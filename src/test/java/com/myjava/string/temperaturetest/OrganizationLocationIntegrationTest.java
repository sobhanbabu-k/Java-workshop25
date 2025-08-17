package com.myjava.string.temperaturetest;

import com.temperature.dao.LocationDao;
import com.temperature.dao.OrganizationDao;
import com.temperature.model.Location;
import com.temperature.model.Organization;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OrganizationLocationIntegrationTest {
    private static OrganizationDao organizationDao;
    private static LocationDao locationDao;

    @BeforeAll
    static void setup() throws Exception {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:mem:orglocdb;DB_CLOSE_DELAY=-1");
        ds.setUser("nexa");

        try (Connection conn = ds.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.execute("""
                CREATE TABLE organization (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(255),
                    contactNo VARCHAR(20),
                    email VARCHAR(255),
                    website VARCHAR(255)
                )
            """);

            stmt.execute("""
                CREATE TABLE location (
                    location_id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(255),
                    address VARCHAR(255),
                    org_id INT,
                    FOREIGN KEY (org_id) REFERENCES organization(id)
                )
            """);
        }
        organizationDao = new OrganizationDao(ds);
        locationDao = new LocationDao(ds);
    }
    @Test
    public void testSaveOrganizationAndLocation() throws SQLException {
        Organization org = new Organization("Google", "9876543210", "contact@google.com", "www.google.com", 0);
        Organization savedOrg = organizationDao.save(org);
        assertNotNull(savedOrg.id());
        assertEquals("Google", savedOrg.name());

//        Location loc = new Location("4-34", "rice mill","Rjy", "ap","india" ,savedOrg.id());
//        Location savedLoc = LocationDao.save(loc);
//        assertNotNull(savedLoc.city());
//        assertEquals("Rjy", savedLoc.city());
    }
}

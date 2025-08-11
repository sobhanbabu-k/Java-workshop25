package com.temperature.dao;

import com.temperature.model.Location;

import javax.sql.DataSource;
import java.sql.*;
public class LocationDao {
    private final DataSource dataSource;
    public LocationDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public Location save(Location loc) {
        String sql = "INSERT INTO location (dno,street,city,state,country, org_id) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, loc.dno());
            ps.setString(2, loc.street());
            ps.setString(3, loc.city());
            ps.setString(4, loc.state());
            ps.setString(5,loc.country());
            ps.setInt(6,loc.org_id());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return new Location(
                            loc.dno(), loc.street(), loc.city(), loc.state(), loc.country(), loc.org_id());
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving location", e);
        }
        return null;
    }
    public int count() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM location");
             ResultSet rs = ps.executeQuery()) {
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error counting locations", e);
        }
    }
}

package org.myjava.practice.controlstatements;

public class BuildingSwitchCase {
    public void print(char charcter){
        switch (charcter){
            case 'A' :
            case 'D' :
            case 'F' :
                System.out.println("10 Floors");
                break;
            case 'B' :
            case 'H' :
                System.out.println("20 Floors");
                break;
            case 'C' :
            case 'S' :
                System.out.println("30 Floors");
                break;
            case 'E' :
            case 'G' :
                System.out.println("50 Floors");
                break;
            case 'L' :
            default:
                System.out.println("100 Floors");
        }
    }

    public static void main(String[] args) {
        BuildingSwitchCase  buildingSwitchCase = new BuildingSwitchCase();
        buildingSwitchCase.print('A');
        buildingSwitchCase.print('D');
        buildingSwitchCase.print('F');
        buildingSwitchCase.print('E');
        buildingSwitchCase.print('G');
        buildingSwitchCase.print('C');
        buildingSwitchCase.print('Z');
        buildingSwitchCase.print('L');
        buildingSwitchCase.print('N');
    }
}

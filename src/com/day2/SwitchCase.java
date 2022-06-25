package com.day2;

public class SwitchCase {
    static void cityCheck(String cName){
        switch (cName){
            case "Mumbai":
                System.out.println("Financial City");
                break;
            case "Kolkata":
                System.out.println("City of Joy");
                break;
            case "Delhi":
                System.out.println("Capital of the country");
                break;
            case "Bangalore":
                System.out.println("Cyber city");
                break;
            default:
                System.out.println("May be other Indian city");
        }
    }

    public static void main(String[] args) {
        String cityName = "Kolkata";
        cityCheck(cityName);
    }
}

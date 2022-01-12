package DBC.Mobile;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 12-Jan-22
 */

import java.util.Scanner;

public class MobileData {
    String brand =  " Oppo";
    String modelName = "A5s";
    int ramInGb = 32;
    short romInGb = 3;
    float screenSize = 6.26f;
    float price = 10999.00f;
    boolean isEMIOption = true;
    char usbCharger = 'B';
    byte cameraMegapixel = 16;
    short maximumStorageCapacity = 256;
    String color = "Black";
    int batteryCapacityInMh = 5000;

    public static void main(String[] args) {
        MobileData mobileData = new MobileData();
        System.out.println("Brand: "+mobileData.brand+"\n"+
                "Model Nmae: "+mobileData.modelName+"\n"+
                "Ram: "+mobileData.ramInGb+"\n"+
                "Rom: "+mobileData.romInGb+"\n"+
                "Screen Size: "+mobileData.screenSize+"\n"+
                "Price: "+mobileData.price+"\n"+
                "EMI: "+mobileData.isEMIOption+"\n"+
                "USB Type: "+mobileData.usbCharger+"\n"+
                "Camera: "+mobileData.cameraMegapixel+"\n"+
                "Maximum Storage: "+mobileData.maximumStorageCapacity+"\n"+
                "Color: "+mobileData.color+"\n"+
                "Battery: "+mobileData.batteryCapacityInMh);

    }






}

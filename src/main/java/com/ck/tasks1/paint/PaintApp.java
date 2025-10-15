package com.ck.tasks1.paint;

public class PaintApp {
    public static void main(String[] args) {
        double wallArea = (40 * 3.4 * 2) + (30 * 3.4 * 2);
       // System.out.println(wallArea);
        double coveragePerCan = 5.1;

        double canDiameter = 0.15;
        double canHeight = 0.30;

        double boxL = 0.60;
        double boxW = 0.30;
        double boxH = 0.35;

//1. Minimum number of cans for a wall measuring 30 * 40 m and ceiling 3.4m above floor:

                             //The Math.ceil() method rounds up to the next whole number (ceiling).
        int cansReq = (int) Math.ceil(wallArea / coveragePerCan);
        System.out.println("Minimum number of cans required: " + cansReq);

//2. Number of full boxes given to the customer who buys this quantity of paint:

                             //Math.floor() returns the largest whole number less than or equal to the value.
        //canHeight aligned along length
        int capacityAlongL = (int) (Math.floor(boxL / canHeight) * Math.floor(boxW / canDiameter) * Math.floor(boxH / canDiameter));
        //canHeight aligned along width --> the can's circular width fits across the box's width
        int capacityAlongW = (int) (Math.floor(boxL / canDiameter) * Math.floor(boxW / canHeight) * Math.floor(boxH / canDiameter));
        //canHeight aligned along height --> the can's circular height fits across the box's height
        int capacityAlongH = (int) (Math.floor(boxL / canDiameter) * Math.floor(boxW / canDiameter) * Math.floor(boxH / canHeight));

                            //Math.max returns the larger (maximum) of two values.
        int cansPerBox = Math.max(capacityAlongL, Math.max(capacityAlongW, capacityAlongH));
        int fullBoxes = (int) Math.floor((double) cansReq / cansPerBox);
        System.out.println("Number of full boxes: " + fullBoxes);

//3. Number of cans not packed into boxes:
        int notPacked = cansReq - fullBoxes * cansPerBox;
        System.out.println("Number of cans not packed: " + notPacked);

    }
}

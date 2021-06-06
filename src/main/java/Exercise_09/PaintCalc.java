/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/
package Exercise_09;

import java.util.Scanner;

public class PaintCalc {
    public static void main(String[]args){
        final int GALLON= 350;
        System.out.print("What is the length of the room?");
        Scanner input = new Scanner(System.in);
        String LengthStr = input.next();
        int length = Integer.parseInt(LengthStr);
        System.out.print("What is the width of the room?");
        String WidthStr = input.next();
        int width = Integer.parseInt(WidthStr);

        int area = length*width;
        int PaintGallons = area/GALLON;
        if (area > PaintGallons*GALLON){
            PaintGallons=PaintGallons+1;
        }

        System.out.print("You will need to purchase "+PaintGallons+ " gallons of paint to cover "+
        area+ " square feet.");

    }
}

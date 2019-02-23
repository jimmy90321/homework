package homework3;

import homework3.POJO.Box;
import homework3.POJO.Box3;
import homework3.POJO.Box5;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter object's length: ");
        float length = scanner.nextFloat();
        System.out.print("Please enter object's width: ");
        float width = scanner.nextFloat();
        System.out.print("Please enter object's height: ");
        float height = scanner.nextFloat();

        getUsableBox(length, width, height);
    }

    private static void getUsableBox(float length, float width, float height) {
        Box box3 = new Box3();
        Box box5 = new Box5();
        if(box3.validate(length,width,height)){
            System.out.println("This object can use Box3");
        }else if (box5.validate(length,width,height)){
            System.out.println("This object can use Box5");
        }else{
            System.out.println("Object too large!!!");
        }
    }
}

package TemaDoi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {
    public static int getOricenumber() {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean repeat = true;
        while (repeat == true) {
            try {
                System.out.print("Please enter a number: ");
                number = scan.nextInt();
                repeat = false;
                System.out.println(myArray[number]);
            } catch (ArrayIndexOutOfBoundsException e) {
                repeat = true;
                System.out.println("Numarul nu se afla in intervalul [0 - " + (myArray.length - 1) + "]");
            } catch (InputMismatchException e) {
                System.out.println("The value [" + scan.nextLine() + "] is not a numeric value.\nPlease try again!");
            }
        }
        System.out.println("cc"+number+"valid");
        return number;
    }

}

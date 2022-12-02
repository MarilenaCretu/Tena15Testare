package TemaDoi;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {

    //Exertitiul  1
    public int readInt() {
        boolean repeat = true;
        int number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value");
            } finally {

            }
        }
        System.out.println("The number is: " + number);
        return number;
    }

    //Exertitiul  2
    public double readDouble() {
        boolean repeat = true;
        double number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number! ");
            } finally {

            }
        }
        System.out.println("The double number is: " + number);
        return number;
    }

    //Exertitiul  2
    public float readFloat() {
        boolean repeat = true;
        float number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
                //          }finally {

            }
        }
        System.out.println("The float number is: " + number);
        return number;
    }

    //Exertitiul  2
    public String readString() {
        boolean repeat = true;
        String text = "";
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                text = scanner.next();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
                //         }finally {

            }
        }
        System.out.println("Text: " + text);
        return text;
    }

    //Exertitiul  3
    public int[] getPopulatedArray(int size) {
        int[] array = new int[size];
        System.out.println("Populating the array with values.");
        for (int i = 0; i < size; i++) {

            array[i] = readInt();

        }
        return array;
    }

    //Exertitiul  4
    public List<Integer> getPopulatedList() {
        List<Integer> list = new ArrayList<>();
        while (true) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                list.add(number);
            } catch (InputMismatchException e) {
                System.out.println("An invalid value was entered.");
                break;
            }
        }
        return list;
    }
}

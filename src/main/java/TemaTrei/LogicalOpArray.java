package TemaTrei;

import java.util.Arrays;

public class LogicalOp {

    //Exerecitiul 2
    public int[] getArray(int[] myArray) {
        for (int i = 1; i < myArray.length; i++) {
            myArray[i - 1] = i;
            System.out.print(myArray[i - 1] + " ");
        }
        return myArray;
    }

    //Exerecitiul 3
    public int[] printArrayValue(int[] myArray) {
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                myArray[j] = i;
                System.out.print(myArray[j] + " ");
                j++;
            }
        }
        return myArray;
    }

    //Exerecitiul 4
    public void mediaArrayValue(int[] myArray) {
        int sun = 0;
        double media = 0;
        for (int i = 0; i < myArray.length; i++) {
            sun += myArray[i];
        }
        media = (double) sun / myArray.length;
        System.out.println(media);
    }

    //Exercitiul 5
    public boolean checkarrArray(String[] arrString, String input) {
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].equals(input)) {
                System.out.println("True");
                return true;
            }
        }
        return false;
    }

    //Exerecitiul 6
    public int getIndexForValue(int[] indexArray, int value) {
        for (int i = 0; i < indexArray.length; i++) {
            if (indexArray[i] == value) {
                System.out.println("\nPozitia pe care se afla numarul \"" + value + "\" este: " + i);
                return i;
            }
        }
        System.out.println("-- Valoarea nu exista in array --");
        return -1;
    }

    //Exerecitiul 7
    public void getGrila() {
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
    }

    //Exerecitiul 8
    public int[] removeNrFromArray(int[] myArray, int nr) {
        int[] secondArray = new int[myArray.length];
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == nr)
                continue;
            secondArray[j++]= myArray[i];
        }
//        int[] finArray = new int[j];
//        for (int i = 0; i < j; i++)
//            finArray[i] = secondArray[i];
//        System.out.println(Arrays.toString(finArray));
        System.out.println(Arrays.toString(secondArray));
        return secondArray;
    }

    //Exerecitiul 9
    public int aldoileamicArray(int[] micArray) {
        int temporary = 0;
        for (int i = 0; i < micArray.length; i++) {
            for (int j = i + 1; j < micArray.length; j++) {
                if (micArray[i] > micArray[j]) {
                    temporary = micArray[j];
                    micArray[j] = micArray[i];
                    micArray[i] = temporary;
                }
            }
        }
        System.out.println(micArray[1]);
        return micArray[1];
    }

    //Exerecitiul 10
    public int[] copyArray(int[] firstArray, int[] emptyArray) {
        firstArray = new int[]{2, 7, 9};
        emptyArray = new int[firstArray.length];
        for (int i = 0, j = 0; i < firstArray.length; i++) {
            emptyArray[j] = firstArray[i];
            j++;
        }
        return emptyArray;
    }
}

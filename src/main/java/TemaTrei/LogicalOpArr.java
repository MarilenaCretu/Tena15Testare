package TemaPatru;

public class LogicalOp {

    //Exercitiul 1
    public void printArrayValue(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

    //Exercitiul 2
    public int minim(int[] array) {
        int minim = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minim) {
                minim = array[i];
                System.out.println(minim);
            }
        }
        return minim;
    }

    public int maxim(int[] array) {
        int maxim = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxim) {
                maxim = array[i];
            }
        }
        System.out.println(maxim);
        return maxim;
    }


}

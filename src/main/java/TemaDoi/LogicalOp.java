package TemaDoi;

public class LogicalOp {
    //ex 5
    public void readArrayIndex(int[] array, int number) {
        try {
            System.out.println(array[number]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large");
        }
    }

    //ex 6
    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

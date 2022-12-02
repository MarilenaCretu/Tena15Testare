package TemaDoi;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Read read = new Read();
        read.readInt();
        read.readDouble();
        read.readFloat();
        read.readString();
        int [] array = read.getPopulatedArray(3);
        for(int i : array){
            System.out.println(i);
        }
        LogicalOp logicalOp = new LogicalOp();
        //5
        logicalOp.readArrayIndex(array, 3);
        //6
        logicalOp.wait(5);
    }

}


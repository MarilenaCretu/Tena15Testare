package TemaTrei;

import java.util.List;

public class LogicalOpList {
    //Exercitiul 1
    public void printListInt(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }

    //Exercitiul 2

    public void addToList(List<Integer> list, int number) {
        list.add(number);
        System.out.print(list);
    }

    //Exercitiul 3

    public void printList(List<Integer> list, int number) {
        for (int i = number; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //Exercitiul 4
    public void printListInvers(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    //Exercitiul 5
    public void addString(List<String> listS, int position, String text) {
        listS.add(position, text);
        System.out.println(listS);
    }

    //Exercitiul 6
    public void addOList(List<Integer> list, int number) {
        list.add(0, number);
        System.out.println(list);
    }

    //Exercitiul 7
    public void printListValue(List<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.println("Index " + i + " are elementul " + list.get(i));
    }

    //Exercitiul 8
    public int getMaxFromList(List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);
        return max;
    }
}

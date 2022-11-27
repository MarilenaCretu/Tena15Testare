package TemaTrei;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        login3enteries();
       // meniu();


    }

    private static void login3enteries() {
        final int Username = 2;
        final int Password = 8;

        int username;
        int password;

        for (int i = 0; i <= 3; i++) {
            if (i < 3) {
                System.out.print("Enter username: ");
                Scanner scanner = new Scanner(System.in);
                username = scanner.nextInt();

                System.out.print("Enter Password: ");
                password = scanner.nextInt();

                if (Username == username && (Password == password)) {
                    meniu();
                    break;
                } else {
                    System.out.println("Wrong Username or Password. Please try again.");
                }
            } else {
                System.out.println("3 incorrect enteries. EXIT!");
            }
        }
    }


    public static int meniu() {
        System.out.print("\n\tHello!\nChoose an option:\n");
        System.out.print("\t1. Operatii matematice\n");
        System.out.print("\t2. Inmultirea/Impartirea\n");
        System.out.print("\t3. Exercitii date \n");
        System.out.print("\t4. Figurine \n");
        System.out.print("\t5. If \n");
        System.out.print("\t6. For \n");
        System.out.print("\t7. While \n");
        System.out.print("\t8. ARRAY \n");
        System.out.print("\t9. Array \n");
        System.out.print("\t10. Sortare lista\n");
        System.out.print("\t0. Exit\n");
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean repeat = true;
        while (repeat == true) {
            try {
                System.out.print("Please enter a number: ");
                number = scan.nextInt();
                repeat = false;
                meniuswich(myArray[number]);
            } catch (ArrayIndexOutOfBoundsException e) {
                repeat = true;
                System.out.println("Numarul nu se afla in intervalul [0 - " + (myArray.length - 1) + "]");
            } catch (InputMismatchException e) {
                System.out.println("The value [" + scan.nextLine() + "] is not a numeric value.\nPlease try again!");
            }
        }
        return number;
    }


    public static void meniuswich(int number) {
        switch (number) {
            case 1:
                System.out.println("Ati ales: 1!");
                submeniuswich(1);
                meniu();
                break;
            case 2:
                System.out.println("The number is: 2!");
                submeniuswich(2);
                meniu();
                break;
            case 3:
                System.out.println("The number is: 3!");
                submeniuswich(3);
                meniu();
                break;
            case 4:
                System.out.println("The number is: 4!");
                submeniuswich(4);
                meniu();
                break;
            case 5:
                System.out.println("The number is: 5!");
                submeniuswich(5);
                meniu();
                break;
            case 6:
                System.out.println("The number is: 6!");
                submeniuswich(6);
                meniu();
                break;
            case 7:
                System.out.println("The number is: 7!");
                submeniuswich(7);
                meniu();
                break;
            case 8:
                System.out.println("The number is: 8!");
                submeniuswich(8);
                meniu();
                break;
            case 9:
                System.out.println("The number is: 9!");
                submeniuswich(9);
                meniu();
                break;
            case 10:
                System.out.println("List: 10!");
                submeniuswich(10);
                break;
            default:
                System.out.println("The number is: 0!\n ---Exit---");
        }

    }

    public static void submeniuswich(int number) {

        LogicalOpList logicalOpList = new LogicalOpList();
        Calculator calculator = new Calculator();


        switch (number) {
            case 1:
                // System.out.println("Ati ales: 1!");
                System.out.println(calculator.adun(3, 2));
                System.out.println(calculator.adun(3.5F, 5.2f, 2));
                System.out.println(calculator.adun(3.5D, 5.2D));
                System.out.println(calculator.scaderea(5.7, 4.9, 2.0));
                System.out.println(calculator.scaderea(5, 4, 2.7));
                System.out.println(calculator.suma(5.7D, 4.9D, 2D));

                meniu();
                break;
            case 2:
                // System.out.println("The number is: 2!");
                System.out.println(calculator.rezultatulimpartirii(2, 7.3));
                System.out.println(calculator.impartirea(8, 4));
                System.out.println(calculator.impartirea(14.2, 3.7));
                System.out.println(calculator.impartirea(14, 3.3));
                System.out.println(calculator.inmultirea(7, 6));
                System.out.println(calculator.inmultirea(5D, 7D));
                System.out.println(calculator.inmultirea3(5.7F, 4.9F, 2));

                meniu();
                break;
            case 3:
                //System.out.println("The number is: 3!");
                System.out.println(calculator.getCalculA());
                System.out.println(calculator.getCalculB());
                System.out.println(calculator.getCalculC());
                System.out.println(calculator.getCalculD());

                meniu();
                break;
            case 4:
                // System.out.println("The number is: 4!");
                Calculator calculator1 = new Calculator();
                System.out.println(calculator1.getJava());
                System.out.println(calculator1.getModelfata());
                meniu();
                break;
            case 5:
                // System.out.println("The number is: 5!");
                LogicalOpIf logicalOpIf = new LogicalOpIf();
                int biggest = logicalOpIf.checkBiggerNumber(2, 3);
                System.out.println("The bigger number is: " + biggest);
                System.out.println(logicalOpIf.verificaretext("FastTrackIT", logicalOpIf.second));
                System.out.println(logicalOpIf.verificare("FastTrack", 2));
                System.out.println(logicalOpIf.maimareoptsauegalsase(9));
                System.out.println(logicalOpIf.maimaretreisauegalpatru(3));
                System.out.println(logicalOpIf.isNumberEven(18));
                System.out.println(logicalOpIf.isEligibleToVote(17));
                System.out.println(logicalOpIf.maimare(77, 2, 55));
                meniu();
                break;
            case 6:
                //System.out.println("The number is: 6!");
                LogicalOpFor logicalOpFor = new LogicalOpFor();
                logicalOpFor.getFirstnumber();
                logicalOpFor.printFromNumberToTarget1();
                logicalOpFor.printFromNumberToTarget2();
                logicalOpFor.getAldoileanumar();
                logicalOpFor.numereintre();
                logicalOpFor.numereintremicmare();
                logicalOpFor.unupanala100par();
                logicalOpFor.unupanala100impar();
                logicalOpFor.adunarea();
                logicalOpFor.averageFromNumberTo100();
                logicalOpFor.asterisk();
                meniu();
                break;
            case 7:
                //System.out.println("The number is: 7!");
                LogicalOpW logicalOpW = new LogicalOpW();

                logicalOpW.getFirstnumber();
                logicalOpW.unupanala100w();
                logicalOpW.unupanalaminus100w();
                logicalOpW.getAldoileanumar();
                logicalOpW.numereintrew();
                logicalOpW.numereintremicmarew();
                logicalOpW.unupanala100parw();
                logicalOpW.unupanalaminus100imparw();
                logicalOpW.countnumerew();
                logicalOpW.divizibilsapte();
                logicalOpW.primeleFibonacci();
                logicalOpW.CozaLozaWoza();
                meniu();
                break;
            case 8:
                // System.out.println("The number is: 8!");
                LogicalOpArr logicalOpArr = new LogicalOpArr();
                System.out.println("Exercitiul 1:\n\tCreati o metoda care insereze un element pe o pozitie specifica intr-un array:");
                int[] array = new int[]{56, 3, 90, 5, 98};
                logicalOpArr.printArrayValue(array);
                System.out.println("\n\nExercitiul 2:\n\tCreati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array:");
                System.out.print("Cel mai mic numar din array este: ");
                logicalOpArr.minim(array);
                System.out.print("Cel mai mare numar din array este: ");
                logicalOpArr.maxim(array);
                System.out.println("\nExercitiul 3:\n\tCreati o metoda care sa inverseze valorile unui array de int-uri:");
                System.out.print("Array initial: ");
                logicalOpArr.printArrayValue(array);
                Arrays.sort(array, 2, 4);
                System.out.println("\nInversare Array:" + Arrays.toString(array));
                System.out.println("\nExercitiul 6:\n\tCreati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator:");
                System.out.print("Array initial: ");
                logicalOpArr.printArrayValue(array);
                Arrays.sort(array);
                System.out.println("\nOrdonare Array:" + Arrays.toString(array));
                meniu();
                break;
            case 9:
                // System.out.println("The number is: 9!");
                LogicalOpArray logicalOpArray = new LogicalOpArray();
                System.out.println("Exercitiul 2:\n\tCreati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100:");
                int[] myArray = new int[100];
                logicalOpArray.getArray(myArray);
                System.out.println("\n\nExercitiul 3:\n\tCreati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100:");
                logicalOpArray.printArrayValue(myArray);
                System.out.println("\n\nExercitiul 4:\n\tCreati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori. Metoda sa calculeze si sa returneze\n" +
                        "media numerelor din array:");
                logicalOpArray.mediaArrayValue(myArray);
                System.out.println("\nExercitiul 5:\n\tCreati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String. Metoda sa\n" +
                        "verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false:");
                String[] arrString = {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};
                System.out.print("Array dat: " + Arrays.asList(arrString) + "\n");
                logicalOpArray.checkarrArray(arrString, "Joi");
                System.out.println("\nExercitiul 6:\n\tCreati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa\n" +
                        "verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul:");
                int[] indexArray = new int[]{56, 3, 50, 5, 98};
                System.out.print("Array dat: " + Arrays.toString(indexArray));
                logicalOpArray.getIndexForValue(indexArray, 50);
                System.out.println("\nExercitiul 7:\n\tCreati o metoda care sa afiseze urmatoarea grila, folosind un array:");
                logicalOpArray.getGrila();
                System.out.println("\nExercitiul 8:\n\tCreati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa\n" +
                        "verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar:");
                logicalOpArray.removeNrFromArray(indexArray, 3);
                System.out.println("\nExercitiul 9:\n\tCreati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array: ");
                int[] micArray = new int[]{56, 3, 50, 5, 98};
                System.out.print("Array dat: " + Arrays.toString(micArray));
                System.out.print("\nAl doilea cel mai mic numar din array este: ");
                logicalOpArray.aldoileamicArray(micArray);
                System.out.println("\nExercitiul 10:\n\tCreati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol. Metoda sa copieze toate valorile din primul\n" +
                        "array, parcurgandu-l, in cel de-al doilea: ");
                int[] firstArray = new int[2];
                int[] emptyArray = new int[2];
                System.out.println(Arrays.toString(logicalOpArray.copyArray(firstArray, emptyArray)));

                meniu();
                break;
            case 10:
                // System.out.println("The number is: 10!");
                List<Integer> listNumber = new ArrayList<>();
                listNumber.add(0, 5);
                listNumber.add(1, 33);
                listNumber.add(2, 4);
                listNumber.add(3, 7);
                listNumber.add(4, 6);

                LogicalOpList logicalOp = new LogicalOpList();
                System.out.println("Exercitiul 1:\n\tScrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.");
                logicalOp.printListInt(listNumber);
                System.out.println("Exercitiul 2:\n\tScrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).\n" +
                        "Metoda sa adauge numarul primit ca si parametru la final de lista.");
                logicalOp.addToList(listNumber, 42);
                System.out.println("\nExercitiul 3:\n\tScrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.\n" +
                        "Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.");
                logicalOp.printList(listNumber, 2);
                System.out.println("Exercitiul 4:\n\tScrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).");
                logicalOp.printListInvers(listNumber);
                System.out.println("\nExercitiul 5:\n\tScrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.\n" +
                        "Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.");
                List<String> listS = new ArrayList<>();
                listS.add(0, "Ana");
                listS.add(1, "are");
                listS.add(2, "multe");
                listS.add(3, "mere");
                listS.add(4, "galbene");
                logicalOp.addString(listS, 2, "azi");
                System.out.println("\nExercitiul 6:\n\tScrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,\n" +
                        "iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.");
                logicalOp.addOList(listNumber, 87);
                System.out.println("\nExercitiul 7:\n\tScrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie.");
                logicalOp.printListValue(listNumber);
                System.out.println("\nExercitiul 8:\n\tScrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.");
                logicalOp.getMaxFromList(listNumber);

                meniu();
                break;
//            default:
//                System.out.println("The number is: 0!\n ---Exit---");
        }
    }

    private void exercitiiList(int number) {

//        if (number == 1) {
//            System.out.println("Ati ales Fahrenheit la Celsius!");
//            System.out.println("Introduceti valoare in Fahrenheit: ");
//            Scanner s = new Scanner(System.in);
//            int ex = s.nextInt();
//            getCelsius(ex);
//            // return;
//        } else if (number == 2) {
//            System.out.println("Ati ales Celsius la Fahrenheit!");
//            System.out.println("Introduceti valoare in Celsius: ");
//            Scanner s = new Scanner(System.in);
//            int ex = s.nextInt();
//            getFahrenhein(ex);
//        } else if (number == 0) {
//            System.out.println("Exit");
//        } else {
//            System.out.println("Numar invalid");
//        }
    }
}

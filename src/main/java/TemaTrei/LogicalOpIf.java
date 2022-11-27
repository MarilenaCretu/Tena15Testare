public class LogicalOp {
    //Tema 11
    //exercitiul 3
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    //exercitiul 4
    String second = "FastTrackIT";

    public String verificaretext(String first, String second) {
        if (first.equals(second)) {
            return "Learning text comparison!";
        }
        return "Got to try some more!";
    }

    //exercitiul 5
    public String verificare(String first, int number) {
        if (first.equals("FastTrack") && number <= 3) {
            return first + " " + number;
        } else if (!first.equals("FastTrack") && number >= 4) {
            return number + " " + first;
        } else {
            return "No condition was met";
        }
    }

    //exercitiul 6
    public String maimareoptsauegalsase(int first) {
        if (first > 8 || first == 6) {
            return "The amount of snow this winter was(cm): " + first;
        }
        return "The forecast snow is(cm): " + first;
    }

    //exercitiul 7
    public String maimaretreisauegalpatru(int first) {
        if (first > 3 && first != 4) {
            return "“The number is greater than 3 and not equal to 4: ";
        } else if (first == 4) {
            return "The number is equal to 4";
        } else if (first < 3) {
            return "The number is lower than 3";
        }
        return "The number is: " + first;
    }

    //exercitiul 8

    public static void numberswich() {
        int number =7;
        switch (number) {
            case 1:
                System.out.println("The number is: 1!");
                break;
            case 2:
                System.out.println("The number is: 2!");
                break;
            case 3:
                System.out.println("The number is: 3!");
                break;
            case 4:
                System.out.println("The number is: 4!");
                break;
            case 5:
                System.out.println("The number is: 5!");
                break;
            case 6:
                System.out.println("The number is: 6!");
                break;
            case 7:
                System.out.println("The number is: 7!");
                break;
            case 8:
                System.out.println("The number is: 8!");
                break;
            case 9:
                System.out.println("The number is: 9!");
                break;
            case 10:
                System.out.println("The number is: 10!");
                break;
            default:
                System.out.println("The number must be in the range 1-10");
        }
    }

    //exercitiul 9
    public boolean isNumberEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //exercitiul 10
    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    //exercitiul 11
    public int maimare(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }
}

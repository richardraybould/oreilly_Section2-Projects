import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double realNo, realNo1, realNo2, realNo3;
        double total, average;
        double count;
        count = 3;


        System.out.println("Enter 3 real numbers");
        realNo1 = keyboard.nextDouble();
        keyboard.nextLine(); // consume the new line char

        realNo2 = keyboard.nextDouble();
        keyboard.nextLine(); // consume the new line char

        realNo3 = keyboard.nextDouble();
        keyboard.nextLine(); // consume the new line char

        total = realNo1 + realNo2 + realNo3;
        average = total / count;

        System.out.println("The total is :" + total);
        System.out.println("count is :" + count);
        System.out.println("Average is :" + average);
// do it with loops
        realNo = 0;
        average = 0;
        total = 0;
        System.out.println("(Loop) Enter " + count + " real numbers");
        for (int i = 0; i < count; i++) {
            realNo = keyboard.nextDouble();
            keyboard.nextLine(); // consume the new line char
            total+=realNo;
        }//end for loop
        average = total / count;

        System.out.println("The total is :" + total);
        System.out.println("count is :" + count);
        System.out.println("Average is :" + average);
    } // end main
}

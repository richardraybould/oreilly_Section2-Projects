import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //keyboard input variables
        String adjective1;
        String girlsName;
        String adjective2;
        String occupation1;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;
        //madLibsLines
        String madLibLine;

        // Data input process
        System.out.print("Enter an adjective:\t");
        adjective1 = keyboard.nextLine(); //keyboard.nextLine(); // consume the new line char

        System.out.print("Enter a girls name:\t");
        girlsName = keyboard.nextLine();

        System.out.print("Enter an adjective:\t");
        adjective2 = keyboard.nextLine(); //keyboard.nextLine(); // consume the new line char

        System.out.print("Enter an occupation:\t");
        occupation1 = keyboard.nextLine(); //keyboard.nextLine(); // consume the new line char

        System.out.print("Enter the name of a place:\t");
        place = keyboard.nextLine(); //keyboard.nextLine(); // consume the new line char

        System.out.print("Enter the name of a piece of clothing:\t");
        clothing = keyboard.nextLine(); //keyboard.nextLine(); // consume the new line char

        System.out.print("Enter the name of a hobby:\t");
        hobby = keyboard.nextLine(); //keyboard.nextLine(); // consume the new line char

        System.out.print("Enter an adjective:\t");
        adjective3 = keyboard.nextLine(); //keyboard.nextLine(); // consume the new line char

        System.out.print("Enter another occupation:\t");
        occupation2 = keyboard.nextLine(); //keyboard.nextLine(); // consume the new line char

        System.out.print("Enter a boys name:\t");
        boysName = keyboard.nextLine(); //keyboard.nextLine(); // consume the new line char

        System.out.print("Enter a mans name:\t");
        mansName = keyboard.nextLine(); //keyboard.nextLine(); // consume the new line char

        // format output strings
        madLibLine = "";
        madLibLine += "There once was a ";
        madLibLine += adjective1;
        madLibLine += " girl named ";
        madLibLine += girlsName;
        madLibLine += ", who \n";
        madLibLine += "was a ";
        madLibLine += adjective2;
        madLibLine += " ";
        madLibLine += occupation1;
        madLibLine += " in the kingdom of ";
        madLibLine += place;
        madLibLine += ".\n";
        madLibLine += "She loved to wear ";
        madLibLine += clothing;
        madLibLine += " and to ";
        madLibLine += hobby;
        madLibLine += ". She wanted to \n";
        madLibLine += "marry the ";
        madLibLine += adjective3;
        madLibLine += " ";
        madLibLine += occupation2;
        madLibLine += " named " ;
        madLibLine += boysName;
        madLibLine += " but her \n";
        madLibLine += "father, King ";
        madLibLine += mansName;
        madLibLine += " forbid her from seeing him.";

        // output MadLibs strings
        System.out.println(madLibLine);


    } //end main
}

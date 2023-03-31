public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;
        int currentAge = 52;
        boolean isGreater21;

        String myName = "John";
        String yourName = "Johnnny";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        //relational operations
        boolean ageComparisons = myAge > yourAge;

        System.out.println("myAge > yourAge?: " + ageComparisons);

        ageComparisons = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge?: " + ageComparisons);

        ageComparisons = yourAge == bobsAge;

        System.out.println("yourAge == bobsAge?: " + ageComparisons);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("do names match?:" + nameComparison);

        isGreater21 = currentAge >= 21;
        System.out.println("currentAge greater than or equal to 21 ?:" + isGreater21);

    } //end main
}

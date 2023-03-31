public class ArithmeticFun {
    public static void main (String args[]) {
        int a = 10;
        int b = 15;

        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("result is " + result);
        System.out.println("diff is " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);

        //BINARY Operators
        result += 20; //result = result + 20
        System.out.println("result is now " + result);

        //UNARY Operators
        result++;
        System.out.println("result ++ " + result); //++result

        result--;
        System.out.println("result -- " + result); //--result

        //Challenge: Multiplication
        product *= 2; //product = product * 2
        System.out.println("Product * 2 = " + product);
    } // end main
}

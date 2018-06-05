package basics;

public class NumbersCalc {
    public static void main(String[] args) {
        System.out.println("Program is starting");
        printName();
        int numA = 10;
        int numB = 20;
        addNumber(numA, numB);
        int product = multiplyNumber(numA, numB);
        // System.out.println("The product of numbers is:" + multiplyNumber(numA, numB));
        System.out.println("The product of numbers is: " + product);
    }

        static void printName(){
            System.out.println("My name is Tom");
        }

        static void addNumber(int numberA, int numberB){
        // This function will add two numbers
            int sum = numberA + numberB;
            System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
        }

         static int multiplyNumber(int valueA, int valueB){
        int product  = valueA * valueB;
        addNumber(product, product);
        return product;


         }


}

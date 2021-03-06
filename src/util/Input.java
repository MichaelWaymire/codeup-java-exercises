package util;
import java.util.Scanner;


public class Input {


    private Scanner scan;




    // constructor runs whenever we see "new Input()"
    public Input() {
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return scan.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public int getInt() {

        System.out.println("Please input a number");
        int input;
        try {
            input = Integer.valueOf(getString());
            return input;
        }catch (NumberFormatException e) {
            System.out.println("Input is not valid");
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max);
        return getInt();

        //        System.out.println("Please input an integer between " + min + " and " + max);
//        return getInt();
    }



    public double getDouble() {
        System.out.println("Please input a number");
        int input;

        try {
            input = Integer.valueOf(getString());
            return input;
        }catch (NumberFormatException e) {
            System.out.println("Input is not valid");
            return getInt();
        }
    }





    public double getDouble(double min, double max) {
        System.out.println("Please input an integer between " + min + " and " + max);
        return getDouble();
    }

    public boolean yesNo() {
        System.out.println("Please input yes or y to continue");
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    //My Attempt
//    private Scanner scanner;
//
//    public Input(){ scanner = new Scanner(System.in).useDelimiter("\n");
//
//    }
//
//    public String getString(){
//        return scanner.next();
//    }
//
//    public String getString(){
//        return scanner.next();
//    }
//
//
//    boolean yesNo(){
//        System.out.println("please input yes or y to continue");
//        String userInput = getString();
//        return yesNo();
//
//    }
////
////
//    int getInt(int min, int max){
//        System.out.println("Please give me a number" + min + " and "
//        + max);
//        return getInt();
//    }
////
////
//    int getInt(){
//        return scanner.nextInt();
//    }
////
////
//    public double getDouble(double min, double max){
//        System.out.println("please input a number between " + min +
//        " and " + max);
//        return getDouble();
//    }
////
////
//    double getDouble(){
//        return scanner.nextInt();
//    }
}
//import the Scanner class to read the user input from the keyboard
import java.util.Scanner;

class FactorialExample{  
 public static void main(String args[]){  
      // Created a Scanner object named 'sc' to get user input
        Scanner sc = new Scanner (System.in);

        int number = sc.nextInt ();

        //Initialized fact to 1 to score the running product
        int fact = 1;

        // Loop from 1 up to the number entered by the user
        for (int i = 1; i<= number; i++) {

        //Next thing i did is to multiply the current value of fact by i  
          fact = fact * i;
        }

        // print the final result
        System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}

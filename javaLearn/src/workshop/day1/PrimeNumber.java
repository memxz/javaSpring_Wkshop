package workshop.day1;

/*
Java Workshops
Debugging with Eclipse IDE

Objectives
The objective of this workshop is to help you familiarise with the Eclipse IDE debugger, and use it to debug your programs. 
Exercise
Setting up 
1)	Creating a Java Project named Debugging
2)	Create a package named java1.debugging
3)	Create a class named PrimeNumber.java
4)	Modify the class PrimeNumber as follows
*/
public class PrimeNumber {
   public static void main(String[] args) {
      printPrimeNumber();
   }
   
   static void printPrimeNumber() {
      for (int n = 5; n <= 10; n++) {
         if (isPrime(n)) {
            System.out.println(n);
         }
      }
   }
   
   static boolean isPrime(int number) {
      boolean isPrime = true;
      //for (int i = 2; i < number; i++) {
         if (number % 2 == 0) {
            isPrime = true;
         } else {
            isPrime = false;
         }
      //}
      
      return isPrime;
   }
}

/*
 * Debugging This implementation has some bugs and therefore needs to be
 * rectified. Use different features of Java Debugger to fix it. Note The
 * objective of this workshop is to familiarize with the debugger. Therefore,
 * even if you know how to rectify the given class, you are still strongly
 * encouraged to learn the debugger’s features.
 */


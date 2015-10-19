/*
 * Write your own program that
 * 1. Uses Scanner for input
 * 2. Uses a for loop
 * 3. Uses a while loop
 * 4. Uses an IF / else if / else
 * 5. Uses a swith
 * 6. Uses an arry
 */

import java.util.Scanner;

  class gradeLevel {
  public static void main (String[] args) {
 
    Scanner s = new Scanner (System.in);
    int grade;
    int skip;
    
    System.out.println(" Do you want to know your grade level? yes (1) or no (2) ");
    skip = s.nextInt();
    
    if(skip == 1) {
     
      System.out.println(" Enter your grade percentage: ");
      grade = s.nextInt();
      
      if (grade >= 70) {
        System.out.println(" you are a good student");
      }
      else if (grade >= 50) {
       System.out.println(" you are a bad student"); 
      }
      else{
       System.out.println("get the out of the school"); 
      }
    }
    
  } // end main method
  
} // end main class

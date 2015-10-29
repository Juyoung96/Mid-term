import java.util.Scanner;

public class Midterm2{
  
  public static void main(String[] args ) {
    
    int sum = 0, i;
    for ( i=1; i<=50; i++ ) {
      sum = sum + i;
    }
    System.out.println( "For Sum = " + sum ); 
    
    int sum2 = 0,i2;
    i2 = 1;
    while ( i2<=50 ) {
     sum2 = sum2 + i2; 
     i2++;
    }
    System.out.println( "While Sum = " + sum2 ); 
    
    boolean done = false;
    int j = 7;
     while ( !done ) {
      if ( j <= 1 ) {
       done = true; 
        System.out.println( "done" );
        break;
      }
      j--;
      System.out.println( "j = " + j );
    }
    
  }
}
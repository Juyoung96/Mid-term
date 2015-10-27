import java.util.Scanner;

public class food{
 
  public static void main( String[] args) {
    
    Scanner s = new Scanner( System.in );
    int food;
    
    System.out.println( "Enter your favorite number 1 to 7: ");
    food = s.nextInt();
    
    System.out.println( "Today's dinner menu is " + food + ": " + getName( food ) );
    
  } //end main method
  
  public static String getName( int food ) {
    
    switch( food ) {
     
      case 1: 
        return "pizza";
      case 2:
        return "bulgogi";
      case 3:
        return "hamburger";
      case 4:
        return "ramen";
      case 5:
        return "hotdog";
      case 6:
        return "bibimbob";
      case 7:
        return "nothing";
      default:
        return "Error - not a number";
      
        
    }
    
  } //end getName method
  
} // end class
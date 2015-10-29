public class Name {
 
  public static void main (String[] args) {
   
    String[] name = { "Juyoung", "Hanmin", "Simon", "Jaehyung" };
    for( int i=0; i<name.length; i++){
     System.out.println(name[i]);
    }
   change( name);
  System.out.println("Best friend!: " + name[0]);
  }
  public static void change(String[] j) {
   j[0] = "Hanmin"; 
  }
}
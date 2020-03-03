import support.LLNode;


public class CarryDriverClass {
   public static void main(String[] args ) {
   
      Numbers<Integer> values;
      values = new Numbers<Integer>();

      //add nodes to the stack
      values.push(3);
      values.push(6);
      values.push(6);
      values.push(9);
      values.push(12);
      values.push(15);
      values.push(18);
      values.push(19);
      values.push(19);
      values.push(20);

      //output integers using the toString method
      System.out.println("The integers on the stack are: " + values);
         
      //check if 15 is in the list
      System.out.println("The value 15 is found " + values.contains(15, values.getTop() ) + " in the list." );
      
      //check if 10 is in the list
      System.out.println("The value 10 is found " + values.contains(10, values.getTop() ) + " in the list." );
   }
}
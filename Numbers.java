import ch02.stacks.*;

import support.LLNode;

public class Numbers<T> extends LinkedStack<T>  {
   protected LLNode<T> top;
   protected int data;
   
   public Numbers() {
      top = null;
   }
   
   // Places element at the top of this stack.
   public void push(T element) {
      LLNode<T> newNode = new LLNode<T>(element);
      newNode.setLink(top);
      top = newNode;
   }
   
  public T top()
  // Throws StackUnderflowException if this stack is empty,
  // otherwise returns top element of this stack.
  {                 
    if (isEmpty())
      throw new StackUnderflowException("Top attempted on an empty stack.");
    else
      return top.getInfo();
  }

   //to String method to create and return a string that represents the current stack
   public String toString() {
      String result = "";
      if (top == null) {
         return "";
      }  
      LLNode<T> currNode = top;
         
      while(currNode != null) {
         result += currNode.getInfo() + ", ";
         currNode = currNode.getLink();
      }
      return result;
   }
  public LLNode getTop() {
    if (isEmpty())
      throw new StackUnderflowException("Top attempted on an empty stack.");
    else
      return top;
  }
  
  public boolean isEmpty()
  // Returns true if this stack is empty, otherwise returns false.
  {              
    return (top == null); 
  }
   
   
   public static int numEvens(LLNode<Integer> currNode) {
      int countEvens = 0;
      
      if(currNode == null) {
         return 0;
      }
      
      //check evens
      if (currNode.getInfo() %2 == 0){
         countEvens = 1;
      }
      countEvens += numEvens(currNode.getLink());//increment counter
   
      return countEvens;
   }
   
   public static boolean contains(int target, LLNode<Integer> list){
  
      if(list == null) { // base case
          return false;
      } 
      if (target == list.getInfo() ) // if current node's value is equal to target then return true
          return true;
         else
            return contains(target, list.getLink()); // call method again and search for subsequent node
   }   
}
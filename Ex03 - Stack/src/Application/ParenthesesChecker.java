package Application;

import java.util.Stack;

public class ParenthesesChecker {

	public static void main(String[] args) {
		String str = "()";
		 
        Stack<Character> st = new Stack<Character>();
 
  
         for(int i = 0; i < str.length(); i++) {
 
           
            if(str.charAt(i) == '(') {
                   st.push(str.charAt(i));
 
            } else if (str.charAt(i) == ')' && st.peek() == '(') {
                   st.pop();
 
             } else {
                  st.push(str.charAt(i));
             }
         }
 
         if(st.empty()) {
              System.out.println("Balanced");
         } else {
              System.out.println("Not balanced");
         }
   }
}	


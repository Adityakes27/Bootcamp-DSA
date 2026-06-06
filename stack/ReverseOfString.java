package Stack;



import java.util.*;


public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        Stack<Character>  st = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
            String rev = "";

            while(!st.isEmpty()){
                rev += st.pop();
            }
            
        
        
        System.out.println("Original String " +str);
        System.out.println("Reversed String " +rev);
        //sc.close();
    }
    
}

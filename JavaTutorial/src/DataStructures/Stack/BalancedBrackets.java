/**
 * 
 */
/**
 * @author T30689
 *
 */
package DataStructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i=0;i<t;i++){
			
			String s = scan.next();
			
			Stack stk = new Stack<Character>();	
			
			boolean isBalanced = false;
			
			for(int j=0;j<s.length();j++){
				
				if(s.charAt(j)=='(' || s.charAt(j)=='{' || s.charAt(j)=='['){
					stk.push(s.charAt(j));
				}
				
				if(s.charAt(j)==')' || s.charAt(j)=='}' || s.charAt(j)==']'){
					
					char c = (char)stk.pop();
					
					if(c=='}' && s.charAt(j)=='{'){
						isBalanced = true;
						break;
					}
					
					if(c==']' && s.charAt(j)=='['){
						isBalanced = true;
						break;
					}				
					
					if(c==')' && s.charAt(j)=='('){
						isBalanced = true;
						break;
					}
					
				}
				
			}
			
			if(isBalanced){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
						
			
		}
		
		scan.close();
		
	}
	
}
package Test;

import java.util.Random;

public class Email {

	String password ;
	
	int defLength = 10;
	
	public Email(){
		System.out.println("password is " + generatePassword(defLength));
	}
	
	private String generatePassword(int length) {
		
		String passwordSet="ABCDEFGHIJKLMNOPRSQWYXZ1234567890?-+*=}";
		char[] password = new char[length];		
		
		
		for(int i=0;i<length;i++) {
			int rand = (int)(new Random().nextInt(passwordSet.length()));
			System.out.println("rand "+ rand);
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
		
	}
	
}

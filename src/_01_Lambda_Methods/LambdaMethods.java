package _01_Lambda_Methods;

import java.util.ArrayList;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 1; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((b)->{
			String copy = b;
			b="";
			for (int i = copy.length()-1; i >= 0; i--) {
				b+=copy.charAt(i);
			}
			System.out.println(b);
		}, "word");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((c)->{
			String copy = "";
			for (int i = 0; i < c.length(); i++) {
				if (i%2==0) {
					copy+=Character.toUpperCase(c.charAt(i));
				}else {
					copy+=c.charAt(i);
				}
			}
			System.out.println(copy);
		}, "word");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((p)->{
			String copy = "";
			for (int i = 0; i < p.length(); i++) {
				copy+=p.charAt(i);
				if (i!=p.length()-1) {
					copy+=".";
				}
			}
			System.out.println(copy);
		}, "word");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((p)->{
			ArrayList<Character> c = new ArrayList<Character>();
			boolean b = true;
			c.add('a');
			c.add('e');
			c.add('i');
			c.add('o');
			c.add('u');
			String copy = "";
			for (int i = 0; i < p.length(); i++) {
				for (int j = 0; j < c.size(); j++) {
					if (p.charAt(i)==c.get(j)) {
						b = false;
					}
				}
				if(b==true) {
					copy+=p.charAt(i);
				}
				b=true;
			}
			System.out.println(copy);
		}, "word");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	

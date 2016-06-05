import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

/*
 * Author: Meredith Manson
 * Program: ACSL 4
 * Given Test Data:
 * 1. #, aac, acc, abc, ac, abbc, abbbc, abbbbc, aabc, aabbc
 * 2. a.c 			1. aac, acc, abc
 * 3. a[ab]c 		2. aac, abc
 * 4. a[^ab]c 		3. acc
 * 5. ab*c 			4. ac, abc, abbc, abbbc, abbbbc
 * 6. a.b{2,4}c 	5. aabbc, abbbc, abbbbc
 * 
 */

public class ACSL4_RegExp15_MM {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);

		while (true){
			
			String[] strings = s.nextLine().split(", ");
			ArrayList<String> answers = new ArrayList<String>();
			String finall = "";
			
			for (int i = 0; i < 5; i++) {
				String input = s.nextLine();
				Pattern p = Pattern.compile(input);
				//System.out.println(p);
				for (int j = 0; j < strings.length; j++) {
					Matcher m = p.matcher(strings[j]);
					boolean b = m.matches();
					//System.out.println(b);
					
					if (b==true){
						answers.add(strings[j]);
						b=false;
					}
				}
				finall=answers.toString().replace("[", "").replace("]", "");
				System.out.println(finall);
				answers.clear();
				
			}
			
		}//close while
		
	}//close main
	
}//close pgm

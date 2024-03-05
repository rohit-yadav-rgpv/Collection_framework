package datastructure;

public class Stringtutorial {
		public static void main(String[] args) {
			
			//concat
			String str1 = "Hello";
			String str2 = "World";
			String str3 = str1 + ", " + str2; 
			System.out.println(str3);
			
			String str = "Hello, World!";
			int length = str.length();
			System.out.println(length);
			
			String str4 = "Hello, World!";
			String subStr = str4.substring(7);
			System.out.println(subStr);
			
			String str5 = "Rohit";
			String str6 = "Rohit";
			boolean isEqual = str5.equals(str6); 
			System.out.println(isEqual);
			int result = str5.compareTo(str6); 
			System.out.println(result);
			
			String str7 = "rohit, yadav!";
			String upperCaseStr = str7.toUpperCase(); 
			System.out.println(upperCaseStr);
			String lowerCaseStr = str7.toLowerCase();
			System.out.println(lowerCaseStr);
			
		}
}

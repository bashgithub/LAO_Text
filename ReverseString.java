package javaprograms;

public class ReverseString {

	public static void main(String[] args) {

		String s = "keerthana";
	    char[] c = s.toCharArray();
	    
	   int size = s.length();
	   String reversedString= "";
	
	   for(int i=size-1; i>=0; i--) {
		reversedString = reversedString + c[i];
	}
		System.out.println(reversedString);

	    
	}

}

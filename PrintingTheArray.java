package javaprograms;

import java.util.Arrays;

public class PrintingTheArray {

	public static void main(String[] args) {

		int[] a = {8, 1, 5, 9, 12, 33, 23, 7, 4, 3};
		
		System.out.println(Arrays.toString(a));
		
		sortingANArray();
		RemoveSpecialCharacterSPacesOtherJunks();
		RemoveSPacesFromGivenString();
		findNumberOfOccurancesFromString();
	}

  public static void sortingANArray() {
	 int[] b = {8, 1, 5, 9, 12, 33, 23, 7, 4, 3};
		
	 System.out.println(Arrays.toString(b));

	  Arrays.parallelSort(b);
	  System.out.println("After sorting the array: "+Arrays.toString(b));
 }
  
  public static void RemoveSpecialCharacterSPacesOtherJunks() {
	  String str = "$131#@% $abcd123 ABCDEF";
	  
	  String s = str.replaceAll("[^a-zA-Z0-9]", "");
	  System.out.println(s);
	  
  }
  
  public static void RemoveSPacesFromGivenString() {
	  String st = " A  B  C  D";
	  
	 String st1 = st.replaceAll("\\s", "");
	  System.out.println(st1);
	  
	  
  }
  
  public static void findNumberOfOccurancesFromString() {
	  String k = "keerthana";
	  int beforeLength = k.length();
	  String k1 = k.replaceAll("e", "");
	  
	  int afterLength = k1.length();
	  System.out.println(beforeLength-afterLength);
	  
	  System.out.println(k1);
	  
  }
 
}


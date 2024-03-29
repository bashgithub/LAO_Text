package javaprograms;

public class FactorialNumber {

	public static void main(String[] args) {
		int fact = factorial(5);
		
		System.out.println(fact);

	}
		
    public static int factorial(int n) {
    	int num =n;
		
		if(num== 0) {
			return 1;
		}else {
			return num*factorial(num-1);//5*4*3*2*1*1 =120
		}
    }
    


		
}

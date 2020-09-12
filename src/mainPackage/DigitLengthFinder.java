package mainPackage;

public class DigitLengthFinder {

	public static void main(String[] args) {
		System.out.println(findNumberLength(123456789));
	}

	// Finds the amount of digits in an integer
	//This version replaces the loop with a Math.log statement
	public static int findNumberLength(int inputNumber) {
		//Spits out 0 if input is 0
		if(inputNumber == 0) {
			return 0;
		}
		else {
			
			return (int) Math.log10(inputNumber)+1;
			
		}
	}

}

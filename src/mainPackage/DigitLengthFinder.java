package mainPackage;

public class DigitLengthFinder {

	public static void main(String[] args) {
		System.out.println(findNumberLength(123456789));
	}

	// Finds the amount of digits in an integer
	public static int findNumberLength(int inputNumber) {
		//Spits out 0 if input is 0
		if(inputNumber == 0) {
			return 0;
		}
		var count = 1;
		//Loops to count digit
		while (inputNumber / 10 > 0) {
			inputNumber = inputNumber/10;
			count++;
		}
		
		return count;
	}
	
	// Finds the amount of digits in an long (overloading)
	public static int findNumberLength(long inputNumber) {
		if(inputNumber == 0) {
			return 0;
		}
		String num = inputNumber+"";
		System.out.println(num);
		return num.length();
		
	}

}

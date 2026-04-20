public class PracticeProblem {

	public static void main(String args[]) {

	}
	
	public static boolean hasCapital (String word) {

	boolean flag = false;
	
	for(int i = 0; i < word.length(); i++) {
		char ch = word.charAt(i);

		if (Character.isUpperCase(ch)) {
			flag = true;
		}
	}
	return flag;

	}

	public static boolean isPrime(int num) {
		boolean flag = true;

		if (num<=1) {
			flag = false;
		}

		for (int i=2; i< num; i++) {
			if(num % i == 0) {
				flag = false;
			}
		}

		return flag;
	}
}

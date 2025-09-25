public class PerfectSquare {
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(1));
		System.out.println(isPerfectSquare(4));
		System.out.println(isPerfectSquare(Integer.MAX_VALUE/100));
		System.out.println(isPerfectSquare(255));
		
	}
	
	public static boolean isPerfectSquare(int num) {
				// Changed '< num' to "<= num" to include num itself
        for(int i = 1; i <= num; i++) {
					// Rewrote the if-else statement so it's more readable
        	if (i*i == num) { // Changed '=' to '==' for comparison
        		return true;
					} else if (i*i > num)  {
						return false;
					}
        }
				// Added this to return false if the loop finishes without finding a perfect square
				return false;
  }

}

/*
 * One thing i struggled with on this project was the readability.
 * it took me a second to realize where was missing a curly bracket.
 * I'll always remember to try and write readable code.
 */

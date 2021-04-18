package week2;
import acm.program.*;
public class Fibonacci extends ConsoleProgram {
private static final int MAX_TERM_VALUE = 10000;
		public void run() {
			println("This program lists the Fibonacci sequence.");
		int term1 = 0;
		int term2 = 1;
		
		while (term1 < MAX_TERM_VALUE) {
		 println(term1);
		int term3 = term1 + term2;
		term1 = term2;
		term2 = term3;
		}
		}
		}
	

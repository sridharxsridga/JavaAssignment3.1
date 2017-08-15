/*
 * 
 * This program is to demonstrate errors in code (if any) and debugging. 
 *
 */
package errorFinding;

public class Test {

	/*
	 * Output must be one of the following: a. Compiler error. b. Will throw a
	 * NoSuchMethod error at runtime. c. It will compile and run printing out
	 * "10� d. It will run with no output. e. It will run and print "10" and
	 * then crash with an error
	 * 
	 * 
	 * Answer is : B Will throw a
	 * NoSuchMethod error at runtime. , Since main() method is not defined.
	 */
	static {
		print(10);
	}

	static void print(int x) {
		System.out.println(x);
		System.exit(0);

	}

}

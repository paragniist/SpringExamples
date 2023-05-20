package com.basicexitcode.test;

public class ExitCodeTest {
	public static void main(String[] args) throws IllegalAccessException {
		if (args.length <= 0) {
			System.exit(99);

		} else if (args.length == 1) {
			System.exit(100);
		}
		System.out.println("Good Bye!");

	}
}

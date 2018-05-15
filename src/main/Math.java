package main;

public class Math {
	public int num = 10;

	@SuppressWarnings("finally")
	public int fun() {

		int result;

		try {
			result = num / 0;

			System.exit(0);
		} catch (Exception e) {
			System.out.println("hi");
			return 2;
		} finally {
			return 3;
		}

	}
}


public class I {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) { // Outer loop for rows
			for (int j = 0; j < 7; j++) { // Inner loop for columns
				if ((i == 0 ) || (j == 3 ) ||(i == 6)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

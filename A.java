public class A {

	public static void main(String[] args) {
        for (int i = 0; i < 7; i++) { // Outer loop for rows
            for (int j = 0; j < 7; j++) { // Inner loop for columns
                if ((i == 0 && j!=0 && j!=6) || (j==0 && i!=0) || i==3 || (j==6 && i!=0)) {        
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

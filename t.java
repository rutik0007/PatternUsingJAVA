public class t {
    public static void main(String[] args) {
        
        for (int i = 0; i <=6; i++) { 
            for (int j = 0; j <=6; j++) { 
                if (j == 3 || i==0) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
           
        }
    }
}

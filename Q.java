public class Q {
    public static void main(String[] args) {
        
        for (int i = 0; i <=7; i++) { 
            for (int j = 0; j <=7; j++) { 
                if (j == 0 && i<4 && i!=0 && i!=4 || j==7 && i<4 && i!=0 && j!=4 || i==4 && j!=0 && j!=7 || i==0 && j!=0 && j!=7 || i==5 && j==4 || i==6 &&  j==6 ) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
           
        }
    }
}

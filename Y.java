public class Y {
    public static void main(String[] args) {
        int n=7;
        for (int i = 0; i <=7; i++) { 
            for (int j = 0; j <=7; j++) { 
                if ( i==j && j<4 || j==n )  { 
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
           if (i<3) {
            n--;
           }
        }
    }
}

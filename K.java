public class K {
    public static void main(String[] args) {
        int n = 6; 
        for (int i = 0; i <=7; i++) { 
            for (int j = 0; j <=7; j++) { 
                if (j == 0 || j==n) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i<4){
                n--;
            }
            else{
                n++;
            }
        }
    }
}

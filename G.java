package Panda;

public class G {
	public static void main(String[] args) {
        for (int i = 0; i < 7; i++) { 
            for (int j = 0; j < 7; j++) { 
                if ((i == 0  && j!=0) || (j==0 && i!=0 && i!=6) || (i==3 && j>2 && j!=6) ||(i==6 && j!=6 && j!=0)||(j==6 && i>3 && i!=6)) {        
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

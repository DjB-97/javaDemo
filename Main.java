import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n=10;
        int m=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if (i==0&&j>0&&j<m-1 || j==0 && i>0 || i==(n-1)/2  || j==m-1&&i>0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}

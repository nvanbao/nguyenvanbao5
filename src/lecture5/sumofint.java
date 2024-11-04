
package lecture5;

import java.util.Scanner;

public class sumofint {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap so nguyen n: ");
            int n = scanner.nextInt();
            int tong=0;
            while(n>0){
                int tam = n%10;
                tong += tam;
                n /= 10;
            }
            System.out.println("Tong so nguyen cua n: " +tong);
    }
}


package lecture5;

import java.util.Scanner;

public class tongchanle {
    public static void main(String[] arg){
        int tongle=0;
        int tongchan=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                tongchan +=i;
                
            }else{
                tongle +=i;
                
            }
        }
        System.out.println("Tong so chan tu 1 den 100 la:\n" +tongchan );
        System.out.println("Tong so le tu 1 den 100 la: \n" +tongle );
    }
}

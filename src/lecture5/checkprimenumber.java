package lecture5;

public class checkprimenumber {
    public static void main(String[] args){
        System.out.print("So nguyen to tu 1 den 100 la: \n");
        for(int i = 1; i <= 100; i++){
            if(checkPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean checkPrimeNumber(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            } 
        }
        return true;
    }
}
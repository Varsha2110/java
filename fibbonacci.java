public class fibbonacci {
    public static void main(String[] args){
        int num1=0;
        int num2=1;
            for(int i=0;i<=10;i++){
            int num=num1+num2;
            System.out.println("Fibonacci Series:"+num); 
            num1=num2;
            num2=num; 
        }
    }
    
}

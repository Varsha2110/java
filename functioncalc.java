import java.util.Scanner;

public class Calculator{
    void calculator(){
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1:");
        a=sc.nextInt();
        System.out.println("Enter the number1:"); 
        b=sc.nextInt();
        System.out.println("Enter the operator (+,-,*,/):");
        char op = sc.next().charAt(0);
        double o = 0;
        if(op=='+'){
            System.out.println(a+b);
        }
        else if(op=='-'){
            System.out.println(a-b);
        }
        else if(op=='*'){
            System.out.println(a*b);
        }
        else{
            System.out.println(a/b);
        }

    }
    obj.calculator();61

}}
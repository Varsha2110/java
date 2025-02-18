

public class ExceptionHa{
    public static void main(String[] args){
        try {
            int a=10;
            int b=0;
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
        try {
            int[] a= {1,2,3,4};
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index 10 not exist");
        }
        try{
            String s=null;
            System.out.println(s.length());
        }
          catch (NullPointerException e){
            System.out.println("There is no data stored");
          }
    }
}
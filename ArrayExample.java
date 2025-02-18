public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2= new int[3];
        int j=2;
        for(int i=0;i<arr.length;i++){
            if(i!=j){
                arr2[j++]=arr[i];
            }
        }
        System.out.println(arr2);

    }
}
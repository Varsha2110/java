class TabulationEx1{
    public static int main(String[] args){
        int n=10;
        int[] table=new int[n+1];
        int n
        table[0]=0;
        table[1]=1;
        for (int i=2;i<=n;i++){
            table[i]=table[i-1]+table[i-2];
        }
        return table[n];
    }
}
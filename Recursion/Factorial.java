class Factorial{
    public static void main(String[] args) {
        int res = fact(5);
        System.out.print(res);
    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return (n-1) * n;
    }
}
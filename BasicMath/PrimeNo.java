class PrimeNo{
    public static void main(String[] args) {
        int num = 2;
        int count =0;
        for(int i=1;i<=num;i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print("Prime No");
        }else{
            System.out.print("Not a Prime No");
        }

    }
}

public class FibonacciNonRecursive {

    public static void main(String[] args){
       //System.out.println(fib(10));
       for(int k = 1; k<=10; k ++){
        System.out.println(fib(k));
       }
    }
    
    public static long fib(long n){
        long f0 = 0;
        long f1 = 1;
        long f2 = 1;

        if(n==0){
            return f0;
        }else if(n==1){
            return f1;
        }else if(n==2){
            return f2;
        }

        for(int i = 3; i<=n; i++){
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }
        return f2;
    }
}

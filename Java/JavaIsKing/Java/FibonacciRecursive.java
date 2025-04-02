public class FibonacciRecursive {

    public static long fib(long index){
        if(index==0){
            return 0;
        }else if(index == 1){
            return 1;
        }else {
            return fib(index-1) + fib(index-2);
        }
    }

    public static void main(String[] args) {
        int n = 50;
        for(int i = 0; i<n; i++){
            System.out.println(fib(i));
        }
    }
}

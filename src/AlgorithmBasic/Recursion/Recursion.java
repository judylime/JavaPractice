package AlgorithmBasic.Recursion;

public class Recursion {
    public static void main(String[] args) {
//        Solution sol = new Solution();
//        for (int i = 0; i < 200; i++) {
//            System.out.println("Fibo(" + i + ")=" + sol.fibo(i) + " ");
//        }
    }
}

class solution {
    public long fibo(int n) {
        // base case
        if(n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        //subproblem
        //recursion rule
        return fibo(n - 1) + fibo(n - 2);
    }
    public long fib(int n) {
        if(n < 0) {
            return -1;
        }
        if(n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long a = 0;
        long b = 1;
        for(int i = 0; i < n - 1; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    //TC: O(n) SC: O(1)

    public long power(int a, int b) {
        //base case
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        }
        //recursion rule
        long half = power(a, b / 2);
        if ( b % 2 == 1){
            return half * half * a;
        } else {
            return half * half;
        }
    }
}

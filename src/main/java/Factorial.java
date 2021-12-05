public class Factorial {


    public static Long computeFactorial(int n){

        if(n == 0){
            return 1L;
        }
        return n * computeFactorial(n-1);

    }

//    n = n x (n-1) x (n-1)

}

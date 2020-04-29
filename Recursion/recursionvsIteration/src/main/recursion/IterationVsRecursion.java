public class IterationVsRecursion {

public int iterationSum(int N){
    int result = 0;
    for (int i = 1; i < N; i++)
         result+=1;

    return result;
}

public int recursion(int N){
    if(N<=1) return 1;
    return N+recursion(N-1);
}

//the computer automatically use the stack memory
    //calling the method recursively the calls and the results pushed into the stuck one-by-one
    //reach the base case >> return 1
        // return 2+1
        // return 3+2+1
        // return 4+3+2+1
    /*
     recursionSum(4)
            recursionSum(3)
                    recursionSum(2)
                            recursionSum(1)
                            return 1
                     return 2+1
             return 3+2+1
      return 4+3+2+1
    These method calls and values are stored on the stack
     */

}

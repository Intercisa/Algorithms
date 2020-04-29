public class HeadAndTail {



    public void head(int N){
        if(N<=1) return;
        head(N-1);
        System.out.printf("%d", N);
    }


    public void tail(int N){
        if(N<=1) return;
        System.out.printf("%d", N);
        tail(N-1);
    }




}

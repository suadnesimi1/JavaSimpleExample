package CreateMethod;

public class callstack_method {

    public static void main(String arg[]){
        int i=5,j=6;
        int result=max(i,j);
        System.out.println(result);
    }
    public static int max(int a, int b){
        int max;
        if(a<b)
            max=a;
        else
            max=b;
        return max;
    }
}

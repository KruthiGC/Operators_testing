package operators;

public class SwapTwoNumbers {
    public static int[] SwapWithTemp(int a ,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        return new int[]{a,b};
    }

    public static int[] SwapWithoutTemp(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        return new int[]{a,b};
    }
}

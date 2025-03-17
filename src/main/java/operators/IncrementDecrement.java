//6. Write a program to show the difference between pre and post ++/-- operators.

package operators;

public class IncrementDecrement {
public static int postIncrement(int a){
    int original=a;
    a++;
    return original;
}

public static int preIncrement(int a){
    return ++a;

}

public static int postDecrement(int b){
    int original=b;
    b--;
    return original;
}

public static int preDecrement(int b){
    return --b;
}
}
//    public static void main(String[] args) {
//        int a = 5;
//        System.out.println("original value: " + a);
//        System.out.println("post increment " + a++);
//        System.out.println("post incremented value: " + a);
//        System.out.println("pre increment done: " + ++a);
//        System.out.println("value after pre-increment: " + a);
//        System.out.println();
//        int b = 8;
//        System.out.println("original value: " + b);
//        System.out.println("post decrement done: " + b--);
//        System.out.println("post decrement value: " + b);
//        System.out.println("pre decrement done: " + --b);
//        System.out.println("pre decrement value:" + b);
//    }
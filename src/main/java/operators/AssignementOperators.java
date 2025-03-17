//8. Write a program to apply all assignment operators.
package operators;

public class AssignementOperators {
    public static int addAssignment(int a,int value){
        return a+=value;
    }

    public static int subAssignment(int a,int value){
        return a-=value;
    }

    public static int multiplyAssignment(int a,int value){
        return a*=value;

    }

    public static int divideAssignment(int a,int value){
        if(value==0){
            throw new ArithmeticException("Cannot divide by zero");

        }
        return a/=value;
    }

    public static int moduloAssignment(int a,int value){
        if(value==0){
            throw new ArithmeticException("modulo operation can't be performed");

        }
        return a%=value;
    }
}



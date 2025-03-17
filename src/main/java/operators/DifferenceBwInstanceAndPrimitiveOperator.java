//5. Write a program to show the difference while comparing (==) primitive data type variables and instance variables.
package operators;


class test{
    int num;
    public test(int num) {
        this.num = num;
    }
}


public class DifferenceBwInstanceAndPrimitiveOperator {
public static boolean CompaPrimitive(int a,int b){
    return a==b;
}

public static boolean CompaReferenced(test obj1,test obj2){
    return obj1==obj2;
}

public static boolean CompaObjValues(test obj1,test obj2){
    return obj1.num==obj2.num;
}
}

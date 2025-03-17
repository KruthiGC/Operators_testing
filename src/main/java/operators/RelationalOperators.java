//4. Write a program to apply relational operators and to compare same type variables.
package operators;

public class RelationalOperators {
//    public static void main(String args[]) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("ENter number 1:");
//        int num1=scanner.nextInt();
//        System.out.println("ENter number 2:");
//        int num2=scanner.nextInt();
        public boolean EqualTo(int num1,int num2){
            return num1==num2;
        }

        public boolean GreaterThan(int num1,int num2){
            return num1>num2;
        }

        public boolean GreaterThanOrEqual(int num1,int num2){
            return num1>=num2;
        }

        public boolean SmallerThanOrEqual(int num1,int num2){
             return num1<=num2;
    }
        public boolean SmallerThan(int num1,int num2){
            return num1<num2;
    }

    public boolean NotEqual(int num1,int num2){
        return num1!=num2;
    }

//    }
}

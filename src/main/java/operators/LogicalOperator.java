//3. Write a program to apply all the logical operators and show the behavior.

package operators;


public class LogicalOperator {
   public static boolean andOperator(boolean a,boolean b){
       return a&&b;
   }

   public static boolean orOperator(boolean a,boolean b){
       return a||b;
   }

   public static boolean notOperator(boolean a){
       return !a;
   }

   public static boolean complexAndOperation(int x,int y){
       return (x<=y)&&(x==y);
   }

   public static boolean complexOrOperation(int x,int y){
       return (x<=y)||(x==y);
   }












}

package Week1.Task1;

/** Дописать функции сложения/вычитания
 *
 * раскомментируйте код и:
 * сложите переменные x и y через функцию сложения sum()
 * вычтите переменную y от x через функцию вычитания difference()
 *
 */
public class Task1 {
    public static void main (String[] args){
         int x = 5;
         int y = 3;

         int sum = sum(x, y);
         int difference = subtract(x, y);

         System.out.println(sum);
         System.out.println(difference);
    }


    public static int sum(int x, int y){
       return  x+y;
    }

    public static int subtract(int x, int y){
        return y-x;
    }


}

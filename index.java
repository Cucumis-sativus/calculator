import java.util.Scanner;

public class index{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.print("一つ目の数字を入力");
        double num1 = scan.nextDouble();

        System.out.println("演算子を入力");
        char ope = scan.next().charAt(0);

        System.out.println("二つ目の数字を入力");
        double num2 = scan.nextDouble();
        scan.close();

        double result;

        switch(ope){
            case '+' ->{
                 result = num1 + num2;
            }
            case '-' ->{
                result = num1 - num2;
            }
            case '*' ->{
                result = num1 * num2;
            }
            case '/'->{
                if (num2 != 0){
                    result = num1 / num2;
                }else{
                    System.out.println("ゼロで割ることはできません");
                    return;
                }
            }
            default ->{
                System.out.println("無効な演算子です");
                return;
            }
        }
        
        System.out.println("計算結果：" + result);

    }
}
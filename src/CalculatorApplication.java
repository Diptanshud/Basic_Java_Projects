import java.util.Scanner;

public class CalculatorApplication {
    public void add(int a, int b) {
        int add = a + b;
        System.out.println(add);
    }
    public void sub(int a, int b) {
        int sub = a - b;
        System.out.println(sub);
    }
    public void mul(int a, int b) {
        int mul = a * b;
        System.out.println(mul);
    }
    public void divide(int a, int b) {
        int divide = a/b;
        System.out.println(divide);
    }
    public int[] userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstoperand =sc.nextInt();
        System.out.println("Enter the second number");
        int secondoperand =sc.nextInt();
        return new int[] {firstoperand,secondoperand};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorApplication ca = new CalculatorApplication();
        System.out.println("Enter the Number to start the operation. 1)Addition 2)Subtraction 3)Multiplication 4)Divide");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Addition");
                int[] result = ca.userInput();
                int firstoperand = result[0];
                int secondoperand = result[1];
                ca.add(firstoperand,secondoperand);
                break;
            case 2:
                System.out.println("Subtraction");
                int[] res = ca.userInput();
                int firstoperands = res[0];
                int secondoperands = res[1];
                ca.sub(firstoperands,secondoperands);
                break;
            case 3:
                System.out.println("Multiplication");
                int[] resu = ca.userInput();
                int firstoperandd = resu[0];
                int secondoperandd = resu[1];
                ca.mul(firstoperandd,secondoperandd);
                break;
            case 4:
                System.out.println("Divide");
                int[] re = ca.userInput();
                int firstoperande = re[0];
                int secondoperande= re[1];
                ca.divide(firstoperande,secondoperande);
                break;
            default:
                System.out.println("Operation End");
        }
    }
}

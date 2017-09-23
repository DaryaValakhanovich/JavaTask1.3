import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение a");
        int a = scanner.nextInt();
        System.out.println("Введите значение b");
        int b = scanner.nextInt();
        System.out.println("Введите значение с");
        int c = scanner.nextInt();
        int D = discriminant(a, b, c);
        double x1, x2 = 0;

        if (isPositive(D)){
            x1 = (-b-Math.sqrt(D))/2 *a;
            x2 = (-b+Math.sqrt(D))/2 *a;
            System.out.println("Корни уравнения: " + x1 + ", " + x2);
        } else if(isZero(D)){
            x1 = -b/2*a;
            System.out.println("Корень уравнения: " + x1);
        } else {
            System.out.println("Нет корней, т. к. дискриминант отрицательный");
        }
    }



    static boolean isPositive(int x){
        return x > 0;
    }

    static boolean isZero(int x){
        return x == 0;
    }

    static int discriminant(int a, int b, int c){
        return b * b - 4 * a * c;
    }
}

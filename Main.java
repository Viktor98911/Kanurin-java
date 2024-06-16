
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Введите первое целое число: ");
int a = scanner.nextInt();

System.out.print("Введите второе целое число: ");
int b = scanner.nextInt();

String comparisonResult = compareNumbers(a, b);
System.out.println(comparisonResult);

performOperations(a, b);
}

public static String compareNumbers(int a, int b) {
if (a > b) {
return "a > b";
} else if (a < b) {
return "a < b";
} else {
return "a = b";
}
}

public static void performOperations(int a, int b) {
System.out.println("Сумма: a + b = " + (a + b));
System.out.println("Разность: a - b = " + (a - b));

try {
double divisionResult = (double) a / b;
System.out.println("Деление: a / b = " + divisionResult);
} catch (ArithmeticException e) {
System.out.println("Деление на ноль");
}

System.out.println("Умножение: a * b = " + (a * b));
}
}














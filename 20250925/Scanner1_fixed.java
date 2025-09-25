import java.util.Scanner;

public class Scanner1_fixed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 계산기 프로그램 ===");
        
        // 계산 메서드들 호출
        add_method(scanner);
        // subtract_method(scanner);
        // multiply_method(scanner);
        // divide_method(scanner);
        
        printCalculation(scanner);


        radius(scanner);
        scanner.close(); // main에서 한 번만 scanner 닫기
    }
    
    public static void add_method(Scanner scanner1) {
        int result;
        int num1, num2;

        System.out.println("\n=== 덧셈 계산 ===");
        System.out.print("첫 번째 숫자를 입력하세요: ");
        num1 = scanner1.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        num2 = scanner1.nextInt();

        result = num1 + num2;   
        System.out.println("두 수의 합: " + result);
    }
    
    // public static void subtract_method(Scanner scanner2) {
    //     int result;
    //     int num1, num2;

    //     System.out.println("\n=== 뺄셈 계산 ===");
    //     System.out.print("첫 번째 숫자를 입력하세요: ");
    //     num1 = scanner2.nextInt();

    //     System.out.print("두 번째 숫자를 입력하세요: ");
    //     num2 = scanner2.nextInt();

    //     result = num1 - num2;   
    //     System.out.println("두 수의 차: " + result);
    // }
    
    // public static void multiply_method(Scanner scanner3) {
    //     int result;
    //     int num1, num2;

    //     System.out.println("\n=== 곱셈 계산 ===");
    //     System.out.print("첫 번째 숫자를 입력하세요: ");
    //     num1 = scanner3.nextInt();

    //     System.out.print("두 번째 숫자를 입력하세요: ");
    //     num2 = scanner3.nextInt();

    //     result = num1 * num2;   
    //     System.out.println("두 수의 곱: " + result);
    // }
    
    // public static void divide_method(Scanner scanner4) {
    //     double result;
    //     int num1, num2;

    //     System.out.println("\n=== 나눗셈 계산 ===");
    //     System.out.print("첫 번째 숫자를 입력하세요: ");
    //     num1 = scanner4.nextInt();

    //     System.out.print("두 번째 숫자를 입력하세요: ");
    //     num2 = scanner4.nextInt();

    //     if (num2 != 0) {
    //         result = (double) num1 / num2;   
    //         System.out.println("두 수의 나눈 값: " + result);
    //     } else {
    //         System.out.println("0으로 나눌 수 없습니다!");
    //     }
    // }

    public static void printCalculation(Scanner scanner5) {
        String name;
        int birth, age;
        
        System.out.println("\n=== 나이 계산 ===");
        
        // nextInt() 후 남은 개행문자 제거
        scanner5.nextLine();
        
        System.out.print("이름을 입력하세요: ");
        name = scanner5.nextLine();

        System.out.print("출생년도를 입력하세요: ");
        birth = scanner5.nextInt();

        age = 2025 - birth + 1;
        
        System.out.println(name + "님의 나이는 " + age +"세입니다.");
    }

    public static void radius(Scanner scanner6) {
        double radius, area;
        
        System.out.println("\n=== 원 넓이 계산 ===");
        System.out.print("원의 반지름을 입력하세요: ");
        radius = scanner6.nextDouble();
        
        area = Math.PI * radius * radius;
        System.out.printf("반지름이 %.2f인 원의 넓이는 %.2f입니다.%n", radius, area);
    }
}

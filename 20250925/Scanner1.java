import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 자기소개 프로그램 ===");
        
        // 이름 입력받기
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        
        // 나이 입력받기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        
        // 키 입력받기
        System.out.print("키(cm)를 입력하세요: ");
        double height = scanner.nextDouble();
        
        // 결과 출력하기
        System.out.println("\n=== 당신의 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("키: " + height + "cm");
        
        // 인사말
        System.out.println("\n안녕하세요, " + name + "님! 반갑습니다!");
        

        scanner.close(); // scanner 닫기

    }
}

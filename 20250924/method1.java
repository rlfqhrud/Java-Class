public class method1 {
    public static void main(String[] args){

         // 간단한 계산
        int num5 = 10;
        int num6 = 5;
        int sum = num5 + num6;

        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(num5 + " + " + num6 + " = " + sum);

        printCalculation(num5, num6, sum);
        printCalculation1(num5, num6, sum);
        sum_printCalculation(num5, num6, num5*num6);
    }
    
    
    // 계산 결과를 출력하는 메서드
        public static void printCalculation(int number1, int number2, int result) {
            System.out.println("\\n=== 간단한 계산 ===");
            System.out.println(number1 + " + " + number2 + " = " + result);
    }

        private static void printCalculation1(int number1, int number2, int result) {
            System.out.println("\\n=== 간단한 계산 ===");
            System.out.println(number1 + " + " + number2 + " = " + result);
    }
        private static void sum_printCalculation(int numbar1, int numbar2, int result){
            System.out.println("\\n === 곱하기===");
            System.out.println(numbar1 + " * " + numbar2 + " = " + result);
    }

}

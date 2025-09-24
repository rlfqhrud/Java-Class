public class method1 {
    public static void main(String[] args){
        final int MAX_SIZE = 100;

        System.out.println("상수 1 : " + MAX_SIZE);
        System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
        System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
        System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
        System.out.println(3147483647L + 3147483648L);
        System.out.println(3.0004999D + 2.0004999D);
        System.out.println(3.0004999F + 2.0004999F);
        System.out.println("AB" + '\b' + 'C');//백스페이스
        System.out.println("AB" + '\t' + 'C');//탭
        System.out.println("AB" + '\n' + 'C');//줄바꿈
        System.out.println("AB" + '\r' + 'C');//

        int num3 = 50;
        long num4 = 3147483647L;
        System.out.println(num3 + num4);

        double pi = 3.1415; 
        int wholeNumber = (int)pi;
        System.out.println(wholeNumber);

        int num1 = 7;
        int num2 = 3;
        
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 / num2 = " + ((float)num1 / (float)num2));
        System.out.println("num1 / num2 = " + (float)(num1 / num2));

         // 간단한 계산
        int num5 = 10;
        int num6 = 5;
        int sum = num5 + num6;

        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(num5 + " + " + num6 + " = " + sum);
    }

}

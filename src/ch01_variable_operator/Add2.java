package ch01_variable_operator;

public class Add2 {
    static void main() {
        // 변수 정의
        int a;
        int b;
        int c;
        int result;

        // 변수 대입
        a = 3;
        b = 4;
        c = 5;
        result = 2*a + 3*b - c;

        // 출력
        System.out.println("a : " + a); // a : 3
        System.out.println("b : " + b); // b : 4
        System.out.println("c : " + c); // c : 5
        System.out.println("result = 2*a + 3*b - c = " + 2*a + " + " + 3*b + " " + "- " + c + " = " + result);
        // result = 2*a + 3*b -  = 6 + 12 - 5 = 13
        System.out.println(" "); // 줄바꾸기
        System.out.println("출력 결과"); // 출력 결과
        System.out.println("a = " + a); // a = 3
        System.out.println("b = " + b); // b = 4
        System.out.println("c = " + c); // c = 5
        System.out.println("result = " + result); // result = 13
    }
}

package ch01_variable_operator;

public class ShowJumsu {
    static void main() {

        // 변수 정의
        String name;
        double Korean;
        double English;
        double average;

        // 변수 대입
        name = "홍길동";
        Korean = 40.0;
        English = 43.0;
        average = (Korean + English) / 2;

        // 출력
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + Korean);
        System.out.println("영어 : " + English);
        System.out.println("평균 : " + average);

    }
}

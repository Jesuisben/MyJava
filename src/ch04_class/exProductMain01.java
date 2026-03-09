package ch04_class;

public class exProductMain01 {
    static void main() {
        // 객체 생성
        exProduct01 watch = new exProduct01();

        //객체 할당
        watch.setMovement("automatic");
        watch.setPower_reserve(38);
        watch.material = "stainLess";

        //메소드 사용
        watch.Display();


    }
}

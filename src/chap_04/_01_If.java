package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15; // 10:00 AM

        // if문 내에서 하나의 문장을 실행할 때는 중괄호 생략 가능
        if (hour < 14)
            System.out.println("Available");
        else
            System.out.println("Unavailable");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false; // 모닝 커피 정보

        // morningCoffee == false 와 같은 기능을 하는 구문으로, !morningCoffee 가 있다. !는 부정 연산자
        if (hour < 14 && morningCoffee == false)
            System.out.println("Available");
        else
            System.out.println("Unavailable");
    }
}

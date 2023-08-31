package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 10;
        if (hour < 14) { // 오후 2시 이전이면 주문
            System.out.println("Americano");
        }
        else { // 그 외의 경우이면 아래 명령어 수행. (01 강좌때 본능적으로 else 구문까지 이미 써버렸네..)
            System.out.println("Iced Tea");
        }
        System.out.println("Ordered #1");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        boolean morningCoffee = true;

        if(hour > 14 || morningCoffee == true) {
            System.out.println("Iced Tea");
        }
        else {
            System.out.println("Americano");
        }
        System.out.println("Ordered #2");
    }
}

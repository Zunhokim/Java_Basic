package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 석차에 따른 장학금 지급
        // 1등 : 전액 / 2등 : 반액 / 3등 : 반액 / 그 외 : 대상 아님.

        int ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("전액");
                break;
            case 2:
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("대상 아님");
        }

        // 중고 상품의 등급에 따른 가격 책정 (1급 : 최상, 4급 : 최하)
        int grade = 1;
        int price = 7000;

        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(price);
    }
}

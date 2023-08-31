package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIF

        // 오렌지 에이드 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean orangeAde = true;
        boolean mangoJuice = true;

        if (orangeAde) {
            System.out.println("Orange Ade +1");
        } else if (mangoJuice) {
            System.out.println("Mango Juice +1");
        } else {
            System.out.println("Americano +1");
        }
        System.out.println("Ordered");
    }
}

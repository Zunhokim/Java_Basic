package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String num1 = "901231-1234567";
        String num2 = "030708-4567890";

        System.out.println(num1.substring(0, 8)); // 0번째 인덱스부터 8번째 인덱스까지 출력
        System.out.println(num2.substring(0, num2.indexOf("-") + 2)); // 0번째 인덱스부터 - 인덱스 기준 2자리까지 출력
    }
}

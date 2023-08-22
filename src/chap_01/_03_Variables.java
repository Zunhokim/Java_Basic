package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "Unknown";
        int hour = 15;

        System.out.println(name + ", 배송이 시작됨. " + hour + "시에 배송 예정.");
        System.out.println(name + ", 배송 완료.");

        double score = 90.5;
        char grade = 'A';
        name = "Nobody";

        System.out.println(name + "의 평균 : " + score + "점, 학점 : " + grade);
    }
}

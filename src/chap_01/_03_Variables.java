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

        /* 변수의 형식
        int : 정수형 / long : 큰 수 (끝에 대문자 또는 소문자 L을 붙여야함)
        double : 실수형 / float : 자릿수가 적은 실수형 (끝에 대문자 또는 소문자 F를 붙여야함)
        char : 단일 문자 / String : 문자열
        boolean : true or false
         */
    }
}


package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구별 없이 문자열 내용의 동일 여부 확인

        // 문자열 비교 심화
        s1 = "1234"; // (참조, 같은 곳을 참조함)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true, 단순히 내용만 비교
        System.out.println(s1 == s2); // s1과 s2의 참조가 같은지 비교

        s1 = new String("1234"); // 서로 다른 메모리 공간에 저장됨
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}

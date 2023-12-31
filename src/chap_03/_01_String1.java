package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변환
        System.out.println(s.toLowerCase()); // 소문자로 변환

        // 포함 관계
        System.out.println(s.contains("Java")); // Java라는 글자가 포함 되는가?
        System.out.println(s.contains("C#")); // C#이라는 글자가 포함 되는가?
        System.out.println(s.indexOf("Java")); // Java라는 문자열의 시작 위치 정보 확인
        System.out.println(s.indexOf("C#")); // 포함되지 않는 문자열은 -1로 반환
        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 문자열 위치
        System.out.println(s.startsWith("I like")); // I like 라는 문자열로 시작하면 true, 아니면 false
        System.out.println(s.endsWith(".")); // .으로 끝이나면 true, 아니면 false
    }
}

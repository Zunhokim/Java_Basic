package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'

        System.out.println("Java\nis\nso funny."); // \n : 줄바꿈

        System.out.println("Apple\t900won\nOrange\t800won\nGrape\t800won"); // \t : 탭

        System.out.println("C:\\Program Files\\Java"); // \\ : 역슬래시

        System.out.println("\"Speak\""); // \" : 큰 따옴표

        System.out.println("\'Think\'"); // \' : 작은 따옴표
    }
}

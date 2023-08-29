package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int a = 115;
        int b = 121;
        String x = (a>=120)?"키가 "+a+"cm, 탑승 가능":"키가 "+a+"cm, 탑승 불가";
        String y = (b>=120)?"키가 "+b+"cm, 탑승 가능":"키가 "+b+"cm, 탑승 불가";

        System.out.println(x);
        System.out.println(y);
    }
}

package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        // 수영장에서 수영을 하는 모습
        int distance = 25;
        int move = 0;

        while (move < distance) {
            move += 5;
            System.out.println(move+"m");
        }
        System.out.println("Arrive");
    }
}

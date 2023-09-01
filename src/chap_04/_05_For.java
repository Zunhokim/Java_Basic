package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        for(int i = 0; i < 10; i++) {
            System.out.println("어서오세요, 나코입니다.");
        }

        for(int i = 0; i < 10; i += 2) { // 짝수 출력
            System.out.print(i); // println은 한 구문이 한줄에 나오고, print는 이어서 나온다.
        }
        System.out.println();
        for(int i = 1; i < 10; i += 2) { // 홀수 출력
            System.out.print(i);
        }

        System.out.println();
        // 1~n까지의 합
        int sum = 0;

        for (int i = 1; i < 101; i++) { // 1부터 100(=n)까지의 합
            sum += i;
        }
        System.out.println(sum);
    }
}

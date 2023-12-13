package kadai4;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("整数を入力してください");
            int n = input.nextInt();
            if (n % 2 == 0) {
                System.out.println("偶数です");
            } else {
                System.out.println("奇数");
            }
        }
    }
}

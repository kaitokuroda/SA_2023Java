package kadai3;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("年齢を入力してください:");
            int age = input.nextInt();

            if (age < 0 || age > 120) {
                System.out.println("エラー");
                break;
            } else if (age < 20) {
                System.out.println("未成年");
            } else {
                System.out.println("成人");
            }
        }
    }
}

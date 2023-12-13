package kadai5;

import java.util.Scanner;

public class kadai48 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("整数を入力してください");
        int n=input.nextInt();

        Hantei hantei=new Hantei();
        hantei.evenOrOdd(n);
    }
}

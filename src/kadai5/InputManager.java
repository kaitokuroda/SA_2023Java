package kadai5;

import java.util.Scanner;

public class InputManager {
    Scanner input=new Scanner(System.in);

    int scan(){
        System.out.println("整数を入力してください");
        return input.nextInt();
    }
}

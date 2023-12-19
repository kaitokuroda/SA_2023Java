package kadai12;

import java.util.Scanner;

public class DeckCheck {
    public static void main(String[] args) {
        Deck deck=new Deck();
        deck.printCardList();
        System.out.println("整数を入力してください");
        Scanner input=new Scanner(System.in);
        try {
            int index = input.nextInt();
            deck.drawCard(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println("正しい数値が入力されませんでした");
        }
    }
}

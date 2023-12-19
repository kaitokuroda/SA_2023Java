package kadai12;

import java.util.ArrayList;
import java.util.List;

public class SimpleBJ {
    public static void main(String[] args) {
        List<Card> p_list=new ArrayList<>();
        List<Card> c_list=new ArrayList<>();
        Battle battle=new Battle();

        p_list=battle.draw(p_list);
        c_list=battle.draw(c_list);
        int p_total= battle.total(p_list);
        System.out.println("あなたの手札の合計は"+p_total);
        int c_total= battle.total(c_list);
        System.out.println("コンピュータの手札の合計は"+c_total);
        battle.judge(p_total,c_total);
    }
}

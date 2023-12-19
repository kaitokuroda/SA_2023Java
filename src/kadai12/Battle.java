package kadai12;

import java.util.List;

public class Battle {
    Deck deck=new Deck();
    public Battle(){

    }

    public List draw(List<Card> p_list){
        for(int i=0;i<2;i++){
            p_list.add(deck.drawCard(i));
        }
        return p_list;
    }

    public int total(List<Card> player) {
        int p_total =0;
        for (int i = 0; i<player.size(); i++) {
             p_total =player.get(i).getNumber()+p_total;
        }
        return p_total;
    }

    public void judge(int p_total,int c_total){
        if(p_total==c_total){
            System.out.println("引き分けです");
        }else if(p_total<22){
             if(c_total>21||p_total>c_total){
                System.out.println("あなたの勝ちです");
            }else{
                 System.out.println("あなたの負けです");
             }
        }else if(p_total>21){
            if(c_total>21){
                System.out.println("引き分けです");
            } else if (c_total<22) {
                System.out.println("あなたの負けです");
            }
        }



    }

}

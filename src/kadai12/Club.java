package kadai12;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private String clubName;
    private Member komon;
    private List<Member> memberList;

    public Club(String clubName, Member komon) {
        this.clubName = clubName;
        this.komon = komon;
        this.memberList=new ArrayList<>();
    }

    public void join(Member menber){
                memberList.add(menber);
        }


    public void leave(String gakuseki){
        for(Member member:memberList){
            if(member.getGakuseki().equals(gakuseki)){
                memberList.remove(member);
            }
        }
    }

    public void print(){
        System.out.println(clubName);
        for(Member member:memberList){
                member.print();
            }
        }
    }


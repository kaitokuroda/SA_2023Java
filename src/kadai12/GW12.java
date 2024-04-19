package kadai12;



import java.util.Scanner;

public class GW12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("部活名を入力:");
        String clubName=input.next();
        System.out.println("顧問名を入力");
        String komonName= input.next();
        Member komon=new Member("komon",komonName);
        Club club=new Club(clubName,komon);


        while(true){
            System.out.println("入部＝１,表示＝２,削除＝３,終了＝０");
            System.out.println("数字を入力：");

            int i= input.nextInt();

            if(i==1){
                System.out.println("学籍番号を入力：");
                String gakuseki= input.next();

                System.out.println("氏名を入力");
                String shimei= input.next();

                Member member=new Member(gakuseki,shimei);
                club.join(member);
            }else if(i==2){
                club.print();
            }else if(i==3){
                System.out.println("削除する学籍を入力");
                String r_gakuseki=input.next();
                club.leave(r_gakuseki);
            }else if(i==0){
                System.exit(0);
            }
        }
    }
}

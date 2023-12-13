package kadai10;

import java.util.Scanner;

public class ZukeiApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("縦：");
        float tate= input.nextFloat();
        System.out.println("横：");
        float yoko= input.nextFloat();
        System.out.println("高さ：");
        float takasa= input.nextFloat();

        Shikaku shikaku=new Shikaku(tate,yoko,takasa);
        shikaku.print();
        Sankaku sankaku=new Sankaku(tate,yoko,takasa);
        sankaku.print();
//        Shikakusui shikakusui=new Shikakusui(tate,takasa);
//        shikakusui.print();
//        Shikakusui shikakusui1=new Shikakusui(tate,yoko,takasa);
//        shikakusui1.print();
    }
}

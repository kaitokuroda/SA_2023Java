package kadai6;

import java.util.Scanner;

public class kadai56 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("x=");
        float x=input.nextFloat();
        System.out.print("y=");
        float y= input.nextFloat();
        System.out.print("z=");
        float z= input.nextFloat();

        Square s=new Square();
        s.tate=x;
        s.yoko=y;
        s.takasa=z;
        float sm=s.menseki();
        System.out.println("四角形の面積は"+sm);
        float st=s.taiseki();
        System.out.println("四角柱の体積は"+st);

        Triangle t=new Triangle();
        t.tate=x;
        t.yoko=y;
        t.takasa=z;
        float tm=t.menseki();
        System.out.println("三角形の面積は"+tm);
        float tt=t.taiseki();
        System.out.println("三角柱の体積は"+tt);
    }
}

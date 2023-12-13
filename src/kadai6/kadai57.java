package kadai6;

import java.util.Scanner;

public class kadai57 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            System.out.print("x=");
            float x = input.nextFloat();
            System.out.print("y=");
            float y = input.nextFloat();
            System.out.print("z=");
            float z = input.nextFloat();
        }
        TriangleFinder triangleFinder=new TriangleFinder();
    }
}

package kadai6;

import java.util.Scanner;

public class kadai58 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TriangleFinder tf = new TriangleFinder();
        tf.triangles = new Triangle[3];

        for (int i = 0; i < tf.triangles.length; i++) {
            Triangle t = new Triangle();
            System.out.print("x" + i + "=");
            t.tate = input.nextFloat();

            System.out.print("y" + i + "=");
            t.yoko = input.nextFloat();

            System.out.print("z" + i + "=");
            t.takasa = input.nextFloat();

            tf.triangles[i] = t;
        }

        tf.findMaxMenseki();
        tf.findMaxTaiseki();
    }
}

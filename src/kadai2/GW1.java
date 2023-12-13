package kadai2;

public class GW1 {
    public static void main(String[] arg) {
        long a = 2;
        double b = 0.9;
        double c = 1.0;
        float d = 0.9F;

        long longAns = a - (long) b;
        double doubleAns1 = c - b;
        double doubleAns2 = c - d;

        System.out.println(longAns);
        System.out.println(doubleAns1);
        System.out.println(doubleAns2);

    }
}

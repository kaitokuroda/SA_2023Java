package kadai4;

import java.util.Scanner;

public class GW1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        char[] charArray=new char[4];

        for(int i=0;i<charArray.length;i++){
            System.out.print("input=");
            charArray[i]=input.nextLine().charAt(0);
        }
//        System.out.print("input=");
//        charArray=input.nextLine().toCharArray();
        System.out.println(charArray);
    }
}

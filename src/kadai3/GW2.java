package kadai3;

import java.util.Scanner;

public class GW2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String st="";

        System.out.print("input=");

        while (true){
            st= input.next();
            System.out.println(st);
            if(st.equals("。")){
                break;
            }
        }
    }
}

package kadai5;

import java.util.Scanner;

public class SearchMin {
    int[] scanIntArray(){
        Scanner input=new Scanner(System.in);
        int[] ia=new int[5];

        for(int i=0;i<ia.length;i++){
            System.out.println("整数を入力してください");
            ia[i]=input.nextInt();
        }
        return ia;
    }

    void showIntArrayAndMin(int[] ia){
        Comparison comparison=new Comparison();
        int min=ia[0];

        for(int i=0;i<ia.length;i++){
            int item=ia[i];
            System.out.println("第"+i+"要素は"+item);
            min=comparison.getMin(min,item);
        }
        System.out.println("最小値は"+min);
    }
}

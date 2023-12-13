package kadai4;

import java.util.Scanner;

public class Array2DMap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[][] ia=new int[5][5];

        int x=2;
        int y=2;

        while(true){
            for(int j=0;j<ia.length;j++) {
                for (int i = 0; i < ia.length; i++) {
                    if (i == x && j==y) {
                        ia[i][j] = 1;
                    } else {
                        ia[i][j] = 0;
                    }
                    System.out.print(ia[i][j] + "");
                }
                System.out.println("");
            }
            System.out.print("どちらに移動する？:");

            String key=input.next();
            switch (key){
                case "a":
                    x=x-1;
                    if(x<0){
                        x=x+5;
                    }
                    System.out.println("左に移動");
                    break;
                case "d":
                    x=x+1;
                    if(x==5){
                        x=x-5;
                    }
                    System.out.println("右に移動");
                    break;
                case "w":
                    y=y-1;
                    if(y<0){
                        y=y+5;
                    }
                    System.out.println("上に移動");
                    break;
                case "x":
                    y=y+1;
                    if(y==5){
                        y=y-5;
                    }
                    System.out.println("下に移動");
                    break;
                case "q":
                    System.out.println("終了");
                    System.exit(0);
            }
        }
    }
}


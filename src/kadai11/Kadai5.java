package kadai11;

import java.io.IOException;

public class Kadai5 {
    public static void main(String[] args) {
        try{
            FileManager fileManager=new FileManager("students.txt");
            String[] lines=fileManager.getAsArray();
            for (int i=0;i<lines.length;i++){
                String line=lines[i];
                Student student=new Student(line);
                student.print();
            }
        }catch (IllegalArgumentException e1){
            System.out.println("ファイル名を正しく入れてください");
        }catch (IOException e2){
            System.out.println("ファイルが読み込めません");
        }
        System.out.println("終了");
    }
}

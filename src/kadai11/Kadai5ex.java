package kadai11;

import java.io.IOException;
import java.util.List;

public class Kadai5ex {
    public static void main(String[] args) {
        try{
            FileManager fileManager=new FileManager("students.txt");
            List<String> lines=fileManager.getAsList();
            for (String line:lines){
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

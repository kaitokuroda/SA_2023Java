package kadai11;

public class Student {
    private String number;
    private String name;

    public Student(String arg) {
        if(arg==null){
            throw new RuntimeException();
        }
        String[] splited=arg.split(",");
        this.number=splited[0];
        this.name=splited[1];
    }

    public void print(){
        String message="学籍："+this.number+"氏名："+this.name;
        System.out.println(message);
    }
}

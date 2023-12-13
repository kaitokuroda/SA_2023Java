package kadai11;

public class StringArrayManager {
    private String[] data;
    private int size;

    public StringArrayManager() {
        this.data = new String[100];
        this.size=0;
    }

    public void add(String st) {
        data[size]=st;
        size++;
    }
    public String get(int index){
        if(data[index]==null){
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }

}

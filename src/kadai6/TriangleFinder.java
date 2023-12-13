package kadai6;

public class TriangleFinder {
    Triangle[] triangles;

    void findMaxMenseki(){
        int index=0;
        for(int i=1;i< triangles.length;i++){
            if(triangles[index].menseki()<triangles[i].menseki()){
                index=i;
            }
        }
        System.out.println("最も面積が大きいインスタンスは"
                + index
                + "番目で、面積は"
                + triangles[index].menseki());
    }

    void findMaxTaiseki() {
        int index = 0;
        for (int i = 1; i < triangles.length; i++) {
            if (triangles[index].taiseki() < triangles[i].taiseki()) {
                index = i;
            }
        }
        System.out.println("最も体積が大きいインスタンスは"
                + index
                + "番目で、体積は"
                + triangles[index].taiseki());
    }




}

package kadai10;

public class Sankaku extends Zukei{
    public Sankaku(float tate,float yoko,float takasa){
        super.tate=tate;
        super.yoko=yoko;
        super.takasa=takasa;
    }

    protected float calcMenseki(){
        float tate=super.tate;
        float yoko=super.yoko;
        float ans=tate*yoko/2;
        return ans;
    }
}

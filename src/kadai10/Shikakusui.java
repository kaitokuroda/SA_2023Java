package kadai10;

public class Shikakusui extends Shikaku{
//    private float ippen;
//    public Shikakusui(){
//        super (0,0,0);
//    };

    public Shikakusui(float ippen,float takasa){
        super(ippen,ippen,takasa);
    }

    public Shikakusui(float tate,float yoko,float takasa){
        super(tate,yoko,takasa);
    }

    @Override
    protected float calcTaiseki(){
        float tate=super.tate;
        float yoko=super.yoko;
        float takasa=super.takasa;
        float ans=tate*yoko*takasa/3;
        return ans;
    }
}

package kadai10;

public class Zukei {
    protected float tate;
    protected float yoko;
    protected float takasa;

//    public Zukei(float tate, float yoko, float takasa) {
//        this.tate = tate;
//        this.yoko = yoko;
//        this.takasa = takasa;
//    }

    protected float calcMenseki(){
        return 0.0f;
    }
    protected float calcTaiseki(){
        return calcMenseki()*takasa;
    }

    public void print(){
        float ansm=calcMenseki();
        float anst=calcTaiseki();
        System.out.println("面積："+ansm+", 体積"+anst);
    }
}

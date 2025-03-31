public class Ponto2D {
    private static int quanditade;
    private double x, y;
    public Ponto2D(){
        x=y=0;
        ++quanditade;
    }

    public Ponto2D(double x, double y){
        this.x=x;
        this.y=y;
        ++quanditade;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public static int getQuanditade(){
        return quanditade;
    }

}

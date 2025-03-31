public class TestaPonto2D {
    public static void main(String[] args) {
        Ponto2D Obj1 = new Ponto2D();
        Ponto2D Obj2 = new Ponto2D(4 ,2);

        System.out.print("Coordenadas de P1: ");
        System.out.printf("%.2f ", Obj1.getX() );
        System.out.printf("%.2f ", Obj1.getY() );

        System.out.print("Coordenadas de P1: ");
        System.out.printf("%.2f ", Obj2.getX() );
        System.out.printf("%.2f ", Obj2.getY() );

        System.out.println("Quantidade de objetos: " + Ponto2D.getQuanditade());
    }

}

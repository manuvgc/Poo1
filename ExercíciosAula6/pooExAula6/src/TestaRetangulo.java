public class TestaRetangulo {
    public static void main(String[] args) {

        Retangulo R1 = new Retangulo();
        Retangulo R2 = new Retangulo(923, 2);
        Retangulo R3 = new Retangulo(0, 5);

        System.out.println("Perímetro: " + R2.Perimetro());
        System.out.println("Área: " + R2.Area());

        R3.isQuadrado();
        R1.isQuadrado();

        R2.printAreaPerimetro();

        R2.alteraRetangulo(-9, 10);
    }
}

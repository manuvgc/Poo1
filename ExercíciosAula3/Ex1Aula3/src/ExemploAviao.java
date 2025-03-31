public class ExemploAviao {
    public static void main(String[] args){
        Aviao aviao1 = new Aviao();
        aviao1.fabricante = "Boeing";
        aviao1.modelo = "777";
        aviao1.qtdeAssentos = 200;

        aviao1.ligar();

        Aviao aviao2 = new Aviao();
        aviao2.fabricante = "MIAAAAAAAAAAAAAU";
        aviao2.modelo = "mrooooooow";
        aviao2.qtdeAssentos = 1;

        aviao2.ligar();
    }
}

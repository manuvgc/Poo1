public class Retangulo {
        private double comprimento, largura;

        public Retangulo(){
            comprimento = 1.0;
            largura = 1.0;
        }

        public Retangulo(double comprimento, double largura){
            this.comprimento = comprimento;
            this.largura = largura;
        }

        public double Perimetro(){
            return (comprimento*2)+(largura*2);
        }

        public double Area(){
            return comprimento*largura;
        }

        public void printAreaPerimetro(){
            System.out.println("A área do retângulo é:" + Area());
            System.out.println("O perímetro do retângulo é:" + Perimetro());
        }

        public void isQuadrado(){
            if(comprimento==largura){
                System.out.println("O retângulo é quadrado");
            }else{
                System.out.println("O retângulo não é quadrado");
            }
        }

        public void alteraRetangulo(double comprimento, double largura){
        if (comprimento<=0 || largura<=0){
            System.out.println("Dimensões Inválidas!");
        }else {
            this.comprimento = comprimento;
            this.largura = largura;
        }
    }

}

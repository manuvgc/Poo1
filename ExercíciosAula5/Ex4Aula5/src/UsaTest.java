public class UsaTest {
    public static void main(String[] args) {
        Test test1 = new Test(5);
        Test test2 = new Test(10);
        System.out.println("Antes da troca");
        System.out.println("ob1.a = " + test1.getA());
        System.out.println("ob2.a = " + test2.getA());
        troca(test1, test2);
        System.out.println("Depois da troca");
        System.out.println("ob1.a = " + test1.getA());
        System.out.println("ob2.a = " + test2.getA());
    }

    public static void troca(Test ob1, Test ob2) {
        Test aux = ob1;
        ob1 = ob2;
        ob2=aux;
        System.out.println("Durante da troca");
        System.out.println("ob1.a = " + ob1.getA());
        System.out.println("ob2.a = " + ob2.getA());
    }
}
/* No java, quando uma variavel é enviada como paramentro, ele só envia uma cópia, e não uma referência,
então o valor original das váriaveis não é trocado.
 */
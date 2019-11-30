public class Principal {
    public static void main(String[] args) {

        Pato pato = new Pato(5);
        Aviao aviao = new Aviao(10);
        SuperHomem superHomem = new SuperHomem(100);

        TorreDeControle torreControle = new TorreDeControle();
        torreControle.addVoador(pato);
        torreControle.addVoador(aviao);
        torreControle.addVoador(superHomem);

        torreControle.voemTodos();
    }
}

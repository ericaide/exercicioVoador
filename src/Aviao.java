public class Aviao implements Voador {

    private int horas;

    public Aviao(int horas) {
        this.horas = horas;
    }

    @Override
    public void voar() {
        int horasAtualizadas = this.horas + 13;
        System.out.println("Estou voando como um avião. Horas de voo total: " + horasAtualizadas);

    }
}

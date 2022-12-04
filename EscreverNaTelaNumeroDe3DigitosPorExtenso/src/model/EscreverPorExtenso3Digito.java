package model;

public class EscreverPorExtenso3Digito extends EscreverPorExtenso2Digito {

    private final String grupoCentena[] = new String[]{"Cento", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seissentos", "Setessentos", "Oitocentos", "Novecentos"};
    private int centena;
    private String saida3 = "";

    public int getCentena() {
        return centena;
    }

    public void setCentena(int centena) {
        this.centena = centena;
    }

    public void inicializarCentenaDezenaUnidade(int numero) {
        centena = (int) (numero / 100) * 100;
        super.inicializarDezenaUnidade(numero - this.getCentena());
    }

    @Override
    public String escrever(int numero) {
        inicializarCentenaDezenaUnidade(numero);
        if (numero == 100) {
            saida3 = "Cem";
        } else if (this.getDezena() == 0 && this.getUnidade() == 0) {
            index = (centena / 100) - 1;
            saida3 = grupoCentena[index];
        } else {
            index = (this.getCentena() / 100) - 1;
            saida3 = this.grupoCentena[index] + " e " + super.escrever(this.getDezena() + this.getUnidade());
        }

        return saida3;
    }
}

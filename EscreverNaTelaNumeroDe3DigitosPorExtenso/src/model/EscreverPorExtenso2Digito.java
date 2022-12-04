package model;

public class EscreverPorExtenso2Digito extends EscreverPorExtenso1Digito {

    private final String grupoDezena1[] = new String[]{"Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove"};
    private final String grupoDezena2[] = new String[]{"Dez", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"};
    private String saida2 = "";
    private int dezena, unidade;

    public int getDezena() {
        return dezena;
    }

    public void setDezena(int dezena) {
        this.dezena = dezena;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public void inicializarDezenaUnidade(int numero) {
        this.dezena = (int) (numero / 10) * 10;
        this.unidade = numero - dezena;
    }

    @Override
    public String escrever(int numero) {
        inicializarDezenaUnidade(numero);
        if (dezena >= 20 && unidade > 0) {
            index = (dezena / 10) - 1;
            saida2 = grupoDezena2[index] + " e " + super.escrever(unidade);

        } else if (unidade == 0) {
            index = (dezena / 10) - 1;
            saida2 = grupoDezena2[index];
        } else {
            index = unidade - 1;
            saida2 = grupoDezena1[index];
        }
        return saida2;
    }

}

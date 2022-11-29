package model;

public class EscreverPorExtenso2Digito extends EscreverPorExtenso1Digito {

    public String saida2 ="", grupoDezena[] = new String[]{"Dez", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"};
    private int dezena = 0, unidade = 0, index;

    public void inicializarDezenaUnidade(int numero) {
        dezena = (int) (numero / 10) * 10;
        unidade = numero - dezena;
    }

    public String escrever2Digitos(int numero) {
        inicializarDezenaUnidade(numero);
        if (unidade > 0) {
            index = dezena / 10;
            saida2= grupoDezena[index - 1] + " e " +super.escrever1Digito(unidade);

        } else {
            index = dezena / 10;
            saida2= grupoDezena[index - 1];
        }
        return saida2;
    }

}

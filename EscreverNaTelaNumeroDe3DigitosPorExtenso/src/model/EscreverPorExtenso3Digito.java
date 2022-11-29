package model;

public class EscreverPorExtenso3Digito extends EscreverPorExtenso2Digito {

    public String saida3="",grupoCentena[] = new String[]{"Cento", "Dozentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seissentos", "Setessentos", "Oitocentos", "Novecentos"};
    private int centena = 0, dezena = 0, unidade = 0, index;

    public void inicializarCentenaDezenaUnidade(int numero) {
        centena = (int) (numero / 100) * 100;
        dezena = (int) ((numero - centena) / 10) * 10;
        unidade = numero - dezena - centena;
    }

    public String escrever3Digitos(int numero) {
        inicializarCentenaDezenaUnidade(numero);
        if (numero == 100) {
            saida3 = "Cem";
        } else if (dezena == 0 && unidade == 0) {
            index = centena / 100;
            saida3 = grupoCentena[index - 1];
        } else if (dezena > 0 && dezena < 20 && unidade == 0) {
            saida3 = grupoCentena[(centena / 100) - 1] + " e " + super.escrever1Digito(dezena);
        } else if (dezena > 0 && unidade == 0) {
            saida3 = grupoCentena[(centena / 100) - 1] + " e " + super.escrever2Digitos(dezena + unidade);
        } else if (dezena == 0 && unidade > 0) {
            saida3 = grupoCentena[(centena / 100) - 1] + " e " + super.escrever1Digito(unidade);
        } else if (dezena > 0 && dezena < 20 && unidade > 0) {
            saida3 = grupoCentena[(centena / 100) - 1] + " e " + super.escrever1Digito(unidade + dezena);
        } else {

            saida3 = grupoCentena[(centena / 100) - 1] + " e " + super.escrever2Digitos(dezena + unidade);
        }
        return saida3;
    }
}

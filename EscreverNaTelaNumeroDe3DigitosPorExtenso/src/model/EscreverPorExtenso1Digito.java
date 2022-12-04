package model;

public class EscreverPorExtenso1Digito extends Escrever {

    private final String grupoUnidade[] = new String[]{"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove"};

    @Override
    public String escrever(int numero) {
        return grupoUnidade[numero];
        
    }

}

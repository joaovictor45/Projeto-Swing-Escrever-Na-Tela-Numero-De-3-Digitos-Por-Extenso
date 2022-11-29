package model;

public class EscreverPorExtenso1Digito {

    public String grupoUnidade[] = new String[]{"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove"};

    public String escrever1Digito(int numero) {
        return grupoUnidade[numero];
    }

}

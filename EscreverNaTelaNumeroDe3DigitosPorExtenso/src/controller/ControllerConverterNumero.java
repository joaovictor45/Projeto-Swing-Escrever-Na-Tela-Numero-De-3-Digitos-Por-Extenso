package controller;

import javax.swing.JOptionPane;
import model.EscreverPorExtenso1Digito;
import model.EscreverPorExtenso2Digito;
import model.EscreverPorExtenso3Digito;
import view.TelaPrincipalView;
import view.TelaRespostaView;

public class ControllerConverterNumero {

    TelaPrincipalView view;

    public ControllerConverterNumero(TelaPrincipalView view) {
        this.view = view;
    }
    EscreverPorExtenso1Digito escreverPorExtenso1 = new EscreverPorExtenso1Digito();
    EscreverPorExtenso2Digito escreverPorExtenso2 = new EscreverPorExtenso2Digito();
    EscreverPorExtenso3Digito escreverPorExtenso3 = new EscreverPorExtenso3Digito();

    public void Converter() {
        String saidaResultado = "";
        int numero = Integer.parseInt(view.getjTextField1NumeroDigitado().getText());
        if (numero < 0 || numero > 999) {

            JOptionPane.showMessageDialog(null, "Número inválido. Digite outro.");

        } else if (numero < 10) {
            saidaResultado = escreverPorExtenso1.escrever(numero);
        } else if (numero < 100) {
            saidaResultado = escreverPorExtenso2.escrever(numero);
        } else if (numero < 1000) {
            saidaResultado = escreverPorExtenso3.escrever(numero);
        }
        TelaRespostaView tela2 = new TelaRespostaView(saidaResultado);
        if (numero < 1000 && numero >= 0) {
            tela2.setVisible(true);
        }
        view.getjTextField1NumeroDigitado().setText("");
    }
}

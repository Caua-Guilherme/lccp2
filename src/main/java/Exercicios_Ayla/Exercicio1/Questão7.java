package Exercicios_Ayla.Exercicio1;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Questão7 {
    public static void main(String[] args) {
        Double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        Double imc = peso/(altura*altura);
        JOptionPane.showMessageDialog(null,"O seu imc é" + imc);
    }
}

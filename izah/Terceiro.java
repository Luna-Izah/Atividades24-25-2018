package br.com.pedroenju;

import javax.swing.JOptionPane;

public class Terceiro {

    private String operacao;
    private float num;
    private float resultado;

    public Terceiro() {
        operacao = "";
        num = 0;
        resultado = 0;
    }

    public void operacoes() {
        this.num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

        while (true) {
            String tmpOp = JOptionPane.showInputDialog("Qual é a operação?\r\n"
                    + "+    para SOMA\r\n"
                    + "-    para SUBTRAÇÃO\r\n"
                    + "*    para MULTIPLICAÇÃO\r\n"
                    + "/    para DIVISÃO\r\n"
                    + "\r\n.    para SAIR");

            if (tmpOp.equals(".")) {
                System.out.printf("O resultado final: %.2f\r\n", this.resultado);
                break;
            } else {
                this.operacao = tmpOp;
                float tmpNum = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
                this.calculo(tmpNum);
                JOptionPane.showMessageDialog(null, "Resultado: " + this.resultado);
                System.out.printf("O resultado: %.2f\r\n", this.resultado);
            }
        }
    }

    public void calculo(float tmpNum2) {
        switch (this.operacao) {
            case "+":
                this.resultado = this.num + tmpNum2;
                break;
            case "-":
                this.resultado = this.num - tmpNum2;
                break;
            case "*":
                this.resultado = this.num * tmpNum2;
                break;
            case "/":
                this.resultado = this.num / tmpNum2;
                break;
            default:
                System.out.println("Ué");
                break;
        }
        this.num = this.resultado;

    }
}

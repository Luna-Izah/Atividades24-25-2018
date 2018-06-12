
package br.com.pedroenju;

import javax.swing.JOptionPane;

public class Sexto {
    private String[] nome;
    private float[] valor;

    public Sexto() {
        nome = new String[3];
        valor = new float[3];
    }

    public void posto() {
        for (int i = 0; i < this.nome.length; i++) {
            this.nome[i] = JOptionPane.showInputDialog("Informe o " + (i + 1) + " posto");
            this.valor[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do " + (i + 1)));
        }
        this.ordenar();
        this.imprimir();

    }

    public boolean ordenar() {
        int x = 0;
        String tmp;
        float tmp2;
        while (x < (this.nome.length - 1)) {
            if (this.valor[x] > this.valor[x + 1]) {
                tmp = this.nome[x];
                tmp2 = this.valor[x];
                this.nome[x] = this.nome[x + 1];
                this.valor[x] = this.valor[x + 1];
                this.nome[x + 1] = tmp;
                this.valor[x + 1] = tmp2;
                x = 0;
            } else {
                x++;
            }
        }
        return true;
    }

    public void imprimir() {
        System.out.println("Posto com menor preço");
        for (int i = 0; i < this.nome.length; i++) {
            System.out.printf("Posto: %s\tPreço: %.2f\r\n", this.nome[i], this.valor[i]);
        }
    }
}

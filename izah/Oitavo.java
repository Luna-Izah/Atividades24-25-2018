package br.com.pedroenju;

import javax.swing.JOptionPane;

public class Oitavo {

    private String[] nome;

    public Oitavo() {
        nome = new String[6];
    }

    public void nomeReverso() {
        for (int i = 0; i < this.nome.length; i++) {
            this.nome[i] = JOptionPane.showInputDialog("Informe o " + (i + 1) + " nome");
        }
        for (int i = (this.nome.length - 1); i >= 0; i--) {
            System.out.printf("Nome: %s\r\n", this.nome[i]);
        }
    }
}

package br.com.pedroenju;

import javax.swing.JOptionPane;

public class Segundo {

    private int var1;
    private double var2;
    private float var3;
    private boolean var4;
    private String var5;

    public Segundo() {
        var1 = 7;
        var2 = 700.5;
        var3 = 7.7f;
        var4 = true;
        var5 = "Pedro Henrique Masato Enju";
    }

    public void imprimir() {

        JOptionPane.showMessageDialog(null,
                "A variável int: " + this.var1
                + "\r\nA variável double: " + this.var2
                + "\r\nA variável float: " + this.var3
                + "\r\nA variável boolean: " + this.var4
                + "\r\nA variável String: " + this.var5);

    }
}

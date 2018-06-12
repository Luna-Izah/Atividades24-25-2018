package br.com.pedroenju;

import javax.swing.JOptionPane;

public class Decimo {

    private float kmL;
    private float distancia;
    
    public void litroNecessario() {
        this.kmL = Float.parseFloat(JOptionPane.showInputDialog("Informe a média KM/L"));
        this.distancia = Float.parseFloat(JOptionPane.showInputDialog("Informe a distância"));
        JOptionPane.showMessageDialog(null, "São necessários " + this.litroCalculo() + " litros de combústivel");
    }
    public float litroCalculo() {
        return (this.distancia / this.kmL);
    }
}

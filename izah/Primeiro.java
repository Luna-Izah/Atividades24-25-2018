
package br.com.pedroenju;

public class Primeiro {
    
    private int var1;
    private double var2;
    private float var3;
    private boolean var4;
    private String var5;

    public Primeiro() {
        var1 = 7;
        var2 = 700.5;
        var3 = 7.7f;
        var4 = true;
        var5 = "Pedro Henrique Masato Enju";
    }
    
    public void imprimir() {
        
        System.out.printf("A variável int: %d\r\nA variável double: %f\r\n"
                + "A variável float: %f\r\nA variável boolean: %b\r\n"
                + "A variável String: %s\r\n", this.var1, this.var2, this.var3, this.var4, this.var5);
        
    }
}

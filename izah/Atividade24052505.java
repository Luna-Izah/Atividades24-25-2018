package br.com.pedroenju;

import javax.swing.JOptionPane;

public class Atividade24052505 {

    public static void main(String[] args) {
        boolean tmp = true;
        while (tmp == true) {
            String opcao = JOptionPane.showInputDialog("O que deseja fazer?\r\n"
                    + "1 para Primeira atividade\r\n"
                    + "2 para Segunda atividade\r\n"
                    + "3 para Terceira atividade\r\n"
                    + "4 para Quarta atividade\r\n"
                    + "5 para Quinta atividade\r\n"
                    + "6 para Sexta atividade\r\n"
                    + "7 para Sétima atividade\r\n"
                    + "8 para Oitava atividade\r\n"
                    + "9 para Nona atividade\r\n"
                    + "0 para Décima atividade\r\n"
                    + "X para sair");
            if (opcao.toUpperCase().equals("X")) {
                tmp = false;
            } else if( (opcao.equals("1")) || (opcao.equals("2")) || (opcao.equals("3"))
                    || (opcao.equals("4")) || (opcao.equals("5")) || (opcao.equals("6"))
                    || (opcao.equals("7")) || (opcao.equals("8")) || (opcao.equals("9"))
                    || (opcao.equals("0"))) {
                int opcao2 = Integer.parseInt(opcao);
                switch (opcao2) {
                    case 1:
                        Primeiro one = new Primeiro();
                        one.imprimir();
                        break;
                    case 2:
                        Segundo two = new Segundo();
                        two.imprimir();
                        break;
                    case 3:
                        Terceiro three = new Terceiro();
                        three.operacoes();
                        break;
                    case 4:
                        Quarto four = new Quarto();
                        four.ordemCrescente();
                        break;
                    case 5:
                        Quinto five = new Quinto();
                        five.frase();
                        break;
                    case 6:
                        Sexto six = new Sexto();
                        six.posto();
                        break;
                    case 7:
                        Setimo seven = new Setimo();
                        seven.inicio();
                        break;
                    case 8:
                        Oitavo eight = new Oitavo();
                        eight.nomeReverso();
                        break;
                    case 9:
                        Nono nine = new Nono();
                        nine.kmLitro();
                        break;
                    case 0:
                        Decimo ten = new Decimo();
                        ten.litroNecessario();
                        break;

                }
            }
        }
    }

}

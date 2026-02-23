package com.cdl.jogo;
import javax.swing.JFrame;

public class Janela extends JFrame {
    public Janela(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Janela();
    }
    
}

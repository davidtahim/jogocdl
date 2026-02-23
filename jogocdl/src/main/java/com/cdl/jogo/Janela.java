package com.cdl.jogo;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Janela extends JFrame {
    private JPanel tela;

    public Janela(){

        tela = new JPanel(){

            public void paintComponent(Graphics g){
                // Aqui você pode desenhar o que quiser usando o objeto Graphics 'g'
                g.setColor(Color.BLUE);
                g.drawLine(0, 240, 640, 240);
                g.drawRect(0, 0, 20, 20);
                g.drawOval(30, 20, 40, 30);
                g.drawString("Olá, Mundo!", 100, 100);  
                

            }

        };

        super.getContentPane().add(tela);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Janela();
    }
    
}

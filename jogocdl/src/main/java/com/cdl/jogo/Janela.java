package com.cdl.jogo;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Janela extends JFrame {
    private JPanel tela;

    public Janela(){

        tela = new JPanel(){

            public void paintComponent(Graphics g){
                // Aqui você pode desenhar o que quiser usando o objeto Graphics 'g'
                
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

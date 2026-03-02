package com.cdl.jogo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Interativo extends JFrame {
    private JPanel tela;
    private int px;
    private int py;
    private boolean jogando = true;
    private final int FPS = 1000 / 20;

    public void inicia() {

        long prxAtualizacao = 0;

        while (jogando) {
            if (System.currentTimeMillis() >= prxAtualizacao) {
                tela.repaint();
                prxAtualizacao = System.currentTimeMillis() + FPS;
            }
        }

    }

    public Interativo() {
        super.addKeyListener(new KeyListener() {
            // evento de teclado apertada
            public void keyTyped(KeyEvent e) {
            }

            // evento de teclado liberado
            public void keyReleased(KeyEvent e) {
            }

            // evento da tecla pressionada
            public void keyPressed(KeyEvent e) {
                // eventos do teclado
                int tecla = e.getKeyCode();

                switch (tecla) {
                    case KeyEvent.VK_ESCAPE:
                        jogando = false;
                        dispose(); // fechar a janela

                        break;

                    case KeyEvent.VK_UP:
                        py--;
                        break;
                    case KeyEvent.VK_DOWN:
                        py++;
                        break;

                    case KeyEvent.VK_LEFT:
                        px--;
                        break;
                    case KeyEvent.VK_RIGHT:
                        px++;
                        break;
                    default:
                        break;
                }
            }
        });


        tela = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight()); 
                // Calcula a posição do retângulo com base no centro da tela e nos deslocamentos px e py
                int x = getWidth() / 2 - 20 + px;
                int y = getHeight() / 2 - 20 + py;
                g.setColor(Color.BLUE);
                g.fillRect(x, y , 40, 40);
                g.drawString("Agora eu estou em (" + x + ", " + y + ").", 5, 10);
            }
        };

        getContentPane().add(tela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);

    }

    public static void main(String[] args) {
        Interativo jogo = new Interativo();
        jogo.inicia();
    }

}

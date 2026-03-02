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
                        py++;
                        break;
                    case KeyEvent.VK_DOWN:
                        py--;
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

    }

}

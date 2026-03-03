package com.cdl.jogo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


public class InterativoMouse extends JFrame {
    private JPanel tela;
    private int px;
    private int py;
    private Point mouseClick = new Point();
    private boolean jogando = true;
    private final int FPS = 1000 / 20;

    public InterativoMouse(){
        tela = new JPanel(){
             public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight());
                // Calcula a posição do retângulo com base no centro da tela e nos deslocamentos
                // px e py
                int x = getWidth() / 2 - 20 + px;
                int y = getHeight() / 2 - 20 + py;
                g.setColor(Color.BLUE);
                g.fillRect(x, y, 40, 40);
                g.drawString("Agora eu estou em (" + x + ", " + y + ").", 5, 10);
            }
        };
        tela.addMouseListener(new MouseListener() {
            public void mouseReleased(MouseEvent e) {
				// Botao mouse liberado
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// Botao mouse pressionado
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// Mouse saiu da tela
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// Mouse entrou na tela
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// Clique do mouse
				mouseClick = e.getPoint();
			}
        });
        super.getContentPane().add(tela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
    }
        public void inicia() {
		long prxAtualizacao = 0;

		while (jogando) {
			if (System.currentTimeMillis() >= prxAtualizacao) {
				atualizaJogo();
				tela.repaint();

				prxAtualizacao = System.currentTimeMillis() + FPS;
			}
		}
	}

	private void atualizaJogo() {
		px = mouseClick.x;
		py = mouseClick.y;
	}

	public static void main(String[] args) {
		InterativoMouse jogo = new InterativoMouse();
		jogo.inicia();
	}

  }
    

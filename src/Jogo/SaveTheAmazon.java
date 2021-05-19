package Jogo;

import java.awt.Color;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class SaveTheAmazon extends JPanel implements Runnable{

    private Passaro passaro;
    
    // É chamado quando fazemos o new
    public SaveTheAmazon(){

        passaro = new Passaro();
        Thread lacoDoJogo = new Thread(this);
        lacoDoJogo.start();
    }
    
    public void run(){

        while(true){

            update();
            repaint();
            dorme();

        }
    }

    private void update(){

    }

    // renderização dos componentes 
    public void paintComponent(Graphics2D g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.blue);
        g.fillRect(0, 0, 50, 50);
        
        passaro.renderizarPassaro(g);

    }

    // velocidade de funcionamento do jogo
    private void dorme(){
        try{
            Thread.sleep(20);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}

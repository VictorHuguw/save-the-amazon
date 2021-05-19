package Jogo;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Passaro {
    
    BufferedImage desenho;

    // construtor da nave
    public Passaro(){
        try{
            desenho = ImageIO.read(new File("sprites/teste.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void renderizarPassaro(Graphics2D g){
         g.drawImage(desenho, 50, 50, null);
    }
}

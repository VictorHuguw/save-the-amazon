package Jogo;

import javax.swing.JFrame;


public class MainJogo {
    public static void main(String[] args) {
        // Inicializando a janela
        JFrame janela = new JFrame("Save the amazon");
        // Definindo tamanho da janela
        janela.setSize(1366,768);
        
        //nao usar nenhum layout padrao do java
        janela.setLayout(null);

        //abrir no centro da tela
        janela.setLocationRelativeTo(null);
        
    
        SaveTheAmazon jogo = new SaveTheAmazon();
        
        jogo.setBounds(0,0,1366,768); //necessario que SaveTheAmazon seja um Jpanel
        
        //adicionando o main do jogo
        janela.add(jogo);

        janela.setVisible(true);

        
    }
}

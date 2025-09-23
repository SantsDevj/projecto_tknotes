package interfaces_graficas;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame{
    public JanelaPrincipal(){
        ImageIcon image = new ImageIcon("recursos_graficos/logo/logo_tknotes.png");

        this.setSize(1280, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setTitle("TKNotes");
        this.setIconImage(image.getImage());
        this.setLocationRelativeTo(null);
    }

    //Definindo a visibilidade por este método
    public void tornarVisivel(){
        this.setVisible(true);
    }
}

package interfaces_graficas;

import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame{
    public JanelaPrincipal(){
        this.setSize(1280, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("TKNotes");
        this.setVisible(true);
    }
}

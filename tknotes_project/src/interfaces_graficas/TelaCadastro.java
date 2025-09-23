package interfaces_graficas;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class TelaCadastro extends JanelaPrincipal{

    //Constructor para iniciar a interface gráfica
    public TelaCadastro(){
        
        //Criando Paineis
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();


        //Defindo as dimensões dos painéis
        panel1.setPreferredSize(new Dimension(500,500));
        panel2.setPreferredSize(new Dimension(500,500));

        //Defindo as cores dos painéis
        panel1.setBackground(new Color(0x333333));
        panel2.setBackground(new Color(0xF5F5F5));

        //Usando a imagem da Logo
        ImageIcon image = new ImageIcon("recursos_graficos/logo/logo_tknotes.png");

        //Adicionado a imagem no painel número 1

        //Adicionando os paineis na janela
        this.add(panel1, new BorderLayout().EAST);
        this.add(panel2, new BorderLayout().WEST);
        
    }
}

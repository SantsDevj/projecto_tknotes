package interfaces_graficas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;

public class TelaCadastro extends JanelaPrincipal{

    //Constructor para iniciar a interface gráfica
    public TelaCadastro(){
        
        //Criando Paineis
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();


        //Defindo as dimensões dos painéis
        panel1.setPreferredSize(new Dimension(500,100));
        panel2.setPreferredSize(new Dimension(800,100));

        //Defindo as cores dos painéis
        panel1.setBackground(new Color(0xFFFFF5));
        panel2.setBackground(new Color(0x888888));

        /*Configurando o Painel 1*/

        //Usando a imagem da Logo
        ImageIcon image = new ImageIcon("recursos_graficos/logo/logo_tknotes.png");

        //Adicionado a imagem nos painéis

        //Usando Labels para colocar as imagens
        JLabel label = new JLabel();
        label.setIcon(image);

        //Label para Mensagem de Boas-Vindas
        JLabel label2 = new JLabel();
        label2.setText("Seja Bem-Vindo ao TKNotes");
        label2.setForeground(Color.GRAY); 
        label2.setFont(new Font("Verdana", Font.BOLD, 24));

        //Adicionando a imagem no painel
        panel1.add(label2);
        panel1.add(label);

        /*Configurando o Painel 2*/

        //Configurando Botões
        JButton button = new JButton();
        button.setSize(150,80);
        button.setText("Cadastrar");

        //Adicionando Texto
        JLabel labelP2 = new JLabel();
        labelP2.setText("Cadastre-se no TKNotes");
        labelP2.setForeground(Color.WHITE); 
        labelP2.setFont(new Font("Verdana", Font.BOLD, 24));

        //Adicionado área de texto
        JTextField text = new JTextField();
        text.setSize(new Dimension(100, 100));
        text.setText("Nome");
        text.setEditable(false);

        JTextField text1 = new JTextField();
        text.setSize(new Dimension(100, 100));
        text1.setText("Email");
        text1.setEditable(false);
        
        JTextField text2 = new JTextField();
        text2.setSize(new Dimension(100, 100));
        text2.setText("Senha");
        text2.setEditable(false);

        //Adicionando elementos no Painel 2
        panel2.add(labelP2);
        panel2.add(text);
        panel2.add(text1);
        panel2.add(text2);
        panel2.add(button);


        //Adicionando os paineis na janela
        this.add(panel1, new BorderLayout().WEST);
        this.add(panel2, new BorderLayout().EAST);
        
    }
}

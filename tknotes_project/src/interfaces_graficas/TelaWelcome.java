package interfaces_graficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaWelcome extends JanelaPrincipal {
    public TelaWelcome(){
        //Defindo a cor do fundo
        this.getContentPane().setBackground(Color.WHITE);

        //Colocando a imagem
        ImageIcon imgIcon = new ImageIcon("recursos_graficos/logo/logo_tknotes.png");

        //redefinindo o tamanho da imagem
        Image imgOriginal = imgIcon.getImage();
        Image resImg = imgOriginal.getScaledInstance(500, 500, Image.SCALE_SMOOTH);

        /*-------Configurando o Painel para Imagem-------*/
        JPanel imgpanel = new JPanel();
        imgpanel.setBackground(Color.WHITE);
        //Criando label para a imagem
        JLabel labelimg = new JLabel(new ImageIcon(resImg));

        /*Configurando o painel para Label de Mensagem*/
        JPanel msgPanel = new JPanel();
        msgPanel.setBackground(Color.WHITE);
        msgPanel.setPreferredSize(new Dimension(300,100));

        //Label para mensagem
        JLabel msgLabel = new JLabel("TKNotes: Sua vida organizada, seus objetivos alcançados!");
        msgLabel.setFont(new Font("verdana", Font.PLAIN, 20));
        msgLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
        msgLabel.setForeground(new Color(0x007BFF));

        //Adicionando label ao painel
        msgPanel.add(msgLabel);

        
        /*------Adicionando Botões na tela------*/

        //Colocando um painel específico para este botão
        JPanel buttonpanel = new JPanel();
        buttonpanel.setBackground(Color.WHITE);
        buttonpanel.setPreferredSize(new Dimension(200, 200));

        JButton contButton = new JButton();
        contButton.setForeground(Color.WHITE);
        contButton.setBackground(new Color(0x12A2B8));
        contButton.setPreferredSize(new Dimension(300, 100));
        contButton.setFocusable(false);

        //Criando label para o botão
        JLabel buttonLabel = new JLabel("            Continuar");
        buttonLabel.setForeground(Color.WHITE);
        buttonLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        buttonLabel.setLayout(new FlowLayout(FlowLayout.CENTER));

        /*--------------Configurando o evento neste botão---------------*/
        contButton.addActionListener(e ->{
            if (e.getSource() == contButton) {
                TelaCadastro telacad = new TelaCadastro();
                telacad.setVisible(true);
            }
        });
        
        /*---------Adicionando label para o botão-------------*/
        contButton.add(buttonLabel);
        /*---------------Adicionando elementos no painel botão-------------*/
        buttonpanel.add(contButton);

        /*---------------Adicionando elementos no painel de imagem-------------*/
        imgpanel.add(labelimg);
        
        /*-------Adicionando na Janela-------*/
        this.add(imgpanel, new BorderLayout().CENTER);
        this.add(buttonpanel, new BorderLayout().SOUTH);
        this.add(msgPanel, new BorderLayout().NORTH);
    }

}

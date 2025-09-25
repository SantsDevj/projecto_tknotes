package interfaces_graficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaListaTarefas extends JanelaPrincipal{
    
    //Constructor para criação desta interface gráfica

    public TelaListaTarefas(){

        /*-------------Configurandos Painéis para estrutura da tela------------*/

        //Painel para o topo da tela

        JPanel topoPainel = new JPanel();

        //Configurando o painel do topo

        topoPainel.setBackground(Color.WHITE);
        topoPainel.setPreferredSize(new Dimension(80, 80));
        topoPainel.setLayout(new FlowLayout(FlowLayout.CENTER));

        //Configurando os elementos de painel do topo

        //Ícone da Imagem para topo do painel

        ImageIcon topoPanelImg = new ImageIcon("recursos_graficos/logo/logo_tknotes.png");

        Image imgTopo = topoPanelImg.getImage();
        Image resImg = imgTopo.getScaledInstance(70, 70, Image.SCALE_SMOOTH); //Imagem redimensionada

        ImageIcon resIconimg = new ImageIcon(resImg); //usando o ImageIcon para conseguir adicionar no Label de imagem

        //Label para mensagem de tarefas

        JLabel taskLabel = new JLabel("Tarefas");

        //configurações do taskLabel
        taskLabel.setFont(new Font("verdana", Font.BOLD, 24));
        taskLabel.setForeground(new Color(0x333333));
        taskLabel.setBackground(Color.WHITE);

        //Label para imagem redimensionada
        
        JLabel resImgLabel = new JLabel(resIconimg);


        /*-----(Adicionando elementos ao painel do topo)------*/

        topoPainel.add(resImgLabel);
        topoPainel.add(taskLabel);



        /*------------Adicionando o painel para o lado direito------------------*/

        // Painel para a direita

        JPanel dirPanel = new JPanel();

        //Configurando o painel da direita

        dirPanel.setBackground(new Color(0xF5F5F5F5));
        dirPanel.setPreferredSize(new Dimension(200, 200));
        dirPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        //Configurando os elementos do painel direito

        //Botão de criar nova tarefa

        JButton criarButton = new JButton("Criar Nova Tarefa");
        criarButton.setVerticalAlignment(JButton.TOP);
        criarButton.setBackground(new Color(0x007BFF));
        criarButton.setFocusable(false);
        criarButton.setForeground(Color.WHITE);
        criarButton.setPreferredSize(new Dimension(180, 40));

        //fazer botão para logout no sistema

        JButton logoutButton = new JButton("fazer logout");
        logoutButton.setVerticalAlignment(JButton.TOP);
        logoutButton.setBackground(new Color(0x6C757D));
        logoutButton.setFocusable(false);
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setPreferredSize(new Dimension(180, 40));

        /*------------(Adicionando os elementos no painel direito)-------------*/
        dirPanel.add(criarButton);
        dirPanel.add(logoutButton);


        /*-----------Criando os paineis para cada tarefa --------------------*/


        /*------------Adicionando o painel na posição central ------------------*/

        //Configurando o painel

        JPanel centerPanel = new JPanel();

        centerPanel.setBackground(new Color(0x888888));
        centerPanel.setPreferredSize(new Dimension(500, 500));

        //Label para mensagem se tarefa estiver vazia

        JLabel voidLabel = new JLabel("Tarefa Vazia!");

        //configurações do voidLabel
        voidLabel.setFont(new Font("verdana", Font.BOLD, 24));
        voidLabel.setForeground(new Color(0xFFFFFF));
        voidLabel.setVerticalAlignment(JLabel.CENTER);
        voidLabel.setHorizontalAlignment(JLabel.CENTER);
        
        /*------------(Adicionando os elementos no painel central)-------------*/

        centerPanel.add(voidLabel);

        /*-----------------Adicionando elementos, na Janela da Tela de Lista de Tarefas--------------------*/

        this.add(topoPainel, new BorderLayout().NORTH);
        this.add(dirPanel, new BorderLayout().WEST);
        this.add(centerPanel, new BorderLayout().CENTER);

    }

    //Testando a janela
    public static void main(String[] args) {
        
        TelaListaTarefas teste = new TelaListaTarefas();
        teste.tornarVisivel();
    }
}

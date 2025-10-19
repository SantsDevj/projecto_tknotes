package interfaces_graficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.concurrent.Flow;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicScrollBarUI;

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

        /*------------Adicionando o painel na posição central ------------------*/

        //Configurando o painel
        
        //PAINEL PARA ELEMENTOS
        JPanel elemPanel = new JPanel();
        elemPanel.setLayout(new FlowLayout());
        elemPanel.setPreferredSize(new Dimension(100,50));
        
        // PAINEL CENTRAL
        JPanel centerPanel = new JPanel();

        centerPanel.setBackground(new Color(0x888FFF));
        centerPanel.setPreferredSize(new Dimension(500, 500));
        centerPanel.setLayout(new GridLayout(0,1,5,5));

        // ------- CONFFIGURANDO OS ELEMENTOS DO CENTERPANEL -------

        //Label para mensagem se tarefa estiver vazia

        JLabel infoLabel = new JLabel("Crie as suas Tarefas!");

        //configurações do voidLabel
        infoLabel.setFont(new Font("verdana", Font.BOLD, 24));
        infoLabel.setForeground(new Color(0xFFFFFF));
        infoLabel.setVerticalAlignment(JLabel.CENTER);
        infoLabel.setHorizontalAlignment(JLabel.CENTER);

        
        //Botão de criação de tarefas
        
        JButton  criarTarefa = new JButton("Criar nova tarefa");
        
        // -- configurando este botão
        criarTarefa.setPreferredSize(new Dimension(50,30));
        criarTarefa.setFocusable(false);
        
        //ADICIONANDO ELEMENTOS AO ELEMPANEL
        elemPanel.add(infoLabel);
        elemPanel.add(criarTarefa);
        
        /*------------(Adicionando os elementos no painel central)-------------*/
        centerPanel.add(elemPanel);
        

        /*-----------------Adicionando elementos, na Janela da Tela de Lista de Tarefas--------------------*/

        this.add(topoPainel, new BorderLayout().NORTH);
        this.add(centerPanel, new BorderLayout().CENTER);

    }

    //Testando a janela
    public static void main(String[] args) {
        
        TelaListaTarefas teste = new TelaListaTarefas();
        teste.tornarVisivel();
    }
}

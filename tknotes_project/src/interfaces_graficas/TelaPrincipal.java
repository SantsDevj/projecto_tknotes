package interfaces_graficas;

import java.awt.*;
import javax.swing.*;

public class TelaPrincipal extends JanelaPrincipal {

    // Construtor para criação desta interface gráfica
    public TelaPrincipal() {

        // Ajuste de tamanho da Janela (opcional, mantendo o estilo)
        this.setSize(1000, 700);

        // 1. ADICIONAR O MENU BAR
        JMenuBar menuBar = criarMenuBar();
        this.setJMenuBar(menuBar);

        /*-------------Configurando Painéis para estrutura da tela------------*/

        // Painel para o topo da tela (NORTH)
        JPanel topoPainel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5)); // Alinhar à esquerda
        topoPainel.setBackground(Color.WHITE);
        topoPainel.setPreferredSize(new Dimension(this.getWidth(), 80)); 

        // --- Configurando os elementos de painel do topo ---
        ImageIcon topoPanelImg = new ImageIcon("recursos_graficos/logo/logo_tknotes.png");
        Image imgTopo = topoPanelImg.getImage();
        Image resImg = imgTopo.getScaledInstance(60, 60, Image.SCALE_SMOOTH); // Imagem redimensionada

        JLabel resImgLabel = new JLabel(new ImageIcon(resImg));
        
        JLabel taskLabel = new JLabel("Tarefas");
        taskLabel.setFont(new Font("Verdana", Font.BOLD, 28)); // Aumento do tamanho da fonte
        taskLabel.setForeground(new Color(0x333333));

        // Adicionando elementos ao painel do topo
        topoPainel.add(resImgLabel);
        topoPainel.add(taskLabel);

        /*------------Configurando o Painel Central (CENTER) ------------------*/

        // O centerPanel usa BorderLayout.CENTER, então ele preencherá o resto da janela.
        // Usaremos BoxLayout para garantir o alinhamento centralizado vertical/horizontal.
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS)); // Empilha verticalmente
        centerPanel.setBackground(new Color(0xF5F5F5)); // Cor de fundo suave
        
        // PAINEL PARA ENVOLVER MENSAGEM E BOTÃO
        // Este painel interno ajuda a agrupar e centralizar
        JPanel elemPanel = new JPanel();
        elemPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0)); // Alinhamento central
        elemPanel.setBackground(new Color(0xF5F5F5)); 

        // --- CONFFIGURANDO OS ELEMENTOS DO CENTERPANEL ---

        // Label para mensagem se tarefa estiver vazia
        JLabel infoLabel = new JLabel("Crie as suas Tarefas!");

        // Correção de Cor: Mudei a cor do texto para ser visível.
        infoLabel.setFont(new Font("Verdana", Font.BOLD, 24));
        infoLabel.setForeground(new Color(0x333333)); 
        infoLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza horizontalmente

        // Botão de criação de tarefas
        JButton criarTarefa = new JButton("Criar nova tarefa");
        
        // Correção de Dimensão: Dimensão mais adequada
        criarTarefa.setPreferredSize(new Dimension(250, 45)); 
        criarTarefa.setFocusable(false);
        criarTarefa.setForeground(Color.WHITE);
        criarTarefa.setBackground(new Color(0x007BFF));
        criarTarefa.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza horizontalmente
        
        // Adicionando elementos ao elemPanel (aqui é onde a lista de tarefas entraria)
        // Por enquanto, apenas a mensagem e o botão.
        elemPanel.add(infoLabel);
        elemPanel.add(Box.createRigidArea(new Dimension(0, 30))); // Espaçamento vertical
        elemPanel.add(criarTarefa);
        
        // Adicionando o elemPanel ao centerPanel
        centerPanel.add(Box.createVerticalGlue()); // Empurra os componentes para o centro vertical
        centerPanel.add(elemPanel);
        centerPanel.add(Box.createVerticalGlue()); // Empurra os componentes para o centro vertical

        /*-----------------Adicionando elementos na Janela Principal--------------------*/
        this.add(topoPainel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
    }
    
    // --- 2. CRIAÇÃO DO JMenuBar ---
    private JMenuBar criarMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        
        // Menu "Opções" (Pode ser qualquer título)
        JMenu menuOpcoes = new JMenu("Menu");
        menuOpcoes.setFont(new Font("Verdana", Font.PLAIN, 16));

        // Itens de Menu
        // 1. Criar Tarefa
        JMenuItem criarTarefaItem = new JMenuItem("Criar Tarefa");
        criarTarefaItem.addActionListener(e -> {
            // Lógica para abrir a TelaAdicionarTarefa
            TelaAdicionarTarefa novaTela = new TelaAdicionarTarefa();
            novaTela.tornarVisivel();
            // this.dispose(); // Não feche a tela principal, apenas o formulário (opcional)
        });

        // 2. Ver Meu Perfil
        JMenuItem meuPerfilItem = new JMenuItem("Meu Perfil");
        meuPerfilItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Funcionalidade: Ver Perfil", "Em Construção", JOptionPane.INFORMATION_MESSAGE);
        });
        
        // 3. Minha Lista de Tarefas (Pode ser para recarregar a tela)
        JMenuItem listaTarefasItem = new JMenuItem("Lista de Tarefas");
        listaTarefasItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Funcionalidade: Recarregar Lista", "Ação", JOptionPane.INFORMATION_MESSAGE);
        });

        // Adicionando os itens ao menu
        menuOpcoes.add(criarTarefaItem);
        menuOpcoes.add(listaTarefasItem);
        menuOpcoes.addSeparator(); // Linha separadora
        menuOpcoes.add(meuPerfilItem);

        // Adicionando o menu à barra
        menuBar.add(menuOpcoes);
        
        return menuBar;
    }

    // Testando a janela
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaPrincipal teste = new TelaPrincipal();
            teste.tornarVisivel();
        });
    }
}
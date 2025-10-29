package interfaces_graficas;

import javax.swing.*;
import java.awt.*;

// Esta tela será usada para adicionar ou editar uma tarefa
public class TelaAdicionarTarefa extends JanelaPrincipal {

    private JTextField tituloField;
    private JTextArea descricaoArea;
    private JTextField dataVencimentoField; 
    private JComboBox<String> categoriaCombo;
    private JComboBox<String> prioridadeCombo;
    private JButton botaoAdicionar;
    
    // --- CONSTRUTOR ---
    public TelaAdicionarTarefa() {
        
        this.setTitle("TKNotes - Adicionar Nova Tarefa");
        this.setSize(600, 700);
        this.setLocationRelativeTo(null); 

        // Painel Principal 
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
        formPanel.setBackground(Color.WHITE);

        // --- 1. Campo Título ---
        tituloField = new JTextField(20);
        formPanel.add(criarCampo("Título:", tituloField));
        formPanel.add(Box.createVerticalStrut(15)); 

        // --- 2. Campo Descrição ---
        descricaoArea = new JTextArea(4, 20); 
        descricaoArea.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        JScrollPane scrollPane = new JScrollPane(descricaoArea);
        formPanel.add(criarCampo("Descrição:", scrollPane));
        formPanel.add(Box.createVerticalStrut(15)); 
        
        // --- 3. Campo Data de Vencimento ---
        dataVencimentoField = new JTextField("dd/mm/aaaa", 15);
        formPanel.add(criarCampo("Data de Vencimento:", dataVencimentoField));
        formPanel.add(Box.createVerticalStrut(15));

        // --- 4. Campo Categoria ---
        String[] categorias = {"Pessoal", "Trabalho", "Estudos", "Outro"};
        categoriaCombo = new JComboBox<>(categorias);
        formPanel.add(criarCampo("Categoria:", categoriaCombo));
        formPanel.add(Box.createVerticalStrut(15));

        // --- 5. Campo Prioridade ---
        String[] prioridades = {"BAIXA", "MEDIA", "ALTA"};
        prioridadeCombo = new JComboBox<>(prioridades);
        formPanel.add(criarCampo("Prioridade:", prioridadeCombo));
        formPanel.add(Box.createVerticalStrut(30)); 

        // --- Painel de Botões  ---
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        botaoAdicionar = new JButton("Adicionar Tarefa");
        JButton botaoCancelar = new JButton("Cancelar");
        
        botaoAdicionar.setBackground(new Color(0x17A2B8)); 
        botaoAdicionar.setForeground(Color.WHITE);
        botaoCancelar.setBackground(Color.LIGHT_GRAY);
        
        buttonPanel.add(botaoCancelar);
        buttonPanel.add(botaoAdicionar);

        this.add(formPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        formPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.pack(); // Ajusta o tamanho da janela aos componentes
    }

    // --- CRIAR UM CAMPO COM RÓTULO ---
    private JPanel criarCampo(String rotulo, JComponent componente) {
        JPanel painelLinha = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        painelLinha.setBackground(Color.WHITE);
        
        JLabel label = new JLabel(rotulo);
        label.setPreferredSize(new Dimension(150, 20)); 

        painelLinha.add(label);
        painelLinha.add(componente);
        
        // Configuração de alinhamento para o BoxLayout
        painelLinha.setAlignmentX(Component.LEFT_ALIGNMENT); 
        painelLinha.setMaximumSize(new Dimension(500, (int)componente.getPreferredSize().getHeight() + 10)); 
        
        return painelLinha;
    }
    
    // --- TESTE RÁPIDO (MAIN) ---
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaAdicionarTarefa tela = new TelaAdicionarTarefa();
            tela.tornarVisivel();
        });
    }
}
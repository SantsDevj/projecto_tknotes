package interfaces_graficas;

import java.awt.*;
import javax.swing.*;

public class TelaBuscaTarefa extends JanelaPrincipal {

    private JTextField campoBusca;
    private JButton botaoPesquisar;
    private JTable tabelaResultados;

    public TelaBuscaTarefa() {
        // Configuração da Janela (herdada de JanelaPrincipal)
        this.setTitle("TKNotes - Buscar Tarefas");
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);

        // O layout da JanelaPrincipal é BorderLayout (topo e centro)

        // 1. Configurando o Painel do Topo (NORTH)
        JPanel topoPainel = criarTopoPainel("Buscar Tarefas");
        this.add(topoPainel, BorderLayout.NORTH);

        // 2. Configurando o Painel Central (CENTER)
        JPanel centroPainel = new JPanel(new BorderLayout());
        centroPainel.setBackground(new Color(0xF5F5F5));

        // --- 2.1. Painel de Ferramentas de Busca (NORTH do centro) ---
        JPanel buscaPainel = criarPainelDeBusca();
        centroPainel.add(buscaPainel, BorderLayout.NORTH);

        // --- 2.2. Área de Resultados (CENTER do centro) ---
        JPanel resultadosPainel = criarPainelDeResultados();
        centroPainel.add(resultadosPainel, BorderLayout.CENTER);

        // Adiciona o painel central à janela
        this.add(centroPainel, BorderLayout.CENTER);
    }

    // Método auxiliar para criar o painel de topo (mantendo o estilo da TelaPrincipal)
    private JPanel criarTopoPainel(String titulo) {
        JPanel topoPainel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5));
        topoPainel.setBackground(Color.WHITE);
        topoPainel.setPreferredSize(new Dimension(this.getWidth(), 80));

        // Ícone da Imagem (Reutilizando a lógica de redimensionamento)
        ImageIcon topoPanelImg = new ImageIcon("recursos_graficos/logo/logo_tknotes.png");
        Image imgTopo = topoPanelImg.getImage();
        Image resImg = imgTopo.getScaledInstance(60, 60, Image.SCALE_SMOOTH); 
        JLabel resImgLabel = new JLabel(new ImageIcon(resImg));

        // Label de Título
        JLabel tituloLabel = new JLabel(titulo);
        tituloLabel.setFont(new Font("Verdana", Font.BOLD, 28));
        tituloLabel.setForeground(new Color(0x333333));

        topoPainel.add(resImgLabel);
        topoPainel.add(tituloLabel);
        
        return topoPainel;
    }
    
    // Método auxiliar para criar o campo de busca e o botão
    private JPanel criarPainelDeBusca() {
        // Usamos FlowLayout para colocar o campo e o botão lado a lado
        JPanel buscaPainel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        buscaPainel.setBackground(new Color(0xF5F5F5));

        campoBusca = new JTextField("Digite o título ou categoria da tarefa...", 30);
        campoBusca.setPreferredSize(new Dimension(350, 40));
        campoBusca.setFont(new Font("Verdana", Font.PLAIN, 14));
        campoBusca.setForeground(Color.GRAY);
        
        // Listener para UX (placeholder)
        campoBusca.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (campoBusca.getText().equals("Digite o título ou categoria da tarefa...")) {
                    campoBusca.setText("");
                    campoBusca.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campoBusca.getText().isEmpty()) {
                    campoBusca.setText("Digite o título ou categoria da tarefa...");
                    campoBusca.setForeground(Color.GRAY);
                }
            }
        });

        botaoPesquisar = new JButton("Pesquisar");
        botaoPesquisar.setPreferredSize(new Dimension(120, 40));
        botaoPesquisar.setBackground(new Color(0x007BFF));
        botaoPesquisar.setForeground(Color.WHITE);
        botaoPesquisar.setFocusable(false);

        // Adiciona a lógica de busca aqui (ainda vazia)
        botaoPesquisar.addActionListener(e -> {
            String termoBusca = campoBusca.getText();
            JOptionPane.showMessageDialog(this, "Pesquisando por: " + termoBusca);
            // Lógica para chamar a DAO e atualizar a tabela viria aqui
        });

        buscaPainel.add(campoBusca);
        buscaPainel.add(botaoPesquisar);

        return buscaPainel;
    }

    // Método auxiliar para criar a área de exibição dos resultados
    private JPanel criarPainelDeResultados() {
        JPanel resultadosPainel = new JPanel(new BorderLayout());
        resultadosPainel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20)); // Margem interna
        resultadosPainel.setBackground(new Color(0xF5F5F5));

        // Dados de exemplo para a tabela
        String[] colunas = {"ID", "Título", "Categoria", "Vencimento", "Prioridade", "Concluída"};
        Object[][] dados = {}; // Começa vazio
        
        // No mundo real, você carregaria os dados de tarefas aqui.
        
        tabelaResultados = new JTable(dados, colunas);
        tabelaResultados.setRowHeight(30); // Altura da linha para melhor visualização
        tabelaResultados.setFont(new Font("Verdana", Font.PLAIN, 12));
        
        // JScrollPane garante que a tabela possa ter scroll se houver muitos resultados
        JScrollPane scrollPane = new JScrollPane(tabelaResultados);
        
        resultadosPainel.add(scrollPane, BorderLayout.CENTER);
        
        return resultadosPainel;
    }

    // Testando a janela
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaBuscaTarefa tela = new TelaBuscaTarefa();
            tela.tornarVisivel();
        });
    }
}
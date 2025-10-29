package interfaces_graficas;

import java.awt.*;
import javax.swing.*;

public class TelaPerfilUsuario extends JanelaPrincipal {

    public TelaPerfilUsuario() {
        // Configuração da Janela
        this.setTitle("TKNotes - Meu Perfil");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);

        // 1. Configurando o Painel do Topo (NORTH)
        JPanel topoPainel = criarTopoPainel("Meu Perfil");
        this.add(topoPainel, BorderLayout.NORTH);

        // 2. Configurando o Painel Central (CENTER)
        JPanel centroPainel = new JPanel();
        centroPainel.setLayout(new BoxLayout(centroPainel, BoxLayout.Y_AXIS));
        centroPainel.setBackground(Color.WHITE);
        centroPainel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50)); // Margem

        // --- 2.1. Título da Seção ---
        JLabel infoTitulo = new JLabel("Informações da Conta");
        infoTitulo.setFont(new Font("Verdana", Font.BOLD, 22));
        infoTitulo.setAlignmentX(Component.LEFT_ALIGNMENT); // Alinhamento à esquerda

        centroPainel.add(infoTitulo);
        centroPainel.add(Box.createVerticalStrut(20)); // Espaçamento

        // --- 2.2. Detalhes do Usuário (Simulação) ---
        // Na aplicação real, você buscará estes dados do objeto Usuario logado.
        centroPainel.add(criarLinhaInfo("Nome de Usuário:", "Usuário Teste"));
        centroPainel.add(criarLinhaInfo("Email:", "usuario.teste@tknotes.com"));
        centroPainel.add(criarLinhaInfo("Membro Desde:", "Janeiro de 2025"));
        
        centroPainel.add(Box.createVerticalStrut(40)); // Espaçamento grande
        
        // --- 2.3. Seção de Ações Críticas ---
        JLabel acoesTitulo = new JLabel("Ações Críticas");
        acoesTitulo.setFont(new Font("Verdana", Font.BOLD, 22));
        acoesTitulo.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        centroPainel.add(acoesTitulo);
        centroPainel.add(Box.createVerticalStrut(20));
        
        // --- Botões de Ação ---
        
        // Botão 1: Apagar TODAS as Tarefas
        JButton apagarTarefasBtn = criarBotaoAcao("Apagar TODAS as Tarefas", new Color(0xFFC107)); // Amarelo
        apagarTarefasBtn.addActionListener(e -> acaoApagarTodasTarefas());
        
        // Botão 2: Terminar Sessão (Logout)
        JButton terminarSessaoBtn = criarBotaoAcao("Terminar Sessão", new Color(0x6C757D)); // Cinza
        terminarSessaoBtn.addActionListener(e -> acaoTerminarSessao());

        // Botão 3: Apagar Conta (PERMANENTE)
        JButton apagarContaBtn = criarBotaoAcao("Apagar Conta PERMANENTEMENTE", new Color(0xDC3545)); // Vermelho
        apagarContaBtn.addActionListener(e -> acaoApagarConta());
        
        // Painel para organizar os botões verticalmente (usa FlowLayout para alinhar à esquerda)
        JPanel acoesPanel = new JPanel();
        acoesPanel.setBackground(Color.WHITE);
        acoesPanel.setLayout(new BoxLayout(acoesPanel, BoxLayout.Y_AXIS));

        acoesPanel.add(apagarTarefasBtn);
        acoesPanel.add(Box.createVerticalStrut(10));
        acoesPanel.add(terminarSessaoBtn);
        acoesPanel.add(Box.createVerticalStrut(10));
        acoesPanel.add(apagarContaBtn);
        
        // Alinha o painel de ações com o resto do conteúdo
        acoesPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        centroPainel.add(acoesPanel);
        
        this.add(centroPainel, BorderLayout.CENTER);
    }
    
    // Método auxiliar para criar o painel de topo (reutilizado)
    private JPanel criarTopoPainel(String titulo) {
        JPanel topoPainel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5));
        topoPainel.setBackground(Color.WHITE);
        topoPainel.setPreferredSize(new Dimension(this.getWidth(), 80));

        ImageIcon topoPanelImg = new ImageIcon("recursos_graficos/logo/logo_tknotes.png");
        Image imgTopo = topoPanelImg.getImage();
        Image resImg = imgTopo.getScaledInstance(60, 60, Image.SCALE_SMOOTH); 
        JLabel resImgLabel = new JLabel(new ImageIcon(resImg));

        JLabel tituloLabel = new JLabel(titulo);
        tituloLabel.setFont(new Font("Verdana", Font.BOLD, 28));
        tituloLabel.setForeground(new Color(0x333333));

        topoPainel.add(resImgLabel);
        topoPainel.add(tituloLabel);
        
        return topoPainel;
    }
    
    // Método auxiliar para criar uma linha de informação de usuário
    private JPanel criarLinhaInfo(String rotulo, String valor) {
        JPanel linha = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 5));
        linha.setBackground(Color.WHITE);
        linha.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel rotuloLabel = new JLabel(rotulo);
        rotuloLabel.setFont(new Font("Verdana", Font.BOLD, 14));
        rotuloLabel.setPreferredSize(new Dimension(200, 20)); // Largura fixa
        
        JLabel valorLabel = new JLabel(valor);
        valorLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        
        linha.add(rotuloLabel);
        linha.add(valorLabel);
        
        return linha;
    }
    
    // Método auxiliar para criar um botão de ação padronizado
    private JButton criarBotaoAcao(String texto, Color corFundo) {
        JButton button = new JButton(texto);
        button.setPreferredSize(new Dimension(350, 45));
        button.setMaximumSize(new Dimension(350, 45)); // Limitar tamanho para BoxLayout
        button.setBackground(corFundo);
        button.setForeground(Color.WHITE);
        button.setFocusable(false);
        button.setAlignmentX(Component.LEFT_ALIGNMENT); // Alinha com o conteúdo
        return button;
    }
    
    // --- LÓGICA DE AÇÕES ---
    
    private void acaoApagarTodasTarefas() {
        int confirmacao = JOptionPane.showConfirmDialog(this, 
            "Tem certeza que deseja apagar TODAS as suas tarefas? Esta ação é irreversível!", 
            "Confirmar Exclusão de Tarefas", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE);
        
        if (confirmacao == JOptionPane.YES_OPTION) {
            // Lógica para chamar a TarefaDAO.apagarTodasTarefas(userId)
            JOptionPane.showMessageDialog(this, "Todas as tarefas foram apagadas.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void acaoTerminarSessao() {
        int confirmacao = JOptionPane.showConfirmDialog(this, 
            "Tem certeza que deseja terminar a sessão?", 
            "Confirmar Termino de Sessão", 
            JOptionPane.YES_NO_OPTION);
        
        if (confirmacao == JOptionPane.YES_OPTION) {
            // 1. Limpar dados da sessão (se houver)
            // 2. Abrir a Tela de Login/Welcome
            TelaLogin telaLogin = new TelaLogin(); 
            telaLogin.tornarVisivel();
            this.dispose(); // Fecha a tela atual
        }
    }

    private void acaoApagarConta() {
        int confirmacao = JOptionPane.showConfirmDialog(this, 
            "ATENÇÃO! Apagar a conta removerá permanentemente todos os seus dados e tarefas.\nTem certeza que deseja apagar sua conta?", 
            "CONFIRMAÇÃO FINAL DE EXCLUSÃO DE CONTA", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.ERROR_MESSAGE);
        
        if (confirmacao == JOptionPane.YES_OPTION) {
            // Lógica para chamar a UsuarioDAO.apagarConta(userId)
            JOptionPane.showMessageDialog(this, "Sua conta foi permanentemente apagada.", "Conta Excluída", JOptionPane.INFORMATION_MESSAGE);
            
            // Redirecionar para a tela inicial
            TelaWelcome telaWelcome = new TelaWelcome();
            telaWelcome.tornarVisivel();
            this.dispose();
        }
    }
    
    // Testando a janela
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaPerfilUsuario tela = new TelaPerfilUsuario();
            tela.tornarVisivel();
        });
    }
}
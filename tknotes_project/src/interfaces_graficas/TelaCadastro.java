package interfaces_graficas;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

//Importando a Classe Usuário 
import implementacao_classes.*;

public class TelaCadastro extends JanelaPrincipal{
    
    @SuppressWarnings("static-access")
    //Constructor para iniciar a interface gráfica
    public TelaCadastro(){
        /*--------(Configurando os Painéis)------ */
        //Usando a imagem da Logo
        ImageIcon image = new ImageIcon("recursos_graficos/logo/logo_tknotes.png");
        
        Image originalImage = image.getImage();
        Image resizeImage = originalImage.getScaledInstance(500, 500, Image.SCALE_SMOOTH);

        //Criando um nnovo iconImage
        ImageIcon resizeIcon = new ImageIcon(resizeImage);
        /*-------------Configurando o Painel 1-------------*/

        JPanel panel1 = new JPanel();

        panel1.setPreferredSize(new Dimension(500,100)); //Dimensão do painel
        
        panel1.setBackground(new Color(0xFFFFFF)); //Backgraound do painel
        
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50)); //Centraliza os componentes do paine 1
        
        //Usando Labels para colocar as imagens
        JLabel imagelabel = new JLabel(resizeIcon);
        
        //Label para Mensagem de Boas-Vindas
        JLabel welcomelabel = new JLabel("<html>Seja bem-vindo<br>já tens uma conta?</html>:");
        welcomelabel.setForeground(Color.gray); 
        welcomelabel.setFont(new Font("Verdana", Font.BOLD, 20));
        
        //Botão para entrar
        JButton loginButton = new JButton("Entrar");
        loginButton.setSize(new Dimension(200,40));
        loginButton.setBackground(new Color(0x17A2B8));
        loginButton.setFocusable(false); //eleimina oo foco do botão

        //Adicionando evento neste botão
        loginButton.addActionListener(e ->{
            if (e.getSource() == loginButton) {
                TelaLogin login = new TelaLogin();
                login.tornarVisivel();
                this.dispose();
            }
            
        });
        
        //Adicionando a imagem no painel
        panel1.add(welcomelabel);
        panel1.add(loginButton);
        panel1.add(imagelabel);
        
        /*----------Configurando o Painel 2----------*/

        JPanel panel2 = new JPanel();

        //Defindo as cores dos painéis
        panel2.setBackground(new Color(0xFFFFFF));
        
        //Defindo as dimensões dos painéis
        panel2.setPreferredSize(new Dimension(800,100));
        //panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS)); //Alinha verticalmemnte os componentes

        //Título para Criar a conta
        JLabel titlelabel = new JLabel("Crie uma Conta");
        titlelabel.setAlignmentX(Component.CENTER_ALIGNMENT); //centraliza o texto
        titlelabel.setBorder(BorderFactory.createEmptyBorder(20,0,20,0)); //fixando o espaçamento
        titlelabel.setFont(new Font("Verdana", Font.BOLD, 20));

        //Campo para nome
        JPanel namepanel = new JPanel();
        namepanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        namepanel.setBackground(Color.WHITE);
        
        //preparando o campo para nome
        JTextField namTextField = new JTextField("Nome");
        namTextField.setPreferredSize(new Dimension(300,40));
        namTextField.setForeground(Color.GRAY);
        namTextField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1, true)); //serve para que a borda esteja arredondada

        //Melhorando a experiência de usuário

        namTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){

                if (namTextField.getText().equals("Nome")) {
                    namTextField.setText("");
                    namTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                if (namTextField.getText().isEmpty()) {
                    namTextField.setText("Nome");
                    namTextField.setForeground(Color.GRAY);
                }
            }
        });

        //Adicionando este campo no namepanel
        namepanel.add(namTextField);

        //Campo para email
        JPanel emailpanel = new JPanel();
        emailpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        emailpanel.setBackground(Color.WHITE);
        
        //preparando o campo para email
        JTextField emailTextField = new JTextField("Email");
        emailTextField.setPreferredSize(new Dimension(300,40));
        emailTextField.setForeground(Color.GRAY);
        emailTextField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1, true)); //serve para que a borda esteja arredondada

        //Melhorando a experiência de usuário

        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){

                if (emailTextField.getText().equals("Email")) {
                    emailTextField.setText("");
                    emailTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                if (emailTextField.getText().isEmpty()) {
                    emailTextField.setText("Email");
                    emailTextField.setForeground(Color.GRAY);
                }
            }
        });
        emailpanel.add(emailTextField);

        //Campo para palavra-passe
        JPanel passpanel = new JPanel();
        passpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        passpanel.setBackground(Color.WHITE);
        
        //preparando o campo para palavra-passe
        JTextField passTextField = new JTextField("Senha");
        passTextField.setPreferredSize(new Dimension(300,40));
        passTextField.setForeground(Color.GRAY);
        passTextField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1, true)); //serve para que a borda esteja arredondada

        //Melhorando a experiência de usuário

        passTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){

                if (passTextField.getText().equals("Senha")) {
                    passTextField.setText("");
                    passTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                if (passTextField.getText().isEmpty()) {
                    passTextField.setText("Senha");
                    passTextField.setForeground(Color.GRAY);
                }
            }
        });
        passpanel.add(passTextField);

        //Configurando Botão para cadastrar
        JButton regbutton = new JButton("Cadastrar");
        regbutton.setPreferredSize(new Dimension(300,40));
        regbutton.setBackground(new Color(0x007BFF));
        regbutton.setForeground(Color.WHITE);
        regbutton.setFocusable(false);

        //Configurando o evento do botão cadastrar

        regbutton.addActionListener(e ->{

            
            //Obtendo as fontes de cada um dos campos (nome, email e senha)
            
            String nomeFonte = namTextField.getText().trim();
            String emailFonte = emailTextField.getText().trim();
            String passFonte = passTextField.getText().trim();
            
            //usando a String Builder para Armazenar os Erros
            
            StringBuilder msgError = new StringBuilder();
            
            //Usando uma flag para controlar erros
            boolean isValido = true;
            
            // --------INICIAR VALIDAÇÃO---------
            
            
            //Verificar se os campos estão vazios
            
            if (nomeFonte.isEmpty() || nomeFonte.equals("Nome")) {
                msgError.append("- O campo Nome não pode estar vazio.\n");
                isValido = false;
            }
            
            if (emailFonte.isEmpty() || emailFonte.equals("Email")) {
                msgError.append("- O campo Email não pode estar vazio.\n");
                isValido = false;
            }
            
            if (passFonte.isEmpty() || passFonte.equals("Senha")) {
                msgError.append("- O campo Senha não pode estar vazio.\n");
                isValido = false;
            }
            
            //Se os campos não estiverem vazios
            
            if (isValido) {
                
                //validar nome
                if (nomeFonte.length() > 100) {
                    msgError.append("- O Nome não pode ter mais de 100 caracteres.\n");
                    isValido = false;   
                }
                
                //validar email
                if (!emailFonte.contains("@") || !emailFonte.contains(".")) {
                    msgError.append("- O Email é inválido.\n");
                    isValido = false;
                }
                
                //Validar senha
                if (passFonte.length() < 6 || passFonte.length() > 8) {
                    msgError.append("- A Senha deve ter no mínimo entre 6 a 8 caracteres");
                    isValido = false;
                }
            }
            
            // --------FINALIZANDO AS VALIDAÇÕES-----------
            
            if (!isValido) {
                JOptionPane.showMessageDialog(null,msgError.toString(), "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            } else{

                //Instanciando a Classe Usuário para ter aceso aos dados
                Usuario usuarioCadastro = new Usuario();

                usuarioCadastro.setNome_usuario(nomeFonte);
                usuarioCadastro.setEmail(emailFonte);
                usuarioCadastro.setSenha(passFonte);

                //Guardar isso no Usuário DAO

                //Mostrar Mensagem de Sucesso
                JOptionPane.showMessageDialog(null, "Cadastro efectuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);

            }
        });
       
        

        //Adicionando elementos no Painel 2
        panel2.add(titlelabel);
        panel2.add(Box.createRigidArea(new Dimension(0,20))); //fixar espaço vertical
        panel2.add(namepanel);
        panel2.add(emailpanel);
        panel2.add(passpanel);
        panel2.add(Box.createRigidArea(new Dimension(0,20))); //fixar espaço vertical
        panel2.add(regbutton);

        /*-------------Adicionando os paineis na janela----------*/
        this.add(panel1, new BorderLayout().WEST);
        this.add(panel2, new BorderLayout().CENTER);
    }
}

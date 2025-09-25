package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//criando a tela de Login
public class TelaLogin extends JanelaPrincipal{
    public TelaLogin(){
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
        JLabel welcomelabel = new JLabel("<html>Bem-vindo de volta!<br>Ainda não tens uma conta?</html>:");
        welcomelabel.setForeground(Color.gray); 
        welcomelabel.setFont(new Font("Verdana", Font.BOLD, 20));
        
        //Botão para entrar
        JButton loginButton = new JButton("Criar");
        loginButton.setSize(new Dimension(200,40));
        loginButton.setBackground(new Color(0x17A2B8));
        loginButton.setFocusable(false); //eleimina oo foco do botão
        //Adicionando evento neste botão
        loginButton.addActionListener(e -> {
            if (e.getSource() == loginButton) {
                TelaCadastro telacad = new TelaCadastro();
                telacad.tornarVisivel();
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
        JLabel titlelabel = new JLabel("Faça Login na sua conta");
        titlelabel.setAlignmentX(Component.CENTER_ALIGNMENT); //centraliza o texto
        titlelabel.setBorder(BorderFactory.createEmptyBorder(20,0,20,0)); //fixando o espaçamento
        titlelabel.setFont(new Font("Verdana", Font.BOLD, 20));

        //Campo para email
        JPanel emailpanel = new JPanel();
        emailpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        emailpanel.setBackground(Color.WHITE);
        
        //preparando o campo para email
        JTextField emailTextField = new JTextField("Email");
        emailTextField.setPreferredSize(new Dimension(300,40));
        emailTextField.setForeground(Color.GRAY);
        emailTextField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1, true)); //serve para que a borda esteja arredondada
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
        passpanel.add(passTextField);

        //Configurando Botão para cadastrar
        JButton regbutton = new JButton("Entrar");
        regbutton.setPreferredSize(new Dimension(300,40));
        regbutton.setBackground(new Color(0x007BFF));
        regbutton.setForeground(Color.WHITE);
        regbutton.setFocusable(false);

       
        

        //Adicionando elementos no Painel 2
        panel2.add(titlelabel);
        panel2.add(Box.createRigidArea(new Dimension(0,20))); //fixar espaço vertical

        panel2.add(emailpanel);
        panel2.add(passpanel);
        panel2.add(Box.createRigidArea(new Dimension(0,20))); //fixar espaço vertical
        panel2.add(regbutton);

        /*-------------Adicionando os paineis na janela----------*/
        this.add(panel1, new BorderLayout().WEST);
        this.add(panel2, new BorderLayout().CENTER);
    
    }

}

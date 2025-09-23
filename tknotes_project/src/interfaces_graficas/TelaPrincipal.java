package interfaces_graficas;

import javax.swing.SwingUtilities;

public class TelaPrincipal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            TelaCadastro cad = new TelaCadastro();
            cad.tornarVisivel();
        });
    }
}

package interfaces_graficas;

import javax.swing.SwingUtilities;

public class TelaTeste {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            TelaWelcome welcome = new TelaWelcome();
            welcome.tornarVisivel();
        });
    }
}

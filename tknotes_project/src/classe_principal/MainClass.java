package classe_principal;

import javax.swing.SwingUtilities;

import dao_classes.*;
import implementacao_classes.*;
import interfaces_graficas.*;

public class MainClass {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaWelcome welcome = new TelaWelcome();
            welcome.tornarVisivel();
        });
    }
}

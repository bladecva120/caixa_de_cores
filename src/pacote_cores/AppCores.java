package pacote_cores;

import javax.swing.JFrame;
import javax.swing.JColorChooser;
import java.awt.BorderLayout;

public class AppCores extends JFrame {

    JColorChooser cores = new JColorChooser();

    void janela() {
        setTitle("Caixa de cores");
        setSize(500, 500);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    AppCores() {
        janela();
        add(BorderLayout.CENTER, cores);
    }

    public static void main(String[] args) {
        new AppCores();
    }

}

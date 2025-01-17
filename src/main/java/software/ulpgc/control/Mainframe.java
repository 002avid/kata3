package software.ulpgc.control;

import software.ulpgc.view.BarDisplay;
import software.ulpgc.view.JFreeChartBarDisplay;

import javax.swing.*;
import java.awt.*;

public class Mainframe extends JFrame {
    private JFreeChartBarDisplay barDisplay;

    public Mainframe() throws HeadlessException {
        setTitle("Gráfico de barras");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createBarDisplay());
    }

    private Component createBarDisplay() {
        this.barDisplay = new JFreeChartBarDisplay();
        return barDisplay;
    }
    public BarDisplay barDisplay(){
        return barDisplay;
    }
}

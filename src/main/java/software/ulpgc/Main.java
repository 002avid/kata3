package software.ulpgc;

import software.ulpgc.Model.Title;
import software.ulpgc.Model.TotalTitleStatistics;
import software.ulpgc.Model.TsvTitleLoader;
import software.ulpgc.View.Mainframe;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        SwingUtilities.invokeLater(() -> {
            try {
        File file = new File("D:/Fotillos/IS2/title.basics.tsv");
        if(!file.exists()) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo 'title.basics.tsv'"),
            "Error de archivo", JOptionPane.ERROR_MESSAGE);
        return;
        }
        List<Title> titleList = TsvTitleLoader.with(file).load();
        Map<String, Integer> statistics = new TotalTitleStatistics().calculate(titleList);
                Mainframe mainframe = new Mainframe();
                mainframe.barDisplay().show(statistics);
                mainframe.setVisible(true);
                } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al cargar los datos: " + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}

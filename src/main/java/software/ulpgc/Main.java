package software.ulpgc;

import software.ulpgc.model.Title;
import software.ulpgc.model.TotalTitleStatistics;
import software.ulpgc.model.TsvTitleLoader;
import software.ulpgc.control.Mainframe;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        SwingUtilities.invokeLater(() -> {
            try {
        File file = new File("inserte_Ruta_Del_Archivo");
        if(!file.exists()) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo 'title.basics.tsv'",
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

package software.ulpgc;

import software.ulpgc.Model.Title;
import software.ulpgc.Model.TotalTitleStatistics;
import software.ulpgc.Model.TsvTitleLoader;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Title> titleList = TsvTitleLoader.with(new File("D:/Fotillos/IS2/title.basics.tsv")).load();
        Map<String, Integer> statistics = new TotalTitleStatistics().calculate(titleList);
        for (String key : statistics.keySet()){
            System.out.println(key + ": " + statistics.get(key));
        }
    }
}

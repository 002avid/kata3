package software.ulpgc.control;

import software.ulpgc.model.Title;

import java.util.List;
import java.util.Map;

public interface TitleHistogram {
    Map<String, Integer> calculate(List<Title> titleList);
}

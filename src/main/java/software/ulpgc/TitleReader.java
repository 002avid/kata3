package software.ulpgc;

import java.io.IOException;
import java.util.List;

public interface TitleReader {
    List<Title> load() throws IOException;
}
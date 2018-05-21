import java.awt.*;
import java.util.ArrayList;

public class Directory {
    String name;
    ArrayList filesList = new ArrayList();
    //
    void addFile(String name, Image ico) {
        System.out.println("addFile() "+this);
        filesList.add(new File(name, ico));
    }
}

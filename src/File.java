import java.awt.*;

public class File {
    String name;
    File(String name, Image ico) {
        this.name=name;
        bindIcon(ico);
    }
    void bindIcon(Image ico) {
        System.out.println("bindIcon() "+" "+ico+this);
    }
}

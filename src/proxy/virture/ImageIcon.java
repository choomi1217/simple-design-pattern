package proxy.virture;

import java.awt.*;
import java.net.URL;

public class ImageIcon implements Icon {
    private final URL imageUrl;
    private final String name;

    public ImageIcon(URL imageUrl, String name) {
        this.imageUrl = imageUrl;
        this.name = name;
    }


    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }

    public void paintIcon() {
        System.out.println("Icon.paintIcon");
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        System.out.println("Icon.paintIcon");
    }
}

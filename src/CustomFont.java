import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CustomFont {
    String url;

    CustomFont(String url){
        this.url = url;
    }
    Font createCustomFont() {
        try {
            File fontFile = new File(url);
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile);

            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            return customFont;
        } catch (FontFormatException | IOException ignored) {
            ignored.printStackTrace();
        }
        return null;
    }

}

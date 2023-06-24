import org.example.ImageResizer;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ImageResizerTest {
    @Test
    public void testResizeImageJava() throws IOException {
        File inputFile = new File("src/main/resources/outdoor-husky-dog.jpg");
        File outputFile = new File("src/main/resources/resized_java.jpg");
        int width = 400;
        int height = 300;

        ImageResizer.resizeImageJava(inputFile, outputFile, width, height);

        BufferedImage resizedImage = ImageIO.read(outputFile);

        assertEquals(width, resizedImage.getWidth());
        assertEquals(height, resizedImage.getHeight());
    }
}

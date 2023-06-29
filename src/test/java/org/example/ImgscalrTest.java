package org.example;

import org.example.ImgscalrImageResizer;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ImgscalrTest {
    @Test
    public void testResizeImageImgscalr() throws IOException{
        File inputFile = new File("src/test/resources/outdoor-husky-dog.jpg");
        File outputFile = new File("src/test/resources/resized_imgscalr.jpg");
        final int width = 400;
        final int height = 300;
        ImgscalrImageResizer.resizeImageImgscalr(inputFile, outputFile, width, height);
        BufferedImage resizedImage = ImageIO.read(outputFile);
        assertEquals(width, resizedImage.getWidth());
        assertEquals(height, resizedImage.getHeight());
    }
}

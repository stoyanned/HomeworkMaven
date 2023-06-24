package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageResizer {
    public static void resizeImageJava(File inputFile, File outputFile, int width, int height) throws IOException{
        BufferedImage originalImage = ImageIO.read(inputFile);
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(originalImage, 0, 0, width, height, null);
        graphics2D.dispose();
        ImageIO.write(resizedImage, "jpg", outputFile);
    }
}

package org.example;

import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImgscalrImageResizer{
    public static void resizeImageImgscalr(File inputFile, File outputFile, int width, int height) throws IOException{
        BufferedImage originalImage = ImageIO.read(inputFile);
        BufferedImage resizedImage = Scalr.resize(originalImage, Scalr.Method.ULTRA_QUALITY, Scalr.Mode.AUTOMATIC, width,height);
        ImageIO.write(resizedImage, "jpg", outputFile);
    }

}

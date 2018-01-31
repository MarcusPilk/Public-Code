package ImageToString;
import net.sourceforge.tess4j.*;
import java.io.*;
public class imageToString {
    public String getImgText(String imageLocation) {
        ITesseract instance = new Tesseract();
        instance.setDatapath("E:\\IntelliJ\\Revision\\src\\tessdata");
        try
        {
            String imgText = instance.doOCR(new File(imageLocation));
            return imgText;
        }
        catch (TesseractException e)
        {
            e.getMessage();
            return "Error while reading image";
        }
    }
    public static void main ( String[] args)
    {
        imageToString imageToString = new imageToString();
        System.out.println(imageToString.getImgText("E:\\IntelliJ\\Revision\\src\\images\\imageTest.jpeg"));
    }
}
package com.reza;

import javax.imageio.stream.ImageInputStream;
import java.io.*;

public class ImageToText {
    private String encodedString = null;

    public String convertToString(File inputFile) {
        try{
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            int fileSize = (int) inputFile.length();
            byte[] imageData = new byte[fileSize];
            fileInputStream.read(imageData);
            return imageData.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void writeFile(String outputFileName) {

    }
}

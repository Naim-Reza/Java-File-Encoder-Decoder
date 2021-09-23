package com.reza;

import java.io.*;

public class Encoder {
    private String encodedString = "";

    public String convertToString(File inputFile) {
        try{
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream(inputFile));
            int fileSize = (int) inputFile.length();
            byte[] imageData = new byte[fileSize];
            reader.read(imageData);
            for (int i = 0; i < imageData.length; i++) encodedString += (Byte.toString(imageData[i]) + ":");
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return encodedString;
    }

    public void writeFile(String outputFileName, String output) {
        try{
            FileWriter fileWriter = new FileWriter(outputFileName);
            fileWriter.write(output);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

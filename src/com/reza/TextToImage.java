package com.reza;

import java.io.*;

public class TextToImage {
    private String imgDataString = "";

    public void convert(File inputFIle, String imgOutputFileName, String separator) {

        try{
            //read file
            BufferedReader reader = new BufferedReader(new FileReader(inputFIle));
            String line = null;
            while ((line = reader.readLine()) != null) imgDataString += line;
            //make a string array
            String[] dataArray = imgDataString.split(separator);
            //convert to a byte array
            byte[] imgDataByte = new byte[dataArray.length];
            for (int i = 0; i < dataArray.length; i++) imgDataByte[i] = Byte.parseByte(dataArray[i]);
            reader.close();
            
            //write the data to the output file
            File outputFile = new File(imgOutputFileName);
            if (!outputFile.exists()) outputFile.createNewFile();
            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(outputFile));
            writer.write(imgDataByte);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

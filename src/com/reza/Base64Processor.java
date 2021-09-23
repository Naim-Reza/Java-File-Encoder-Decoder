package com.reza;

import java.io.*;
import java.util.Base64;

public class Base64Processor {
    private String txtExt = ".txt";
    private String imgExt = ".jpg";

    private String encodedString = null;


    public void encode(File inputFile, String fileName) {
        try{
            //read file
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream(inputFile));
            int fileSize = (int) inputFile.length();
            byte[] imgData = new byte[fileSize];
            //store bytes into byte array
            reader.read(imgData);
            //encode bytes to string
            encodedString = Base64.getEncoder().encodeToString(imgData);

            //write file to a text file
            this.writeToText(fileName, encodedString);
            //close stream
            reader.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void decode(String fileName){
        String inputFileName = fileName + txtExt;
        File file = new File(inputFileName);
        String dataString = "";

        try{
            //read text file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) dataString += line;
            //convert string to byte array
            byte[] imgData = Base64.getDecoder().decode(dataString);

            //write to a image file
            this.writeToBinary(fileName,imgData);
            reader.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    private void writeToText(String fileName, String outputString){
        String outputFileName = fileName + txtExt;

        try{
            FileWriter writer = new FileWriter(outputFileName);
            writer.write(outputString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToBinary(String fileName, byte[] bytes){
        String outputFileName = fileName + imgExt;
        File file = new File(outputFileName);

        try{
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file));
            stream.write(bytes);
            stream.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}

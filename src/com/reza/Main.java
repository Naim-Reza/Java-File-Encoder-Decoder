package com.reza;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        ImageToText imageToText = new ImageToText();
        File inputFile = new File("cat.jpg");
        String outputFileName = "cat_out.txt";

        //take the image file and convert it to string
        String convertedString = imageToText.convertToString(inputFile);

        //write the string to a file
        imageToText.writeFile(outputFileName, convertedString);

        //convert the text file- 2nd part
        File textInputFile = new File(outputFileName);
        String imgOutputFileName = "cat_out.jpg";
        String separator = ":";
        TextToImage textToImage = new TextToImage();

        //convert the text file to image file
        textToImage.convert(textInputFile, imgOutputFileName, separator);


    }
}

package com.reza;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        ImageToText imageToText = new ImageToText();
        File inputFile = new File("cat.jpg");
        String outputFileName = "cat_out.jpg";

        //take the image file and convert it to string
        String convertedString = imageToText.convertToString(inputFile);

        //write the string to a file
        imageToText.writeFile(outputFileName);

    }
}

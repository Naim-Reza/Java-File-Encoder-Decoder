package com.reza;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        File inputFile = new File("cat.jpg");
        String outputFileName = "cat_out.txt";

        //take the image file and convert it to string
        String convertedString = encoder.convertToString(inputFile);

        //write the string to a file
        encoder.writeFile(outputFileName, convertedString);

        //convert the text file- 2nd part
        File textInputFile = new File(outputFileName);
        String imgOutputFileName = "cat_out.jpg";
        String separator = ":";
        Decoder decoder = new Decoder();

        //convert the text file to image file
        decoder.convert(textInputFile, imgOutputFileName, separator);

        //use of base64 encoding
        String base64OutputFileName = "cat_out_base64";
        Base64Processor base64Processor = new Base64Processor();

        //encode the image file and saves as a text file
        base64Processor.encode(inputFile, base64OutputFileName);

        //decode base64 encoded file and save as image
        base64Processor.decode(base64OutputFileName);


    }
}

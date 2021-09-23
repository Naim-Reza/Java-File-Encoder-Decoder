#Java File Encoder - Decoder
### How to encode
To encode your file you need to do the followings:
* Create an instance of the Encoder class
* Pass your file to Encoder.convertToString method as argument
* Store the encoded String to a varriable
* To write the encoded string to a file, provide the file name and encoded string.

### How to decode
* Create an instance of Decoder class
* Provide input file, output file name and separator to the Decoder.convert method as argument.

### How to use base64 encoding
* Create an instance of Base64Processor class.
* Provide input file and output file name as the arguments of Base64Processor.encode method for encoding.
* Provide input file name and output file name as the arguments of Base64Processor.decode method for decoding.

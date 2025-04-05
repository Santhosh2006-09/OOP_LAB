abstract class FileConverter {
    abstract void convert(String inputFile, String outputFile);
}

class TextToUppercase extends FileConverter {
    @Override
    void convert(String inputFile, String outputFile) {
        System.out.println("Converting " + inputFile + " to uppercase in " + outputFile);
        // Actual implementation would read/write files here
    }
}

class ImageResizer extends FileConverter {
    @Override
    void convert(String inputFile, String outputFile) {
        System.out.println("Resizing image " + inputFile + " to " + outputFile);
        // Actual implementation would resize image here
    }
}

public class FileFormatConverter {
    public static void main(String[] args) {
        FileConverter textConverter = new TextToUppercase();
        FileConverter imageConverter = new ImageResizer();
        
        textConverter.convert("input.txt", "output.txt");
        imageConverter.convert("photo.jpg", "small_photo.jpg");
    }
}
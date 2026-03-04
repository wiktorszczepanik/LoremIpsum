package Exceptions;

public class ReadFileException extends Exception {
    public ReadFileException(String message) {
        super("LoremIpsum generator error:\n\tText: ".concat(message));
    }
}

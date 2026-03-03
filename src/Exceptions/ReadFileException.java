package Exceptions;

public class ReadFileException extends Exception {
    public ReadFileException(String message) {
        super("Text: ".concat(message));
    }
}

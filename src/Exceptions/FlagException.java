package Exceptions;

public class FlagException extends Exception {
    public FlagException(String message) {
        super("LoremIpsum generator error:\n\tFlag: ".concat(message));
    }
}

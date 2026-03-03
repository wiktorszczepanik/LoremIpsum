package Exceptions;

public class FlagException extends Exception {
    public FlagException(String message) {
        super("Flag: ".concat(message));
    }
}

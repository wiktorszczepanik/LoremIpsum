package Run;

import Constants.Type;
import Exceptions.FlagException;

import java.text.MessageFormat;

public class Flags {

    private final String[] args;
    private int length;
    private Type type;

    public Flags(String[] args) {
        this.args = args;
    }

    public void assignFlags() throws FlagException {
        if (args.length != 2) throw new FlagException("Incorrect number of flags (try help flag).");
        try {
            this.length = Integer.parseInt(args[0]);
        } catch (NumberFormatException nfe) {
            throw new FlagException("Incorrect number for length.");
        }
        this.type = switch (args[1].trim().toLowerCase()) {
            case "paragraphs", "paragraph" -> Type.PARAGRAPHS;
            case "sentences", "sentence" -> Type.SENTENCES;
            case "words", "word" -> Type.WORDS;
            default -> throw new FlagException("Incorrect text type.");
        };
    }

    public int getLength() {
        return length;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Length: {0}\nType: {1}", length, type.getType());
    }

}

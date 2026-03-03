package Entry;

import Exceptions.FlagException;

public class Flags {

    private final String[] args;
    private int length;
    private Type type;

    public Flags(String[] args) {
        this.args = args;
    }

    public void assignFlags() throws FlagException {
        if (args.length != 2) throw new FlagException("Incorrect number.");
        try {
            this.length = Integer.parseInt(args[0]);
        } catch (NumberFormatException nfe) {
            throw new FlagException("Incorrect number for length.");
        }
        this.type = switch (args[1].trim().toLowerCase()) {
            case "paragraph" -> Type.PARAGRAPHS;
            case "sentences" -> Type.SENTENCES;
            case "words" -> Type.WORDS;
            default -> throw new FlagException("Incorrect text type.");
        };
    }

    public int getLength() {
        return length;
    }

    public Type getType() {
        return type;
    }

}

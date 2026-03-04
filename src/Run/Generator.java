package Run;

import Constants.Type;
import Exceptions.ReadFileException;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Generator {

    private int length;
    private Type type;
    private Pattern pattern;
    private String path;
    private ArrayList<String> text;
    private String END = ".";


    public Generator(int length, Type type, String path) {
        this.length = length;
        this.type = type;
        this.path = path;
    }

    public void setPattern() {
        this.pattern = switch (type) {
            case Type.PARAGRAPHS -> Pattern.compile("\n");
            case Type.SENTENCES -> Pattern.compile("[.?!] ");
            case Type.WORDS -> Pattern.compile("\\s+");
        };
    }

    public void readTemplateText() throws ReadFileException {
        InputStream input = getClass().getResourceAsStream(path);
        if (input == null) throw new ReadFileException("Source file not found.");
        text = new ArrayList<>();
        try (Scanner scanner = new Scanner(input)) {
            scanner.useDelimiter(pattern);
            while (scanner.hasNext()) {
                text.add(scanner.next().replaceAll("[.,!]", ""));
            }
        }
    }

    public void generate() {
        String terminator = type.getTerminator();
        int textSize = text.size();
        int counter = 0, tokenCounter = 0;
        while (counter < length) {
            System.out.print(text.get(tokenCounter++));
            if (counter + 1 < length) System.out.print(terminator);
            if (tokenCounter >= textSize) tokenCounter = 0;
            counter++;
        }
        System.out.print(END);
    }

}

import Entry.Type;
import Exceptions.ReadFileException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Generator {

    private int length;
    private Type type;
    private Pattern pattern;
    private Path path;
    private ArrayList<String> text;


    public Generator(int length, Type type, Path path) {
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
        text = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            scanner.useDelimiter(pattern);
            while (scanner.hasNext()) {
                text.add(scanner.next().replaceAll("[.,!]", ""));
            }
        } catch (IOException exception) {
            throw new ReadFileException("Source file not found.");
        }
    }

    // Words
    public void generate() {
        int textSize = text.size();
        int counter = 0, tokenCounter = 0;
        if (type == Type.PARAGRAPHS) {
            for (String paragraph : text) {
                System.out.println(paragraph.concat("."));
            }
        } else if (type == Type.SENTENCES) {
            while (counter < length) {
                System.out.print(text.get(tokenCounter++));
                if (counter + 1 < length) System.out.print(". ");
                if (tokenCounter >= textSize) tokenCounter = 0;
                counter++;
            }
            System.out.print(".");
        } else {
            while (counter < length) {
                System.out.print(text.get(tokenCounter++));
                if (counter + 1 < length) System.out.print(" ");
                if (tokenCounter >= textSize) tokenCounter = 0;
                counter++;
            }
            System.out.print(".");
        }
    }

}

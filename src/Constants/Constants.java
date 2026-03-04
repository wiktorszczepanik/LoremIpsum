package Constants;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Constants {
    public static Path TEXT_PATH = Paths.get("src/Text/LoremIpsum.txt");

    public static String help() {
        return "Example Lorem Ipsum generator usage:" +
                "java -jar LoremIpsum.jar 5 paragraphs" +
                "java -jar LoremIpsum.jar 10 sentences" +
                "java -jar LoremIpsum.jar 15 words" +
                "java -jar LoremIpsum.jar help";
    }
}

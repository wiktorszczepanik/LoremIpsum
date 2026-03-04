package Constants;

public class Constants {
    public static String TEXT_PATH = "/Text/LoremIpsum.txt";
    public static String help() {
        return """
                Example Lorem Ipsum generator usage:
                \tjava -jar LoremIpsum.jar 5 paragraphs
                \tjava -jar LoremIpsum.jar 10 sentences
                \tjava -jar LoremIpsum.jar 15 words
                \tjava -jar LoremIpsum.jar help""";
    }
}

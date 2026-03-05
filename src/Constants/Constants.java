package Constants;

public class Constants {
    public static String TEXT_PATH = "/Text/LoremIpsum.txt";
    public static String help() {
        return """
                The LoremIpsum is a Java program that allows users to generate placeholders in text form, using Lorem Ipsum.
                
                java -jar LoremIpsum.jar <number> <type>
                
                Example Lorem Ipsum generator usage:
                
                \tjava -jar LoremIpsum.jar 5 paragraphs
                \tjava -jar LoremIpsum.jar 10 sentences
                \tjava -jar LoremIpsum.jar 15 words""";
    }
}

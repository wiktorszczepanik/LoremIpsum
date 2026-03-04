import Constants.Constants;
import Run.Flags;
import Exceptions.ReadFileException;
import Run.Generator;

public class LoremIpsum {

    public static void main(String[] args) {
        if (args.length == 1 && (args[0].equals("-h") ||
            args[0].equals("--help") || args[0].equals("help"))) {
            System.out.println(Constants.help());
            return;
        }
        var flags = new Flags(args);
        try {
            flags.assignFlags();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
            return;
        }
        var generator = new Generator(
                flags.getLength(), flags.getType(), Constants.TEXT_PATH
        );
        generator.setPattern();
        try {
            generator.readTemplateText();
        } catch (ReadFileException exception) {
            System.err.println(exception.getMessage());
            return;
        }
        generator.generate();
    }
}
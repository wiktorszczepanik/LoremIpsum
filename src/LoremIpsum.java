import Constants.Constants;
import Entry.Flags;
import Exceptions.ReadFileException;

void main(String[] args) throws ReadFileException {
    var flags = new Flags(args);
    try {
        flags.assignFlags();
    } catch (Exception exception) {
        System.err.println(exception.getMessage());
    }
    var generator = new Generator(
        flags.getLength(), flags.getType(), Constants.TEXT_PATH
    );
    generator.setPattern();
    try {
        generator.readTemplateText();
    } catch (ReadFileException exception) {
        System.err.println(exception.getMessage());
    }
    System.out.println(flags);
    generator.generate();
}
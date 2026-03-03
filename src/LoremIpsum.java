import Entry.Flags;

void main(String[] args) {
    var flags = new Flags(args);
    try {
        flags.assignFlags();
    } catch (Exception exception) {
        System.err.println("Lorem Ipsum error:");
        System.err.println(exception.getMessage());
    }
    var generator = new Generator(flags.getLength(), flags.getType());
}
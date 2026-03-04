package Constants;

public enum Type {
    PARAGRAPHS {
        @Override
        public String getType() {
            return "Paragraphs";
        }
        @Override
        public String getTerminator() {
            return ".\n";
        }
    },
    SENTENCES {
        @Override
        public String getType() {
            return "Sentences";
        }
        @Override
        public String getTerminator() {
            return ". ";
        }
    },
    WORDS {
        @Override
        public  String getType() {
            return "Words";
        }
        @Override
        public String getTerminator() {
            return " ";
        }
    };

    public abstract String getType();
    public abstract String getTerminator();
}

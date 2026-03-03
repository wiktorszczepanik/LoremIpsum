package Entry;

public enum Type {
    PARAGRAPHS {
        @Override
        public String getType() {
            return "Paragraphs";
        }
    },
    SENTENCES {
        @Override
        public String getType() {
            return "Sentences";
        }
    },
    WORDS {
        @Override
        public  String getType() {
            return "Words";
        }
    };

    public abstract String getType();
}

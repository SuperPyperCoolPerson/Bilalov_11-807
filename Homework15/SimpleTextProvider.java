public class SimpleTextProvider implements TextProvider {
    private String text;

    public SimpleTextProvider(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        String strToReturn;
        if (text.length()  <= 100) {
            strToReturn = text;
        } else {
            strToReturn = text.substring(0, 100 - 1);
        }
        return "SimpleTextProvider{" +
                "text='" + strToReturn + '\'' +
                '}';
    }
}

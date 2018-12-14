import java.util.ArrayList;
import java.util.List;

public class CosTextAnalyzer implements TextAnalyzer, SearchEngine {
    @Override
    public double analyze(TextProvider te1, TextProvider te2) {
        List<String> bag = tokenizeUnique(te1.getText() + " " + te2.getText());
        List<String> list1 = tokenize(te1.getText());
        List<String> list2 = tokenize(te2.getText());
        return cosineSimilarity(list1, list2, bag);
    }

    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        return null;
    }

    /**
     * Returns a list of unique words found in an input text.
     * Words in the text can be delimited by one space or a space with a comma
     */
    private List<String> tokenizeUnique(String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (!uniqueWords.contains(word))
                uniqueWords.add(word);
        }
        return uniqueWords;
    }

    private List<String> tokenize(String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> listWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            listWords.add(word);
        }
        return listWords;
    }

    private double[] termFrequency(List<String> list, List<String> bag) {
        double[] count = new double[bag.size()];
        for (String word : list) {
            if (bag.contains(word)) {
                count[bag.indexOf(word)]++;
            }
        }
        double norm = 0;
        for (double i : count) {
            norm += i * i;
        }
        norm = Math.sqrt(norm);
        for (int i = 0; i < count.length; i++) {
            count[i] = count[i] / norm;
        }
        return count;
    }

    private double cosineSimilarity(List<String> l1, List<String> l2, List<String> bag) {
        double[] c1 = termFrequency(l1, bag);
        double[] c2 = termFrequency(l2, bag);
        double coscoef2 = 0;
        for (int i = 0; i < c1.length; i++) {
            coscoef2 += c1[i] * c2[i];
        }
        return coscoef2;
    }
}

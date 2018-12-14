import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchEngineImpl implements SearchEngine {
    TextAnalyzer analyzer = new JaccardTextAnalyzer();
    TextAnalyzer cosAnalyzer = new CosTextAnalyzer();

    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        List<TextProvider> name = new ArrayList<>();
        return sort(sources, target);

    }

    private List<TextProvider> sort(List<TextProvider> sources, TextProvider target) {
        Scanner sc = new Scanner(System.in);
        int method = sc.nextInt();

        if (method == 1) {
            double ja1 = 0.0;
            double ja2 = 0.0;
            for (int i = 0; i < sources.size(); i++) {
                for (int j = sources.size() - 1; j > i; j--) {

                    ja1 = analyzer.analyze(target, sources.get(j - 1));
                    ja2 = analyzer.analyze(target, sources.get(j));


                    if (ja1 < ja2) {
                        TextProvider text = sources.remove(j - 1);
                        sources.add(j, text);
                    }
                }
            }
        }


        if (method == 2) {
            double cos1 = 0.0;
            double cos2 = 0.0;
            for (int i = 0; i < sources.size(); i++) {
                for (int j = sources.size() - 1; j > i; j--) {

                    cos1 = cosAnalyzer.analyze(target, sources.get(j - 1));
                    cos2 = cosAnalyzer.analyze(target, sources.get(j));

                    if (cos1 < cos2) {
                        TextProvider text = sources.remove(j - 1);
                        sources.add(j, text);
                    }
                }



            }
        }
        return sources;
    }
}
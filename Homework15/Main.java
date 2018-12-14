import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TextAnalyzer a = new JaccardTextAnalyzer();
        CosTextAnalyzer c = new CosTextAnalyzer();
        String s1 = "Мама мыла рану, я ничего не делал";
        String s2 = "Я совсем ничего не делал";
        double coef = a.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
        System.out.println("Коэффициент схожести по Джакарду: " + coef);
        double coscoef = a.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
        System.out.println("Схожесть по косинусной мере: " + coscoef);

        File f1 = createFile("f1", s1);
        File f2 = createFile("f2", s2);
        double coef2 = a.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
        System.out.println("Жаккард для содержимого файлов: " + coef2);
        double coscoef2 = a.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
        System.out.println("Косинусная мера для содержимого файлов: " + coscoef2);
        f1.delete(); f2.delete();
        System.out.println("Жаккард или Косинус?");
        new SearchEngineTest();

    }



    static File createFile(String fileName, String content) throws FileNotFoundException {
        File f = new File(fileName);
        PrintWriter pw = new PrintWriter(f);
        pw.print(content);
        pw.close();
        return f;
    }

}

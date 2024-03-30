package wordcounter;

public class WordCounterLogic {

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}

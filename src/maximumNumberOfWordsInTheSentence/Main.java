package maximumNumberOfWordsInTheSentence;

public class Main {
    public static void main(String[] args) {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too",
                "this is great thanks very much"};
        int maxWords = 0;
        for (int i = 0; i < sentences.length; i++) {
            int countWords = 0;
            int a = 0;
            for (int j = 0; j < sentences[i].length(); j += a) {
                a = 0;
                if (sentences[i].indexOf(" ", j) > 0) {
                    countWords++;
                    a += sentences[i].indexOf(" ", j) + 1 - j;
                } else break;
            }
            countWords++;
            if (maxWords < countWords) {
                maxWords = countWords;
            }
        }
        System.out.println(maxWords);

    }
}

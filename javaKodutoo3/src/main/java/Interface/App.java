package Interface;

public final class App {
    public static void main(String[] args) {
        Word word = new Word();
        Word2 word2 = new Word2();
        String text = word.readFile("test.txt");
        String[] wordArray = word.splitWords(text);
        wordArray = word2.lowerCaseLetters(wordArray);
        int count = word2.countLongerThan(wordArray, 5);
        System.out.println(count);

    }
}

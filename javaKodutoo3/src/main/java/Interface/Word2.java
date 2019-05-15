package Interface;


public class Word2 implements WordInterface {
    public String[] lowerCaseLetters(String[] wordArray) {
        for (int i = 0; i < wordArray.length; i++) {
            String word = wordArray[i];
            wordArray[i] = word.toLowerCase();
        }
        return wordArray;
    }

    public int countLongerThan(String[] wordArray, int letterCount) {
        int count = 0;

        for (int i = 0; i < wordArray.length; i++) {
            String word = wordArray[i];
            if (word.length() >= letterCount) {
                count ++;
            }
        }
        return count;
    }

    @Override
    public String readFile(String path) {
        return null;
    }

    @Override
    public String[] splitWords(String text) {
        return null;
    }
}
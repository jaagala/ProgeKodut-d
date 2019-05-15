package Interface;

public interface WordInterface {
    public String readFile(String path);
    public String[] splitWords(String text);
    public String[] lowerCaseLetters(String[] wordArray);
    public int countLongerThan(String[] wordArray, int letterCount);    
}
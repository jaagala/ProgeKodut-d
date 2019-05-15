package javatest;

public class Program {
    public static void main(String[] args) {
        FileReading text = new FileReading("andmed.txt");
        System.out.println(text.word_counter);

    }
}
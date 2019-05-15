package javatest;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class FileReading {
    String file_path;
    String file_content;
    String[] array_of_words;
    HashMap<String, Integer> word_counter = new HashMap<>();

    public FileReading(String _path) {
        this.file_path = _path;

        this.read_file();
        this.split_to_words();
        this.words_to_lowercase();
        this.count_the_words();
    }
    public String read_file(){
        Path file_path = Paths.get(this.file_path);
        try {
            byte[] file_content_in_bytes = Files.readAllBytes(file_path);
            String file_content_str = new String(file_content_in_bytes, StandardCharsets.UTF_8);
            this.file_content = file_content_str;
        } catch (IOException my_error) {
            my_error.printStackTrace();
        }
        return this.file_content;
    }
    public String[] split_to_words(){
        String[] array_of_words = this.file_content.split("\\s");
        this.array_of_words = array_of_words;
        return this.array_of_words;

    }
    public String[] words_to_lowercase(){
        for (int i = 0; i < this.array_of_words.length; i++) {
            String word_in_array = this.array_of_words[i];
            String word_in_lowercase = word_in_array.toLowerCase();
            this.array_of_words[i] = word_in_lowercase;
        }
        return this.array_of_words;
    }
    public HashMap<String, Integer> count_the_words(){
        for (String word : this.array_of_words) {
            if(this.word_counter.get(word) == null){
                this.word_counter.put(word, 1);
            } else {
                int f = this.word_counter.get(word);
                this.word_counter.put(word, f+1);
            }
        }
        return this.word_counter;
    }
}
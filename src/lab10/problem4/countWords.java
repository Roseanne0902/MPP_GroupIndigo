package lab10.problem4;

import java.util.List;

public class countWords {
    public int countWords(List<String> words, char c, char d, int len){
        int count = 0;
        for (String word: words){
            if(word.contains(""+c) && word.length()==len && !word.contains(""+d)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> testWords = List.of(
                "cat", "car", "cab", "dog", "cut",
                "cater", "cow", "cop", "cap", "dip", "cup"
        );
        countWords obj = new countWords();
        int result = obj.countWords(testWords, 'c', 'd', 3);
        System.out.println("The number of words having met the conditions are: " + result);
    }
}
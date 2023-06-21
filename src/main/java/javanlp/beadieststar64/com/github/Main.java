package javanlp.beadieststar64.com.github;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "おはようございます。私はRECREATORです。";
        List<String> tokens = tokenize(text);
        for (String token : tokens) {
            System.out.println(token);
        }
    }

    public static List<String> tokenize(String text) {
        // テキストをスペースや句読点で分割してトークンのリストを作成する
        List<String> tokens = new ArrayList<>();
        String[] words = text.split("\\s+|\\p{Punct}");
        for (String word : words) {
            if (!word.isEmpty()) {
                tokens.add(word);
            }
        }
        return tokens;
    }
}
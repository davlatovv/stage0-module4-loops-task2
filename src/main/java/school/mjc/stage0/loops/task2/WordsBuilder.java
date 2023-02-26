package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder sb = new StringBuilder();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            sb.append(chars[i]);
        }

        String phrase = sb.toString();
        System.out.print(phrase);
    }
}

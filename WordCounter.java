public class WordCounter {
    public static void main(String[] args) {
        String str = "bob played connect-4 with his younger brother bobby and his other friend named bob";
        String word = "bob";

        String[] words = str.split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        System.out.println(count);
        return;
    }
    
}
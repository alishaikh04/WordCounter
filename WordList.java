import java.util.Map;
import java.util.HashMap;

public class WordList{

    private int wordCount;
    private String data;

    public WordList()
    {
    }
    public WordList(String data)
    {
        this.data = data;
    }
    public WordList(WordList other)
    {
        this.data = other.data;
    }

     public int numberofWords( String data)
    {
       this.data = data;
       wordCount = 0; // reset
       if (data == null) return 0;
       String trimmed = data.trim();
       if (trimmed.isEmpty()) return 0;
       // split on one or more whitespace characters
       String[] parts = trimmed.split("\\s+");
       wordCount = parts.length;
       return wordCount;
}

    /**
     * Return a map of word --> frequency for the provided input.
     * Splits on whitespace, strips leading/trailing punctuation and lowercases words.
     */
    public Map<String, Integer> wordFrequencies(String data) {
        this.data = data;
        Map<String, Integer> freq = new HashMap<>();
        if (data == null) return freq;
        String trimmed = data.trim();
        if (trimmed.isEmpty()) return freq;
        String[] parts = trimmed.split("\\s+");
        for (String part : parts) {
            // remove leading/trailing non-word characters (punctuation)
            String w = part.replaceAll("^\\W+|\\W+$", "");
            if (w.isEmpty()) continue;
            w = w.toLowerCase();
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        return freq;
    }
  
    @Override
    public Object clone() throws CloneNotSupportedException{
        return (WordList) super.clone();
    }
    @Override 
    public String toString()
    {
        return "WordList(" + wordCount + "): " + data;
    }

}

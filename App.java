import java.util.Scanner;

public class App {
     
    public void run() {

        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the data that you want to enter :" );
        String enterdata = sc.nextLine();
        System.out.println("data : " + enterdata);

        WordList w1 = new WordList();
         int count = w1.numberofWords(enterdata);
        System.out.println("number of words : " + count);

    System.out.println("word frequencies:");
    java.util.Map<String, Integer> freq = w1.wordFrequencies(enterdata);
    for (java.util.Map.Entry<String, Integer> e : freq.entrySet()) {
      System.out.println("  " + e.getKey() + " : " + e.getValue());
    }

      sc.close();
    }

}


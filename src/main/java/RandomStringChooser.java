import java.util.*;
public class RandomStringChooser {
  /* to be implemented in part (a) */
  private ArrayList<String> validWords = new ArrayList<String>();
  public RandomStringChooser(String[] words) {
      for (string word : words) {
          validWords.add(word);
      }
  }

  public String getNext() {
      int rando = (int)(Math.random() * validWords.size());
      if (validWords.size() == 0) return "NONE";
      String ans = validWords.get(rando);
      validWords.remove(rando);
      return ans;
  }
  // Heads up! 
  // You will get a very confusing error message until you have working code in
  // part b as well
}

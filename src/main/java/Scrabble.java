import java.io.Console;

public class Scrabble {
  char[] ones = {'1', 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'};
  char[] twos = {'2', 'D', 'G'};
  char[] threes = {'3', 'B', 'C', 'M', 'P'};
  char[] fours = {'4', 'F', 'H', 'V', 'W', 'Y'};
  char[] fives = {'5', 'K'};
  char[] eights = {'8', 'J', 'X'};
  char[] tens = {'9', 'Q', 'Z'};
  Object[] points = {ones, twos, threes, fours, fives, eights, tens};

  public Integer calculateScore(char input) {
    Integer total = 0;
    for(int pointWorth = 0; pointWorth < points.length; pointWorth++) {
      for(int letter = 0; letter < points[pointWorth].length; letter++) {
        if(points[pointWorth][letter] == input) {
          int toAdd = Integer.parseInt(points[pointWorth][0]);
          total += pointWorth;
        }
      }
    }
    return total;
  }
}

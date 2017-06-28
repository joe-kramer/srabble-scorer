import java.io.Console;

public class Scrabble {
  // Character[] ones = {'1', 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'};
  // Character[] twos = {'2', 'D', 'G'};
  // Character[] threes = {'3', 'B', 'C', 'M', 'P'};
  // Character[] fours = {'4', 'F', 'H', 'V', 'W', 'Y'};
  // Character[] fives = {'5', 'K'};
  // Character[] eights = {'8', 'J', 'X'};
  // Character[] tens = {'9', 'Q', 'Z'};
  // Object[] points = {ones, twos, threes, fours, fives, eights, tens};
  //
  // public Integer calculateScore(char input) {
  //   int total = 0;
  //   for(int pointWorth = 0; pointWorth < points.length; pointWorth++) {
  //     for(int letter = 0; letter < points[pointWorth].length; letter++) {
  //       if(points[pointWorth][letter] == input) {
  //         int toAdd = Character.getNumericValue(points[pointWorth][0]);
  //         total += pointWorth;
  //       }
  //     }
  //   }
  //   return total;
  // }

  //SIMPLE METHOD
  Character[] ones = {'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'};
  Character[] twos = {'D', 'G'};
  Character[] threes = {'B', 'C', 'M', 'P'};
  Character[] fours = {'F', 'H', 'V', 'W', 'Y'};
  Character[] fives = {'K'};
  Character[] eights = {'J', 'X'};
  Character[] tens = {'Q', 'Z'};

  public Integer calculateScore(char input) {
    int total = 0;

    for(char letter : ones) {
      if (input == letter) {
        total += 1;
      }
    }
    for(char letter : twos) {
      if (input == letter) {
        total += 2;
      }
    }
    for(char letter : threes) {
      if (input == letter) {
        total += 3;
      }
    }
    for(char letter : fours) {
      if (input == letter) {
        total += 4;
      }
    }
    for(char letter : fives) {
      if (input == letter) {
        total += 5;
      }
    }
    for(char letter : eights) {
      if (input == letter) {
        total += 8;
      }
    }
    for(char letter : tens) {
      if (input == letter) {
        total += 10;
      }
    }
    return total;
  }
}

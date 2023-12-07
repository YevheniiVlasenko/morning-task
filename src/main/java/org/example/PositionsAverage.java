package org.example;

public class PositionsAverage {
  public static double getAveragePercentage(String string) {
    String[] stringArray = string.split(",");
    double currentSimilarityCount = 0;
    for (int i = 0; i < stringArray.length; i++) {
      for (int j = i + 1; j < stringArray.length; j++) {
        if (i == j) {
          continue;
        }
        for (int n = 0; n < stringArray[0].length(); n++) {
          if (stringArray[i].charAt(n) == stringArray[j].charAt(n)) {
            currentSimilarityCount++;
          }
        }
      }
    }
    int totalPositions = stringArray.length * stringArray[0].length();

    return currentSimilarityCount / totalPositions / stringArray[0].length() * 100;
  }
}

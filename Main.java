import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();

    try {
      Scanner s = new Scanner(new File("total.txt"));

      while (s.hasNext()) {
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    } catch (Exception e) {
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
    System.out.println(totalScore.size() + " students took the test.");

    int total = 0;
    int count1000OrGreater = 0; // Counter for students who scored 1000 or greater
    int countLowerThan1000 = 0; // Counter for students who scored lower than 1000

    for (int score : totalScore) {
      total += score;
      if (score >= 1000) {
        count1000OrGreater++;
      } else {
        countLowerThan1000++;
      }
    }

    double average = (double) total / totalScore.size();
    System.out.println("Average Score: " + average);
    System.out.println("Number of students who scored 1000 or greater: " + count1000OrGreater);
    System.out.println("Number of students who scored lower than 1000: " + countLowerThan1000);
  }
}

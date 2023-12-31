/*
 * Question : Given a string s, return the number of segments in the string.
 * 
 * A segment is defined to be a contiguous sequence of non-space characters.
 * 
 * 
 */
public class JavaQuest25 {
  public static void main(String[] args) {
    System.out.println(countWords("       ")); // 0
    System.out.println(countWords("")); // 0
    System.out.println(countWords("Hello")); // 1
    System.out.println(countWords("Hello, my name is John."));// 5
    System.out.println(countWords(" . "));// 1
  }

  public static int countWords(String s) {
    if (s == null || s.trim().length() == 0) {
      return 0;
    }
    int count = 0;
    boolean inSegment = false;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ' ') {
        if (!inSegment) {
          inSegment = true;
          count++;
        }
      } else {
        inSegment = false;
      }
    }
    return count;
  }
}

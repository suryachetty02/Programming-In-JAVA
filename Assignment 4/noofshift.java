import java.util.*;
class Solution1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("s: ");
String s = input.nextLine();
System.out.print("goal: ");
String goal = input.nextLine();
boolean result = rotateString(s, goal);
System.out.println(result);
}
public static boolean rotateString(String s, String goal) {
if (s.length() != goal.length()) {
return false;
}
String s2 = s + s;
return s2.contains(goal);
}
}
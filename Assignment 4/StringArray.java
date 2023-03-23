import java.util.*;
public class fizzbuzz {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("n: ");
int n = input.nextInt();
List<String> answer = fizzBuzz(n);
System.out.println(answer);
}
public static List<String> fizzBuzz(int n) {
List<String> answer = new ArrayList<String>();
for (int i = 1; i <= n; i++) {
if (i % 3 == 0 && i % 5 == 0) {
answer.add("FizzBuzz");
} else if (i % 3 == 0) {
answer.add("Fizz");
} else if (i % 5 == 0) {
answer.add("Buzz");
} else {
answer.add(Integer.toString(i));
}
}
return answer;
}
}
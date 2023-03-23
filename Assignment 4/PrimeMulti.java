class PrimeExample implements Runnable {
public void run() {
int i, m = 20, flag;
for (i = 1; i <= m; i++) {
flag = 1;
if (i <= 3) {
System.out.println(i + " is prime number");
continue;
} else {
for (int j = 2; j < i; j++) {
if (i % j == 0) {
flag = 0;
break;
}
}
if (flag != 1) {
System.out.println(i + " is not prime number");
} else {
System.out.println(i + " is prime number");
}
}
}
}
}
class prime {
public static void main(String args[]) {
try {
PrimeExample p1 = new PrimeExample();
Thread t1 = new Thread(p1);
t1.start();
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}
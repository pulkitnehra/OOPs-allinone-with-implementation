// class firstFile{
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }



public class Barn {
public static void main(String[] args) {
new Barn().go("hi", 1);
new Barn().go("hi", "world", 2);
}
public void go(String... y, int x) {
System.out.print(y[y.length - 1] + " ");
}
}

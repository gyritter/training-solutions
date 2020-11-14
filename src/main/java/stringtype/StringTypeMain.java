package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String name = "John Doe";
        String prefix = "Hello ";
        String message = prefix + name;
        message = message +444;
        boolean b = message.equals("Hello John Doe");

        boolean c = message.equals("Hello John Doe444");

        System.out.println(b);

        System.out.println(c);
        String a="";
        String x="";
        String d= a+x;
        String egyik= "Abcde";
        System.out.println(egyik.length());
        System.out.println(d.length());
        System.out.println(egyik.charAt(0) + ", " + egyik.charAt(2));
        System.out.println(egyik.substring (0,2));
    }
}

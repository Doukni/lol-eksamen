package src.BroCodeJavaTutorial;

public class Methods {

    public static void main(String[] args) {
        String name = "Adam";
        int age = 21;

        hello(name, 21);

        int x = 2;
        int y = 20;

        System.out.println(add(x,y));
    }

    static void hello(String title, int age){
        System.out.println("Hello " + title + " are you " + age + " years old?");
    }

    static int add(int x, int y){


        return x+y;
    }
}

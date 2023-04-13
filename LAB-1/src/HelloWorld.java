
public class HelloWorld {

    public static void main(String[] args) {
        // intial hello statement
        System.out.println("Hello World!");

        System.out.println("Let's Say hello to everyone!");

        if (args.length == 0){
            System.out.println("Awwww, No one showed up");
        } else {
            // prints "hello" to all names mentioned in parameters
             for(int i = 0; i < args.length; i++) {
                 System.out.println("Hello " + args[i] + "!");
             }
        }


    }
}


// Create 3 class, 2 function (each), in 1st class make 1 static method, make a main class as 4th class

public class ClassWork9thMay {

    public static void main (String args[]) {
        FirstClass one = new FirstClass();
        SecondClass second = new SecondClass();
        ThirdClass third = new ThirdClass();

        one.Rajesh();
        FirstClass.Ankit();

        second.Aayush();
        second.Hunter();

        third.Rabin();
        third.Yubraj();
    }
}
class FirstClass {
    public static void Ankit () {
        System.out.println("Ankit\n");
    }
    public void Rajesh () {
        System.out.println("Rajesh\n");
    }
}
class SecondClass {
    public void Hunter () {
        System.out.println("Hunter\n");
    }
    public void Aayush () {
        System.out.println("Aayush\n");
    }
}
class ThirdClass {
    public void Rabin () {
        System.out.println("Rabin\n");
    }
    public void Yubraj () {
        System.out.println("Yubraj\n");
    }
}
package march14to18assignmentgreekster;

public class Animal {

    // Declare and initialize some String data.
    private String voice = "meouww";
    
    public static void main(String [] args) {
        
        // Declare a variable called 'animal' of the type 'Animal'.
        // Initialize the variable with a new 'Animal'.
        Animal animal = new Animal();
        
        // Call (run) the speak() method.
        animal.speak();
    }
    
    // Define a 'speak' method, which does nothing but
    // print (i.e. display) the String data.
    public void speak() {
        System.out.println(voice);
    }
}
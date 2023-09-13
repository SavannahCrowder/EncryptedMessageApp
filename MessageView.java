import java.util.Scanner;

public class MessageView {
    private final Scanner scanner = new Scanner(System.in); // stored here so we don't cause conflicts with System.in

    //Prints the menu for user. Should welcome the user to the Wonderland Messenger.
    // Then it should convey to the user that inputting "s" means search for a message, and "x" means exit the program.
    public void printMenu(){
        System.out.println("Welomce to the Wonderland Messenger!");
        System.out.println("Enter 's' to search for message.");
        System.out.println("Enter 'x' to exit the program.");
        //TO DO Done?
    }
    //Prints a message to console then returns next line of input from user using the Scanner.
    // Feel free to look at previous labs' implementations of this method for guidance.
    public String getInput(String msg){
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
        //TO DO Done?
    }


    public String messageToString(OpenMessage m){ //Returns the string form of an OpenMessage object passed in.
        String s = "TO: " + m.getTo() + "\n";
        s += "FROM: " + m.getFrom() + "\n";
        s += "SUBJECT: " + m.getSubject() + "\n";
        s += "BODY: " + m.getBody() + "\n";
        return s;
    }

}

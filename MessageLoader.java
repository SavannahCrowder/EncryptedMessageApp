import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MessageLoader {

    public static ArrayList<OpenMessage> loadFile(String filename){
        ArrayList<OpenMessage> messageList = new ArrayList<OpenMessage>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String to = parseLine(scanner.nextLine());
                String from = parseLine(scanner.nextLine());
                String subject = parseLine(scanner.nextLine());
                String body = parseLine(scanner.nextLine());
                OpenMessage message = new OpenMessage(to, from, subject, body);
                messageList.add(message);
            }
            scanner.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found: " + filename);
        }
        return messageList;
    }

    public static String parseLine(String line) {
        int colonIndex = line.indexOf(":");
        if (colonIndex == -1 || colonIndex == line.length() -1){
            return "";
        }
      String parsedLine = line.substring(colonIndex + 1);
        parsedLine = parsedLine.trim();
        return parsedLine;
    }

}
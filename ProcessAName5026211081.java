import java.util.Scanner;

public class ProcessAName5026211081 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = scn.nextLine();
        int spaceIdx = name.indexOf(' '); 
        String firstName = name.substring(0,1).toUpperCase();
        
        spaceIdx++;
        String lastIn = name.substring(spaceIdx, spaceIdx+1).toUpperCase();
        spaceIdx++;
        String lastName = name.substring(spaceIdx);
        
                System.out.println("Your name is : " +lastIn+lastName+ ", " +firstName+ ".");
    }
}

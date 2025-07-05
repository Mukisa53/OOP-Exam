import java.util.Scanner;

public class BookDescriptionCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the librarian to enter a book description
        System.out.println("Enter the book description:");
        String description = scanner.nextLine();
        
        // Convert description to lower case for case-insensitive comparison
        String lowerCaseDescription = description.toLowerCase();
        String wordToFind = "uganda";
        
        // Counting occurrences of "Uganda"
        int count = 0;
        int index = 0;
        
        // Loop until no more occurrences are found
        while ((index = lowerCaseDescription.indexOf(wordToFind.toLowerCase(), index)) != -1) {
            count++;
            index += wordToFind.length(); // Move index forward to continue searching
        }
        
        // Outputting the result
        System.out.println("The word 'Uganda' appears " + count + " times in the description.");
        
        scanner.close(); // Close the scanner resource
    }
}


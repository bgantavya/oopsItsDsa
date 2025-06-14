



import java.util.Scanner;
public class BookRecommendationSystem {
    // Method to recommend a book based on user preferences and conditions
    public static String recommendBook(String preferredGenre, int booksRead, boolean specialOffer) {
        String rec ="0";
        if(booksRead>0){

            if (booksRead<10 && specialOffer)rec = "We recommend a new release" + preferredGenre + "book";
            else if (booksRead>10 && specialOffer){
                rec = "We recommend a classic" + preferredGenre + "book";}
            else if (booksRead<10 && !specialOffer){
                rec = "We recommend a popular" + preferredGenre + "book";}
            else if (booksRead>10 && !specialOffer){
                rec = "We recommend a critically acclaimed" + preferredGenre + "book";}
            else{
                rec = "not found";
            }
        }
        return rec;}
        // Your implementation goes here
        // Use Boolean expressions, if-else statements, and nested if-else statements as needed
        // Return the book recommendation as a string
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the preferred genre, books read, and special offer status
        System.out.print("Enter your preferred genre: ");
        String preferredGenre = scanner.nextLine();

        System.out.print("Enter the number of books you have read: ");
        int booksRead = scanner.nextInt();

        System.out.print("Is there a special offer? (true/false): ");
        boolean specialOffer = scanner.nextBoolean();

        // Call the method and print the book recommendation
        String recommendation = recommendBook(preferredGenre, booksRead, specialOffer);
        System.out.println("Book Recommendation: " + recommendation);

        scanner.close();
    }
}

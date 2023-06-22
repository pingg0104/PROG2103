public class Main {
    public static void main(String[] args) {
        EBook ebook = new EBook("There’s a Monster", "Tom Fletcher", 6.99, 10, ".pdf");
        System.out.println("The book's title is " + ebook.getTitle());
        System.out.println("The book's author is " + ebook.getAuthor());
        System.out.println("The book's price is " + ebook.getPrice());
        System.out.println("The book's quantity is " + ebook.getQuantity());
        System.out.println("The book's file format is " + ebook.getFileFormat());
        ebook.openBook();
        ebook.downloadBook();
        System.out.println("The book's validate format is " + ebook.validateFormat());
        System.out.println();

        PhysicalBook physicalBook = new PhysicalBook("The Fox Who Wanted to Fly", "Harley Hamilton", 8.99, 5,250);
        System.out.println("Physical Book details:");
        System.out.println("Title: " + physicalBook.getTitle());
        System.out.println("Author: " + physicalBook.getAuthor());
        System.out.println("Price: $" + physicalBook.getPrice());
        System.out.println("Quantity: " + physicalBook.getQuantity());
        System.out.println("Weight: " + physicalBook.getWeight() + "g");
        System.out.println("Shipping Cost: $" + physicalBook.calculateShippingCost());
        System.out.println("Weight in pounds: " + physicalBook.getWeightInPounds() + " lbs");
    }
}
public class Main {
    public static void main(String[] args) {
        EBook ebook = new EBook("There’s a Monster", "Tom Fletcher", 6.99, 10, ".pdf");
        System.out.println("Title: " + ebook.getTitle());
        System.out.println("Author: " + ebook.getAuthor());
        System.out.println("Price: RM" + ebook.getPrice());
        System.out.println("Quantity: " + ebook.getQuantity());
        System.out.println("File format: " + ebook.getFileFormat());
        ebook.openBook();
        ebook.downloadBook();
        System.out.println("The book's validate format is " + ebook.validateFormat());
        System.out.println();

        PhysicalBook physicalBook = new PhysicalBook("The Fox Who Wanted to Fly", "Harley Hamilton", 8.99, 5,250);
        System.out.println("Physical Book details:");
        System.out.println("Title: " + physicalBook.getTitle());
        System.out.println("Author: " + physicalBook.getAuthor());
        System.out.println("Price: RM" + physicalBook.getPrice());
        System.out.println("Quantity: " + physicalBook.getQuantity());
        System.out.println("Weight: " + physicalBook.getWeight() + "g");
        System.out.println("Shipping Cost: RM" + physicalBook.calculateShippingCost());
        System.out.println("Weight in pounds: " + physicalBook.getWeightInPounds() + " lbs");
    }
}

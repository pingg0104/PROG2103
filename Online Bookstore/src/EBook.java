public class EBook extends Book{
    private String fileFormat;

    EBook(String title, String author, double price, int quantity, String fileFormat){
        super(title, author, price, quantity);
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public void openBook(){
        System.out.println("The book is opened and you may start reading. ");
    }

    public void downloadBook(){
        System.out.println("The book has begin downloading. ");
    }

    public boolean validateFormat(){
        String[] validFormats = { ".pdf", ".epub" };
        for (String format : validFormats) {
            if (fileFormat.equals(format)) {
                return true;
            }
        }
        return false;
    }
}

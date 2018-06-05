package basics;

public class Strings {
    public static void main(String[] args) {
        String bookTitle;
        String wordChoice = "Ring";
        bookTitle = "The Lord of the Rings";

        if (bookTitle.contains(wordChoice)){
            System.out.println("The book contains the word " + wordChoice);
        }

        String browser = "Chrome";
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("The browser is chrome");
        }

        String firstName = "Tom";
        String lastName = "Wiggers";
        String BSN = "1234567";

        System.out.println("There are " + BSN.length() + " digits in your BSN.");

        // Print the initials plus last 4 digits of BSN
        System.out.print(firstName.substring(0, 1));
        System.out.print(lastName.substring(0, 1));
        System.out.print(BSN.substring(5));

    }
}

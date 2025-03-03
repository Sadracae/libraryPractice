import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Register Patron");
            System.out.println("5. View Patrons");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Search Book");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Copies: ");
                    int copies = scanner.nextInt();
                    library.addBook(new Book(title, author, isbn, copies));
                    break;
                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    isbn = scanner.nextLine();
                    library.removeBook(isbn);
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.print("Patron Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Patron ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Contact: ");
                    String contact = scanner.nextLine();
                    library.registerPatron(new Patron(name, id, contact));
                    break;
                case 5:
                    library.viewPatrons();
                    break;
                case 6:
                    System.out.print("Enter ISBN to borrow: ");
                    isbn = scanner.nextLine();
                    library.borrowBook(isbn);
                    break;
                case 7:
                    System.out.print("Enter ISBN to return: ");
                    isbn = scanner.nextLine();
                    library.returnBook(isbn);
                    break;
                case 8:
                    System.out.print("Search by Title, Author, or ISBN: ");
                    String query = scanner.nextLine();
                    library.searchBook(query);
                    break;
                case 9:
                    System.out.println("Exiting system.");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

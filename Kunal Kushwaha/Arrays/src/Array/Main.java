package Array;

class Writer {
    private String name, email;
    private char gender;

    public Writer(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Writer[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}

class Book {
    private String Name;
    private Writer writer;
    private double price;
    private int qty;

    public Book(String Name, Writer writer, double price) {
        this.Name = Name;
        this.writer = writer;
        this.price = price;
    }

    public Book(String Name, Writer writer, double price, int qty) {
        this.Name = Name;
        this.writer = writer;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name=" + Name + "," + writer.toString() +
                ",price=" + price + ",qty=" + qty;
    }
}

public class Main {
    public static void main(String[] args) {
        Writer writer1 = new Writer("J.K. Rowling", "jk.rowling@example.com", 'F');
        Book book1 = new Book("Harry Potter", writer1, 39.99, 100);

        System.out.println(writer1); // Writer details
        System.out.println(book1);   // Book details
    }
}
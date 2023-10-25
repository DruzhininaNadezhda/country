package Books;


import java.util.Arrays;

public class book {
    private String nameBook;
    PublishingHouse publishingHouse;
    private int year;
    private String[] authors = {"Седжвик Роберт", "Уэйн Кевин", "Вигерс Карл", "Шилдт Герберт", "Полубенцева М.И"};

    public static void main(String[] args) {
        PublishingHouse Prospect = new PublishingHouse("Проспект", "Москва");
        PublishingHouse Piter = new PublishingHouse("Питер", "Санкт-Петербург");
        PublishingHouse BHV = new PublishingHouse("БХВ", "Санкт-Петебург");
        PublishingHouse Dialectica = new PublishingHouse("Диалектика", "Киев");
        book[] book = new book[5];
        book[0] = new book("Computer Science: основы программирования на Java,ООП, алгоритмы и структуры данных;", 2018, Piter, "Седжвик Роберт", "Уэйн Кевин");
        book[1] = new book("Разработка требований к программному обеспечению. 3-е издание, дополненное", 2019, BHV);
        book[2] = new book("Java. Полное руководство, 10-е издание", 2018, Dialectica);
        book[3] = new book("C/C++. Процедурное программирование", 2017, BHV, "Полубенцева М.И");
        book[4] = new book("Конституция РФ", 2020, null );
Printall(book);
BHV.setCityPublishingHouse("Санкт-Петербург");
        Printall(book);
    }



    public void setAuthors(String[] authors) {
        if (authors == null || authors.length == 0) throw new IllegalArgumentException();
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws IllegalArgumentException {
        if (year > 0) {
            this.year = year;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getAuthors() {
        return authors.length;
    }

    public String getAuthors(int index) throws IllegalArgumentException {
        if (index > authors.length || index < 0) {
            throw new IllegalArgumentException();
        }
        return authors[index];

    }

    public void setNameBook(String nameBook) throws IllegalArgumentException {
        if (nameBook == null || nameBook.isEmpty()) {
            throw new IllegalArgumentException("Необходимо ввести название книги");
        } else {
            this.nameBook = nameBook;
        }
    }
    public String print() {
        String d = null;
        if (authors == null) {
            d = getNameBook() + getYear() + publishingHouse;
        } else {d = getNameBook() + getYear() + Arrays.toString(authors) + publishingHouse;}
        return d;
            }

    public static void Printall(book[] book) {
        for (Books.book value : book) {
            System.out.println(value.print());
        }
    }

    public book(String nameBook, int year, PublishingHouse publishingHouses) {
        setNameBook(nameBook);
        setYear(year);
        this.publishingHouse=publishingHouses;
        this.authors = null;
            }

    public book(String nameBook, int year, String author, Books.PublishingHouse publishingHouses) {
        setNameBook(nameBook);
        setYear(year);
        this.publishingHouse=publishingHouses;
    }

    public book(String nameBook, int year, PublishingHouse publishingHouses, String... authors) {
        setNameBook(nameBook);
        setYear(year);
        this.authors = authors;
        this.publishingHouse = publishingHouses;
    }
}




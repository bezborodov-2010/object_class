public class Main {
    public static void main(String[] args) {
        Author firstBook = new Author("Антон", "Чехов");
        Author secondBook = new Author("Владимир", "Маяковский");
        Book first = new Book("Вишневый сад", firstBook, 1903);
        Book second = new Book("Облако в штанах", secondBook, 1915);
        System.out.println("Название книги " + first.getName() + ". Автор " + firstBook.getFirstName() + " " + firstBook.getLastName() + first.setPublicationYear(1904));
        System.out.println("Название книги " + second.getName() + ". Автор " + secondBook.getFirstName() + " " + secondBook.getLastName() + second.setPublicationYear(1945));
    }
}
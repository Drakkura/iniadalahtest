/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testt;

/**
 *
 * @author ryan
 */
public class Testt {

    public static void main(String[] args) {
        // Creating authors
        Author author1 = new Author("George Orwell");
        Author author2 = new Author("Aldous Huxley");

        // Creating books
        Book book1 = new Book("1984", author1);
        Book book2 = new Book("Brave New World", author2);

        // Creating library and adding books
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        // Listing all books in the library
        library.listBooks();
    }
}

class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Library {
    private java.util.List<Book> books;

    public Library() {
        books = new java.util.ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor().getName());
        }
    }
}
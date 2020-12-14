/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderSystem;

import java.util.ArrayList;

/**
 * @author Cong
 */
public class BookDirectory {

    private ArrayList<Book> booklist = new ArrayList<>();

    public BookDirectory() {
    }

    public void addProduct(Book book) {
        book.setId(booklist.size() + 1);
        booklist.add(book);
    }

    public void deletedProductDirectory(Book p) {
        booklist.remove(p);
    }

    public Book searchProductDirectory(int bookID) {
        for (Book book : booklist) {
            if (book.getId() == bookID) {
                return book;
            }
        }
        return null;
    }
     public Book searchBook(String bookname) {
        for (Book book : booklist) {
            if (book.getName().equals(bookname)) {
                return book;
            }
        }
        System.out.println("No book");
        return null;
    }
     public boolean checkBookUnique(String bookname) {
        for (Book book : booklist) {
            if (book.getName().equals(bookname)) {
                 System.out.println("Book Name Exists");
                return false;
            }
        }
       
        return true;
    }
    public ArrayList<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(ArrayList<Book> booklist) {
        this.booklist = booklist;
    }

    public void update(Book book) {
        
       // booklist.set(book.getId(), book);
      
       
    }
}

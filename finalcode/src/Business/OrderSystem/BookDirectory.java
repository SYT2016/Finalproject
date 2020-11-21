/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderSystem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 16104
 */
public class BookDirectory {//all menu
    private ArrayList<Book> booklist;
    
    public BookDirectory(){
        booklist=new ArrayList<Book> ();
    }
    public Book addProduct(){
        Book book=new Book();
        booklist.add(book);
        return book;
    
    
    }
    
        public void deletedProductDirectory(Book p){   
        booklist.remove(p);

    }
        public Book searchProductDirectory(int bookID){
        for(Book book:booklist){
            if(book.getBookid()==bookID){
                return book;
            }
        }
        return null;
    
    
    }

    public ArrayList<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(ArrayList<Book> booklist) {
        this.booklist = booklist;
    }




}

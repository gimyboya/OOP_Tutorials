package com.company;

import java.util.ArrayList;

/**
 * Created by gimy on 4/13/2017.
 */
public class Book extends Item {

  private int ISBN;

  public Book(String auth, String title, int puby, String publ, int isbn){
    super(auth,title,puby,publ);
    ISBN = isbn;
  }


  public int getISBN() {
    return ISBN;
  }

  public void setISBN(int ISBN) {
    this.ISBN = ISBN;
  }

  public boolean SearchItem(String term){

    if(this.getAuther().contains(term)){
        return true;
      }

      if(this.getPublisher().contains(term)){
        return true;
      }

      if(this.getTitle().contains(term)){
        return true;
      }

      if(String.valueOf(this.getPublicationYear()).contains(term)){
        return true;
      }

    if(String.valueOf(this.getISBN()).contains(term)){
      return true;
    }

      return false;
  }

  public void PrintObject(){
    System.out.println("\n");
    System.out.println("Title: " + this.getTitle());
    System.out.println("Authors: " + this.getAuther());
    System.out.println("Publisher: " + this.getPublisher());
    System.out.println("Year published: " + this.getPublicationYear());


  }
}

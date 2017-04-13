package com.company;

/**
 * Created by gimy on 4/13/2017.
 */
public abstract class Item {


  private String auther;
  private String title;
  private int publicationYear;
  private String publisher;

  public Item(){
  }

  public Item(String auther, String title, int publicationYear, String publisher){
    this.auther = auther;
    this.title = title;
    this.publicationYear = publicationYear;
    this.publisher = publisher;
  }


  public String getAuther() {
    return auther;
  }

  public void setAuther(String auther) {
    this.auther = auther;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  abstract public boolean SearchItem(String term); // notice that the search method is slightly different here it returns a boolean that's because i want to find all the instances
  abstract public void PrintObject();
}

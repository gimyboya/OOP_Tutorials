package com.company;

/**
 * Created by gimy on 4/13/2017.
 */
public class Journal extends Item {

  private String publicaVenue;
  private int NOP;

  public Journal(String auth, String title, int puby, String publ, String publicaVenue, int nop){
    super(auth,title,puby,publ);
    this.publicaVenue = publicaVenue;
    this.NOP = nop;
  }

  public String getPublicaVenue() {
    return publicaVenue;
  }

  public void setPublicaVenue(String publicaVenue) {
    this.publicaVenue = publicaVenue;
  }

  public int getNOP() {
    return NOP;
  }

  public void setNOP(int NOP) {
    this.NOP = NOP;
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

    if(String.valueOf(this.getPublicaVenue()).contains(term)){
      return true;
    }

    if(String.valueOf(this.getNOP()).contains(term)){
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
    System.out.println("Venue: " + this.getPublicaVenue());
    System.out.println("Number of pages: " + this.getNOP());

  }
}

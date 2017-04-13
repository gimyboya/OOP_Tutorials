package com.company;

import java.util.ArrayList;

public class Main {



  public static void main(String[] args) {

    ArrayList<Item> Items = new ArrayList<Item>();
    
    String term = null;

    Book book1 = new Book("Lili Marziana", "Usrati Jannati From Islamic Perspective", 2016, "Springer", 1245879);

    Journal journal1 = new Journal("Ali", "Skyline query processing", 2015, " IEEE", "Journals of Systems & Software", 10);
    Journal journal2 = new Journal("Arjumand", "Software Engineering Teams", 2015, " Springer", "Information Software Technology", 20);

    AddElement(Items, book1);
    AddElement(Items, journal1);
    AddElement(Items, journal2);

    displayAll(Items);

    SearchAll(Items, "IEEE");
    SearchAll(Items, "Springer");
    SearchAll(Items, "2015");
    SearchAll(Items, "Lili Marziana");

  }

  public static void AddElement(ArrayList myArrayList, Item myItem){

    myArrayList.add(myItem);

  }

  public static void displayAll(ArrayList<Item> myarrayList){
    System.out.println("\n\nDisplaying All the items: ");
    for (int i = 0; i < myarrayList.size(); i++) {
      myarrayList.get(i).PrintObject();
    }
  }

  public static void SearchAll(ArrayList<Item> myArrayList, String term){

    System.out.println("\n\n\nThe results for the term \"" + term  + "\": ");
    for (int i = 0; i < myArrayList.size(); i++) {
      if(myArrayList.get(i).SearchItem(term)){
        myArrayList.get(i).PrintObject();
      }
    }

  }



}

package com.mycollection;

public class MyCollectionApp {
    public static void main(String[] args) {
        StringCollection myCollection = new StringCollection();
        myCollection.addElement("Zero");
        myCollection.addElement("One");
        myCollection.addElement("Two");
        myCollection.addElement("Three");
        myCollection.addElement("Four");
        myCollection.addElement("Five");

        int size = myCollection.collectionSize();
        System.out.println("Size of collection: " + size);
        System.out.println();
        System.out.println(myCollection.toString());

        //remove last element
        String valueOfLastElement = myCollection.getElement(myCollection.collectionSize() - 1);
        myCollection.removeElement(valueOfLastElement);

        //remove first element
        String valueOfFirstElement = myCollection.getElement(0);
        myCollection.removeElement(valueOfFirstElement);

        //remove middle element
        String valueOfMiddleElement = "Seven";
        myCollection.removeElement(valueOfMiddleElement);

        //add element
        String elementsValue = "Six";
        myCollection.addElement(elementsValue);
        System.out.println(myCollection.toString());

        //remove element - index 2
        System.out.println("Removing of element with index 2:");
        valueOfLastElement = myCollection.getElement(2);
        myCollection.removeElement(valueOfLastElement);

        //get first element - index 0
        int elementsIndex = 0;
        System.out.println("Get element with index " + elementsIndex);
        String valueOfElement = myCollection.getElement(elementsIndex);
        System.out.println("Element with index " + elementsIndex + ": " + valueOfElement+ "\n");

        //get last element - index: (size - 1)
        elementsIndex = myCollection.collectionSize() - 1;
        System.out.println("Get element with index " + elementsIndex);
        valueOfElement = myCollection.getElement(elementsIndex);
        System.out.println("Element with index " + elementsIndex + ": " + valueOfElement + "\n");

//        //get too big index
//        elementsIndex = 10;
//        System.out.println("Get element with index " + elementsIndex);
//        valueOfElement = myCollection.getElement(elementsIndex);
//        System.out.println("Element with index " + elementsIndex + ": " + valueOfElement + "\n");
    }
}

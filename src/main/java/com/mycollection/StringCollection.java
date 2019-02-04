package com.mycollection;

public class StringCollection {
    private Element collectionHead = null;

    public int collectionSize() {
        int collectionSize = 0;
        if (collectionHead == null) return collectionSize;
        Element tmpElement = collectionHead;
        do {
            collectionSize++;
            tmpElement = tmpElement.getNext();
        } while (tmpElement != null);
        return collectionSize;
    }

    public String getElement(int n) throws IndexOutOfBoundsException {
        if (collectionHead == null) {
            throw new IndexOutOfBoundsException("StringCollection is empty!!!");
        }
        if (n >= this.collectionSize()) {
            throw new IndexOutOfBoundsException("Index " + n + " is larger than collection size (" + this.collectionSize() + ")");
        }
        Element tmp = collectionHead;
        for (int i = 0; i < n; i++) {
            tmp = tmp.getNext();
        }
        return tmp.getValue();
    }

    public void addElement(String s) {
        if (collectionHead == null) {
            Element newElement = new Element(s);
            collectionHead = newElement;
        } else {
            Element lastElement = null;
            Element tmp = collectionHead;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            lastElement = tmp;
            Element newElement = new Element(s);
            lastElement.setNext(newElement);
            newElement.setPrev(lastElement);
        }
        System.out.println("New element \"" + s + "\" has been added to collection");
    }

    public boolean removeElement(String s) throws IndexOutOfBoundsException {
        if (collectionHead == null) {
            throw new IndexOutOfBoundsException("StringCollection is empty!!!");
        }
        Element tmp = collectionHead;
        if (collectionHead.getValue().equals(s)) {
            collectionHead = collectionHead.getNext();
            collectionHead.setPrev(null);
        }
        while (tmp != null) {
            if (tmp.getValue().equals(s)) {
                Element prev = tmp.getPrev();
                Element next = tmp.getNext();
                if (prev != null) {
                    prev.setNext(next);
                }
                if (next != null) {
                    next.setPrev(prev);
                }
                System.out.println("Element \"" + s + "\" - has been removed\n" + this.toString());
                tmp.setPrev(null);
                tmp.setNext(null);
                return true;
            }
            tmp = tmp.getNext();
        }
        System.out.println("Removing element failed. Element of collection \"" + s + "\" not found\n");
        return false;
    }

    @Override
    public String toString() {
        String napis = "Elements of collection: \n";
        for (int i = 0; i < this.collectionSize(); i++) {
            napis = napis + this.getElement(i) + "\n";
        }
        return napis;
    }
}


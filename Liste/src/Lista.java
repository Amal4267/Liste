public class Lista {
    private Nodo head;
    private Nodo tail;

    public Lista() {
        head = null;
        tail = null;
    }

  
    public void addHead(Nodo n) {
        if (head == null) {
            head = tail = n;
            return;
        }
        n.setNext(head);
        head.setPrev(n);
        head = n;
    }


    public void add(Nodo n) {
        if (head == null) {
            head = tail = n;
            return;
        }
        tail.setNext(n);
        n.setPrev(tail);
        tail = n;
    }

  
    public void remove(String s) {
        Nodo temp = head;

        while (temp != null) {
            if (temp.getValue().equals(s)) {

                if (temp.getPrev() != null)
                    temp.getPrev().setNext(temp.getNext());
                else
                    head = temp.getNext();

                if (temp.getNext() != null)
                    temp.getNext().setPrev(temp.getPrev());
                else
                    tail = temp.getPrev();

                return;
            }
            temp = temp.getNext();
        }
    }

 
    public boolean exists(String s) {
        Nodo temp = head;

        while (temp != null) {
            if (temp.getValue().equals(s))
                return true;
            temp = temp.getNext();
        }
        return false;
    }

  
    public String toString() {
        String s = "Lista (avanti): ";
        Nodo temp = head;

        while (temp != null) {
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        return s;
    }

    
    public String toStringReverse() {
        String s = "Lista (indietro): ";
        Nodo temp = tail;

        while (temp != null) {
            s += temp.getValue() + " - ";
            temp = temp.getPrev();
        }
        return s;
    }
}

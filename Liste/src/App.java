public class Main {
    public static void main(String[] args) {

        Lista l = new Lista();

        l.addHead(new Nodo("A"));
        l.add(new Nodo("B"));
        l.add(new Nodo("C"));
        l.addHead(new Nodo("D"));

        System.out.println(l.toString());
        System.out.println(l.toStringReverse());

        System.out.println("Esiste A? " + l.exists("A"));
        l.remove("A");
        System.out.println("Questa è la lista dopo la rimozione di A");
        System.out.println(l.toString());
        

    }
}


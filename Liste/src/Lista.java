public class Lista {
   Nodo root;
    public Lista(){
        root = null;
        
        
        
    }
    public void addHead( Nodo n ){
            if(root == null){
                root = n;
                return;
            }
            n.setNext(root);
            root = n;
        }
    public void add( Nodo n ){
        if(root==null){
            root = n;
            return;
        }
        Nodo temp = root;
        while(temp.getNext()!=null) temp=temp.getNext();
        temp.setNext(n);
    }
    public String toString(){
        String s = "La lista contiene:";
        Nodo temp = root;
        while(temp!=null){
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        return s + "\n";
    }
}

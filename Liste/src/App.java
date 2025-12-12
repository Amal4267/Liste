public class App {
   public static void main(String[] args) {
		Lista l = new Lista();
		l.add(new Nodo("Mario"));
		l.add(new Nodo("Giulio"));
		l.add(new Nodo("Francesco"));
		l.addHead(new Nodo("Giuseppe"));
		System.out.println(l);
	}
}

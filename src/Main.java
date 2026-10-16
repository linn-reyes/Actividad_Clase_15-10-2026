public class Main {
    public static void main(String[] args) {
        // Lista de libros
        DoublyLinkedListGatos<Gatos> gato = new DoublyLinkedListGatos<>();
        gato.insertLast(new Gatos("Tostada", "Manchado"));
        gato.insertLast(new Gatos("Patches", "Anaranjado"));
        gato.insertFirst(new Gatos("Mushu", "Atigrado"));

        gato.traverse();
        // Lo nuevo: podemos recorrerla al revés
        gato.traverseBackward();

        System.out.println("Existe Maru: " + gato.contains(new Gatos("Maru", "Siberiano")));
        gato.remove(new Gatos("Maru", "Siberiano"));

        gato.traverse();
        gato.traverseBackward();
    }
}

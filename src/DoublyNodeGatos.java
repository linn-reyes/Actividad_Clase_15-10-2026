public class DoublyNodeGatos<T> {
    // El dato o datos que guarda el nodo
    private T data;
    // Referencia al nodo siguiente (empieza en null por defecto)
    private DoublyNodeGatos<T> next;
    // Referencia al nodo anterior (empieza en null por defecto)
    private DoublyNodeGatos<T> prev;

    public DoublyNodeGatos(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    DoublyNodeGatos<T> getNext() {
        return next;
    }

    void setNext(DoublyNodeGatos<T> next) {
        this.next = next;
    }

    DoublyNodeGatos<T> getPrev() {
        return prev;
    }

    void setPrev(DoublyNodeGatos<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "[" + data + "]";
    }
}
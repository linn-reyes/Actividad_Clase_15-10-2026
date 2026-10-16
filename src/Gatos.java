import java.util.Objects;

public class Gatos {
    private final String nombre;
    private final String raza;

    public Gatos(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return nombre + " es de la raza " + raza;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Gatos gatos = (Gatos) o;
        return Objects.equals(nombre, gatos.nombre) && Objects.equals(raza, gatos.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, raza);
    }
}

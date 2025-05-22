import javax.persistence.*;
import java.io.Serializable;

/**
 * Clase que representa a un cliente que será guardado en la base de datos.
 */
@Entity // Esta clase se va a almacenar como entidad en ObjectDB
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    // Constructor vacío obligatorio para ObjectDB
    public Cliente() {}

    // Constructor para facilitar la creación de objetos
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters necesarios para que ObjectDB pueda acceder a los campos
    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método que muestra los datos del cliente
    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nombre='" + nombre + "'}";
    }
}

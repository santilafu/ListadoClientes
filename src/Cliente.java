import java.util.*;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Clase que representa un cliente.
 * Que será guardado en la base de datos.
 */
@Entity //Esta clase se va a almacenar como entidad en ObjectDB
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public Cliente() {}

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
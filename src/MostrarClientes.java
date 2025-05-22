import javax.persistence.*;
import java.util.List;

/**
 * Clase que permite mostrar los clientes de la base de datos ordenados alfabeticamente en orden inverso.
 */
public class MostrarClientes {
    public static void main(String[] args) {
        // Creamos el gestor de entidades conectado a nuestra unidad "miBD".
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBD");
        EntityManager em = emf.createEntityManager();

        // Creamos una consulta JPQL para obtener todos los clientes ordenados por nombre en orden inverso
        TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c ORDER BY c.nombre DESC", Cliente.class);
        List<Cliente> clientes = query.getResultList();

        // Mostramos los clientes
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Cerramos el gestor de entidades.
        em.close();
        emf.close();
    }
}
import javax.persistence.*;

/**
 * Clase que permite insertar clientes en la base de datos.
 */

public class InsertarClientes {
    public static void main(String[] args) {
        //Creamos el gestor de entidades conectado a nuestra unidad "miBD".
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBD");
        EntityManager em = emf.createEntityManager();

        // Iniciamos una transacción
        em.getTransaction().begin();

        //Insertamos clientes.
        em.persist(new Cliente("Juan"));
        em.persist(new Cliente("Pedro"));
        em.persist(new Cliente("María"));
        em.persist(new Cliente("Ana"));
        em.persist(new Cliente("Luis"));
        em.persist(new Cliente("Carlos"));
        em.persist(new Cliente("Laura"));
        em.persist(new Cliente("Sofía"));

        // Finalizamos la transacción.
        em.getTransaction().commit();

        // Cerramos el gestor de entidades.
        em.close();
        emf.close();
        // Imprimimos un mensaje de confirmación
        System.out.println("Clientes insertados correctamente.");
    }
}
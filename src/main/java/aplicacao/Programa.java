package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        // INSERINDO DADOS

        // Id nulo para que o BD defina o Id automaticamente.
        Pessoa p1 = new Pessoa(null, "Leo", "leo@gmail.com");
        Pessoa p2 = new Pessoa(null, "Leozao", "leozao@gmail.com");
        Pessoa p3 = new Pessoa(null, "Leozera", "leozera@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        em.close();
        emf.close();

        System.out.println("Dados inseridos!");

    }
}

package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa2 {
    public static void main(String[] args) {

        // Buscando dados do BD.

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 2);

        System.out.println(p);
        em.close();
        emf.close();

    }
}

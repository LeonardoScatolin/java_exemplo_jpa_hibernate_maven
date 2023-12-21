package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa4 {
    public static void main(String[] args) {

        // ATUALIZANDO PESSOA

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa pessoa = em.find(Pessoa.class, 3);

        em.getTransaction().begin();
        pessoa.setNome("Leo Scatolin");
        em.getTransaction().commit();

        System.out.println(pessoa);

        em.close();
        emf.close();
    }
}

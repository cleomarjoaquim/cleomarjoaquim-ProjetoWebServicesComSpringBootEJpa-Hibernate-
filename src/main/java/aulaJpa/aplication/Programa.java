package aulaJpa.aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulaJpa.dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null,"Carols Torres","blablabla@gmail");
		Pessoa p2 = new Pessoa(null,"marcio fraca","uahsduhasd@gmail");
		Pessoa p3 = new Pessoa(null,"eu  joaquim","kkkk@gmail");
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println(p);

		System.out.println("PRONTO");
		em.close();
		emf.close();
	}

}

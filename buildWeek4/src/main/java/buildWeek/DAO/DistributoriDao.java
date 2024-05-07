package buildWeek.DAO;

import buildWeek.Entity.Distributore;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DistributoriDao {

    private EntityManager em;

    public DistributoriDao(EntityManager em) {
        this.em = em;
    }

    public void save(Distributore distributore) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(distributore);
        et.commit();
    }

    public Distributore getDistributoreById (int id) {
        return em.find(Distributore.class, id);
    }

    public void delete (int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();

        Distributore distributore = getDistributoreById(id);

        if (distributore != null) {
            em.remove(distributore);
        } else {
            System.out.println("Distributore non presente");
        }

        et.commit();
    }

}

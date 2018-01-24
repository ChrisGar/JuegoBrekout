
package Controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Participante;

public class GestionDato {
   
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JuegoBreakOutPU");

    public GestionDato() {
    }
    
    public boolean insertar(Participante p)
    {
        boolean retorno=false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        retorno=true;
        return retorno;
    }
    
    public List<Participante> leer()
    {
        List<Participante> retorno=null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno=em.createQuery("SELECT p FROM Participante p ORDER BY p.id").getResultList();
        em.getTransaction().commit();
        return retorno;
    
    }
}

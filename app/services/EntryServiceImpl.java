
package services;

import models.Entry;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


/**
 * Created by rchang on 3/22/17.
 */

@Service
public class EntryServiceImpl implements EntryService {
    

    @PersistenceContext private EntityManager em;

    @Override
    public List<Entry> getAllEntries() {
        CriteriaQuery<Entry> c = em.getCriteriaBuilder().createQuery(Entry.class);
        c.from(Entry.class);
        return em.createQuery(c).getResultList();
    }

    @Override
    @Transactional
    public Integer addEntry(Entry entry) {
        if (entry == null) {
            return -1;
        }
        em.persist(entry);

        return 0;
    }



}

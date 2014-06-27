package com.eventos.BD;

import com.eventos.ED.EventosED;
import com.eventos.RN.EventosRN;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EventosBD {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("EventosPU");

    public void salva(EventosED eventosED) {
        EventosRN eventoRN = new EventosRN();

        try {
            EntityManager em = null;
            try {
                em = emf.createEntityManager();
                em.getTransaction().begin();

                if (eventosED.getIdEvento() == null) {
                    em.persist(eventosED);
                } else {
                    em.merge(eventosED);
                }

                em.getTransaction().commit();
            } finally {
                if (em != null) {
                    em.close();
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao salvar: " + e);
        }
    }

    public List<EventosED> lista() {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            TypedQuery<EventosED> q = em.createQuery("select object(o) from EventoED as o", EventosED.class);
            return q.getResultList();
        } catch (Exception e) {
            System.out.println("Erro ao listar os dados: " + e);
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public EventosED obtemEvento(String id) {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            return em.find(EventosED.class, new Long(id));
        } catch (Exception e) {
            System.out.println("Erro ao buscar um evento: " + e);
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void delete(Long id) throws Exception {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            EventosED eventosED;

            try {
                eventosED = em.getReference(EventosED.class, id);
                eventosED.getIdEvento();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("Objeto de id " + id + " não encontrado.", enfe);
            }
            em.remove(eventosED);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao deletar: " + e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}

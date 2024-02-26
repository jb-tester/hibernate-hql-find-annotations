package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HibernateTest1 {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
            EntityManager em = session.getEntityManagerFactory().createEntityManager();

            System.out.println("================== @HQL count Query: ");
            System.out.println(SampleQueries_.countSamplesBySample("mysample", session));

            System.out.println("================== @HQL Query with no 'from': ");
            SampleQueries_.findSamplesByColor("cyan", session).forEach(System.out::println);

            System.out.println("================== @HQL Query with no 'from' as var: ");
            SampleQueries_.findSamplesByColorOrSample("blue", "new_sample", session).forEach(System.out::println);

            System.out.println("================== simple inlined query with no 'from' as session.createQuery() parameter: ");
            Query q1 = session.createQuery("where firstNum < 20", Datesnumbers.class);
            q1.getResultList().forEach(System.out::println);

            System.out.println("================== simple query with no 'from' passed as variable to as session.createQuery() parameter: ");
            String qstr2 = " where color = :color";
            Query q2 = session.createQuery(qstr2, Sample.class).setParameter("color", "red");
            q2.getResultList().forEach(System.out::println);

            System.out.println("================== simple query with no 'from' as em.createQuery() parameter: ");
            TypedQuery<Datesnumbers> q3 = em.createQuery("where firstNum > 20", Datesnumbers.class);
            q3.getResultList().forEach(System.out::println);

        } finally {
            session.close();
        }
    }


}

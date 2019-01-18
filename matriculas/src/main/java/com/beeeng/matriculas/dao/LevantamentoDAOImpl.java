package com.beeeng.dao;



public class LevantamentoDAOImpl implements LevantamentoDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;

    }

    @Override
    public void save(Levantamento l){
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(l);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Levantamento>List(){
        Session session = this.sessionFactory.openSession();
        List<Levantamento> levantamentoList = session.createQuery("from Levantamento").List();
        session.close();
        return levantamentoList;
    }

}

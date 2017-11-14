package persistence;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Filme;

public class FilmeDao {
	    Session       session;
    	 Transaction transaction;
	     Query           query;
	     Criteria         criteria;
	     
	     
	     public void create(Filme f) throws Exception{
	    	 session = HibernateUtil.getSessionFactory().openSession();
	    	   transaction = session.beginTransaction();
	    	        session.save(f);     //gravar
	    	    transaction.commit();
	    	 session.close();
	     }
	     
	     public void update(Filme f) throws Exception{
	    	 session = HibernateUtil.getSessionFactory().openSession();
	    	   transaction = session.beginTransaction();
	    	        session.update(f);    //alterar
	    	    transaction.commit();
	    	 session.close();
	     }
	     
	     public void delete(Filme f) throws Exception{
	    	 session = HibernateUtil.getSessionFactory().openSession();
	    	   transaction = session.beginTransaction();
	    	        session.delete(f);    //excluir
	    	    transaction.commit();
	    	 session.close();
	     }
	     
	     public List<Filme> findAll(){
	    	 session = HibernateUtil.getSessionFactory().openSession();
	    	   List<Filme> lista = session.createQuery("from Filme").list();
	    	 session.close();
	    	 return lista;
	     }
	     
	     public Filme findByCode(Integer cod){
	    	 session = HibernateUtil.getSessionFactory().openSession();
	    	  Filme filme =(Filme) session.get(Filme.class,cod);
	    	 session.close();
	    	 return filme;
	     }
	     
	     
	

}

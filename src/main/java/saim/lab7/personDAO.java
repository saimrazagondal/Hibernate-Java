package saim.lab7;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class personDAO {

    public Session currSession = null;

    public personDAO(){
        SessionCreator.createSessionFactory();
        currSession= SessionCreator.getSessionFactory().openSession();
    }

    public void finalize(){
        currSession.close();
    }


    /*
     * Method that saves record into database
     * takes a person object as argument
     */
    public void register(person per){
        currSession.beginTransaction();
        currSession.save(per);
        currSession.getTransaction().commit();
        System.out.println("Record successfully added to the database!\n\n");
        finalize();
    }


    /*
     * Method that updates record into database
     */
    public void update(person per){
        currSession.beginTransaction();
        currSession.saveOrUpdate(per);
        currSession.getTransaction().commit();
        System.out.println("Record successfully updated!\n\n");
        finalize();
    }


    /*
     * Method that retrieves record from database
     */
    public person retrieve(int id){
        person per;
        currSession.beginTransaction();
        per = currSession.get(person.class, id);
        currSession.getTransaction().commit();
        finalize();

        if(per == null){
            System.out.println("No record found!\n");
            return null;
        } else{
            return per;
        }
    }


    /*
     * Method that deletes record from database
     */
    public void delete(int id){
        person per;
        currSession.beginTransaction();
        per = currSession.get(person.class, id);
        if(per == null){
            System.out.println("No record found!\n");
        } else{
            String hql="delete from person where id="+id;
            Query query=currSession.createQuery(hql);
            query.executeUpdate();
            System.out.println("Record successfully deleted!\n\n");
        }
        currSession.getTransaction().commit();
        finalize();
    }




}

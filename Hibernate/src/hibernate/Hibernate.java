/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;
import models.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author ghosh
 */
public class Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setFirstName("Soumyadeep");
        s1.setLastName("Ghosh");
        s1.setSemester(6);
        SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionfactory.openSession();
        session.beginTransaction();
        session.save(s1);
        session.getTransaction().commit();
        session.close();
        sessionfactory.close();
    }
    
}

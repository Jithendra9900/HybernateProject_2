package org.jsp.HibernateProject_2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.HibernateProject_2.entity.Bankinfo;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("HibernateProject_2");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction =manager.getTransaction();
        transaction.begin();
        Bankinfo bank = new Bankinfo();
        bank.setAcctNo(103);
        bank.setBalance(30000);
        bank.setBankName("SBI");
        bank.setHolderName("sai");
        bank.setIfsc("SBIBANK35");
        manager.persist(bank);
        System.out.println("insert the data...!!");
        transaction.commit();
    }
}

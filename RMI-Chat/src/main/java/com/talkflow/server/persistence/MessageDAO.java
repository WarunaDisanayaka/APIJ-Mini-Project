package com.talkflow.server.persistence;
import com.talkflow.common.Message;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MessageDAO {
    public void saveMessage(Message message) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(message);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

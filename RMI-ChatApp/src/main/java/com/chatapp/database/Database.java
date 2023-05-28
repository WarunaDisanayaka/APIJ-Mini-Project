package com.chatapp.database;

import entity.UserEntity;
import jakarta.persistence.*;
import org.hibernate.Session;

import java.sql.Connection;

public class Database {

    public void logout(String username){

    }

    public EntityManagerFactory emf;
    public EntityManager em;
    public EntityTransaction et;
    public Session se;

    public Database() {
        emf = Persistence.createEntityManagerFactory("default");
        em = emf.createEntityManager();
        et = em.getTransaction();
        se = em.unwrap(Session.class);
    }

    public void insert(UserEntity userEntity){
        try {
            et.begin();
            em.persist(userEntity);
            et.commit();
        }finally {
            if (et.isActive()){
                et.rollback();
            }

        }
    }

    public UserEntity getUserByUsernameAndPassword(String username, String password) {
        try {
            et.begin();

            String queryString = "SELECT u FROM UserEntity u WHERE u.username = :username AND u.password = :password";
            TypedQuery<UserEntity> query = em.createQuery(queryString, UserEntity.class);
            query.setParameter("username", username);
            query.setParameter("password", password);
            UserEntity user = query.getSingleResult();

            et.commit();
            return user;
        } catch (NoResultException e) {
            return null; // User not found
        } finally {
            if (et.isActive()) {
                et.rollback();
            }
        }
    }

}

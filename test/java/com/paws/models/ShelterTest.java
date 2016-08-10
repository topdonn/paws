package com.paws.models;

import com.paws.util.Mysql;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 8/10/16.
 */
public class ShelterTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateNewShelterndSave() throws Exception {
        Session session = Mysql.getSession();
        session.beginTransaction();
        Shelter s = new Shelter("Biglots");
        session.save(s);
        session.getTransaction().commit();
        session.close();


    }

    @Test
    public void setName() throws Exception {

    }

}
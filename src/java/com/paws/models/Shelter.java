package com.paws.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by localadmin on 8/10/16.
 */
@Entity
@Table(name = "shelters")
@Access(AccessType.PROPERTY)
public class Shelter {

    private int id;
    private String name;
    private Date open;

    public Shelter(String name) {
        this.name = name;
        this.open = new Date();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Basic
    @Column(name = "open", nullable = false)
    public Date getOpen() { return open; }
    public void setOpen(Date open) { this.open = open; }
}

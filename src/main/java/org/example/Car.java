package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {
    @Id
    private int id;
    private String name;
    @ManyToOne
    private Cricketer cricketer;

    public Cricketer getCricketer() {
        return cricketer;
    }

    public void setCricketer(Cricketer cricketer) {
        this.cricketer = cricketer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

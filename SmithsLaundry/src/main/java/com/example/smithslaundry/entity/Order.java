package com.example.smithslaundry.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")

public class Order {
    @Id
    private Number tShirt;
    private Number shirt;
    private Number socks;
    private Number sweater;
    private Number jackets;
    private Number trouser;
    private Number carpets;
    private Number shoes;

    //getters
    public Number getTShirt() {return tShirt;}

    public Number getShirt() {return shirt;}

    public Number getSocks() {return socks;}

    public Number getJackets() {return jackets;}

    public Number getSweater() {return sweater;}

    public Number getTrouser() {return trouser;}

    public Number getCarpets() {return carpets;}

    public Number getShoes() {return shoes;}

    //Setters

    public void setTShirt(Number tShirt) {
        this.tShirt = tShirt;
    }

    public void setShirt(Number shirt) {
        this.shirt = shirt;
    }

    public void setSocks(Number socks) {
        this.socks = socks;
    }

    public void setJackets(Number jackets) {this.jackets = jackets;}

    public void setSweater(Number sweater) {
        this.sweater = sweater;
    }

    public void setTrouser(Number trouser) {
        this.trouser = trouser;
    }

    public void setCarpets(Number carpets) {this.carpets = carpets;}

    public void setShoes(Number shoes) {
        this.shoes = shoes;
    }

}
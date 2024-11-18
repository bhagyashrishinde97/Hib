package org.example;

import jakarta.persistence.*;

import java.util.Date;


/*package org.example;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    @Column(length = 50)
    private String street;

    @Column(length = 100)
    private String city;

    private boolean isOpen;

    @Transient
    private double x;

    @Temporal(TemporalType.DATE)
    private Date addedDate;

    @Lob
    private byte[] image;

    // Getters and setters
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }
}*/


    @Entity
    public class Address {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int addressId;

        @Column(length = 50)
        private String street;

        @Column(length = 100)
        private String city;

        private boolean isOpen;

        @Transient
        private double x;

        @Temporal(TemporalType.DATE)
        private Date addedDate;

        @Lob
        private byte[] image;

        // Getters and setters
        public int getAddressId() { return addressId; }
        public void setAddressId(int addressId) { this.addressId = addressId; }

        public String getStreet() { return street; }
        public void setStreet(String street) { this.street = street; }

        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }

        public boolean isOpen() { return isOpen; }
        public void setOpen(boolean open) { isOpen = open; }

        public double getX() { return x; }
        public void setX(double x) { this.x = x; }

        public byte[] getImage() { return image; }
        public void setImage(byte[] image) { this.image = image; }

        public Date getAddedDate() { return addedDate; }
        public void setAddedDate(Date addedDate) { this.addedDate = addedDate; }
    }


package com.example.demospringtientrinh.model;

import jakarta.persistence.*;



@Entity
@Table(name = "tbl_luutru")
public class LuTru {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "time", length = 50)
    private String date;


    @Column(name = "von")
    private double von;

    @Column(name = "ampe")
    private double ampe;

    @Column(name = "congsuat")
    private double congSuat;

    public LuTru() {
    }

    public LuTru(Integer id ,String date, double von, double ampe, double congSuat) {
        this.id = id;
        this.date = date;
        this.von = von;
        this.ampe = ampe;
        this.congSuat = congSuat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getVon() {
        return von;
    }

    public void setVon(double von) {
        this.von = von;
    }

    public double getAmpe() {
        return ampe;
    }

    public void setAmpe(double ampe) {
        this.ampe = ampe;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
}

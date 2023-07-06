package com.example.demospringtientrinh.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tbl_giatri")
public class ThongSo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "time")
    private Date date;

    @Column(name = "von")
    private double von;

    @Column(name = "ampe")
    private double ampe;

    @Column(name = "id_device")
    private Integer idDevice;

    public ThongSo() {

    }

    public ThongSo(Integer id, Date date, double von, double ampe, Integer idDevice) {
        this.id = id;
        this.date = date;
        this.von = von;
        this.ampe = ampe;
        this.idDevice = idDevice;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
}

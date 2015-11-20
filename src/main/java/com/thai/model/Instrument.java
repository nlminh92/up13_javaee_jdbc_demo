package com.thai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_instrument")
public class Instrument {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="instrument_name", length=64)
    private String name;

    @Column(name="instrument_type", length=32)
    private InstrumentType instrumentType;

    @OneToOne(mappedBy="instrument")
    private Musician musican;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public Musician getMusician() {
        return musican;
    }

    public void setMusician(Musician musican) {
        this.musican = musican;
    }

    @Override
    public String toString() {
        return name + ", id = " + id + ", instrumentType = " + instrumentType;
    }

}

package com.thai.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Musican")
public class Musican {

    @Column(name="pkid")
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name="musican_name", length=64)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name="date_of_birth", length=64)
    private Date dateOfBirth;

    @Enumerated(EnumType.STRING)
    @Column(name="music_type", length=16)
    private MusicType musicType;


    public long getId() {
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public MusicType getMusicType() {
        return musicType;
    }

    public void setMusicType(MusicType musicType) {
        this.musicType = musicType;
    }

    @Override
    public String toString() {
        return name + ", id = " + id + ", dateOfBirth = " + dateOfBirth + ", musicType = " + musicType;
    }
}

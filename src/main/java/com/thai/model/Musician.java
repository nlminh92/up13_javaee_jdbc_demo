package com.thai.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.JoinFetch;
import org.eclipse.persistence.annotations.JoinFetchType;

@Entity
@Table(name="t_musican")
public class Musician {

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

    //    @JoinColumn(name="instrument") // without me, the column name will be instrument_id, automatically generated
    @OneToOne(
            cascade=CascadeType.PERSIST,
            fetch=FetchType.EAGER)
    @JoinFetch(JoinFetchType.OUTER)
    private Instrument instrument;

    @OneToMany(
            cascade=CascadeType.PERSIST,
            fetch=FetchType.EAGER)
    //    @JoinFetch(JoinFetchType.OUTER)
    private List<Song> songList = new ArrayList<Song>();

    @Embedded
    private Address address;

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

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSong(Song song) {
        this.songList.add(song);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + ", id = " + id + ", dateOfBirth = " + dateOfBirth + ", musicType = " + musicType;
    }
}

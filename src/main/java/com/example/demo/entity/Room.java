package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {
    //  ROOM_ID BIGSERIAL PRIMARY KEY,
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //w Oracle jest sequence
    @Column(name = "ROOM_ID")
    private long id;

    //  NAME VARCHAR(16) NOT NULL,
    @Column(name = "NAME")
    private String name;
    //  ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
    @Column(name = "ROOM_NUMBER")
    private String roomNumber;
    //  BED_INFO CHAR(2) NOT NULL
    @Column(name = "BED_INFO")
    private String bedinfo;

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

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedinfo() {
        return bedinfo;
    }

    public void setBedinfo(String bedinfo) {
        this.bedinfo = bedinfo;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", bedinfo='" + bedinfo + '\'' +
                '}';
    }
}

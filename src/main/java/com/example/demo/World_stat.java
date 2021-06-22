package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class World_stat{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "World_title", nullable = false, unique = true, length = 45)
    private String World_title;

    @Column(name = "min1", nullable = false, length = 64)
    private String Minion1;

    @Column(name = "min2", nullable = false, length = 20)
    private String Minion2;

    @Column(name = "Boss", nullable = false, length = 20)
    private String Boss;

    @Column(name = "Town", nullable = false, length = 20)
    private String Town;

    @Column(name = "Enemy_type", nullable = false, length = 20)
    private String Enemy_Type;

    @Column(name = "Time", nullable = false, length = 20)
    private String Time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorld_title() {
        return World_title;
    }

    public void setWorld_title(String world_title) {
        World_title = world_title;
    }

    public String getMinion1() {
        return Minion1;
    }

    public void setMinion1(String minion1) {
        Minion1 = minion1;
    }

    public String getMinion2() {
        return Minion2;
    }

    public void setMinion2(String minion2) {
        Minion2 = minion2;
    }

    public String getBoss() {
        return Boss;
    }

    public void setBoss(String boss) {
        Boss = boss;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    public String getEnemy_Type() {
        return Enemy_Type;
    }

    public void setEnemy_Type(String enemy_Type) {
        Enemy_Type = enemy_Type;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
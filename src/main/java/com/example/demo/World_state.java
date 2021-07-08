package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "Worlds")
public class World_state {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "World_title", nullable = false, unique = true)
    private String World_title;

    @Column(name = "min1Name", nullable = false)
    private String Minion1Name;

    @Column(name = "min2Name", nullable = false)
    private String Minion2Name;

    @Column(name = "min1Health", nullable = false)
    private int Minion1health;

    @Column(name = "min2Health", nullable = false)
    private int Minion2health;

    @Column(name = "min1Weapon", nullable = false)
    private String Minion1weapon;

    @Column(name = "min2Weapon", nullable = false)
    private String Minion2weapon;

    @Column(name = "min1Damage", nullable = false)
    private int Minion1wd;

    @Column(name = "min2Damage", nullable = false)
    private int Minion2wd;

    @Column(name = "bossName", nullable = false)
    private String BossName;

    @Column(name = "bossHealth", nullable = false)
    private int Bosshealth;

    @Column(name = "BossWeapon", nullable = false)
    private String Bossweapon;

    @Column(name = "bossDamage", nullable = false)
    private int Bosswd;

    @Column(name = "Town", nullable = false)
    private String Town;

    @Column(name = "Enemy_type", nullable = false)
    private String Enemy_Type;

    @Column(name = "Time", nullable = false)
    private int Time;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWorld_title() {
        return World_title;
    }

    public void setWorld_title(String world_title) {
        World_title = world_title;
    }

    public String getMinion1Name() {
        return Minion1Name;
    }

    public void setMinion1Name(String minion1Name) {
        Minion1Name = minion1Name;
    }

    public String getMinion2Name() {
        return Minion2Name;
    }

    public void setMinion2Name(String minion2Name) {
        Minion2Name = minion2Name;
    }

    public int getMinion1health() {
        return Minion1health;
    }

    public void setMinion1health(int minion1health) {
        Minion1health = minion1health;
    }

    public int getMinion2health() {
        return Minion2health;
    }

    public void setMinion2health(int minion2health) {
        Minion2health = minion2health;
    }

    public String getMinion1weapon() {
        return Minion1weapon;
    }

    public void setMinion1weapon(String minion1weapon) {
        Minion1weapon = minion1weapon;
    }

    public String getMinion2weapon() {
        return Minion2weapon;
    }

    public void setMinion2weapon(String minion2weapon) {
        Minion2weapon = minion2weapon;
    }

    public int getMinion1wd() {
        return Minion1wd;
    }

    public void setMinion1wd(int minion1wd) {
        Minion1wd = minion1wd;
    }

    public int getMinion2wd() {
        return Minion2wd;
    }

    public void setMinion2wd(int minion2wd) {
        Minion2wd = minion2wd;
    }

    public String getBossName() {
        return BossName;
    }

    public void setBossName(String bossName) {
        BossName = bossName;
    }

    public int getBosshealth() {
        return Bosshealth;
    }

    public void setBosshealth(int bosshealth) {
        Bosshealth = bosshealth;
    }

    public String getBossweapon() {
        return Bossweapon;
    }

    public void setBossweapon(String bossweapon) {
        Bossweapon = bossweapon;
    }

    public int getBosswd() {
        return Bosswd;
    }

    public void setBosswd(int bosswd) {
        Bosswd = bosswd;
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

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }
}
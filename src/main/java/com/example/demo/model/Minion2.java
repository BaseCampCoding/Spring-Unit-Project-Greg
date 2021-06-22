package com.example.demo.model;

import java.util.UUID;

public class Minion2 {
    private UUID id;
    private String Name;
    private int Health;
    private String Weapon;
    private int Weapon_damage;

    public Minion2() {
    }

    public Minion2(UUID id,String name, int health, String weapon, int weapon_damage) {
        Name = name;
        Health = health;
        Weapon = weapon;
        Weapon_damage = weapon_damage;
    }

    public Minion2(String name, int health, String weapon, int weapon_damage) {
        Name = name;
        Health = health;
        Weapon = weapon;
        Weapon_damage = weapon_damage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public int getWeapon_damage() {
        return Weapon_damage;
    }

    public void setWeapon_damage(int weapon_damage) {
        Weapon_damage = weapon_damage;
    }

    @Override
    public String toString() {
        return "Minion2{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Health=" + Health +
                ", Weapon='" + Weapon + '\'' +
                ", Weapon_damage=" + Weapon_damage +
                '}';
    }
}

package com.example.demo.model;

import java.util.UUID;

public class Worlds {
    private UUID id;
    private String Username;
    private String title;
    private String town;
    private String what_kind;
    private int lives;

    public Worlds() {
    }

    public Worlds(
            UUID id,
            String username,
            String title,
            String town,
            String what_kind,
            int lives) {
                this.Username = username;
                this.title = title;
                this.town = town;
                this.what_kind = what_kind;
                this.lives = lives;
        }

    public Worlds(String username,
                  String title,
                  String town,
                  String what_kind,
                  int lives) {
        Username = username;
        this.title = title;
        this.town = town;
        this.what_kind = what_kind;
        this.lives = lives;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getWhat_kind() {
        return what_kind;
    }

    public void setWhat_kind(String what_kind) {
        this.what_kind = what_kind;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public String toString() {
        return "Worlds{" +
                "id=" + id +
                ", Username='" + Username + '\'' +
                ", title='" + title + '\'' +
                ", town='" + town + '\'' +
                ", what_kind='" + what_kind + '\'' +
                ", lives=" + lives +
                '}';
    }
}

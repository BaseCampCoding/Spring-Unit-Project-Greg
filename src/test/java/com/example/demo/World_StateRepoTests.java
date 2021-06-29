package com.example.demo;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class World_StateRepoTests {

     @Autowired
     private TestEntityManager entityManager;

    @Autowired
    private World_StateRepo repository;

    @Test
    public void testCreateWorld() {
        World_state world = new World_state();
        world.setWorldid(0);
        world.setEmail("Default@gmail.com");
        world.setWorld_title("default");
        world.setMinion1Name("DefaultM1");
        world.setMinion1health(100);
        world.setMinion1weapon("Sword");
        world.setMinion1wd(10);
        world.setMinion2Name("DefaultM1");
        world.setMinion2health(100);
        world.setMinion2weapon("Sword");
        world.setMinion2wd(10);
        world.setBossName("DefaultBoss");
        world.setBosshealth(1000);
        world.setBossweapon("Vindicator's Cleaver");
        world.setBosswd(100);
        world.setTown("Default");
        world.setEnemy_Type("DefaultM1 DefaultM2 DefaultBoss");
        world.setTime(60);

        World_state savedWorld = repository.save(world);

        World_state existWorld = entityManager.find(World_state.class, savedWorld.getId());

        assertThat(world.getEmail()).isEqualTo(existWorld.getEmail());

    }
}

package at.htl.hobby.entity;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.MethodName.class)
class PersonAndHobbyTest {

    @Test
    void t100_createHobby() {
        Hobby jogging = new Hobby("Jogging");

        assertThat(jogging.getDescr()).isEqualTo("Jogging");
    }

    @Test
    void t110_setHobbySimple() {
        Hobby jogging = new Hobby("Jogging");
        Person susi = new Person("Susi");
        susi.setHobby(jogging);

        assertThat(jogging.getPersons()).hasSize(1);
        assertThat(jogging.getPersons()).contains(susi);
        assertThat(susi.getHobby()).isEqualTo(jogging);
    }

    @Test
    void t115_setHobbyMultiplePersons() {
        Hobby jogging = new Hobby("Jogging");
        Person susi = new Person("Susi");
        susi.setHobby(jogging);

        Person hansi = new Person("Hansi");
        hansi.setHobby(jogging);

        assertThat(jogging.getPersons()).hasSize(2);
        assertThat(jogging.getPersons()).containsExactly(susi,hansi);
        assertThat(susi.getHobby()).isEqualTo(jogging);
    }

    @Test
    void t120_setHobbyToNull() {
        Hobby jogging = new Hobby("Jogging");
        Person susi = new Person("Susi");
        susi.setHobby(jogging);

        assertThat(jogging.getPersons()).hasSize(1);
        assertThat(jogging.getPersons()).contains(susi);
        assertThat(susi.getHobby()).isEqualTo(jogging);


        susi.setHobby(null);
        assertThat(susi.getHobby()).isNull();
        assertThat(jogging.getPersons()).hasSize(0);
    }

    @Test
    void t130_setHobbytoNewAnotherHobby() {
        Hobby jogging = new Hobby("Jogging");
        Person susi = new Person("Susi");
        susi.setHobby(jogging);

        assertThat(jogging.getPersons()).hasSize(1);
        assertThat(jogging.getPersons()).contains(susi);
        assertThat(susi.getHobby()).isEqualTo(jogging);

        Hobby lesen = new Hobby("Lesen");
        susi.setHobby(lesen);
        assertThat(susi.getHobby()).isEqualTo(lesen);
        assertThat(lesen.getPersons()).hasSize(1);
    }




}

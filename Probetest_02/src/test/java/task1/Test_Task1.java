package task1;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DirektorTest {
    /*
    private static Direktor director;
    private static Kundenberater customerAdvisorOne;

    @Order(1)
    @DisplayName("Correct constructor")
    @Test
    void constructorTest() {
        director = new Direktor("Dietmar");
        assertEquals("Dietmar", director.getName());
    }

    @Order(2)
    @DisplayName("Getter (name)")
    @Test
    void getNameTest() {
        director.setName("Dietmar");
        assertEquals("Dietmar", director.getName());
    }

    @Order(3)
    @DisplayName("Setter (name)")
    @Test
    void setNameTest() {
        director.setName("Maxl");
        assertEquals("Maxl", director.getName());
    }

    @Order(4)
    @DisplayName("Add customer advisor")
    @Test
    void addCustomerAdvisor() {
        customerAdvisorOne = new Kundenberater("Hansl", 3_500, null);
        director.kundenberaterHinzufuegen(customerAdvisorOne);
        assertTrue(director.getKundenberaterliste().contains(customerAdvisorOne));
    }

    @Order(5)
    @DisplayName("Remove customer advisor")
    @Test
    void removeCustomerAdvisor() {
        director.kundenberaterLoeschen(customerAdvisorOne);
        System.out.println(director.getKundenberaterliste());
        assertFalse(director.getKundenberaterliste().contains(customerAdvisorOne));
    }

    @Order(6)
    @DisplayName("Total annual turnover (insg. Jahresumsatz)")
    @Test
    void sumCheck() {
        final double sum = 8_000;

        Kundenberater franzl = new Kundenberater("Franzl", 3_000, null);
        Kundenberater berta = new Kundenberater("Berta", 3_500, null);
        Kundenberater elke = new Kundenberater("Elke", 1_500, null);

        director.kundenberaterHinzufuegen(franzl);
        director.kundenberaterHinzufuegen(berta);
        director.kundenberaterHinzufuegen(elke);

        assertEquals(sum, director.jahresumsatzAllerBeraterAusrechnen());
    }
     */
}

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class KundeTest {
    /*
    private static Kunde hans = new Kunde("Hans", "Maier", 100_000, null);
    private static Kundenberater franz = new Kundenberater("Franz", 5_000, new ArrayList<>());
    @Order(1)
    @DisplayName("Correct constructor")
    @Test
    void constructorTest() {
        assertEquals("Hans", hans.getVorname());
        assertEquals("Maier", hans.getNachname());
        assertEquals(100_000, hans.getKontostand());
        assertNull(hans.getKundenberater());
        System.out.println("Getter- and Setter-Methods are also running.");
    }

    @Order(2)
    @DisplayName("Set customer advisor")
    @Test
    void setKundenberaterTest() {
        hans.setKundenberater(franz);

        assertEquals(franz, hans.getKundenberater());
        assertTrue(franz.getKundenliste().contains(hans));
    }
     */
}

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class KundenberaterTest {
    /*
    private static Kundenberater customerAdvisorTwo;
    private static Kunde hans = new Kunde("Hans", "Maier", 100_000, null);
    private static Kunde ludwig = new Kunde("Ludwig", "Moser", 200_000, null);
    private static Kunde niklas = new Kunde("Niklas", "Kek", 130_000, null);

    @Order(1)
    @DisplayName("Correct constructor")
    @Test
    void constructorTest() {
        customerAdvisorTwo = new Kundenberater("Dietmar", 4_000, new ArrayList<>());
        assertEquals("Dietmar", customerAdvisorTwo.getName());
        assertEquals(4_000, customerAdvisorTwo.getJahresumsatz());
        assertTrue(customerAdvisorTwo.getKundenliste().isEmpty());
    }

    @Order(2)
    @DisplayName("Getter (name)")
    @Test
    void getNameTest() {
        customerAdvisorTwo.setName("Dietmar");
        assertEquals("Dietmar", customerAdvisorTwo.getName());
    }

    @Order(3)
    @DisplayName("Setter (name)")
    @Test
    void setNameTest() {
        customerAdvisorTwo.setName("Maxl");
        assertEquals("Maxl", customerAdvisorTwo.getName());
    }

    @Order(4)
    @DisplayName("Add customer")
    @Test
    void addCustomerTest() {
        customerAdvisorTwo.addKunde(hans);
        customerAdvisorTwo.addKunde(ludwig);
        customerAdvisorTwo.addKunde(niklas);

        //Adding customer for a second time
        customerAdvisorTwo.addKunde(hans);

        //Check if the object has been added to the list
        assertEquals(hans, customerAdvisorTwo.getKundenliste().getFirst());
        assertEquals(ludwig, customerAdvisorTwo.getKundenliste().get(1));
        assertEquals(niklas, customerAdvisorTwo.getKundenliste().get(2));

        //Check if an object can be in the list multiple times
        assertEquals(1, Collections.frequency(customerAdvisorTwo.getKundenliste(), hans));

        //Check if the association has been implemented correctly
        assertEquals(customerAdvisorTwo, hans.getKundenberater());
        assertEquals(customerAdvisorTwo, niklas.getKundenberater());
        assertEquals(customerAdvisorTwo, ludwig.getKundenberater());
    }

    @Order(5)
    @DisplayName("Remove customer")
    @Test
    void removeCustomerTest() {
        customerAdvisorTwo.removeKunde(hans);
        customerAdvisorTwo.removeKunde(ludwig);

        //Check if the object has been removed from the list
        assertEquals(1, customerAdvisorTwo.getKundenliste().size());
        assertEquals(niklas, customerAdvisorTwo.getKundenliste().getFirst());

        //Check if the association has been implemented correctly
        assertNull(hans.getKundenberater());
        assertNull(ludwig.getKundenberater());
    }
     */
}
package hei.prog4.calculus_ratiocinator.Affirmation;

import static org.junit.jupiter.api.Assertions.*;

import hei.prog4.calculus_ratiocinator.Logics.Logic;
import org.junit.jupiter.api.Test;

public class DoncTest {
    @Test
    public void test_Lou_est_beau_donc_Lou_est_pauvre() {
        Affirmation verite = new Vérité("Lou est beau");
        Affirmation mensonge = new Mensonge("Lou est pauvre");
        Affirmation affirmation = new AffirmationGenerale(verite, mensonge, Logic.DONC);
        assertFalse(affirmation.estVrai());
    }

    @Test
    public void test_Lou_est_pauvre_donc_Lou_est_beau() {
        Affirmation mensonge = new Mensonge("Lou est pauvre");
        Affirmation verite = new Vérité("Lou est beau");
        Affirmation affirmation = new AffirmationGenerale(mensonge, verite, Logic.DONC);
        assertTrue(affirmation.estVrai());
    }

    @Test
    public void test_Lou_est_beau_donc_Lou_est_beau() {
        Affirmation verite1 = new Vérité("Lou est beau");
        Affirmation verite2 = new Vérité("Lou est beau");
        Affirmation affirmation = new AffirmationGenerale(verite1, verite2, Logic.DONC);
        assertTrue(affirmation.estVrai());
    }

    @Test
    public void test_Lou_est_pauvre_donc_Lou_est_pauvre() {
        Affirmation mensonge1 = new Mensonge("Lou est pauvre");
        Affirmation mensonge2 = new Mensonge("Lou est pauvre");
        Affirmation affirmation = new AffirmationGenerale(mensonge1, mensonge2, Logic.DONC);
        assertTrue(affirmation.estVrai());
    }
}

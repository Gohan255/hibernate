package homework.burdel.services;

import homework.burdel.model.Whore;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WhoreServiceTest {

    private WhoreService whoreService;
    private Whore w1;
    private Whore w2;
    private Whore w3;

    @Before
    public void init() {
        whoreService = new WhoreService();

        w1 = new Whore("A", "A", "A", 20, true);
        w2 = new Whore("B", "B", "B", 12, true);
        w3 = new Whore("C", "C", "C", 15, false);
    }

    @Test
    public void findWhoresAged() {
        List<Whore> result = List.of(w1, w2, w3);
        assertEquals(List.of(w2), whoreService.findWhoresAged(result));
    }
}
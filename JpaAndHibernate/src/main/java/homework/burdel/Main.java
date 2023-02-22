package homework.burdel;

// @OneToMany, @ManyToMany zrobic jakis przyklad zastaosowan, wygenerowac bd

         /* Wykorzstyujac poznane technologie stwórz serwis do zarządzania domem publicznym.
           Mamy tabele prostytuka która ma id, imie, nazwisko, preferencje, wiek oraz to czy dziwka ma hiv.

           Kolejna tabela bedzie burdel id, nazwa, pseudonim burdel mamy.

           Stwórz model dziwki i burdelu.
           Stwórz dao do zapisu i odczytu dziwek i burdelu.
           Zapisz kilka dziwek i burdelow do bazy danych
           Odczytaj dziwki, znajdz dziwki które maja hiv ale sa niepelnoletnie
        */

import homework.burdel.dao.BrothelDao;
import homework.burdel.dao.BrothelDaoImpl;
import homework.burdel.dao.WhoreDao;
import homework.burdel.dao.WhoreDaoImpl;
import homework.burdel.model.Brothel;
import homework.burdel.model.Whore;
import homework.burdel.services.WhoreService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Brothel brothel = new Brothel("Kwiat Lotosu", "Sliska Grazyna");

        Whore w1 = new Whore("Ania", "Doruchania", "Klocek na klate", 20, true);
        Whore w2 = new Whore("Basia", "Doruchania", "Klocek na klate", 20, true);
        Whore w3 = new Whore("Grazynka", "Doruchania", "Klocek na klate", 20, true);
        Whore w4 = new Whore("Agatka", "Malolatka", "Klocek na klate", 16, true);


        BrothelDao brothelDao = new BrothelDaoImpl();
        WhoreDao whoreDao = new WhoreDaoImpl();



/*

        brothel.addWhore(w1);

        brothelDao.save(brothel);
        whoreDao.save(w1);
*/

        List<Long> idList = List.of(2L, 4L, 6L, 9L);
        List<Whore> whores = whoreDao.loadAll(idList);

        System.out.println(whoreDao.load(2L).getBrothel());

        WhoreService whoreService = new WhoreService();



        System.out.println("SAVED TO DATA BASE!");

        brothelDao.cleanUp();
        whoreDao.cleanUp();

    }

}

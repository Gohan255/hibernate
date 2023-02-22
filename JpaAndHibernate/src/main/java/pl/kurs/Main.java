/*
package pl.kurs;

import pl.kurs.dao.CarDao;
import pl.kurs.dao.CarDaoImpl;
import pl.kurs.model.Car;
import pl.kurs.model.Item;

public class Main {
    public static void main(String[] args) {
        */
/*

            ORM - object relational maping

            java app -> object -> orm -> baza danych

            JPA - java persistence api

            jpa layer - zbior interfejsow

            hibernate - implementacja tych interfejsow

            java app -> jpa layer -> jdbc -> bd

            POJO (plain old java object)

            encja (entity)

            entity manager

            entity manager factory

            stworz scheme cars i tabele  car id, producer, model, color, productionYear

            dao - data access object
         *//*


        Car car = new Car("Bmw", "m4", "blue", 2022);
        Item item = new Item("turbo", car);
        CarDao carDao = new CarDaoImpl();
        carDao.save(car);
        System.out.println("ZAPISANO DO BD!!!!");

        Car loadedCar = carDao.load(1L);
        System.out.println(loadedCar);

        carDao.cleanUp();

        // @OneToMany, @ManyToMany zrobic jakis przyklad zastaosowan, wygenerowac bd

         */
/* Wykorzstyujac poznane technologie stwórz serwis do zarządzania domem publicznym.
           Mamy tabele prostytuka która ma id, imie, nazwisko, preferencje, wiek oraz to czy dziwka ma hiv.

           Kolejna tabela bedzie burdel id, nazwa, pseudonim burdel mamy.

           Stwórz model dziwki i burdelu.
           Stwórz dao do zapisu i odczytu dziwek i burdelu.
           Zapisz kilka dziwek i burdelow do bazy danych
           Odczytaj dziwki, znajdz dziwki które maja hiv ale sa niepelnoletnie
        *//*

    }
}
*/

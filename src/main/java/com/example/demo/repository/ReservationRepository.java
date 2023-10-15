package com.example.demo.repository;

import com.example.demo.entity.Reservation;
import com.example.demo.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;


/**
 * @Component - najbardziej ogólny, może byc wykorzystywany dla beenów będących mapperami, konwerterami
 * @Repository - wszystko to gdzie składujemy dane
 * @Service - logika serwisowa, wykonywanie działań np: kup kawę
 * @Controller / @RestController - warstwa prezentująca dane / API aplikacji
 */
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);

    Iterable<Reservation> findReservationByRoomIdAndReservationDate(long id, Date date);
}

package com.example.demo.repository;

import com.example.demo.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @Component - najbardziej ogólny, może byc wykorzystywany dla beenów będących mapperami, konwerterami
 * @Repository - wszystko to gdzie składujemy dane
 * @Service - logika serwisowa, wykonywanie działań np: kup kawę
 * @Controller / @RestController - warstwa prezentująca dane / API aplikacji
 */
@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}

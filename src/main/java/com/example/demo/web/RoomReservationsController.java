package com.example.demo.web;

import com.example.demo.entity.RoomReservation;
import com.example.demo.service.ReservationService;
import com.example.demo.util.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class RoomReservationsController {
    private final DateUtil dateUtil;
    private final ReservationService reservationService;

    public RoomReservationsController(DateUtil dateUtil, ReservationService reservationService) {
        this.dateUtil = dateUtil;
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getReservations(@RequestParam(value = "date", required = false) String dateString, Model model) {
        Date date = this.dateUtil.createDateFromString(dateString);
        List< RoomReservation> roomReservations = this.reservationService.getRoomReservationsForDate(date);
        model.addAttribute("roomReservations", roomReservations);
        return "roomres";
    }
}

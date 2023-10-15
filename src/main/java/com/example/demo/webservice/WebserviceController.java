package com.example.demo.webservice;

import com.example.demo.entity.Guest;
import com.example.demo.entity.Room;
import com.example.demo.entity.RoomReservation;
import com.example.demo.service.ReservationService;
import com.example.demo.util.DateUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WebserviceController {
    private final ReservationService reservationService;
    private final DateUtil dateUtil;

    public WebserviceController(ReservationService reservationService, DateUtil dateUtil) {
        this.reservationService = reservationService;
        this.dateUtil = dateUtil;
    }

    @GetMapping("/guests")
    public List<Guest> getGuests(){
        return this.reservationService.getHotelGuests();
    }

    @PostMapping("/guests")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuests(@RequestBody Guest guest){
        this.reservationService.addGuest(guest);
    }

    @DeleteMapping("/guests/{guestId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGuest(@PathVariable Long guestId){
    this.reservationService.deleteGuest(guestId);
    }

    @GetMapping("/rooms")
    public List<Room> getRooms(){
        return this.reservationService.getRooms();
    }

    //Bo ten request jest ogolny a ten get jest szczegolowy
    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    //Request param do pobierania po dacie, paramtry podaje sie po znaku zapytania
    public List<RoomReservation> getReservations(@RequestParam(value = "date", required = true)String dateString){
        Date date = this.dateUtil.createDateFromString(dateString);
        return this.reservationService.getRoomReservationsForDate(date);
    }
}

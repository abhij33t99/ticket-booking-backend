package com.ticketbooking.theatreservice.repository;

import com.ticketbooking.theatreservice.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Modifying
    @Query(value = "CALL BOOK_TICKETS(:p_seats, :p_name, :p_showtime);", nativeQuery = true)
    void bookTickets(@Param("p_seats") String seats, @Param("p_name") String name, @Param("p_showtime") LocalDateTime showTime);
}

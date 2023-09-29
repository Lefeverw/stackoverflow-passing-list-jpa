package com.wouterlefever.stackoverflow.passing.list.jpa.repository;

import com.wouterlefever.stackoverflow.passing.list.jpa.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, String> {
    @Query(
            value = "select distinct ID_RIGHT from TDK_SEC_HOTEL_RIGHT h where h.ID_RIGHT in ?1",
            nativeQuery = true)
    List<String> findAllByHOTELs(List<String> HOTELs);
}

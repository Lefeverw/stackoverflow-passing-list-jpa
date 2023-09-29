package com.wouterlefever.stackoverflow.passing.list.jpa;

import com.wouterlefever.stackoverflow.passing.list.jpa.entity.Hotel;
import com.wouterlefever.stackoverflow.passing.list.jpa.repository.HotelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private final HotelRepository hotelRepository;

    public Application(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        hotelRepository.save(new Hotel("id1","Large Hotel"));
        hotelRepository.save(new Hotel("id2", "Medium Hotel"));
        hotelRepository.save(new Hotel("id3", "Small Hotel"));

        List<String> allByHOTELs = hotelRepository.findAllByHOTELs(List.of("id2", "id3"));
        System.out.println(allByHOTELs);
    }
}
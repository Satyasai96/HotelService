package com.info.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.info.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}

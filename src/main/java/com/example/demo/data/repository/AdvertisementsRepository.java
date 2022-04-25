package com.example.demo.data.repository;

import com.example.demo.data.entity.Advertisements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementsRepository extends JpaRepository<Advertisements, Long> {
}

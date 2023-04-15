package com.kafka.consumer.database.kafkaconsumerdatabase.repository;


import com.kafka.consumer.database.kafkaconsumerdatabase.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
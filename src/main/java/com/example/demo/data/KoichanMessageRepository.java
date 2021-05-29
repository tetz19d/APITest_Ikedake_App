package com.example.demo.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KoichanMessageRepository extends JpaRepository<KoichanMessage, Long> {
    public List<KoichanMessage> findAll();

    public Optional<KoichanMessage> findById(long id);
}
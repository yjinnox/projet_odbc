package com.afdtech.dao;

import com.afdtech.entities.Fiche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FicheRepository extends JpaRepository<Fiche, Long> {

}

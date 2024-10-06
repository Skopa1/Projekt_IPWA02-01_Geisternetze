package com.iu.teschner.geisternetze.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iu.teschner.geisternetze.model.Netz;

public interface NetzRepository extends JpaRepository<Netz, Long> {
}
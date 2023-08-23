package com.wcci.amazon.b4.virtualpet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VirtualPetRepository extends JpaRepository<VirtualPet, Long>

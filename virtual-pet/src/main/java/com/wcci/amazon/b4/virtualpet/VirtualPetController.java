package com.wcci.amazon.b4.virtualpet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController
    @RequestMapping("/api/pets")
    public class VirtualPetController {
      private final VirtualPetRepository virtualPetRepository;
      public VirtualPetController(VirtualPetRepository virtualPetRepository) {
        this.virtualPetRepository = virtualPetRepository;
      }
      @GetMapping("/{id}")
      public VirtualPet getPetById(@PathVariable Long id) {
        return virtualPetRepository.findById(id)
            .orElseThrow(() -> new PetNotFoundException(id));
    }
      @PostMapping
      public VirtualPet addPet(@RequestBody VirtualPet newPet) {
        return virtualPetRepository.save(newPet);
    }
      @DeleteMapping("/{id}")
      public void deletePet(@PathVariable Long id) {
        virtualPetRepository.deleteById(id);
    }
    }
------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------
5:51
package com.example.demo.virtualpet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface VirtualPetRepository extends JpaRepository<VirtualPet, Long>


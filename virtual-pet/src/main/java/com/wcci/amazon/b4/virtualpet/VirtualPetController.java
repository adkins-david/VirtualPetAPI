package com.wcci.amazon.b4.virtualpet;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping
public class VirtualPetController {
    @Autowired
    VirtualPetRepository virtualPetRepository;

    @GetMapping("/{id}")
    public ResponseEntity<VirtualPet> getVirtualPet(@PathVariable("id") long id) {
        Optional<VirtualPet> virtualPet = virtualPetRepository.findById(id);

        if (virtualPet.isPresent()) {
            return new ResponseEntity<>(virtualPet.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/main/java/com/wcci/amazon/b4/virtualpet/{id}")
    public ResponseEntity<List<VirtualPet>> getAllVirtualPet() {
        List<VirtualPet> virtualPets = virtualPetRepository.findAll();

        if (virtualPets.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<VirtualPet>>(virtualPets, HttpStatus.OK);
        }
    }

    @PostMapping("main/java/com/wcci/amazon/b4/virtualpet/add/{id}")
    public ResponseEntity<VirtualPet> createVirtualPet(@RequestBody VirtualPet virtualPet) {
        //List<VirtualPet> virtualPets = virtualPetRepository;
               // VirtualPet.save(new VirtualPet());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/main/java/com/wcci/amazon/b4/virtualpet/delete/{id}")
      public void deletePet(@PathVariable Long id) {
        virtualPetRepository.deleteById(id);
      }

    }

















/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.function.Supplier;
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
      @GetMapping("/api/pets/{id}")
      /*public Supplier<Throwable> supplier() {*/
     /*  public ResponseEntity<VirtualPet> getPetById(@PathVariable Long id) {
        Optional<VirtualPet>=virtualPetRepository.findById(id);

        if (VirtualPet.isPresent()) {
          return new ResponseEntity<>(VirtualPet.get(), HttpStatus.OK);
        }else{
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

            /* .orElseThrow(() -> new PetNotFoundException("id"));*/
      //}
    /* } */
      //@PostMapping("/api/pets/{id}")
      //public VirtualPet addPet(@RequestBody VirtualPet newPet) {
        //return virtualPetRepository.save(newPet);
    //}
      //@DeleteMapping("/api/pets/{id}")
      //public void deletePet(@PathVariable Long id) {
       // virtualPetRepository.deleteById(id);
    //}
    //} 



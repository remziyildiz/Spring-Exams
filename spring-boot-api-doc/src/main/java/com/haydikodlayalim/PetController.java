package com.haydikodlayalim;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/pet")
@RequestMapping
@Api(value = "Benim Pet Api dökümantasyonum")
public class PetController {

    private List<Pet> petList = new ArrayList<>();

    @PostConstruct
    public void init(){
        petList.add(new Pet(1, "Test Pet",new Date()));

    }



    @PostMapping
    @ApiOperation(value = "Yeni Pet Ekleme metodu",notes = "Bu metodu dikkatli kullan")
    public ResponseEntity<Pet> kaydet(@RequestBody @ApiParam(value = "hayvan") Pet pet) {
        petList.add(pet);
        return ResponseEntity.ok(pet);

    }
    @GetMapping
    @ApiOperation(value = "Pet listesi metodu",notes = "Bu metod tümünü getirir")
    public ResponseEntity<List<Pet>> tumunuListele() {
        return ResponseEntity.ok(petList);
    }
}
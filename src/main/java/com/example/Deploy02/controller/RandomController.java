package com.example.Deploy02.controller;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/sumrandom")
public class RandomController {
    private Random random =new Random();
  @GetMapping("/randomsum")
  public ResponseEntity<Integer> sumIntRandom(){
      Integer sum= random.nextInt() + random.nextInt();
      return ResponseEntity.ok().body(sum);

  }

}

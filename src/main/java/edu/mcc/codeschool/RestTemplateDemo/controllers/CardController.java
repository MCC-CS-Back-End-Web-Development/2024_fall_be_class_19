package edu.mcc.codeschool.RestTemplateDemo.controllers;

import edu.mcc.codeschool.RestTemplateDemo.models.Card;
import edu.mcc.codeschool.RestTemplateDemo.services.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cards")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public ResponseEntity<List<Card>> getAllCards(){
        return ResponseEntity.ok(cardService.getAllCards());
    }

    @GetMapping("/v2/{id}")
    public ResponseEntity<Card> getAllCardsReactive(@PathVariable String id){
        return ResponseEntity.ok(cardService.getAllCardsWebClient(id));
    }
}

package edu.mcc.codeschool.RestTemplateDemo.services;

import edu.mcc.codeschool.RestTemplateDemo.clients.PokemonCardClient;
import edu.mcc.codeschool.RestTemplateDemo.mappers.CardMapper;
import edu.mcc.codeschool.RestTemplateDemo.models.Card;
import edu.mcc.codeschool.RestTemplateDemo.models.external.PokemonTcgCard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {
    private final PokemonCardClient pokemonCardClient;
    private final CardMapper cardMapper;

    public CardService(PokemonCardClient pokemonCardClient, CardMapper cardMapper) {
        this.pokemonCardClient = pokemonCardClient;
        this.cardMapper = cardMapper;
    }

    public List<Card> getAllCards(){
        List<PokemonTcgCard> cards = pokemonCardClient.listPokemonCards();
        List<Card> ret = new ArrayList<>();
        cards.forEach(card -> ret.add(cardMapper.mapPokemonToCard(card)));
        return ret;
    }
}

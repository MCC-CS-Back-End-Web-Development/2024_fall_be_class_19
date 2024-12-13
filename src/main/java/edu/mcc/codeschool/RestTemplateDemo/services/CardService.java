package edu.mcc.codeschool.RestTemplateDemo.services;

import edu.mcc.codeschool.RestTemplateDemo.clients.PokemonCardClient;
import edu.mcc.codeschool.RestTemplateDemo.clients.PokemonCardClientV2;
import edu.mcc.codeschool.RestTemplateDemo.mappers.CardMapper;
import edu.mcc.codeschool.RestTemplateDemo.models.Card;
import edu.mcc.codeschool.RestTemplateDemo.models.external.PokemonTcgCard;
import edu.mcc.codeschool.RestTemplateDemo.models.external.PokemonTcgCardResponse;
import edu.mcc.codeschool.RestTemplateDemo.models.external.PokemonTcgGetCardResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {
    private final PokemonCardClient pokemonCardClient;
    private final PokemonCardClientV2 pokemonCardClientV2;
    private final CardMapper cardMapper;

    public CardService(PokemonCardClient pokemonCardClient, PokemonCardClientV2 pokemonCardClientV2, CardMapper cardMapper) {
        this.pokemonCardClient = pokemonCardClient;
        this.pokemonCardClientV2 = pokemonCardClientV2;
        this.cardMapper = cardMapper;
    }

    public List<Card> getAllCards(){
        List<PokemonTcgCard> cards = pokemonCardClient.listPokemonCards();
        List<Card> ret = new ArrayList<>();
        cards.forEach(card -> ret.add(cardMapper.mapPokemonToCard(card)));
        return ret;
    }

    public Card getAllCardsWebClient(String id){
        PokemonTcgGetCardResponse resp = pokemonCardClientV2.getPokemonCardById(id).block();
        Card ret = null;
        if(resp != null){
            ret = cardMapper.mapPokemonToCard(resp.getData());
        }
        return ret;
    }
}

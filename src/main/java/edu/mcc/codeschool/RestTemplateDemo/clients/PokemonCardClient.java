package edu.mcc.codeschool.RestTemplateDemo.clients;

import edu.mcc.codeschool.RestTemplateDemo.models.external.PokemonTcgCard;
import edu.mcc.codeschool.RestTemplateDemo.models.external.PokemonTcgCardResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class PokemonCardClient {
    private final RestTemplate restTemplate;

    public PokemonCardClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<PokemonTcgCard> listPokemonCards(){
        PokemonTcgCardResponse response = restTemplate.getForObject("https://api.pokemontcg.io/v2/cards", PokemonTcgCardResponse.class);
        return response != null ? response.getData() : null;
    }
}

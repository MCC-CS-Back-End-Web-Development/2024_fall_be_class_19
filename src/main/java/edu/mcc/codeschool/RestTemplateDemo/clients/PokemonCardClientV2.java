package edu.mcc.codeschool.RestTemplateDemo.clients;

import edu.mcc.codeschool.RestTemplateDemo.config.PokemonClientConfig;
import edu.mcc.codeschool.RestTemplateDemo.models.external.PokemonTcgCardResponse;
import edu.mcc.codeschool.RestTemplateDemo.models.external.PokemonTcgGetCardResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;

@Component
public class PokemonCardClientV2 {
    private final WebClient webClient;
    private final PokemonClientConfig pokemonClientConfig;

    public PokemonCardClientV2(WebClient.Builder webClientBuilder, PokemonClientConfig pokemonClientConfig) {
        this.pokemonClientConfig = pokemonClientConfig;
        this.webClient =webClientBuilder
                .baseUrl(pokemonClientConfig.getHost())
                .defaultHeaders(httpHeaders())
                .build();
    }

    private Consumer<HttpHeaders> httpHeaders(){
        return httpHeaders -> {
          httpHeaders.set("Accept", String.valueOf(MediaType.APPLICATION_JSON));
          // httpHeaders.set("API-KEY", "YOUR API KEY FROM CONFIG HERE");
        };
    }

    public Mono<PokemonTcgGetCardResponse> getPokemonCardById(String id){
        System.out.println("EVAAANN" + pokemonClientConfig.getHost());
        System.out.println("EVAAANN" + pokemonClientConfig.getListPokemonCardsPath());
        return webClient.get().uri(uriBuilder -> uriBuilder
                .path(pokemonClientConfig.getListPokemonCardsPath())
//                 .queryParam("myParm", pokemonClientConfig.getApiKey())
                .build(id)
        ).retrieve()
        .bodyToMono(PokemonTcgGetCardResponse.class);
    }
}

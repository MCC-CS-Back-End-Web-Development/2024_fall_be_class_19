package edu.mcc.codeschool.RestTemplateDemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "api.pokemon")
public class PokemonClientConfig {
    private String host;
    private String listPokemonCardsPath;
    private String apiKey;

    public String getHost() {
        return host;
    }

    public PokemonClientConfig setHost(String host) {
        this.host = host;
        return this;
    }

    public String getListPokemonCardsPath() {
        return listPokemonCardsPath;
    }

    public PokemonClientConfig setListPokemonCardsPath(String listPokemonCardsPath) {
        this.listPokemonCardsPath = listPokemonCardsPath;
        return this;
    }

    public String getApiKey() {
        return apiKey;
    }

    public PokemonClientConfig setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}

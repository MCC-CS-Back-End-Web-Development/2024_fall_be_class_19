package edu.mcc.codeschool.RestTemplateDemo.models.external;

public class PokemonTcgGetCardResponse {
    private PokemonTcgCard data;

    public PokemonTcgCard getData() {
        return data;
    }

    public PokemonTcgGetCardResponse setData(PokemonTcgCard data) {
        this.data = data;
        return this;
    }
}

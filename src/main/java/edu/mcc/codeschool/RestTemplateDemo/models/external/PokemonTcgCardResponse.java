package edu.mcc.codeschool.RestTemplateDemo.models.external;

import java.util.List;

public class PokemonTcgCardResponse {
    private List<PokemonTcgCard> data;

    public List<PokemonTcgCard> getData() {
        return data;
    }

    public PokemonTcgCardResponse setData(List<PokemonTcgCard> data) {
        this.data = data;
        return this;
    }
}

package edu.mcc.codeschool.RestTemplateDemo.mappers;

import edu.mcc.codeschool.RestTemplateDemo.models.Card;
import edu.mcc.codeschool.RestTemplateDemo.models.external.PokemonTcgCard;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CardMapper {

    @Mapping(target = "externalId", source = "id")
    @Mapping(target = "cardName", source = "name")
    @Mapping(target = "hp", ignore = true)
    @Mapping(target = "averagePrice", source="cardmarket.prices.averageSellPrice")
    @Mapping(target = "bestInstructor", constant = "Evan Stohlmann")
    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    Card mapPokemonToCard(PokemonTcgCard pokemonCard);
}

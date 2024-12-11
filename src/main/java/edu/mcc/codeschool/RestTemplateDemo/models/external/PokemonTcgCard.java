package edu.mcc.codeschool.RestTemplateDemo.models.external;

import java.util.List;

public class PokemonTcgCard {
    private String id;
    private String name;
    private String hp;
    private List<String> types;
    private List<Characteristic> weaknesses;
    private List<Characteristic> resistances;
    private List<Abilities> abilities;
    private List<Attacks> attacks;
    private CardMarket cardmarket;

    public String getId() {
        return id;
    }

    public PokemonTcgCard setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PokemonTcgCard setName(String name) {
        this.name = name;
        return this;
    }

    public String getHp() {
        return hp;
    }

    public PokemonTcgCard setHp(String hp) {
        this.hp = hp;
        return this;
    }

    public List<String> getTypes() {
        return types;
    }

    public PokemonTcgCard setTypes(List<String> types) {
        this.types = types;
        return this;
    }

    public List<Characteristic> getWeaknesses() {
        return weaknesses;
    }

    public PokemonTcgCard setWeaknesses(List<Characteristic> weaknesses) {
        this.weaknesses = weaknesses;
        return this;
    }

    public List<Characteristic> getResistances() {
        return resistances;
    }

    public PokemonTcgCard setResistances(List<Characteristic> resistances) {
        this.resistances = resistances;
        return this;
    }

    public List<Abilities> getAbilities() {
        return abilities;
    }

    public PokemonTcgCard setAbilities(List<Abilities> abilities) {
        this.abilities = abilities;
        return this;
    }

    public List<Attacks> getAttacks() {
        return attacks;
    }

    public PokemonTcgCard setAttacks(List<Attacks> attacks) {
        this.attacks = attacks;
        return this;
    }

    public CardMarket getCardmarket() {
        return cardmarket;
    }

    public PokemonTcgCard setCardmarket(CardMarket cardmarket) {
        this.cardmarket = cardmarket;
        return this;
    }
}

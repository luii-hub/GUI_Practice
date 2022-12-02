package gui101;

public class Pokedex {
    private Pokemon[] pokemons;
    private int currNum;

    public Pokedex(int numPokemons){
        this.pokemons = new Pokemon[numPokemons];
        this.currNum = 1;

        for (int i = 0; i < pokemons.length; i++){
            pokemons[i] = new Pokemon(i+1);
        }
    }

    public int getCurrNum() {
        return currNum;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public String getCurrPkmnName(){
        return pokemons[currNum-1].getName();
    }

    public String getCurrPkmnDesc(){
        return pokemons[currNum-1].getDesc();
    }

    public void setCurrPkmnName(String name){
        pokemons[currNum-1].setName(name);
    }

    public void setCurrPkmnDesc(String desc){
        pokemons[currNum-1].setDesc(desc);
    }

    public void prevPokemon(){
        if(!isFirstPokemon()){
            currNum--;
        }
    }

    public void nextPokemn(){
        if(!isLastPokemon()){
            currNum++;
        }
    }

    public boolean isFirstPokemon(){
        return currNum == 1;
    }

    public boolean isLastPokemon(){
        return currNum == pokemons.length;
    }

}

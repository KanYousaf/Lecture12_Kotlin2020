package com.example.lecture12_kotlin


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_fragment_pokemon_details.view.*

class fragment_pokemon_details : Fragment() {
    val Pokemon_Character_Details = arrayOf(
        "Bulbasaur","Bulbasaur known as Fushigidane in Japan, is a Pokémon species in Nintendo and Game Freak's Pokémon franchise. Designed by Ken Sugimori, their name is a combination of the words bulb and dinosaur",
        "Charizard","Charizard, known in Japan as Lizardon, is a Pokémon species in Nintendo and Game Freak's Pokémon franchise. Created by Ken Sugimori, Charizard first appeared in the video games Pocket Monsters Red and Green and subsequent sequels",
        "Charmander","Charmander, known as Hitokage in Japan, is a Pokémon species in Nintendo and Game Freak's Pokémon franchise. The end of a Charmander's tail is alight with a flame, and the flame's size reflects both the physical health and the emotions of the individual",
        "Charmeleon","Charmeleon, known as the Flame Pokémon, are bipedal lizard Pokémon, that have yellow bellies and soles, three clawed feet and hands, and bear a flame at the end of their tails",
        "Fearow","Fearow is meow sister",
        "Ivysaur","Ivysaur is one of the species of Pokémon creatures from the Pokémon media franchise",
        "Metapod","Metapod is another pokemon character",
        "Pikachu","Pikachu are a fictional species of Pokémon. Pokémon are fictional creatures that appear in an assortment of comic books, animated movies and television shows, video games, and trading card games licensed by The Pokémon Company, a Japanese corporation.",
        "Raichu","Raichu is a Pokémon species in Nintendo and Game Freak's Pokémon franchise. Raichu is the evolution to Pikachu, the mascot of the series. It was originally conceived by Game Freak's character development team and finalized by Ken Sugimori.",
        "Venusaur","Venusaur, known in Japan as Fushigibana, is a Grass/Poison type Pokémon species in Nintendo and Game Freak's Pokémon franchise.",
        "Voltorb", "Voltorb is a ball shape turtle",
        "Weedle", "Weedlly Weedlly Meedlly",
        "Clefairy","Clefairy is one of the species of Pokémon creatures from the Pokémon media franchise.",
        "Vulpix","Vulpix evolves into Ninetales when exposed to a fire stone. Created by Ken Sugimori, they first appeared in the video games Pokémon Red and Blue and later appear in subsequent sequels, various merchandise, spinoff titles, and animated and printed adaptations of the franchise.",
        "Wigglytuff","Wigglytuff first appeared in the video games Pokémon Red and Blue and subsequent sequels, later appearing in various merchandise, spinoff titles and animated and printed adaptations of the franchise.")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val rowView = inflater.inflate(R.layout.fragment_fragment_pokemon_details, container, false)
        val receivedArgs = arguments

        if(receivedArgs!=null) {
            val pokemonName: String = receivedArgs.getString("pokemon_name")?:"Pikachu"
            rowView.character_name.text = pokemonName

            val imageID = resources.getIdentifier(pokemonName.toLowerCase(), "drawable", activity!!.packageName)
            rowView.character_image.setImageResource(imageID)


            for (i in 0..Pokemon_Character_Details.size - 1) {
                if (pokemonName.equals(Pokemon_Character_Details[i])) {
                    rowView.character_description.text = Pokemon_Character_Details[i + 1]
                }
            }
        }

        return rowView
    }


}

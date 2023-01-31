package com.example.myrecyclerview

class SuperHeroProvider {

    companion object{
        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "Spiderman",
                "Marvel",
                "Peter Parker",
                "https://"
            ),
            SuperHero(
                "Batman",
                "DC",
                "Bruce Wayne",
                "https://"
            ),
            SuperHero(
                "Superman",
                "DC",
                "Clark Kent",
                "https//"
            ),
            SuperHero(
                "Iron Man",
                "Marvel",
                "Tony Stark",
                "https://"
            )

        )

    }
}
package com.example.monkeydluffy.info.data

import androidx.compose.ui.graphics.Color

data object CharacterRepo {
    val Characters = listOf(
        Character(
            1,
            "Monkey D. Luffy",
            "https://4kwallpapers.com/images/wallpapers/one-piece-gear-5-luffy-3840x2160-12504.png",
            "Luffy image",
            "Captain of the Straw Hat Pirates | Future Pirate King | Rubber Man",
            "Luffy, wielder of the Gum-Gum (Hito Hito: Nika) Fruit, now awakened into Gear 5. Reckless, cheerful, and fearless, he inspires freedom wherever he goes. His ultimate dream is to find the One Piece and become the Pirate King.",
            listOf(
                Triple("Captain ", Color(0xFFFF0000), Color(0xFFFFA500)),
                Triple("Luffy", Color(0xFF00BFFF), Color(0xFF1E90FF))
            )
        ),
        Character(
            2,
            "Roronoa Zoro",
            "https://cdn.oneesports.gg/cdn-data/2024/04/Anime_OnePiece_Zoro_Sword_Attack.jpg",
            "Zoro image",
            "First Mate | Pirate Hunter | Demon Swordsman",
            "Master of the Three-Sword Style, Zoro’s dream is to become the World’s Greatest Swordsman, surpassing Dracule Mihawk. Fierce loyalty to Luffy and unmatched willpower make him the crew’s strongest warrior.",
            listOf(
                Triple("Swordsman ", Color(0xFF2E8B57), Color(0xFF00FF7F)),
                Triple("Zoro", Color(0xFF228B22), Color(0xFF7CFC00))
            )
        ),
        Character(
            3,
            "Usopp",
            "https://images3.alphacoders.com/138/1380230.png",
            "Usopp image",
            "Sniper | God Usopp | Sogeking | Brave Warrior of the Sea",
            "Once a liar and teller of tall tales, Usopp has grown into a true Brave Warrior of the Sea. As the Straw Hat’s sharpshooter, his unmatched creativity fuels powerful inventions and long-range sniping. Bearing the names Sogeking and God Usopp, he inspires allies and terrifies enemies.",
            listOf(
                Triple("Sniper ", Color(0xFFFF4500), Color(0xFFFF6347)),
                Triple("Usopp ", Color(0xFF8B4513), Color(0xFFD2691E)),
            )
        ),
        Character(
            4,
            "Nami",
            "https://imgsrv.crunchyroll.com/cdn-cgi/image/fit=contain,format=auto,quality=70,width=1200,height=675/catalog/crunchyroll/589d80a30234ebe6c587d195c0be9f1b.jpg",
            "Nami image",
            "Navigator | Cat Burglar | Thief of Hearts | Weather Manipulator",
            "The crew’s brilliant navigator, Nami dreams of mapping the entire world. With her Clima-Tact and Zeus, she manipulates weather and lightning to defeat enemies.",
            listOf(
                Triple("Navigator ", Color(0xFFFFA07A), Color(0xFFFF6347)),
                Triple("Nami", Color(0xFFFFDAB9), Color(0xFFFF4500))
            )
        ),
        Character(
            5,
            "Vinsmoke Sanji",
            "https://comicbook.com/wp-content/uploads/sites/4/2024/07/b0e6de44-087a-432b-8db7-46e07b6d5f8f.jpg",
            "Sanji image",
            "Cook | Black Leg | Gentleman Chef | Diable Jambe Master",
            "Sanji, master of Black Leg martial arts, dreams of finding the All Blue. A fierce fighter with burning Diable Jambe and Ifrit Jambe, his chivalry and cooking make him indispensable.",
            listOf(
                Triple("Cook ", Color(0xFFFFA500), Color(0xFFFF8C00)),
                Triple("Sanji", Color(0xFFDAA520), Color(0xFFFFDAB9))
            )
        ),
        Character(
            6,
            "Tony Tony Chopper",
            "https://www.themarysue.com/wp-content/uploads/2022/03/chopper-one-piece-straw-hats.jpg",
            "Chopper image",
            "Doctor | Human-Reindeer | Rumble Ball Expert | Cotton Candy Lover",
            "A reindeer who ate the Human-Human Fruit. Cute but fierce, Chopper dreams of curing all diseases, transforming into various forms with Rumble Balls.",
            listOf(
                Triple("Doctor ", Color(0xFFEE82EE), Color(0xFFDA70D6)),
                Triple("Chopper", Color(0xFF00CED1), Color(0xFF20B2AA))
            )
        ),
        Character(
            7,
            "Nico Robin",
            "https://images3.alphacoders.com/135/1355322.jpeg",
            "Robin image",
            "Archaeologist | Devil Child | Scholar of the Void Century | Flower-Flower Woman",
            "Robin, wielder of the Flower-Flower Fruit, seeks the Rio Poneglyph to uncover the Void Century. Calm, intelligent, and deeply loyal, she is the crew’s key to history.",
            listOf(
                Triple("Archaeologist ", Color(0xFFBA55D3), Color(0xFFDDA0DD)),
                Triple("Robin", Color(0xFFDA70D6), Color(0xFFFFC0CB))
            )
        ),
        Character(
            8,
            "Franky",
            "https://seakoff.com/cdn/shop/articles/franky-from-one-piece-the-super-cyborg-of-the-straw-hat-pirates-321056.jpg?v=1718531214",
            "Franky image",
            "Shipwright | Cyborg | SUPER!! Inventor | Iron Man of the Sea",
            "The genius cyborg shipwright who built the Thousand Sunny. Proudly ‘SUPER!!’, Franky’s dream is to sail across the seas on the ultimate ship with his crew.",
            listOf(
                Triple("Cyborg ", Color(0xFFFF4500), Color(0xFFFF6347)),
                Triple("Franky", Color(0xFF4682B4), Color(0xFF5F9EA0))
            )
        ),
        Character(
            9,
            "Brook",
            "https://images.alphacoders.com/138/1381546.png",
            "Brook image",
            "Musician | Soul King | Revived Skeleton | Dancing Musician",
            "Revived by the Revive-Revive Fruit, Brook is a lively skeleton who brings music and joy. His dream is to reunite with Laboon and spread happiness with his songs.",
            listOf(
                Triple("Musician ", Color(0xFFFFFFFF), Color(0xFFB0E0E6)),
                Triple("Brook", Color(0xFF708090), Color(0xFFA9A9A9))
            )
        ),
        Character(
            10,
            "Jinbe",
            "https://pbs.twimg.com/media/GE5dGP0W0AAg1ZR?format=jpg&name=large",
            "Jinbe image",
            "Helmsman | Knight of the Sea | Fish-Man Karate Master | Calm and Honorable",
            "A master of Fish-Man Karate and former Warlord, Jinbe dreams of coexistence between humans and fish-men. Wise, calm, and honorable, he is Luffy’s trusted ally.",
            listOf(
                Triple("Helmsman ", Color(0xFF00FFFF), Color(0xFF4682B4)),
                Triple("Jinbe", Color(0xFF1E90FF), Color(0xFF000080))
            )
        )
    )
}

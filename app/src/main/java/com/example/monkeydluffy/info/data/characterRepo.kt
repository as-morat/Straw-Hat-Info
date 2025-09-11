package com.example.monkeydluffy.info.data

import androidx.compose.ui.graphics.Color
import com.example.monkeydluffy.R

data object CharacterRepo {
    val Characters = listOf(
        Character(
            1,
            "Luffy",
            "https://4kwallpapers.com/images/wallpapers/one-piece-gear-5-luffy-3840x2160-12504.png",
            "Luffy image",
            "Captain of the Straw Hat Pirates and wielder of the Gum-Gum Fruit. Reckless, cheerful, and fearless in chasing his dream.",
            "Luffy’s rubber body lets him fight in wild, creative ways. Despite his carefree nature, he is brave, determined, and deeply values his friends. His greatest goal is to find the One Piece and become the Pirate King, a dream that drives every adventure he takes on.",
            listOf(
                Triple("Monkey", Color(0xFFFF4500), Color(0xFFFFD700)),
                Triple(" D. ", Color(0xFFFF0000), Color(0xFFFFA500)),
                Triple("Luffy", Color(0xFF00BFFF), Color(0xFF1E90FF))
            )
        ),

        Character(
            2,
            "Zoro",
            "https://cdn.oneesports.gg/cdn-data/2024/04/Anime_OnePiece_Zoro_Sword_Attack.jpg",
            "Zoro image",
            "The Straw Hats’ swordsman, known for his three-sword style and relentless training.",
            "Zoro aims to become the world’s greatest swordsman, honoring a promise to his childhood friend. His loyalty to Luffy is unshakable, and his strength makes him the crew’s strongest fighter. Though often serious, his poor sense of direction is legendary among fans and crewmates alike.",
            listOf(
                Triple("Roronoa", Color(0xFF006400), Color(0xFF32CD32)),
                Triple(" Zoro", Color(0xFF2E8B57), Color(0xFF00FF7F))
            )
        ),

        Character(
            3,
            "Sanji",
            "https://comicbook.com/wp-content/uploads/sites/4/2024/07/b0e6de44-087a-432b-8db7-46e07b6d5f8f.jpg",
            "Sanji image",
            "The Straw Hat cook, a master of martial arts using only his legs.",
            "Sanji dreams of discovering the All Blue, a legendary sea where every fish in the world can be found. Fierce in battle yet softhearted, he protects his friends with all his strength. His chivalry towards women and unmatched cooking skills make him unique among pirates.",
            listOf(
                Triple("Vinsmoke", Color(0xFFFFFF00), Color(0xFFFFD700)),
                Triple(" Sanji", Color(0xFFFFA500), Color(0xFFFF8C00))
            )
        ),

        Character(
            4,
            "Nami",
            "https://imgsrv.crunchyroll.com/cdn-cgi/image/fit=contain,format=auto,quality=70,width=1200,height=675/catalog/crunchyroll/589d80a30234ebe6c587d195c0be9f1b.jpg",
            "Nami image",
            "The navigator of the crew, sharp, resourceful, and obsessed with maps and treasure.",
            "Nami dreams of drawing a complete map of the world. With her Clima-Tact, she manipulates the weather to defeat even powerful enemies. Though she values money and treasure, her loyalty to her crew is unshakable, making her both clever and courageous on the seas.",
            listOf(
                Triple("The Navigator", Color(0xFFFF69B4), Color(0xFFFFB6C1)),
                Triple(" Nami", Color(0xFFFFA07A), Color(0xFFFF6347))
            )
        ),

        Character(
            5,
            "Usopp",
            "https://images3.alphacoders.com/138/1380230.png",
            "Usopp image",
            "The sharpshooter of the crew, a storyteller with a mix of fear and courage.",
            "Usopp often struggles with fear but never hesitates when his friends truly need him. His creativity in making weapons and tricks makes him invaluable. He dreams of becoming a brave warrior of the sea, inspired by the tales he once told as lies but now lives as truth.",
            listOf(
                Triple("Sogeking", Color(0xFFFFD700), Color(0xFFFFFF00)),
                Triple(" God ", Color(0xFFFF4500), Color(0xFFFF6347)),
                Triple("Usopp", Color(0xFF8B4513), Color(0xFFD2691E))
            )
        ),

        Character(
            6,
            "Chopper",
            "https://www.themarysue.com/wp-content/uploads/2022/03/chopper-one-piece-straw-hats.jpg",
            "Chopper image",
            "The doctor of the Straw Hats, a reindeer who gained human traits from the Human-Human Fruit.",
            "Chopper’s dream is to cure every disease in the world. Small and adorable in form, he transforms into powerful battle forms when needed. His medical expertise, innocence, and kindness make him one of the most beloved members of the crew.",
            listOf(
                Triple("Tony Tony", Color(0xFFADD8E6), Color(0xFF87CEFA)),
                Triple(" Chopper", Color(0xFFEE82EE), Color(0xFFDA70D6))
            )
        ),

        Character(
            7,
            "Robin",
            "https://images3.alphacoders.com/135/1355322.jpeg",
            "Robin image",
            "The archaeologist of the crew, calm, intelligent, and mysterious.",
            "Robin ate the Flower-Flower Fruit, allowing her to sprout limbs anywhere. Her dream is to uncover the true history of the world hidden in the Poneglyphs. Although her past is filled with pain and loneliness, she found trust and belonging with the Straw Hats.",
            listOf(
                Triple("Nico", Color(0xFF8A2BE2), Color(0xFF9370DB)),
                Triple(" Robin", Color(0xFFBA55D3), Color(0xFFDDA0DD))
            )
        ),

        Character(
            8,
            "Brook",
            "https://images.alphacoders.com/138/1381546.png",
            "Brook image",
            "The musician of the Straw Hats, a lively skeleton with a love for music.",
            "Brook ate the Revive-Revive Fruit, granting him life after death. Despite his comical personality, he hides deep loneliness from his years at sea. His dream is to reunite with Laboon, the whale he promised to see again, while bringing joy through his music.",
            listOf(
                Triple("Soul King", Color(0xFF00CED1), Color(0xFF20B2AA)),
                Triple(" Brook", Color(0xFFFFFFFF), Color(0xFFB0E0E6))
            )
        ),

        Character(
            9,
            "Jinbe",
            "https://pbs.twimg.com/media/GE5dGP0W0AAg1ZR?format=jpg&name=large",
            "Jinbe image",
            "The helmsman of the crew, a fish-man with honor and great strength.",
            "Jinbe is a master of Fish-Man Karate and a former Warlord of the Sea. He dreams of peace between humans and fish-men, fighting for equality. His wisdom and calm nature balance the crew, while his loyalty and bravery make him an irreplaceable ally.",
            listOf(
                Triple("Son of Sea", Color(0xFF1E90FF), Color(0xFF000080)),
                Triple(" Jinbe", Color(0xFF00FFFF), Color(0xFF4682B4))
            )
        ),

        Character(
            10,
            "Franky",
            "https://seakoff.com/cdn/shop/articles/franky-from-one-piece-the-super-cyborg-of-the-straw-hat-pirates-321056.jpg?v=1718531214",
            "Franky image",
            "The shipwright of the Straw Hats, a cyborg with a bold personality and flashy style.",
            "Franky rebuilt his body into a powerful cyborg after a tragic past. As the crew’s shipwright, he built the Thousand Sunny, their dream ship. Loud, eccentric, and proud of being ‘SUPER!!’, he’s both comic relief and a vital fighter whose engineering genius keeps the crew sailing strong.",
            listOf(
                Triple("Cyborg", Color(0xFF00BFFF), Color(0xFF1E90FF)),   // light blue → deep blue
                Triple(" Franky", Color(0xFFFF4500), Color(0xFFFF6347))   // orange-red → coral
            )
        )
    )
}

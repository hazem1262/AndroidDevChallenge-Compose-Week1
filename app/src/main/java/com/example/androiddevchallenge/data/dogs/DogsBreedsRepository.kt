package com.example.androiddevchallenge.data.dogs

fun getDogBreedById(id:Int) = getDogsSpreadList().find { it.id == id }

// clone of https://api.thedogapi.com/v1/images/search?limit=10&page=0&order=Desc response
fun getDogsSpreadList() = listOf(
    DogsBreed(
        id = 50,
        name = "Border Collie",
        bredFor = "Sheep herder",
        bredGroup = "Herding",
        lifeSpan = "12 - 16 years",
        temperament = "Tenacious, Keen, Energetic, Responsive, Alert, Intelligent",
        url = "https://cdn2.thedogapi.com/images/MnFVJ4XuT.jpg"
    ),
    DogsBreed(
        id = 61,
        name = "Bull Terrier",
        bredFor = "Bull baiting, Fighting",
        bredGroup = "Terrier",
        lifeSpan = "10 - 12 years",
        temperament = "Trainable, Protective, Sweet-Tempered, Keen, Active",
        url = "https://cdn2.thedogapi.com/images/xNHN6Vu1e.jpg"
    ),
    DogsBreed(
        id = 103,
        name = "English Springer Spaniel",
        bredFor = "Bird flushing, retrieving",
        bredGroup = "Sporting",
        lifeSpan = "12 - 14 years",
        temperament = "Affectionate, Cheerful, Alert, Intelligent, Attentive, Active",
        url = "https://cdn2.thedogapi.com/images/Hk0Jfe5VQ_1280.jpg"
    ),
    DogsBreed(
        id = 142,
        name = "Keeshond",
        bredFor = "Barge watchdog",
        bredGroup = "Non-Sporting",
        lifeSpan = "12 - 15 years",
        temperament = "Agile, Obedient, Playful, Quick, Sturdy, Bright",
        url = "https://cdn2.thedogapi.com/images/S1GAGg9Vm_1280.jpg"
    ),
    DogsBreed(
        id = 145,
        name = "Kooikerhondje",
        bredFor = "Luring ducks into traps - \\\"tolling\\\"",
        bredGroup = "Sporting",
        lifeSpan = "12 - 15 years",
        temperament = "Benevolent, Agile, Alert, Intelligent, Active, Territorial",
        url = "https://cdn2.thedogapi.com/images/LrXQhXhmb.jpg"
    ),
    DogsBreed(
        id = 167,
        name = "Miniature Pinscher",
        bredFor = "Small vermin hunting",
        bredGroup = "Toy",
        lifeSpan = "15 years",
        temperament = "Clever, Outgoing, Friendly, Energetic, Responsive, Playful",
        url = "https://cdn2.thedogapi.com/images/Hy3H7g94X_1280.jpg"
    ),
    DogsBreed(
        id = 222,
        name = "Shiba Inu",
        bredFor = "Hunting in the mountains of Japan, Alert Watchdog",
        bredGroup = "Non-Sporting",
        lifeSpan = "12 - 16 years",
        temperament = "Charming, Fearless, Keen, Alert, Confident, Faithful",
        url = "https://cdn2.thedogapi.com/images/GlfNCIUjz.jpg"
    ),
    DogsBreed(
        id = 246,
        name = "Tibetan Terrier",
        bredFor = "Good luck charms, mascots, watchdogs, herding dogs, and companions",
        bredGroup = "Non-Sporting",
        lifeSpan = "12 - 15 years",
        temperament = "Affectionate, Energetic, Amiable, Reserved, Gentle, Sensitive",
        url = "https://cdn2.thedogapi.com/images/YavuF9onG.jpg"
    ),
    DogsBreed(
        id = 260,
        name = "Wirehaired Pointing Griffon",
        bredFor = "Gundog, \\\"swamp-tromping\\\", Flushing, pointing, and retrieving water fowl & game birds",
        bredGroup = "Sporting",
        lifeSpan = "12 - 14 years",
        temperament = "Loyal, Gentle, Vigilant, Trainable, Proud",
        url = "https://cdn2.thedogapi.com/images/Bkam2l9Vm_1280.jpg"
    )

)
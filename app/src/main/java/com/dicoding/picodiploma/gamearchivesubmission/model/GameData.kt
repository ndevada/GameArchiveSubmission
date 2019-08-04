package com.dicoding.picodiploma.gamearchivesubmission.model

object GameData {
    private var data = arrayOf(
        arrayOf(
            "One Piece: World Seeker",
            "https://3.bp.blogspot.com/-MvxB0FcBlOg/XI4XNoPomPI/AAAAAAAAC5Y/pal7gnvAmpQ2dvz95Gj4JoCezMnoZBxewCLcBGAs/s640/cover.jpg",
            "Adventure",
            "Xbox One, PC (Microsoft Windows), PlayStation 4",
            "Mar 14, 2019",
            "Ganbarion",
            "Bandai Namco Entertainment",
            "ワンピース ワールドシーカー",
            "Single player",
            "https://images.igdb.com/igdb/image/upload/t_cover_big/co1hl9.jpg",
            "Set sail on an all-new ONE PIECE adventure in ONE PIECE World Seeker! Luffy and the Straw Hat Pirates are back in a new story that puts players’ into Luffy’s point of view, as he battles and explores an expansive and seamless world. Open landscapes provide many paths for players to experience Luffy’s gum-gum abilities and swing into action."
        ),
        arrayOf(
            "Sekiro: Shadows Die Twice",
            "https://www.haltegame.com/i/2019/02/sekiro-shadows-die-twice-art.jpg",
            "Adventure",
            "Xbox One, PC (Microsoft Windows), PlayStation 4",
            "Mar 22, 2019",
            "FromSoftware",
            "Activision",
            "Shadows Die Twice",
            "Single player",
            "https://images.igdb.com/igdb/image/upload/t_cover_big/co1hl9.jpg",
            "Set sail on an all-new ONE PIECE adventure in ONE PIECE World Seeker! Luffy and the Straw Hat Pirates are back in a new story that puts players’ into Luffy’s point of view, as he battles and explores an expansive and seamless world. Open landscapes provide many paths for players to experience Luffy’s gum-gum abilities and swing into action."
        ),
        arrayOf(
            "Diesel Brothers: The Game",
            "https://i.ytimg.com/vi/nsMoktxZfes/maxresdefault.jpg",
            "Simulator",
            "PC (Microsoft Windows)",
            "Mar 31, 2019",
            "Code Horizon",
            "Code Horizon",
            "-",
            "Single player, Multiplayer",
            "https://images.igdb.com/igdb/image/upload/t_cover_big/co1hl9.jpg",
            "Set sail on an all-new ONE PIECE adventure in ONE PIECE World Seeker! Luffy and the Straw Hat Pirates are back in a new story that puts players’ into Luffy’s point of view, as he battles and explores an expansive and seamless world. Open landscapes provide many paths for players to experience Luffy’s gum-gum abilities and swing into action."
        ),
        arrayOf(
            "Sakuna: Of Rice and Ruin",
            "https://3.bp.blogspot.com/-iz1cF_djyCE/W8YXRMMlWYI/AAAAAAAADEw/5MIZLk9pt9oTrXVsNx4tcuU_hCvowYIGwCLcBGAs/s1600/Saduna.PNG",
            "Platform, Role-playing (RPG), Simulator",
            "Nintendo Switch, PC (Microsoft Windows), PlayStation 4",
            "Dec 31, 2019",
            "Edelweiss",
            "XSEED Games",
            "-",
            "Single player",
            "https://images.igdb.com/igdb/image/upload/t_cover_big/co1hl9.jpg",
            "Set sail on an all-new ONE PIECE adventure in ONE PIECE World Seeker! Luffy and the Straw Hat Pirates are back in a new story that puts players’ into Luffy’s point of view, as he battles and explores an expansive and seamless world. Open landscapes provide many paths for players to experience Luffy’s gum-gum abilities and swing into action."
        )
    )

    val listData: ArrayList<Game>
        get() {
            val list = ArrayList<Game>()
            for (aData in data) {
                val game = Game()
                game.name = aData[0]
                game.img = aData[1]
                game.genre = aData[2]
                game.platforms = aData[3]
                game.releaseDates = aData[4]
                game.developers = aData[5]
                game.publisher = aData[6]
                game.alt_name = aData[7]
                game.game_mode = aData[8]
                game.img_detail = aData[9]
                game.desc = aData[10]

                list.add(game)
            }

            return list
        }
}
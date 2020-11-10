package be.pxl.ja.oefening5;

import java.util.List;
import java.util.function.Predicate;

public class GameBrowser {

	private final GameCollection gameCollection;


	public GameBrowser(GameCollection gameCollection) {
		this.gameCollection = gameCollection;
	}

	public List<VideoGame> showFreeGames() {
		return gameCollection.selectGames(videoGame -> videoGame.getPrice() == 0);
	}

	public List<VideoGame> showGamesInGenre(String action) {
		return gameCollection.selectGames(videoGame -> videoGame.getGenres().contains(action));
	}

	public List<VideoGame> showGamesForSearch(String cd) {
		return gameCollection.selectGames(new Predicate<VideoGame>() {
			@Override
			public boolean test(VideoGame videoGame) {
				return videoGame.getName().toLowerCase().contains(cd.toLowerCase());
			}
		});
	}
}

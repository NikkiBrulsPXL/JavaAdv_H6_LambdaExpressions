package be.pxl.ja.oefening5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GameCollection {
	private final List<VideoGame> videoGames = new ArrayList<>();

	public void addGame(VideoGame game) {
		videoGames.add(game);
	}

	public List<VideoGame> selectGames(Predicate<VideoGame> filter){
		List<VideoGame> selectedGames = new ArrayList<VideoGame>();
		videoGames.forEach(videoGame -> {
			if(filter.test(videoGame)){
				selectedGames.add(videoGame);
			}
		});
		return selectedGames;
	}

}

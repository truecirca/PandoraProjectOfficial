package circa.projectpandora.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import circa.projectpandora.model.GamesAvaliable;

class TestGamesAvaliable {

	@Test
	void testRandomGenerationWorks() {
		GamesAvaliable games = new GamesAvaliable();
		
		String actual = games.getRandomCharacter();
		
		assertEquals("Silent", actual);
	}

}

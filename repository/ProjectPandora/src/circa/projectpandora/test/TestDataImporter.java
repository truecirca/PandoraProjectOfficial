package circa.projectpandora.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import circa.projectpandora.model.DataImporter;

class TestDataImporter {

	@Test
	void testDataImports() {
		DataImporter testData = new DataImporter();
		
		String actual = testData.toString();
		
		assertEquals("some data\nmore some more data data more sometimes more help\n", actual);
	}
	
	@Test
	void testDataImporterCountsGames() {
		DataImporter testData = new DataImporter();
		
		int actual = testData.getGameCount();
		
		assertEquals(2, actual);
	}

}

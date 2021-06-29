package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>, Thomas Mayer
 */
class AppTest {

    @Test
    void runFootball() {
    	String correctTeam = "Team with smallest goal spread       : Aston_Villa";
    	String calculatedTeam = App.main("--football", "football.csv");
    	 assertEquals(correctTeam , calculatedTeam, "The main  method do not return the Team with the lowest goal distance of the footballcsv file.");
    }
    
    @Test
    void runWeather() {
    	String beatifullDay = "Day with smallest temperature spread : 14";
    	String calculatedDay = App.main("--weatherDistance", "weather.csv");
        assertEquals(beatifullDay , calculatedDay, "The main  method do not return the day with the lowest temperature distance of the weather.csv file.");
    }


}
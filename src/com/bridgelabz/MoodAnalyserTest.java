package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

	@Test
	 public void givenMessageWhenProperShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = MoodAnalyser.analyseMood("i am in sad mood");
        Assert.assertEquals("Sad", actualResult);
	}

}

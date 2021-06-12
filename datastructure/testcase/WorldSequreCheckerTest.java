package com.csingh.datastructure.testcase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.csingh.datastructure.problems.WorldSequreChecker;

class WorldSequreCheckerTest {

	@Test
	void checkSimpleCase1() {
		assertEquals(WorldSequreChecker.validate(Arrays.asList("ball", "area", "lead", "lady")), true);
	}
	
	@Test
	void checkSimpleCase2() {
		assertEquals(WorldSequreChecker.validate(Arrays.asList("ball")), false);
	}
	
	@Test
	void checkSimpleCase3() {
		assertEquals(WorldSequreChecker.validate(Arrays.asList("abc", "bc", "d")), false);
	}

}

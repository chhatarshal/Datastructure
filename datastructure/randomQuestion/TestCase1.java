package com.csingh.datastructure.randomQuestion;

import org.junit.jupiter.api.Test;

class TestCase1 {
	
	
	
	 
	@Test
	public void test1() {
		OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
		Cache cache = (Cache) optimizedDiskCache;

		
	}
	
	@Test
	public void test2() {
		MemoryCache memoryCache = new MemoryCache();
		Cache cache = (Cache) memoryCache;
		DiskCache diskCache = (DiskCache) cache;

	}
	
	@Test
	public void test3() {

		DiskCache diskCache = new DiskCache();
		OptimizedDiskCache optimizedDiskCache = (OptimizedDiskCache) diskCache;

		
	}
	
	@Test
	public void test4() {
		OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
		DiskCache diskCache = (DiskCache) optimizedDiskCache;

		
	}
	
	@Test
	public void test5() {
		Cache cache = new Cache();
		MemoryCache memoryCache = (MemoryCache) cache;

		
	}
	
	@Test
	public void test6() {
		OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
		Cache cache = (Cache) optimizedDiskCache;
		DiskCache diskCache = (DiskCache) cache;
	}

}
  class Cache {}

  class DiskCache extends Cache {}

  class MemoryCache extends Cache {}

  class OptimizedDiskCache extends DiskCache {}

package com.dependson.beans;

import java.util.List;

public class CacheManager {
	private Cache cache;
	private List<IAccessor> accessors;

	public CacheManager(Cache cache, List<IAccessor> accessors) throws Exception {
		this.cache = cache;
		this.accessors = accessors;
		initialize();
	}

	public void initialize() throws Exception {
		for (IAccessor accessor : accessors) {
			cache.put(accessor.getKey(), accessor.getData());
		}
	}
}

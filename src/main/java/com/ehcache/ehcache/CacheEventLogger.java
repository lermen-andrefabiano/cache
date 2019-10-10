package com.ehcache.ehcache;

import lombok.extern.java.Log;
import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;

@Log
public class CacheEventLogger implements CacheEventListener<Object, Object> {
    @Override
    public void onEvent(CacheEvent<?, ?> cacheEvent) {
        log.info(String.format("Cache event %s for item with key %s. Old value = %s, New value = %s", cacheEvent.getType(), cacheEvent.getKey(), cacheEvent.getOldValue(), cacheEvent.getNewValue()));
    }
}

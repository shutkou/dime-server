package eu.dime.ps.storage.entities;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.roo.addon.test.RooIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@Configurable
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/META-INF/spring/ps-db-applicationContext.xml")
@Transactional
@RooIntegrationTest(entity = HistoryCache.class, findAll=false)
public class HistoryCacheIntegrationTest {

    @Test
    public void testMarkerMethod() {
    }

	@Autowired
    private HistoryCacheDataOnDemand dod;

	@Test
    public void testCountHistoryCaches() {
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to initialize correctly", dod.getRandomHistoryCache());
        long count = eu.dime.ps.storage.entities.HistoryCache.countHistoryCaches();
        org.junit.Assert.assertTrue("Counter for 'HistoryCache' incorrectly reported there were no entries", count > 0);
    }

	@Test
    public void testFindHistoryCache() {
        eu.dime.ps.storage.entities.HistoryCache obj = dod.getRandomHistoryCache();
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to provide an identifier", id);
        obj = eu.dime.ps.storage.entities.HistoryCache.findHistoryCache(id);
        org.junit.Assert.assertNotNull("Find method for 'HistoryCache' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'HistoryCache' returned the incorrect identifier", id, obj.getId());
    }

	@Test
    public void testFindHistoryCacheEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to initialize correctly", dod.getRandomHistoryCache());
        long count = eu.dime.ps.storage.entities.HistoryCache.countHistoryCaches();
        if (count > 20) count = 20;
        java.util.List<eu.dime.ps.storage.entities.HistoryCache> result = eu.dime.ps.storage.entities.HistoryCache.findHistoryCacheEntries(0, (int) count);
        org.junit.Assert.assertNotNull("Find entries method for 'HistoryCache' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'HistoryCache' returned an incorrect number of entries", count, result.size());
    }

	@Test
    public void testFlush() {
        eu.dime.ps.storage.entities.HistoryCache obj = dod.getRandomHistoryCache();
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to provide an identifier", id);
        obj = eu.dime.ps.storage.entities.HistoryCache.findHistoryCache(id);
        org.junit.Assert.assertNotNull("Find method for 'HistoryCache' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyHistoryCache(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'HistoryCache' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }

	@Test
    public void testMerge() {
        eu.dime.ps.storage.entities.HistoryCache obj = dod.getRandomHistoryCache();
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to provide an identifier", id);
        obj = eu.dime.ps.storage.entities.HistoryCache.findHistoryCache(id);
        boolean modified =  dod.modifyHistoryCache(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        eu.dime.ps.storage.entities.HistoryCache merged = (eu.dime.ps.storage.entities.HistoryCache) obj.merge();
        obj.flush();
        org.junit.Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        org.junit.Assert.assertTrue("Version for 'HistoryCache' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }

	@Test
    public void testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to initialize correctly", dod.getRandomHistoryCache());
        eu.dime.ps.storage.entities.HistoryCache obj = dod.getNewTransientHistoryCache(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'HistoryCache' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'HistoryCache' identifier to no longer be null", obj.getId());
    }

	@Test
    public void testRemove() {
        eu.dime.ps.storage.entities.HistoryCache obj = dod.getRandomHistoryCache();
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'HistoryCache' failed to provide an identifier", id);
        obj = eu.dime.ps.storage.entities.HistoryCache.findHistoryCache(id);
        obj.remove();
        obj.flush();
        org.junit.Assert.assertNull("Failed to remove 'HistoryCache' with identifier '" + id + "'", eu.dime.ps.storage.entities.HistoryCache.findHistoryCache(id));
    }
}
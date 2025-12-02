package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class PlaylistRecommenderTest {

    @Test
    public void testClassifyEnergyHigh() {
        List<Integer> bpms = List.of(150, 145, 160);
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergyMedium() {
        List<Integer> bpms = (110, 120, 130);
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergyLow() {
        List<Integer> bpms = List.of(60, 80, 90);
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergyRejectsNull() {
        assertThrows(IllegalArgumentException.class, () ->
            PlaylistRecommender.classifyEnergy(null));
        }

    @Test
    public void testIsValidTrackTitle() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Hello World"));
    }

    @Test
    public void testNormalizeVolumeClampsHigh() {
        assertEquals(100, PlaylistRecommender.normalizeVolume(150));
    }}

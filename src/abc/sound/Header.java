package abc.sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Header class represents the header of a piece of music in abc notation
 *
 */
public class Header {
    
    private final String meter;
    private final String length;
    private final String tempoBaseNote;
    private final int tempoBPM;
    private final String composer;
    private final String title;
    private final String index;
    private final String key;
    private final Map<String, List<String>> voices;
 
    // Rep Invariant;
    //  none of the non-primitive fields are null
    //  tempoBPM > 0
    
    // Safety from rep exposure:
    //  all fields are marked as private and final.
     
    public Header(String title, String index, String key, String composer, String meter, String length, String tempoBaseNote, int tempoBPM,
                    Map<String, List<String>> voices) {
        this.title = title;
        this.index = index;
        this.key = key;
        this.composer = composer;
        this.meter = meter;
        this.length = length;
        this.tempoBaseNote = tempoBaseNote;
        this.tempoBPM = tempoBPM;
        Map<String, List<String>> voicesCopy = new HashMap<>();
        for (Map.Entry<String, List<String>> kvPair : voices.entrySet()) {
            List<String> lines = new ArrayList<>(kvPair.getValue());
            voicesCopy.put(kvPair.getKey(), lines);
        }
        this.voices = voicesCopy;
        checkRep();
    }
        
    private void checkRep() {
        assert title != null;
        assert index != null;
        assert key != null;
        assert composer != null;
        assert meter != null;
        assert length != null;
        assert tempoBaseNote != null;
        assert tempoBPM > 0;
        assert voices != null;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("X: " + index + "\n");
        sb.append("T: " + title + "\n");
        sb.append("C: " + composer + "\n");
        sb.append("L: " + length + "\n");
        sb.append("M: " + meter + "\n");
        sb.append("Q: " + tempoBaseNote + "=" + tempoBPM + "\n");
        for (String voice : voices.keySet()) {
            sb.append("V: " + voice +"\n");
        }
        sb.append("K: " + key);
        return sb.toString();
    }


    /** @return the meter */
    public String getMeter() {
        return this.meter;
    }
    
    /** @return the length */
    public String getLength() {
        return this.length;
    }
    
    /** @return tempo base note */
    public String getTempoBaseNote() {
        return this.tempoBaseNote;
    }
    
    /** @return tempo bpm */
    public int getTempoBPM() {
        return this.tempoBPM;
    }
    
    /** @return the composer */
    public String getComposer() {
        return this.composer;
    }
    
    /** @return the title */
    public String getTitle() {
        return this.title;
    }
    
    /** @return the index */
    public String getIndex() {
        return this.index;
    }
    
    /** @return the key */
    public String getKey() {
        return this.key;
    }
    
    /** @return voices */
    public Map<String, List<String>> getVoices() {
        Map<String, List<String>> voicesCopy = new HashMap<>();
        for (Map.Entry<String, List<String>> kvPair : voices.entrySet()) {
            List<String> lines = new ArrayList<>(kvPair.getValue());
            if (!lines.isEmpty()) {
                voicesCopy.put(kvPair.getKey(), lines);
            }
        }
        return voicesCopy;
    }
    
}
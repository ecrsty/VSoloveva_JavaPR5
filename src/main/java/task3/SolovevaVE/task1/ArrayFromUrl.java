package task3.SolovevaVE.task1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArrayFromUrl {
    @JsonProperty("arrayNumbers")
    private int[] array;

    public int[] getArray() {
        return array;
    }
}

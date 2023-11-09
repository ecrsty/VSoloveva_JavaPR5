package task3.SolovevaVE.task2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BoolRequest {
    @JsonProperty("answer")
    private boolean answer;

    public boolean isAnswer() {
        return answer;
    }
}

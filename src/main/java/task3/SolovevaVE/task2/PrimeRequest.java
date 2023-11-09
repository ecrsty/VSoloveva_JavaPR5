package task3.SolovevaVE.task2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PrimeRequest {
    @JsonProperty("name")
    private String name;

    @JsonProperty("length")
    private int length;

    @JsonProperty("numbers")
    private String numbers;

    @Override
    public String toString() {
        return "PrimeRequest{" +
                "name=" + name +
                ", length='" + length + '\'' +
                ", numbers=" + numbers +
                '}';
    }

    public PrimeRequest(String name, int length, String numbers) {
        this.name = name;
        this.length = length;
        this.numbers = numbers;
    }
}

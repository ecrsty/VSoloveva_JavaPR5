package task3.SolovevaVE.task2;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ArrService {
    @POST("/")
    Call<BoolRequest> postJson(@Body PrimeRequest primeRequest);
}

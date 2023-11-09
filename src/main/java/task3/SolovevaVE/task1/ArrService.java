package task3.SolovevaVE.task1;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ArrService {
    @GET("/")
    Call<ArrayFromUrl> getArray();
}

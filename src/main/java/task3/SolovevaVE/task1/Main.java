package task3.SolovevaVE.task1;

import com.fasterxml.jackson.databind.json.JsonMapper;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Retrofit client = new Retrofit
                .Builder()
                .baseUrl("http://prime.tms-studio.ru:8085")
                .addConverterFactory(JacksonConverterFactory.create(new JsonMapper()))
                .build();

        ArrService arrService = client.create(ArrService.class);
        Call<ArrayFromUrl> call = arrService.getArray();

        try {
            Response<ArrayFromUrl> response = call.execute();
            if (response.isSuccessful()) {
                ArrayFromUrl arrayFromUrl = response.body();
                int[] array = arrayFromUrl.getArray();

                int min = array[0], max = array[0];
                double average = 0;

                for (int i = 0; i < array.length; i++){
                    average += array[i];
                    if (array[i] < min)
                        min = array[i];
                    if (array[i] > max)
                        max = array[i];
                }

                System.out.println("Наибольшее число: "+max);
                System.out.println("Наименьшее число: "+min);
                System.out.println("Среднее значение: "+(average/array.length));

            } else {
                System.err.println("Ошибка при выполнении запроса: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

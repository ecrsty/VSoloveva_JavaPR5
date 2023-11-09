package task3.SolovevaVE.task2;

import com.fasterxml.jackson.databind.json.JsonMapper;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.*;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;


public class Main {

    private static void saveToFile(String text) {
        try(FileWriter writer = new FileWriter("answers/answer.txt", false))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        File dir = new File("answers");
        if(!dir.exists()){
            dir.mkdir();
        }

        int[] mas = new int[13];
        for (int i = 0; i < 13; i++)
        {
            mas[i] = new Random().nextInt(-100, 101);
        }

        String masString = Arrays.toString(mas);
//        System.out.println(masString);
        PrimeRequest primeRequest = new PrimeRequest("Соловьева Виктория", 13, masString);

        System.out.println(primeRequest.toString());

        Retrofit client = new Retrofit
                .Builder()
                .baseUrl("http://prime.tms-studio.ru:8085")
                .addConverterFactory(JacksonConverterFactory.create(new JsonMapper()))
                .build();

        ArrService arrService = client.create(ArrService.class);
        Call<BoolRequest> call = arrService.postJson(primeRequest);

        try {
            Response<BoolRequest> response = call.execute();
            if (response.isSuccessful()) {
                BoolRequest body = response.body();
                if (body.isAnswer()){
                    saveToFile("True");
                    System.out.println("Данные отправлены");
                }
                else saveToFile("False");
            } else {
                System.err.println("Ошибка при выполнении запроса: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

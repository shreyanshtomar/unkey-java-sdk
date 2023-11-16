package com.unkey;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.unkey.dtos.KeyCreateRequest;
import com.unkey.dtos.KeyCreateResponse;
import okhttp3.*;

import java.io.IOException;

import static com.unkey.constants.Constants.UNKEY_API_URL;


public class UnkeySDK {

    private String rootKey;

    public UnkeySDK(String rootKey) {
        this.rootKey = rootKey;
    }

    public static KeyCreateResponse keyCreate(KeyCreateRequest requestBody, String authToken) throws IOException {
        // Convert the request body to JSON
        Gson gson = new GsonBuilder().create();
        String jsonData = gson.toJson(requestBody);

        // Create the HTTP request
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(UNKEY_API_URL + "/keys")
                .post(RequestBody.create(MediaType.parse("application/json"), jsonData))
                .addHeader("Authorization", "Bearer " + authToken)
                .addHeader("Content-Type", "application/json")
                .build();

        // Send the HTTP request
        Response response = client.newCall(request).execute();

        // Handle the response
        if (response.isSuccessful()) {
            // Response is successful, parse the response body as KeyCreateResponse
            String responseBody = response.body().string();
            return gson.fromJson(responseBody, KeyCreateResponse.class);
        } else {
            // Handle error response
            String errorBody = response.body().string();
            throw new IOException(errorBody);
        }
    }
}
package com.github.sebyplays.jgeo.api;

import lombok.Getter;
import lombok.SneakyThrows;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class GSP {

    @Getter private JSONObject jsonObject;

    @SneakyThrows
    public GSP(String jsonUrl){

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(jsonUrl).openConnection().getInputStream()));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line);
            }
            this.jsonObject = new JSONObject(stringBuilder.toString());
            this.jsonObject.put("initial-jgeo-url", jsonUrl);
    }

}

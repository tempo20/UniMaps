/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.team29.westernmap;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author Tristan
 */
public class Weather {
    public JSONObject getWeather() throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/London%20Ontario?unitGroup=metric&include=current&key=BFG38EUDZJXUTM34H5DYBMMZC&contentType=json"))
            .method("GET", HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse response = HttpClient.newHttpClient()
            .send(request, HttpResponse.BodyHandlers.ofString());
        String rebody = response.body().toString();
        JSONObject weather = new JSONObject(rebody);
        return weather;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Weather test = new Weather();
        JSONObject weather = test.getWeather();
        String location = (String) weather.get("address");
        
        System.out.println(location);
        System.out.println(weather.get("days").getClass().getName());
        
        JSONArray days = (JSONArray) weather.get("days");
//        String[] cc = (String[]) weather.get("currentConditions");
        JSONObject days2 = (JSONObject) days.get(0);
        System.out.println(weather.get("days"));
        System.out.println(days2.get("feelslike").getClass().getName());
        
//        System.out.println(currentConditions.get("uvindex"));
    }
}

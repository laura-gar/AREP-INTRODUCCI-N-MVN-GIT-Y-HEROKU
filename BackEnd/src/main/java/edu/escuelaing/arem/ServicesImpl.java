package edu.escuelaing.arem;
import com.google.gson.JsonObject;

public class ServicesImpl {
    Services services;
    
    public ServicesImpl(){
        this.services = new Services();
    }

    public JsonObject celsiusToFahrenheit(double celsius){
        double ans = services.celsiusToFahrenheit(celsius);

        JsonObject json = new JsonObject();

        json.addProperty("status", 200);
        json.addProperty("result", ans);

        return json;
    }

    public JsonObject fahrenheitToCelsius(double fahrenheit){
        double ans = services.fahrenheitToCelsius(fahrenheit);

        JsonObject json = new JsonObject();

        json.addProperty("status", 200);
        json.addProperty("result", ans);

        return json;
    }

}

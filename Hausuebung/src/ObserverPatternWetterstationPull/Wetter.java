package ObserverPatternWetterstationPull;

public class Wetter extends Wetterstation {
    private int temperature;
    private int humidity;

    public int getTemperature(){
        return this.temperature;
    }
    public int getHumidity(){
        return this.humidity;
    }


    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    public void setHumidity(int humidity){
        this.humidity = humidity;
    }


}

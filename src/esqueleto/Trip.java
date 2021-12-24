package esqueleto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Classe que representa uma viagem.
 *
 * @author IPOO
 * @version 2021/2022
 */
public class Trip {
    private Route[] stations;
    private LocalDateTime start;
    private LocalDateTime end;
    private int numberOfZones;
    private double tripCost;
    
    public Trip(Route[] stations, LocalDateTime start, LocalDateTime end, double tripCost){
        if(!stations.equals(null)){
            this.stations = stations;
        }
        
        this.start = start;
        this.end = end;
        
        if(tripCost > 0.0){
            this.tripCost = tripCost;
        }
    }
    
    public LocalTime getTripDuration(){
        LocalTime tripTime = null;
        
        return tripTime;
    }
    
    public void showTrip(){}
}

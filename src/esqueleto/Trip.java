package esqueleto;

import java.time.Instant;
import java.time.LocalDate;
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
    private LocalDateTime startTrip;
    private LocalDateTime endTrip;
    private int numberOfZones;
    private double tripCost;
    
    public Trip(Route[] stations, LocalDate startTrip, LocalTime startHour, LocalDate endTrip, LocalTime endHour, double tripCost){
        if(!stations.equals(null)){
            this.stations = stations;
        }
        this.startTrip = LocalDateTime.of(startTrip, startHour);
        this.endTrip = LocalDateTime.of(endTrip, endHour);
        
        if(tripCost > 0.0){
            this.tripCost = tripCost;
        }
    }
    
    public long getTripDuration(){
        long tripTime = ChronoUnit.HOURS.between(startTrip, endTrip);
        return tripTime;
    }
    
    public void showTrip(){
        for(int i = 0;i<stations.length;i++){
            stations[i].routeInfo();
            stations[i].numberOfZones();
        }
        getTripDuration();
    }
}

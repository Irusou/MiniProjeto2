package esqueleto;

//import java.time.Instant;
import java.time.LocalDateTime;
//import java.time.ZoneId;
//import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Classe que representa uma viagem.
 *
 * @author IPOO
 * @version 2021/2022
 */
public class Trip {
    private SubwayLine[] line;
    private LocalDateTime startTrip;
    private LocalDateTime endTrip;
    private int numberOfZones;
    private double tripCost;
    
    
    /**
     * Construtor de uma viagem
     * 
     * @param line array com as rotas
     * @param startTrip data e hora do inicio da viagem
     * @param endTrip data e hora do fim da viagem
     * @param tripCost preco da viagem
     */
    public Trip(SubwayLine[] line, LocalDateTime startTrip, LocalDateTime endTrip, double tripCost){
        if(!line.equals(null)){
            for(int i = 0;i<this.line.length;i++){
                this.line = line;
            }
        }
        this.startTrip = startTrip;
        this.endTrip = endTrip;
        
        if(tripCost > 0.0){
            this.tripCost = tripCost;
        }
    }
    
    /**
     * Duracao da viagem
     * 
     * @return tripTime duracao de uma viagem
     */
    public long getTripDuration(){
        long tripTime = ChronoUnit.HOURS.between(startTrip, endTrip);
        return tripTime;
    }
    
    /**
     * info da viagem
     */
    public void showTrip(){
        for(int i = 0;i<line.length;i++){
            line[i].getStationInPosition(i).toString();
        }
        getTripDuration();
    }
}

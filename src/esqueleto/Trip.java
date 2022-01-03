package esqueleto;

import java.time.LocalDateTime;
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
        long tripTime = ChronoUnit.HOURS.between(getStartTrip(), getEndTrip());
        return tripTime;
    }

    /**
     * @return the line
     */
    public SubwayLine[] getLine() {
        return line;
    }

    /**
     * @return the startTrip
     */
    public LocalDateTime getStartTrip() {
        return startTrip;
    }

    /**
     * @return the endTrip
     */
    public LocalDateTime getEndTrip() {
        return endTrip;
    }

    /**
     * @return the numberOfZones
     */
    public int getNumberOfZones() {
        return numberOfZones;
    }

    /**
     * @return the tripCost
     */
    public double getTripCost() {
        return tripCost;
    }

    /**
     * info da viagem
     */
    public void showTrip(){
        for(int i = 0;i<getLine().length;i++){
            getLine()[i].getStationInPosition(i).toString();
        }
        getTripCost();
        getTripDuration();
    }
}

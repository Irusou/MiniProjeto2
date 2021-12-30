package esqueleto;

/**
 * Classe que representa um percurso efetuado por um passageiro, desde a estação
 * de origem à estação de destino.
 *
 * @author IPOO
 * @version 2021/2022
 */
public class Route {
    private Station[] stations;
    private int numberOfStations = 0;
    
    public Route(Station[] station){
        this.stations = new Station[6];
            stations = station; 
	}    
    
    public int numberOfZones(){
        int numberOfZones = 0;
            for(int i = 0;i<stations.length;i++){
                numberOfZones++;
            }
        return numberOfZones;
    }
    
    public Station originalStation(String station){
        for(int i = 0;i<stations.length;i++){
            if(stations[i].getName().equals(station)){
                return stations[i];
            }
        }
        return null;
    }
    
    public Station destinationStation(String station){
        for(int i = stations.length - 1; i>=0; i--){
            if(stations[i].getName().equals(station)){
                return stations[i];
            }
        }
        return null;
    }
    
    public String routeInfo(){
        for(int i = 0; i<stations.length;i++){
            if(stations[i].getName().equals("Senhora de Matosinhos")||
                    stations[i].getName().equals("Povoa de Varzim")||
                    stations[i].getName().equals("ISMAI")||
                    stations[i].getName().equals("Hospital Sao Joao")||
                    stations[i].getName().equals("Aeroporto")||
                    stations[i].getName().equals("Senhora da Hora")){
                return "Inicio: "+stations[i].toString();
            }else if(stations[i].getName().equals("Estadio do Dragao")||
                    stations[i].getName().equals("Campanha")||
                    stations[i].getName().equals("Santo Ovidio")||
                    stations[i].getName().equals("Trindade")||
                    stations[i].getName().equals("Fanzeres")){
                return "Chegada: "+stations[i].toString();
            }else{
                return stations[i].toString();
            }  
        }
        return null;
    }
}
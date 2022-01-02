package esqueleto;

/**
 * Classe que representa um percurso efetuado por um passageiro, desde a estação
 * de origem à estação de destino.
 *
 * @author IPOO
 * @version 2021/2022
 */
public class Route {
    private SubwayLine[] stations;
    private int numberOfStations = 0;
    
    /**
     * Construtor percurso
     * 
     * @param station array de linhas com estacoes
     */
    public Route(SubwayLine[] station){
        //this.stations = new Station[6];
        stations = station; 
    }    
    
    /**
     * Numero de zonas
     * 
     * @return numberOfZones numero de zonas percorridas
     */
    public int numberOfZones(){
        int numberOfZones = 0;
            for(int i = 0;i<stations.length;i++){
                numberOfZones++;
            }
        return numberOfZones;
    }
    
    /**
     * Estacao de origem
     * 
     * @param station recebe uma linha
     * @return stations[i] estacao de origem no array da linha
     */
    public SubwayLine originalStation(String station){
        for(int i = 0; i < stations.length;i++){
            if(stations[i].haveStation(station)){
                return stations[i];
            }
        }
        return null;
    }

    /**
     * Estacao de destino
     * 
     * @param station recebe uma linha
     * @return stations[i] estacao de destino no array da linha
     */
    public SubwayLine destinationStation(String station){
        for(int i = stations.length - 1; i>=0; i--){
            if(stations[i].haveStation(station)){
                return stations[i];
            }
        }
        return null;
    }
    
    /**
     * Info do percurso
     * 
     * @return info relativa ao percurso
     */
    public String routeInfo(){
        for(int i = 0; i<stations.length;i++){
            return stations[i].getStationInPosition(i).toString();
        }
        return null;
    }
}
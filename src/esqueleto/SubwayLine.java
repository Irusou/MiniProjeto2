package esqueleto;

/**
 * Classe que representa uma linha de metro.
 *
 * @author IPOO
 * @version 2021/2022
 */
public class SubwayLine {

    private char code;
    private String color;
    private int subwayLine;

    private Station[] stations = {new Station("Povoa de Varzim",Zone.PVVC1,false),
                                  new Station("Vila do Conde",Zone.PVVC1,false),
                                  new Station("Azurara",Zone.VCD1,false),
                                  new Station("Vilar do Pinheiro",Zone.VCD2,false),
                                  new Station("Custoias",Zone.MAI2,true),
                                  new Station("Fonte do Cuco",Zone.MAI2,true),
                                  new Station("Senhora da Hora",Zone.PRT2,true),
                                  new Station("Ramalde",Zone.PRT2,true),
                                  new Station("Casa da Musica",Zone.PRT1,true),
                                  new Station("Trindade",Zone.PRT1,true),
                                  new Station("Campanha",Zone.PRT1,true),
                                  new Station("Estadio do Dragao",Zone.PRT1,true),
                                  new Station("Nasoni",Zone.PRT3,false),
                                  new Station("Rio Tinto",Zone.MAI3,false),
                                  new Station("Fanzeres",Zone.GDM1,false),
                                  new Station("Aeroporto",Zone.VCD2,false),
                                  new Station("Senhora de Matosinhos",Zone.MTS1,false),
                                  new Station("Matosinhos Sul",Zone.MTS1,false),
                                  new Station("ISMAI",Zone.MAI1,false),
                                  new Station("Parque Maia",Zone.MAI2,false),
                                  new Station("Hospital Sao Joao",Zone.PRT3,false),
                                  new Station("Polo Universitario",Zone.PRT3,false),
                                  new Station("Marques",Zone.PRT1,false),
                                  new Station("Sao Bento",Zone.PRT1,false),
                                  new Station("General Torres",Zone.VNG1,false),
                                  new Station("Santo Ovidio",Zone.VNG1,false)};

    /**
     * Construtor da classe SubwayLine. Recebe o código, a cor de designação da
     * linha e o conjunto de estações que fazem parte da mesma.
     *
     * @param code - código identificativo da linha
     * @param color - cor representante da linha
     * @param stations - estações que compõem a linha
     */
    public SubwayLine(char code, String color, Station stations) {
        switch(code){
            case 'A' : this.code = code;break;
            case 'B' : this.code = code;break;
            case 'C' : this.code = code;break;
            case 'D' : this.code = code;break;
            case 'E' : this.code = code;break;
            case 'F' : this.code = code;break;
        }
        
        switch(color){
            case "Azul" : this.color = color;break;
            case "Vermelha" : this.color = color;break;
            case "Verde" : this.color = color;break;
            case "Amarela" : this.color = color;break;
            case "Roxa" : this.color = color;break;
            case "Laranja" : this.color = color;break;
        }
        subwayLine = 0;
        
        if(subwayLine < this.stations.length){
            this.stations[subwayLine++] = stations;   
        }
    }
    
    
    
    
    /**
     * Verifica se determinada estação pertence a esta linha.
     *
     * @param stationName - nome da estação a verificar
     * @return o sucesso da operação. true caso pertença, false caso contrário.
     *
     */
    public boolean haveStation(String stationName) {
        for(int i = 0; i < stations.length; i++){
            if(stations[i].getName().equals(stationName)){
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica se duas estações pertencem a esta linha.
     *
     * @param firstStation - nome da primeira estação a verificar
     * @param secondStation - nome da segunda estação a verificar
     * @return o sucesso da operação. true caso pertençam, false caso contrário
     */
    public boolean haveTwoStations(String firstStation, String secondStation) {
        for(int i = 0; i < stations.length; i++){
            if(stations[i].getName().equals(firstStation) && stations[i].getName().equals(secondStation)){
                return true;
            }
        }
        return false;
    }

    /**
     * Determina, caso exista, em que posição se encontra determinada estação
     * nesta linha.
     *
     * @param stationName - nome da estação a determinar posição
     * @return a posição em que a estação se encontra
     */
    public int stationPositionInLine(String stationName) {
        int index = 0;
            for(int i = 0; i < stations.length; i++){
                if(stations[i].getName().equals(stationName)){
                    index = i;
                }
            }
        return index;
    }

    /**
     * Devolve uma estação existente nesta linha, a partir do seu nome.
     *
     * @param stationName - nome da estação
     * @return estação, caso exista
     */
    public Station getStationInLine(String stationName) {
            for(int i = 0; i < stations.length; i++){
                if(stations[i].getName().equals(stationName)){
                    return stations[i];
                }
            }
            return null;
    }

    public char getCode() {
        return code;
    }

    public void setCode(char code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Station[] getStations() {
        for(int i = 0; i < stations.length; i++ ){
            return stations;
        }
        return null;
    }

    public Station getStationInPosition(int position) {
            for(int i = 0; i < stations.length; i++){
                if(i == position){
                    return stations[i];
                }
            }
        return null;
    }

    @Override
    public String toString() {
        return "Codigo: "+getCode()+" Cor: "+getColor();
    }
}

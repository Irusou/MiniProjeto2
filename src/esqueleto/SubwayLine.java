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
    private Station[] line;

    /**
     * Construtor da classe SubwayLine. Recebe o código, a cor de designação da
     * linha e o conjunto de estações que fazem parte da mesma.
     *
     * @param code - código identificativo da linha
     * @param color - cor representante da linha
     * @param stations - estações que compõem a linha
     */
    public SubwayLine(char code, String color, Station[] line) {
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
        
        this.line = line;
    }
    
    
    
    
    /**
     * Verifica se determinada estação pertence a esta linha.
     *
     * @param stationName - nome da estação a verificar
     * @return o sucesso da operação. true caso pertença, false caso contrário.
     *
     */
    public boolean haveStation(String stationName){
        boolean haveStation = false;
        for(int i = 0; i < line.length; i++){
            if(line[i].getName().equals(stationName)){
                haveStation = true;
            }
        }
        return haveStation;
    }

    /**
     * Verifica se duas estações pertencem a esta linha.
     *
     * @param firstStation - nome da primeira estação a verificar
     * @param secondStation - nome da segunda estação a verificar
     * @return o sucesso da operação. true caso pertençam, false caso contrário
     */
    public boolean haveTwoStations(String firstStation, String secondStation){
        boolean haveStations = false;
        for(int i = 0; i < line.length; i++){
            if(line[i].getName().equals(firstStation)){
                if(line[i].getName().equals(secondStation)){
                    haveStations = true;
                    break;
                }
            }
        }
        return haveStations;
    }

    /**
     * Determina, caso exista, em que posição se encontra determinada estação
     * nesta linha.
     *
     * @param stationName - nome da estação a determinar posição
     * @return a posição em que a estação se encontra
     */
    public int stationPositionInLine(String stationName) {
        int index = -1;
            for(int i = 0; i < line.length; i++){
                if(line[i].getName().equals(stationName)){
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
            for(int i = 0; i < line.length; i++){
                if(line[i].getName().equals(stationName)){
                    return line[i];
                }
            }
            return null;
    }

    /**
     * Devolve uma estação existente nesta linha, a partir da sua posiicao.
     *
     * @param position - posicao da estacao
     * @return station estação, caso exista
     */
    public Station getStationInPosition(int position) {
        Station station = null;
            for(int i = 0; i < line.length; i++){
                if(i == position){
                    station = line[i];
                }
            }
        return station;
    }

    /**
     * Mostra se existe uma estacao numa posicao.
     *
     * @param position - posicao da estacao
     * @return hasStation devolve true caso exista, false caso contrario
     */    
    public boolean hasStationInPosition(int position) {
        boolean hasStation = false;
            for(int i = 0; i < line.length; i++){
                if(i == position){
                    hasStation = true;
                }
            }
        return hasStation;
    }

    // GETs & SETs
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

    @Override
    public String toString() {
        return "Codigo: "+getCode()+" Cor: "+getColor();
    }
}
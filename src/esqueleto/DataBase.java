package esqueleto;

/**
 * Classe responsável pelo armazenamento e manipulação de dados da aplicação.
 *
 * @author IPOO
 * @version 2021/2022
 */
public class DataBase {

    // array que contém as linhas de metro
    private SubwayLine[] subwayLines;
    // array que contém os preços por zonas
    private Data[] prices;
    // array que contém os passageiros registados na aplicação
    private Passenger[] passengers;
    
    private int numberOfPassengers;
    
    private static final int MAX_PASSENGERS = 5; //5
    /**
     * Construtor da classe DataBase. Deverá inicializar os arrays responsáveis
     * por armazenar os dados da aplicação.
     */
    public DataBase() {
        passengers = new Passenger[MAX_PASSENGERS];
        numberOfPassengers = 0;
        
    }

    public int getMaxPassengers(){
        return MAX_PASSENGERS;
    }
    
    public int getNumberOfPassengers(){
        return numberOfPassengers;
    }
    
    /**
     * Adiciona um novo passageiro ao array. Não poderá existir passageiros com
     * NIFs iguais.
     *
     * @param passenger - passageiro a adicionar ao array
     * @return o sucesso da operação. True caso sucesso, false caso contrário.
     */
    public boolean addPassenger(Passenger passenger) {
        boolean added = false;
	if(numberOfPassengers<passengers.length){
            passengers[numberOfPassengers++] = passenger;
            added = true;
	}
	return added;

    }

    /**
     * Elimina um passageiro do array de passageiros. Todas as posições do array
     * deverão ser ajustadas, de forma a não haver elementos vazios entre os
     * passageiros existentes no array,
     *
     * @param passenger - o passageiro a eliminar
     * @return o sucesso da operação. True caso sucesso, false caso contrário.
     */
    public boolean deletePassenger(String nif) {
        for(int i = 0; i<numberOfPassengers;i++){
            if(passengers[i].getNif().equals(nif)){
                passengers[i]=null;
                return true;
            }
        }
        return false;
    }

    /**
     * valida a existencia de um passageiro com um NIF igual.
     *
     * @param nif - NIF a validar
     * @return true caso exista, false caso contrário
     */
    public boolean existPassenger(String nif) {
        for(int i = 0; i<numberOfPassengers;i++){
            if(passengers[i].getNif().equals(nif)){
                return true;
            }
        }
        return false;
    }
    
    public Passenger getPassenger(String nif){
        Passenger passenger = null;
        for(int i = 0; i<numberOfPassengers; i++){
            if(passengers[i].getNif().equals(nif)){
                passenger = passengers[i];
            }
        }
         return passenger;   
    }

    /**
     * indica a posição em que um passageiro ocupa no array
     *
     * @param nif - NIF do passageiro
     * @return posicao no array. -1 caso não exista.
     */
    public int getPositionOfPassenger(String nif) {
        int index = 0;
            for(int i = 0; i<numberOfPassengers;i++){
                if(passengers[i].getNif().equals(nif)){
                    index = i;
                }
            }
        return index;
    }

    /**
     * Retorna o preço correspondente ao nº de zonas percorridas.
     *
     * @param zone - numero de zonas percorridas
     * @return preço correspondente, -1 caso não exista
     */
    public double getPriceOfZone(int zone) {
        
        return -1;
    }

    /**
     * Duplica array caso este esteja cheio. O tamanho do array deverá ser o
     * dobro do tamanho atual. Deverá passar todos os elementos existentes no
     * array para o novo array criado.
     */
    public void increasePassengers() {
        if(isFull()){
            Passenger[] newPassengers = new Passenger[2*MAX_PASSENGERS];
            for(int i = 0; i<passengers.length;i++){
                newPassengers[i]=passengers[i];
            }
        }
    }

    /**
     * Verifica se o array de passageiros esta cheio
     * @return isFull true se estiver cheio, false caso contrario.
     */
    public boolean isFull(){
        boolean isFull = false;
            for(int i = 0; i<numberOfPassengers;i++){
                if(!passengers[i].equals(null)){
                    isFull = true;
                }
            }
        return isFull;
    }
    
    /**
     * Retorna um passageiro registado na aplicação, pelo seu NIF.
     *
     * @param nif - NIF do passageiro
     * @return passageiro caso exista
     */
    public Passenger getPassengerByNIF(String nif) {
        for(int i = 0; i<numberOfPassengers; i++){
            if(passengers[i].getNif().equals(nif)){
                return passengers[i];
            }
        }
        return null;
    }

    /**
     * Retorna a linha de metro onde exista determinada estação.
     *
     * @param station - estação a procurar
     * @return a linha, caso exista
     */
    public SubwayLine lineWithStation(String station) {
        
        return null;
    }

    /**
     * Retorna a linha de metro onde exista duas estações específicas.
     *
     * @param origin - estação de origem a procurar
     * @param destination - estação de destino a procurar
     * @return a linha, caso exista
     */
    public SubwayLine lineWithBothStations(String origin, String destination) {
       
        return null;
    }

}

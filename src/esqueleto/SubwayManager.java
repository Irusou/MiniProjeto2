package esqueleto;

import java.time.LocalDateTime;

/**
 * Classe responsável pelo funcionamento da aplicação. Centraliza a informação e
 * interação com o utilizador.
 *
 * @author IPOO
 * @version 2021/2022
 */
public class SubwayManager {

    private DataBase db;
    private Menu menu;

    /**
     * Construtor da classe SubwayManager. Inicializa a base de dados com
     * informação da aplicação e o menu de interação com o utilizador.
     */
    public SubwayManager() {
        this.db = new DataBase();
        this.menu = new Menu(this);

        //iniciar menu
    }

    /**
     * Cria um passageiro na base de dados.
     *
     * @param name - nome do passageiro
     * @param nif - nif do passageiro
     * @param birthdate - data de nascimento do passageiro
     */
    public boolean createPassenger(String name, String nif, String birthdate) {
        return false;
    }

    /**
     * Elimina um passageiro existente na base de dados, caso exista
     *
     * @param nif - nif do passageiro
     * @return o sucesso da operação. True caso sucesso, false caso contrário.
     */
    public boolean deletePassenger(String nif) {
        return false;
    }

    /**
     * Apresenta informação de um passageiro existente.
     *
     * @param nif - nif do passageiro
     */
    public void showPassenger(String nif) {
        
    }

    /**
     * Marca um passageiro com estatuto de estudante.
     *
     * @param nif - nif do passageiro
     * @return o sucesso da operação. True caso sucesso, false caso contrário.
     */
    public boolean addStudentStatus(String nif) {

        return false;
    }

    /**
     * Traça um percurso que permite determinar todas as estações percorridas,
     * da estação de inicio á estação de destino. Deverá considerar as situações
     * de a estação de origem e de destino encontrarem-se na mesma linha, ou em
     * linhas diferentes.Neste caso, deverá considerar a mudança entre linhas.
     *
     * @param origin - estação de origem
     * @param destination - estação de destino
     * @return rota criada com base nas estações de origem e de destino
     */
    public Route traceRoute(String origin, String destination) {

        return null;
    }

    /**
     * Permite efetuar uma viagem. A viagem é efetuada com base na estação de
     * origem e destino, recebe também a hora e data de inicio e de fim. esta
     * viagem ficará associada a um passageiro. Após a viagem, o histórico da
     * mesma deverá ser associada ao passageiro, bem como o custo asssociado
     * debitado do seu cartão de viagem.
     *
     * @param origin - nome da estação de origem
     * @param destination - nome da estação de destino
     * @param initialTime - data e hora do início da viagem
     * @param finalTime - data e hora do final da viagem
     * @param nif - NIF do passageiro
     * @return a viagem realizada
     */
    public Trip makeTrip(String origin, String destination, LocalDateTime initialTime, LocalDateTime finalTime, String nif) {

        return null;
    }

    /**
     * Apresenta o histórico de viagens de um determinado passageiro.
     *
     * @param nif - NIF do passageiro
     */
    public void showTripHistory(String nif) {
  
    }

    /**
     * Método auxiliar que concatena dois arrays de estações num array único.
     *
     * @param st1 -primeiro array de estações
     * @param st2 - segundo array de estações
     * @return array resultante da concatenação dos dois arrays recebidos
     */
    private Station[] concatStations(Station[] st1, Station[] st2) {

        return null;
    }

    /**
     * Obtém uma estação em determinada linha que contém ligação com a outra
     * estação de destino.
     *
     * @param originLine - linha de origem onde deverá existir uma estação de
     * ligação
     * @param destination - estação de destino
     * @return estação de correspondência, que efetua a ligação entre a linha de
     * origem e a estação de destino
     */
    private Station getStationLinkedToDestination(SubwayLine originLine, String destination) {

        return null;
    }

    /**
     * Traça um percurso entre a estação de origem e a estação de destino
     *
     * @param originPosition - estação onde inicia o percurso
     * @param destinationPosition - estação onde finaliza o percurso
     * @param line - linha onde o percurso deverá ser efetuado
     * @return array de estações com todas as estações percorridas, da estação
     * de origem à estação de destino
     */
    private Station[] createRoute(int originPosition, int destinationPosition, SubwayLine line) {

        return null;
    }

}

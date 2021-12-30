package esqueleto;


/**
 * Classe que representa uma estação
 *
 * @author IPOO
 * @version 2021/2022
 */
public class Station {

    private String name;
    private Zone zone;
    private boolean correspondence;

    /**
     * Construtor da classe Station. Recebe o nome e a zona metropolitana a que
     * pertence.
     *
     * @param name
     * @param zone
     */
    public Station(String name, Zone zone) {
        this.name = name;
        this.zone = zone;
    }

    /**
     * Construtor da classe Station. Recebe o nome, a zona metropolitana a que
     * pertence e se a estação tem correspondência com mais de uma linha de
     * metro.
     *
     * @param name
     * @param zone
     * @param correspondence
     */
    public Station(String name, Zone zone, boolean correspondence) {
        this(name, zone);
        this.correspondence = correspondence;
    }

    // GETs & SETs
    public String getName() {
        return name;
    }

    public Zone getZone() {
        return zone;
    }

    public boolean doCorrespondence() {
        return correspondence;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", " + zone;
    }

}

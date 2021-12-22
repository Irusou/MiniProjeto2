package esqueleto;

/**
 * Classe que representa um percurso efetuado por um passageiro, desde a estação
 * de origem à estação de destino.
 *
 * @author IPOO
 * @version 2021/2022
 */
public class Route {
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
    
    public Route(Station[] stations){
        if(!stations.equals(null)){
            this.stations = stations;
        }
    }
    
    public int numberOfZones(){
        int numberOfZones = 0;
            for(int i = 0;i<stations.length;i++){
                numberOfZones += i;
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
}

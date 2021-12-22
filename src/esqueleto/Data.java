package esqueleto;

/**
 * Classe que fornece um conjunto de dados da aplicação.
 *
 * @author IPOO
 * @version 2021/2022
 */
public class Data {

    private static Station st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12,
            st13, st14, st15, st16, st17, st18, st19, st20, st21, st22, st23, st24,
            st25, st26;

    /**
     * Inicializa todas as estações
     */
    private static void initializeStations() {

        // AZUL
        st1 = new Station("Senhor de Matosinhos", Zone.MTS1);
        st2 = new Station("Matosinhos Sul", Zone.MTS1);
        st3 = new Station("Senhora da Hora", Zone.PRT2, true);
        st4 = new Station("Ramalde", Zone.PRT2, true);
        st5 = new Station("Casa da Musica", Zone.PRT1, true);
        st6 = new Station("Trindade", Zone.PRT1, true);
        st7 = new Station("Campanha", Zone.PRT1, true);
        st8 = new Station("Estádio do Dragao", Zone.PRT1, true);

        // VERMELHA
        st9 = new Station("Povoa de Varzim", Zone.PVVC1);
        st10 = new Station("Vila do Conde", Zone.PVVC1);
        st11 = new Station("Azurara", Zone.VCD1);
        st12 = new Station("Vilar de Pinheiro", Zone.VCD2);
        st13 = new Station("Fonte do Cuco", Zone.MAI2, true);
        //st3 - Senhora da Hora - igual azul
        //st4 - Ramalde - igual azul
        //st5 - Casa da Música - igual azul
        //st6 - Trindade - igual azul
        //st7 - Campanhã - igual azul
        //st8 - Estádio do Dragão - igual azul

        // VERDE
        st14 = new Station("ISMAI", Zone.MAI1);
        st15 = new Station("Parque Maia", Zone.MAI2);
        //st13 - Fonte do Cuco
        //st3 - Senhora da Hora
        //st4 - Ramalde
        //st6 - Trindade
        //st7 - Campanhã

        // AMARELA
        st16 = new Station("Hospital Sao Joao", Zone.PRT3);
        st17 = new Station("Polo Universitario", Zone.PRT3);
        st18 = new Station("Marques", Zone.PRT1);
        //st6- Trindade
        st19 = new Station("Sao Bento", Zone.PRT1);
        st20 = new Station("General Torres", Zone.VNG1);
        st21 = new Station("Santo Ovidio", Zone.VNG1);

        // ROXA
        st22 = new Station("Aeroporto", Zone.VCD2);
        st23 = new Station("Custoias", Zone.MAI2);
        //st13 - Fonte do Cuco
        //st3 - Senhora da Hora
        //st4 - Ramalde
        //st5 - Casa da Música
        //st6 - Trindade

        //LARANJA
        //st3 - Senhora da Hora
        //st4 - Ramalde
        //st5 - Casa da Música
        //st6 - Trindade
        //st7 - Campanhã
        //st8 - Estádio do Dragão
        st24 = new Station("Nasoni", Zone.PRT3);
        st25 = new Station("Rio Tinto", Zone.MAI3);
        st26 = new Station("Fanzeres", Zone.GDM1);
    }

    /**
     * Permite obter as linhas de metro com respetivas estações.
     *
     * @return um array de linhas de metro
     */
    public static SubwayLine[] getLines() {
        initializeStations(); //Initialize Stations values

        SubwayLine[] lines = new SubwayLine[6];

        // TERMINAR ARRAYS ESTACOES
        Station[] stations1 = {st1, st2, st3, st4, st5, st6, st7, st8};
        lines[0] = new SubwayLine('A', "Azul", stations1);

        Station[] stations2 = {st9, st10, st11, st12, st13, st3, st4, st5, st6, st7, st8};
        lines[1] = new SubwayLine('B', "Vermelha", stations2);

        Station[] stations3 = {st14, st15, st13, st3, st4, st6, st7};
        lines[2] = new SubwayLine('C', "Verde", stations3);

        Station[] stations4 = {st16, st17, st18, st6, st19, st20, st21};
        lines[3] = new SubwayLine('D', "Amarela", stations4);

        Station[] stations5 = {st22, st23, st13, st3, st4, st5, st6};
        lines[4] = new SubwayLine('E', "Roxa", stations5);

        Station[] stations6 = {st3, st4, st5, st6, st7, st8, st24, st25, st26};
        lines[5] = new SubwayLine('F', "Laranja", stations6);

        return lines;
    }

    /**
     * Permite obter os preços por zona.
     *
     * @return um array com os preços por zona
     */
    public static double[] getPrices() {
        double[] prices = {0.80, 1.20, 1.60, 2.00, 2.40, 2.80, 3.20, 3.60, 4.00, 4.40};
        return prices;
    }
}

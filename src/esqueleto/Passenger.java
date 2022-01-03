package esqueleto;

import java.time.LocalDate;
import java.util.regex.Pattern;

/**
 * Classe que representa um passageiro de metro
 *
 * @author IPOO
 * @version 2021/2022
 */
public class Passenger {

    private String name;
    private static String nif;
    private String birthDate;
    private Trip[] tripsLog;
    private int tripNumber;
    private boolean student;
    private static final int NUMBER_OF_TRIPS = 10;
    private static final double CHILD_DISCOUNT = 0.9;
    private static final double YONG_DISCOUNT = 0.18;
    private static final double STUDENT_DISCOUNT = 0.36;
    private static final double SENIOR_DISCOUNT = 0.55;

    /**
     * Construtor da classe Passenger. Inicializa também o histórico de viagens,
     * limitado a dez elementos.
     *
     * @param name - nome do passageiro
     * @param nif - NIF do passageiro
     * @param birthDate - data de nascimento do passageiro, no formato
     * AAAA-MM-DD
     */
    public Passenger(String name, String nif, String birthDate) {
        if(name != null){
            this.name = name;
        }
        if(nif != null && nif.length()==9){
            this.nif = nif;
        }
        Pattern p = null;
        if(birthDate.matches("\\d{4}-\\d{2}-\\d{2}")){
            p = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        }
        if(p.matcher(birthDate).matches()){
            this.birthDate = birthDate;
        }
        student = false;
        tripsLog = new Trip[NUMBER_OF_TRIPS];
        tripNumber = 0;
    }

    /**
     * Adiciona uma viagem ao histórico de viagens do passageiro. A viagem
     * deverá ser adicionada na primeira posição do respetivo array, limitado a
     * dez elementos. As mais antigas serão eliminadas.
     *
     * @param trip - viagem efetuada
     */
    public void addTripLog(Trip trip) {
        if(tripNumber < NUMBER_OF_TRIPS){
            tripsLog[tripNumber++] = trip;
        }//As mais antigas serão eliminadas.
    }

    /**
     * Apresenta o histórico das viagens efetuadas.
     */
    public void showTripLog(){
        for(int i = 0;i < tripNumber;i++){
            tripsLog[i].showTrip();
        }
    }

    /**
     * Calcula o desconto do passageiro mediante a sua idade ou condição.
     *
     * @return discount o valor de desconto
     */
    public int getDiscount() {
        int discount = 0;
        if(getAge()<10){
            discount = (int)(CHILD_DISCOUNT * 100);
        }else if(!isStudent() && (getAge()>=10 || getAge()<=25)){
            discount = (int)(YONG_DISCOUNT * 100);
        }else if(isStudent() && (getAge()>10 || getAge()<=30)){
            discount = (int)(STUDENT_DISCOUNT * 100);
        }else{
            discount = (int)(SENIOR_DISCOUNT * 100);
        }
        return discount;
    }

    /**
     * Marca o passageiro como estudante, caso ainda não tenha sido assinalado e
     * esteja comprendido no intervalo de idades para o efeito.
     *
     * @return o sucesso da operação. true caso sucesso, false caso contrário.
     */
    public boolean markAsStudent() {
        if(!student && (getAge()>10 || getAge()<=30)){
            student = true;
            return true;
        }
        return false;
    }

    /**
     * Calcula a idade a partir da data de nascimento
     *
     * @return age valor da idade
     */
    public int getAge() {
        int age = 0;
        LocalDate date = LocalDate.parse(birthDate);
        LocalDate today = LocalDate.now();
        age = today.getYear() - date.getYear();
        return age;
    }

    /**
     * Apresenta a informação do passageiro.
     */
    public void showInfo() {
        System.out.println("Nome: "+getName()+", "+getAge());
        System.out.println("Nif: "+getNif());
        System.out.println("Desconto: "+getDiscount()+"%");
        System.out.println("Estudante? "+studentToString());
    }

    // GETs & SETs
    public String getName() {
        return name;
    }

    public String getNif() {
        return nif;
    }

    public Trip[] getTripsLog() {
        return tripsLog;
    }

    public boolean isStudent() {
        return student;
    }
    
    /**
     * 
     * @return str mostra se e aluno ou nao
     */
    public String studentToString(){
        String str = "";
        if(student){
            str = "Sim";
        }else{
            str = "Nao";
        }
        return str;
    }
}

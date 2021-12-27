package esqueleto;

import java.util.regex.Pattern;


/**
 * Classe que representa o menu da aplicação. Responsável por toda a interação
 * com o utilizador.
 *
 * @author IPOO
 * @version 2021/2022
 */
public class Menu {

    private final InputReader reader;
    private final SubwayManager manager;

    /**
     * Construtor da classe Menu
     *
     * @param manager - gestor da aplicação, responsável pela parte funcional
     */
    public Menu(SubwayManager manager) {
        this.reader = new InputReader();
        this.manager = manager;
    }

    /**
     * Apresenta o menu principal da aplicação e a respetiva interação.
     */
    public void mainMenu() {
        int option;
        do {
            System.out.println("\n\tMENU PRINCIPAL");
            System.out.println("1. Gestão de Passageiros"); // DONE
            System.out.println("2. Gestão de Viagens");
            System.out.println("0. Sair");
            System.out.println("Escolha a sua opção:");

            option = readOption(0, 2);

            switch (option) {
                case 1:
                    displaySubMenuPassenger();
                    break;
                case 2:
                    displaySubMenuTrip();
                    break;
            }
        } while (option != 0);
    }

    /**
     * Apresenta o submenu de gestão de passageiros e a respetiva interação com
     * o utilizador.
     */
    private void displaySubMenuPassenger() {
        int option;
        do {
            System.out.println("\n\tMENU GESTAO DE PASSAGEIROS");
            System.out.println("1. Criar");// DONE
            System.out.println("2. Eliminar");// DONE
            System.out.println("3. Mostrar"); // DONE
            System.out.println("4. Associar estatuto de estudante"); // DONE
            System.out.println("0. Regressar ao Menu Anterior");
            System.out.println("Escolha a sua opção:");
            option = readOption(0, 4);

            switch (option) {
                case 1:
                    String nif = getNif();
                    String name = getName();
                    String birthDate = getBirthDate();
                    if (manager.createPassenger(name, nif, birthDate)) {
                        System.out.println("Passageiro criado com sucesso!");
                    }
                    break;
                case 2:
                    nif = getNif();
                    if (manager.deletePassenger(nif)) {
                        System.out.println("Passageiro eliminado com sucesso!");
                    }
                    break;
                case 3:
                    nif = getNif();
                    manager.showPassenger(nif);
                    break;
                case 4:
                    nif = getNif();
                    if (manager.addStudentStatus(nif)) {
                        System.out.println("Registado com sucesso!");
                    } else {
                        System.out.println("Ocorreu um erro no registo!");
                    }
                    break;
            }
        } while (option != 0);
    }

    /**
     * Apresenta o submenu de gestão de viagens e a respetiva interação com o
     * utilizador.
     */
    private void displaySubMenuTrip() {

    }

    /**
     * Apresenta o menu respetivo à funcionalidade de efetuar uma viagem.
     *
     * @param nif - NIF do passageiro
     */
    private void displayTripMenu(String nif) {
   
    }

    /**
     * Solicita ao utilizador a inserção de um NIF válido
     *
     * @return NIF introduzido
     */
    private String getNif() {
        boolean valid = false;
        String nif = "";
        do {
            System.out.println("Introduza o NIF do passageiro:");
            nif = reader.getText("NIF");
            valid = validNif(nif);
        } while (!valid);
        return nif;
    }

    /**
     * Solicita ao utilizador a inserção de um nome de passageiro
     *
     * @return nome introduzido
     */
    private String getName() {
        boolean valid = false;
        String name = "";
        do {
            System.out.println("Introduza o nome do passageiro:");
            name = reader.getText("Nome");
            valid = isValidString(name);
        } while (!valid);
        return name;
    }

    /**
     * Solicita ao utilizador a inserção de uma data de nascimento no formato
     * "AAAA-MM-DD".
     *
     * @return data de nascimento inserida
     */
    private String getBirthDate() {
        boolean valid = false;
        String birthDate = "";
        do {
            System.out.println("Introduza uma data de aniversário ao passageiro:");
            birthDate = reader.getText("Data de aniversário");
            valid = validBirthDate(birthDate);
        } while (!valid);
        return birthDate ;
       
    }

    /**
     * Responsável pela leitura de uma opção introduzida
     *
     * @param minor
     * @param major
     * @return
     */
    private int readOption(int minor, int major) {
        int option;
        do {
            option = reader.getIntegerNumber("opção");
            if (option < minor || option > major) {
                System.out.println(" Escolha uma opção correta (" + minor + " a " + major + ")");
            }
        } while (option < minor || option > major);
        return option;
    }

    /**
     * Recebe uma String e valida se é composta por digitos.
     *
     * @param text - Texto a validar
     * @return true se for digitos, false caso pelo menos um dos caracteres não
     * seja
     */
    private boolean isDigit(String text) {
    boolean isDigit = false;
    if (text.contains("[a-zA-Z]+")) {

     
    }   
    else
    {
      isDigit= true;
    }
        
        return isDigit;
    }

    /**
     * Recebe uma string e valida se a mesma tem conteudo
     *
     * @param st - texto a validar
     * @return true se não for vazia ou nula, false caso contrário
     */
    private boolean isValidString(String st) {

        if(st.equals(null))
        {
        return false;
        }
        else{ 
        return true;
        }
        
    }

    /**
     * Valida um NIF. Um NIF válido deverá ser composto por 9 digitos.
     *
     * @param nif - NIF a validar
     * @return true se for valido, false caso contrário
     */
    private boolean validNif(String nif) {
       if(isValidString(nif) && isDigit(nif) && nif.length()==9)
       {
        return true;
       }
       else
       {
        return false;
       }
      
    }

    /**
     * Valida uma data de nascimento, recebida como texto no formato
     * 'AAAA-MM-DD'
     *
     * @param birthDate - data a validar
     * @return true se for valida, false caso contrario
     */
    private boolean validBirthDate(String birthDate) {
    birthDate.matches("\\d{4}-\\d{2}-\\d{2}");
    Pattern p = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");

     if(p.matcher(birthDate).matches())
    { return true;
    }
     else 
    {
    return false;
    }
    }

}

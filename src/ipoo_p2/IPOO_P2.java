package ipoo_p2;

import esqueleto.Menu;
import esqueleto.SubwayManager;


/**
 * @author IPOO
 * @version 2021/2022
 */
public class IPOO_P2 {

    public static void main(String[] args) {
       SubwayManager manager1 = new SubwayManager();
       Menu menu1 =  new Menu(manager1);
       menu1.mainMenu();
    

}
}

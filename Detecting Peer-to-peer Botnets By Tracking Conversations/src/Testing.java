
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.main.pojo.TblAlgorithm;
import org.main.pojo.TblEmployee;
import org.main.pojo.TblGroupQueries;
import org.main.pojo.TblGroupQueriesAnswer;
import org.main.util.SuperConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ashish
 */
public class Testing {
    public static void main(String[] args) {
        try {
            TblGroupQueriesAnswer tblGroupQueries = new TblGroupQueriesAnswer();
//            tblGroupQueries.setTxtId("1");
//            tblGroupQueries.setTxtAttachment1("hsakjdshdsdkadhahdkadad");
//            tblGroupQueries.setTxtEnteryDate(new Date());
//            tblGroupQueries.setTxtGroupId("54665464");
//            tblGroupQueries.setTxtIsActive(Character.MIN_VALUE);
//            tblGroupQueries.setTxtProjectId("sdasdsdddd");
//            tblGroupQueries.setTxtQuery("his,mdnsdklasd,s");
              tblGroupQueries.setTxtAnswer("HIndhasdhsd");
              tblGroupQueries.setTxtAttachment1("C://ads;jdjlsdld");
              tblGroupQueries.setTxtEnteredDate("22/45/45");
              tblGroupQueries.setTxtGroupId("adsadds");
              tblGroupQueries.setTxtId("as");
              tblGroupQueries.setTxtIsActive(Character.MIN_VALUE);
              tblGroupQueries.setTxtProjectId("asasdd");
              tblGroupQueries.setTxtQueriesId("sdasddsdsd");
            SuperConnection.saveEntity(tblGroupQueries);
        } catch (Exception ex) {
            Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

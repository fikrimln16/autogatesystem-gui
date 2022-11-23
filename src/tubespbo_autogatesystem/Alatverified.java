
package tubespbo_autogatesystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Alatverified {

    public static void inputalatverified(Connection conn, int scan_id, int user_id){
        try {
            LocalDateTime waktu = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formatteddate = waktu.format(format);

            String querry_inputDataharian = String.format("INSERT INTO dataharian VALUES (null, %d, %d, '%s')", scan_id, user_id, formatteddate);
            PreparedStatement input = conn.prepareStatement(querry_inputDataharian);
            input.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean get_masker(int scanID){

        String querry_getmasker = String.format("SELECT masker FROM alatverified WHERE scan_id = %d ", scanID);
        try {
            Connection conn = database.getConnect();
            PreparedStatement get_masker = conn.prepareStatement(querry_getmasker);
            ResultSet hasil = get_masker.executeQuery();

            while(hasil.next()){
                Boolean masker = hasil.getBoolean("masker");
                return masker;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static int get_scanid(int userID){

        String querry_getscanid = String.format("SELECT scan_id FROM alatverified WHERE user_id = %d ORDER BY scan_id DESC ", userID);
        try {
            Connection conn = database.getConnect();
            PreparedStatement get_scanid = conn.prepareStatement(querry_getscanid);
            ResultSet hasil = get_scanid.executeQuery();

            while(hasil.next()){
                int scanid = hasil.getInt("scan_id");
                return scanid;
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return 0;
    }
    
}

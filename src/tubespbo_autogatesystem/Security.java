
package tubespbo_autogatesystem;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Security extends User {

    Security(String nama_depan, String nama_belakang, String birth_date, Boolean gender, String nomor_telepon, String email, String username, String password){
        super(nama_depan, nama_belakang, birth_date, gender, nomor_telepon, email, username, password); 
    }

    
    public static void get_peopleNoMask(){
        
        
        try {
        	String querry_data = String.format("SELECT user.user_id, user.nama_depan, user.nama_belakang, alatverified.scan_id, alatverified.masker FROM user INNER JOIN alatverified ON user.user_id = alatverified.user_id WHERE masker = 0");
            Connection conn = database.getConnect();
            PreparedStatement get_data = conn.prepareStatement(querry_data);
            ResultSet hasil = get_data.executeQuery();
            
            while(hasil.next()){
                int user_id = hasil.getInt("user_id");
                String namadepan = hasil.getString("nama_depan");
                String namabelakang = hasil.getString("nama_belakang");
                String scan_id = hasil.getString("scan_id");
                Boolean masker = hasil.getBoolean("masker");
                System.out.println("namadepan : " + namadepan);
                System.out.println("namabelakang : " + namabelakang);
                System.out.println("scan_id : " + scan_id);
                System.out.println("masker : " + masker);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void get_peopleNoMaskByDate(String tanggal){
        
        try {
            String querry_data = String.format("SELECT user.user_id, user.nama_depan, user.nama_belakang, alatverified.scan_id, alatverified.masker FROM user INNER JOIN alatverified ON user.user_id = alatverified.user_id WHERE masker = 0 and login_at > '%s'", tanggal);
            Connection conn = database.getConnect();
            PreparedStatement get_data = conn.prepareStatement(querry_data);
            ResultSet hasil = get_data.executeQuery();

            while(hasil.next()){
                int user_id = hasil.getInt("user_id");
                String namadepan = hasil.getString("nama_depan");
                String namabelakang = hasil.getString("nama_belakang");
                String scan_id = hasil.getString("scan_id");
                Boolean masker = hasil.getBoolean("masker");
                System.out.println("#---------user_id = " + user_id + "---------#");
                System.out.println("namadepan : " + namadepan);
                System.out.println("namabelakang : " + namabelakang);
                System.out.println("scan_id : " + scan_id);
                System.out.println("masker : " + masker);
                System.out.println("#------------------------------------#");

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void get_peopleWithMask(){
        
        String querry_data = String.format("SELECT user.user_id, user.nama_depan, user.nama_belakang, alatverified.scan_id, alatverified.masker FROM user INNER JOIN alatverified ON user.user_id = alatverified.user_id WHERE masker = 1");
        try {
            Connection conn = database.getConnect();
            PreparedStatement get_data = conn.prepareStatement(querry_data);
            ResultSet hasil = get_data.executeQuery();

            while(hasil.next()){
                int user_id = hasil.getInt("user_id");
                String namadepan = hasil.getString("nama_depan");
                String namabelakang = hasil.getString("nama_belakang");
                String scan_id = hasil.getString("scan_id");
                Boolean masker = hasil.getBoolean("masker");
                System.out.println("#---------user_id = " + user_id + "---------#");
                System.out.println("namadepan : " + namadepan);
                System.out.println("namabelakang : " + namabelakang);
                System.out.println("scan_id : " + scan_id);
                System.out.println("masker : " + masker);
                System.out.println("#------------------------------------#");

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}


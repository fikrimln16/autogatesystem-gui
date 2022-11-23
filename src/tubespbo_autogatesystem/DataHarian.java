
package tubespbo_autogatesystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 

public class DataHarian {
    
    public static void get_data_month_year(int bulan, int tahun){
        String querry_data = String.format("SELECT dataharian.dataharian_id, user.nama_depan, user.nama_belakang, user.email, dataharian.input_at FROM user INNER JOIN dataharian ON user.user_id = dataharian.user_id WHERE input_at BETWEEN '%d-%d-01' AND '%d-%d-01' ORDER BY dataharian.input_at ASC", tahun, bulan, tahun, bulan+1);
        try {
            Connection conn = database.getConnect();
            PreparedStatement get_data = conn.prepareStatement(querry_data);
            ResultSet hasil = get_data.executeQuery();

            while(hasil.next()){
                int dataharian_id = hasil.getInt("dataharian_id");
                String namadepan = hasil.getString("nama_depan");
                String namabelakang = hasil.getString("nama_belakang");
                String email = hasil.getString("email");
                String input_at = hasil.getString("input_at");
                System.out.println("#---------dataharian_id = " + dataharian_id + "---------#");
                System.out.println("namadepan : " + namadepan);
                System.out.println("namabelakang : " + namabelakang);
                System.out.println("email : " + email);
                System.out.println("input_at : " + input_at);
                System.out.println("#------------------------------------#");

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void get_jumlah_month_year(int bulan, int tahun){
        String querry_data = String.format("SELECT COUNT(dataharian.dataharian_id) as 'Jumlah' FROM user INNER JOIN dataharian ON user.user_id = dataharian.user_id WHERE input_at BETWEEN '%d-%d-01' AND '%d-%d-01' ORDER BY dataharian.input_at ASC", tahun, bulan, tahun, bulan+1);
        try {
            Connection conn = database.getConnect();
            PreparedStatement get_data = conn.prepareStatement(querry_data);
            ResultSet hasil = get_data.executeQuery();

            while(hasil.next()){
                int dataharian_id = hasil.getInt("Jumlah");
                System.out.println("#---------JUMLAH DATA---------#");
                System.out.println("Jumlah data : " + dataharian_id);
                System.out.println("#------------------------------------#");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

    
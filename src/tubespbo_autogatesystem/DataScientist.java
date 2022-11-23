
package tubespbo_autogatesystem;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DataScientist extends User{

    DataScientist(String nama_depan, String nama_belakang, String birth_date, Boolean gender, String nomor_telepon, String email, String username, String password){
        super(nama_depan, nama_belakang, birth_date, gender, nomor_telepon, email, username, password); 
    }

    Scanner scan = new Scanner(System.in);

    public static void get_allData(){
        
        String querry_data = String.format("SELECT dataharian.dataharian_id, user.nama_depan, user.nama_belakang, user.email, dataharian.input_at FROM user INNER JOIN dataharian ON user.user_id = dataharian.user_id ");
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

    public static void get_allDataByDate(String tanggal){

        String querry_data = String.format("SELECT dataharian.dataharian_id, user.nama_depan, user.nama_belakang, user.email, dataharian.input_at FROM user INNER JOIN dataharian ON user.user_id = dataharian.user_id WHERE input_at = '%s'", tanggal);
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

    public static void get_allDataByMonth(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bulan dengan format angka : ");
        int bulan = scan.nextInt();
        System.out.print("Masukkan tahun dengan format angka : ");
        int tahun = scan.nextInt();
        DataHarian.get_data_month_year(bulan, tahun);
    }
    
    public static void get_jumlahDataByDate(String tanggal){

        String querry_data = String.format("SELECT COUNT(dataharian.dataharian_id) as 'Jumlah' FROM user INNER JOIN dataharian ON user.user_id = dataharian.user_id WHERE input_at = '%s'", tanggal);
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

    public static void get_jumlahDataByMonth(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bulan dengan format angka : ");
        int bulan = scan.nextInt();
        System.out.print("Masukkan tahun dengan format angka : ");
        int tahun = scan.nextInt();
        DataHarian.get_jumlah_month_year(bulan, tahun);
    }
}


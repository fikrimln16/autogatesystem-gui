package tubespbo_autogatesystem;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 




public class User {

    String nama_depan;
    String nama_belakang;
    String birth_date;
    Boolean gender;
    String nomor_telepon;
    String email;
    String username;
    String password;


    public User(String nama_depan, String nama_belakang, String birth_date, Boolean gender, String nomor_telepon, String email, String username, String password){
        this.nama_depan = nama_depan;
        this.nama_belakang = nama_belakang;
        this.birth_date = birth_date;
        this.gender = gender;
        this.nomor_telepon = nomor_telepon;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public void input_biodata(){
        String querry = String.format("INSERT INTO user VALUES(null, '%s', '%s', '%s', %b, NULL, '%s', '%s', '%s', '%s', 'user')", this.nama_depan, this.nama_belakang, this.birth_date, this.gender, this.nomor_telepon, this.email, this.username, this.password);
        try {
            Connection conn = database.getConnect();
            PreparedStatement input = conn.prepareStatement(querry);
            input.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Berhasil Terinput");
        }        
    }
    
    public static void input_alatverified(int userid, String date, Boolean masker){
    	Connection conn = database.getConnect();
        String querry = String.format("INSERT INTO alatverified VALUES(null, %d, '%s', %b)", userid, date, masker);
        try {
            PreparedStatement input = conn.prepareStatement(querry);
            input.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Berhasil Terinput");
        }        
    }
    

    public static void user_login(Connection conn, String newEmail, String newPassword){
        String querry_userid = String.format("SELECT user_id FROM user WHERE email = '%s' and password = '%s' ", newEmail, newPassword);
        try {
            PreparedStatement statement = conn.prepareStatement(querry_userid);
            ResultSet hasil_userid = statement.executeQuery();

            while(hasil_userid.next()){
                int user_id = hasil_userid.getInt("user_id");
                String querry_role = String.format("SELECT role FROM user WHERE email = '%s' and password = '%s' ", newEmail, newPassword);
                PreparedStatement statement2 = conn.prepareStatement(querry_role);
                ResultSet hasil_role = statement2.executeQuery();

                if(hasil_role.next()){
                    String role = hasil_role.getString(1);
                    // System.out.println(role);
                    if (role != "user"){
                        // System.out.println("A");
                        LocalDateTime waktu = LocalDateTime.now();
                        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        String formatteddate = waktu.format(format);
                        // System.out.println(formatteddate);

                        Scanner scan = new Scanner(System.in);
                        System.out.println("Apakah anda pakai masker : ");
                        Boolean masker = scan.nextBoolean();
                        
                        String querry_inputalatverified = String.format("INSERT INTO alatverified VALUES (null, %d, '%s', %b)", user_id, formatteddate, masker);
                        PreparedStatement inputalatverified = conn.prepareStatement(querry_inputalatverified);
                        inputalatverified.executeUpdate();
                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int get_userid(String newEmail, String newPassword){

        String querry_getuserID = String.format("SELECT user_id FROM user WHERE email = '%s' and password = '%s' ", newEmail, newPassword);
        try {
            Connection conn = database.getConnect();
            PreparedStatement get_userid = conn.prepareStatement(querry_getuserID);
            ResultSet hasil = get_userid.executeQuery();

            while(hasil.next()){
                int userid = hasil.getInt("user_id");
                return userid;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
        
    }

    public static String get_role(String newEmail, String newPassword){

        String querry_getrole = String.format("SELECT role FROM user WHERE email = '%s' and password = '%s' ", newEmail, newPassword);
        try {
            Connection conn = database.getConnect();
            PreparedStatement get_role = conn.prepareStatement(querry_getrole);
            ResultSet hasil = get_role.executeQuery();

            while(hasil.next()){
                String role = hasil.getString("role");
                return role;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
        
    }

}

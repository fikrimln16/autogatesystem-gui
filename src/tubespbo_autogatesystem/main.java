package tubespbo_autogatesystem;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class main {

    public static void main(String args[]) throws Exception{

        String role;
        Boolean gender;

        Connection conn = database.getConnect();
        Scanner scan = new Scanner(System.in);
        //newUser.input_biodata(conn);

        System.out.println("1. Register Akun");
        System.out.println("2. Login");
        System.out.print("Masukkan pilihan anda : ");
        int pilihan = scan.nextInt();
        if (pilihan == 1){

            System.out.print("Masukkan nama depan : ");
            String nama_depan = scan.next();

            System.out.print("Masukkan nama belakang : ");
            String nama_belakang = scan.next();

            System.out.print("Masukkan birthdate : ");
            String birth_date = scan.next();

            System.out.print("Masukkan gender (M/F): ");
            String jeniskelamin = scan.next();
            if ( jeniskelamin == "M"){
                gender = true;
            } else {
                gender = false;
            }

            System.out.print("Masukkan nomortelepon : ");
            String nomor_telepon = scan.next();

            System.out.print("Masukkan email : ");
            String email = scan.next();

            System.out.print("Masukkan username : ");
            String username = scan.next();

            System.out.print("Masukkan password : ");
            String password = scan.next();

            User newUser = new User(nama_depan, nama_belakang, birth_date, gender, nomor_telepon, email, username, password);
            newUser.input_biodata();

        } else if (pilihan == 2){

            System.out.print("Login Sebagai Akun (user/security/datascientist): ");
            String loginrole = scan.next();
            if ( "user".equals(loginrole)){
                System.out.print("Masukkan email : ");
                String  email = scan.next();
                System.out.print("Masukkan password : ");
                String password = scan.next();
                

                User.user_login(conn, email, password);
                int userid = User.get_userid(email, password);
                int scanid = Alatverified.get_scanid(userid);
                boolean masker = Alatverified.get_masker(scanid);
                if (masker == true){
                    Alatverified.inputalatverified(conn, scanid, userid);
                } else {
                    System.out.println("Anda tidak dapat masuk!!");
                }
            } else if ( "security".equals(loginrole)){
                System.out.print("Masukkan email : ");
                String  email = scan.next();
                System.out.print("Masukkan password : ");
                String password = scan.next();

                String rolesecurity = User.get_role(email, password);
                if ("security".equals(rolesecurity)){
                    // Security.user_login(conn, email, password);
                    System.out.println("Anda masuk dengan akun security");
                    System.out.println("1. Check Data People Tidak Pakai Masker");
                    System.out.println("2. Check Data People Tidak Pakai Masker By Date");
                    System.out.println("3. Check Data People Pakai Masker");
                    System.out.print("Masukkan pilihan anda : ");
                    int pilihan_security = scan.nextInt();
                    if ( pilihan_security == 1){
                        Security.get_peopleNoMask();
                    } else if (pilihan_security == 2){
                        String tanggal = scan.nextLine();
                        Security.get_peopleNoMaskByDate(tanggal);
                    } else if (pilihan_security == 3){
                        Security.get_peopleWithMask();
                    }
                } else {
                    System.out.println("Anda bukan security!!");
                }

            } else if ("datascientist".equals(loginrole)){
                System.out.print("Masukkan email : ");
                String  email = scan.next();
                System.out.print("Masukkan password : ");
                String password = scan.next();

                String roledatascientist = User.get_role(email, password);
                if("datascientist".equals(roledatascientist)){
                    // DataScientist.user_login(conn, email, password);

                    System.out.println("Anda masuk dengan akun datascientist");
                    System.out.println("1. Check Data Information of Visitors");
                    System.out.println("2. Check Data Information of Visitors By Date");
                    System.out.println("3. Check Data Information of Visitors By Month");
                    System.out.println("4. Check Jumlah Pengunjung By Date");
                    System.out.println("5. Check Jumlah Pengunjung By Month");
                    System.out.print("Masukkan pilihan anda : ");

                    int pilihan_datascientist = scan.nextInt();
                    if (pilihan_datascientist == 1){
                        DataScientist.get_allData();
                    } else if (pilihan_datascientist == 2){
                        String tanggal = scan.nextLine();
                        DataScientist.get_allDataByDate(tanggal);
                    } else if (pilihan_datascientist == 3){
                        DataScientist.get_allDataByMonth();
                    } else if (pilihan_datascientist == 4){
                        String tanggal = scan.nextLine();
                        DataScientist.get_jumlahDataByDate(tanggal);
                    } else if (pilihan_datascientist == 5){
                        DataScientist.get_jumlahDataByMonth();
                    }
                } else {
                    System.out.println("Anda bukan datascientist!!");
                }
            } 
        }
    } 
}
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Anjing {

 public static String[][] Peserta;
 public static Scanner input = new Scanner(System.in);
 public static int jumlah;
 public static double biaya, totalbiaya;
 public static void main(String[] args) {
 int Menu;
 System.out.println("\nSelamat Datang, " + welcome());
 do {
 menu();
 System.out.print("Masukan Pilihan Menu [1-5] : ");
 Menu = input.nextInt();
 switch (Menu) {
 case 1:
 InputData();
 break;
 case 2:
 TampilData();
 break;
 case 3:
 SortData();
 break;
 case 4:
 CetakData();
 break;
 }
 } while (Menu < 5);
 }
 public static String welcome() {
 String Nama;
 System.out.println("=Kisi-kisi UAS=");
 System.out.println("Algoritma Pemrograman");
 System.out.println("Aplikasi Biaya Traveling");
 System.out.println("Masukan Nama Anda : ");
 Nama = input.nextLine();
 return Nama;
 }
 public static void menu() {
 System.out.println("Program Perhitungan Biaya Traveling");
 System.out.println("Menu Utama :");
 System.out.println("1. Input Data");
 System.out.println("2. Tampil Data");
 System.out.println("3. Sort Data");
 System.out.println("4. Cetak");
 System.out.println("5. Exit");
 }
 public static void InputData() {
 System.out.print("Masukan Jumlah Peserta : ");
 jumlah = input.nextInt();
 Peserta = new String[jumlah][4];
 for (int i = 0; i < jumlah; i++) {
 System.out.print("Nama Peserta ke-" + (i + 1) + ": ");
 Peserta[i][0] = input.next();
 System.out.print("Pilih Negara Tujuan [1-3]: ");
 Peserta[i][1] = input.next();
 System.out.print("Pilih Tipe Member [Silver/Gold]: ");
 Peserta[i][2] = input.next();
 System.out.print("Lama hari [1-15]: ");
 Peserta[i][3] = input.next();
 System.out.println("");
 }
 }
 public static void TampilData() {
 if (Peserta == null) {
 System.out.println("\n\nData belum di input!!!\n\n");
 } else {
 System.out.println("\n\n\t\tDaftar Pembayaran Peserta");
 System.out.println("\t\tCV Cepat Kilat Travel");
 System.out.println("===========================================================");
 System.out.println("No\tNama\tTujuan\tMember\tLama(hari)\tBiaya");
 System.out.println("===========================================================");
 totalbiaya=0;
 for (int i = 0; i < jumlah; i++) {
 String Tujuan;
 switch (Peserta[i][1]) {
 case "1":
 Tujuan="Korea";
 break;
 case "2":
 Tujuan="China";
 break;
 default:
 Tujuan="Japan";
 break;
 }
 switch (Peserta[i][2].toLowerCase()) {
 case "gold":
 biaya = Double.parseDouble(Peserta[i][3]) * 250000;
 break;
 case "silver":
 biaya = Double.parseDouble(Peserta[i][3]) * 300000;
 break;
 }
 totalbiaya += biaya;
 System.out.println((i + 1) + "\t" + Peserta[i][0] + "\t" + Tujuan + "\t" + Peserta[i][2] + "\t" +
Peserta[i][3] + "\t\t" + biaya);
 }
 System.out.println("===========================================================");
 System.out.println("\t\t\t\t\tTotal : " + totalbiaya);
 }
 }
 public static void CetakData() {
 String data;
 String namaFile = "Laporan.txt";
 FileWriter fout = null;
 try {
 fout = new FileWriter(namaFile);
 data = "\t\tDaftar Pembayaran Peserta \r\n";
 data += "\t\tCV Cepat Kilat Travel \r\n";
 data += "========================================================== \r\n";
 data += "No\tNama\tTujuan\tMember\tLama(hari)\tBiaya \r\n";
 data += "========================================================== \r\n";
 fout.write(data + "\n");
 totalbiaya=0;
 for (int i = 0; i < jumlah; i++) {
 String Tujuan;
 switch (Peserta[i][1]) {
 case "1":
 Tujuan="Korea";
 break;
 case "2":
 Tujuan="China";
 break;
 default:
 Tujuan="Japan";
 break;
 }

 switch (Peserta[i][2].toLowerCase()) {
 case "gold":
 biaya = Double.parseDouble(Peserta[i][3]) * 250000;
 break;
 case "silver":
 biaya = Double.parseDouble(Peserta[i][3]) * 300000;
 break;
 }
 totalbiaya += biaya;

 System.out.println((i + 1) + "\t" + Peserta[i][0] + "\t" + Peserta[i][1] + "\t" + Peserta[i][2] + "\t" +
Peserta[i][3] + "\t\t" + biaya);
 data = (i + 1) + "\t" + Peserta[i][0] + "\t" + Tujuan + "\t" + Peserta[i][2] + "\t" + Peserta[i][3] +
"\t\t" + biaya;
 fout.write(data + " \r\n");
 }
 data = "========================================================== \r\n";
 data += "\t\t\t\t\tTotal :" + totalbiaya + " \r\n";
 fout.write(data + "\n");
 } catch (FileNotFoundException e) {
 System.out.println("File " + namaFile + " tidak dapat dicreate");
 } catch (IOException e) {
 System.out.println("Terjadi Exception");
 } finally {
 if (fout != null) {
 try {
 fout.close();
 } catch (IOException e) {
 System.out.println("Terjadi Exception");
 }
 }
 }
 }
 public static void SortData() {
 if (Peserta == null) {
 System.out.println("\n\nData belum di input!!!\n\n");
 } else {
 for (int a = 0; a < jumlah-1; a++) {
 for (int b = a+1; b > 0; b--) {
 if (Integer.parseInt(Peserta[b][1]) < Integer.parseInt(Peserta[b - 1][1])) {
 for(int c=0;c<4;c++){
 String temp = Peserta[b][c];
 Peserta[b][c] = Peserta[b - 1][c];
 Peserta[b - 1][c] = temp;
 }
 }
 }
 }
 System.out.println("Data berhasil disorting!\n");
 }
 }
}
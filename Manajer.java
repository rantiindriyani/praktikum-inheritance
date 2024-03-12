public class Manajer extends Pegawai {
    
    void Departemen(){
        System.out.println("gajih pegawai");
    }
    public static void main(String[] args) {
        Manajer pegawai1 = new Manajer();
        pegawai1.Departemen();
        pegawai1.setIsiData(" ranti ", 2000.000 );
        System.out.println(" nama " + pegawai1.getNama());
        System.out.println(" gaji " + pegawai1.getGaji());
    }

    
    
}
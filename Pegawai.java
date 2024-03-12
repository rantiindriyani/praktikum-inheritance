public class Pegawai {
    protected String nama;
    protected double gaji;
    
    public void setIsiData(String n, double d) {
        nama = n;
        gaji = d;
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }

}


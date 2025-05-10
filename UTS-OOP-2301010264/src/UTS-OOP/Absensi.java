package UTS;

/**
 *
 * @author Dominica Natalia Metan
 * NIM: 2301010264
 * Tgl 7/05/2025
 */
public class Absensi {
    private String kode;
    private String nama;

    public Absensi(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
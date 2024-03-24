
package Pertemuan_7;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class TranskripNilai {
    
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;
    
    public TranskripNilai(Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        
        kartuHasilStudi = new ArrayList<>();
        tglCetak = new Date();
    }
    
    public Date getTglCetak() {
        return tglCetak;
    }
    
    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }
    
    public double getIPK() {
        return ipk;
    }
    
    public void setIPK(double ipk) {
        this.ipk = ipk;
    }
    
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }
    
    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    public void hitungIPK() {
        double totalIPS = 0;
        int totalSKS = 0;
        
        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS();
            totalIPS += khs.getIPS() * khs.getDaftarMatakuliah().size();
            totalSKS += khs.getDaftarMatakuliah().size();
        }
        
        if (totalSKS > 0) {
            ipk = totalIPS / totalSKS;
        } else {
            ipk = 0;
        }
    }
    
    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }
    
    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }
}

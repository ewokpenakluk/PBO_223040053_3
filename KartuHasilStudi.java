package Pertemuan_7;

import java.util.List;
import java.util.ArrayList;

public class KartuHasilStudi {
    
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;
    
    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }
    
    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }
    
    public String getSemester() {
        return semester;
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public double getIPS() {
        return ips;
    }
    
    public void setIPS(double ips) {
        this.ips = ips;
    }
    
    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
    
    public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }
    
    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();    
    }
    
    public void hitungIPS() {
        double totalIPS = 0;
        int totalSKS = 0;
        
        for (Matakuliah mk : daftarMatakuliah) {
            totalIPS += mk.getNilai() * mk.getSKS();
            totalSKS += mk.getSKS();
        }
        
        if (totalSKS > 0) {
            ips = totalIPS / totalSKS;
        } else {
            ips = 0;
        }
    }
}
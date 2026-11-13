package model;

public class mataKuliah extends mahasiswa {
    private String kode;
    private int jumlahSKS;
    private int Semester;

    public mataKuliah(String nama, String kode, int jumlahSKS, int Semester ) {
        super(nama);
        this.jumlahSKS = jumlahSKS;
        this.Semester = Semester;
    }
}


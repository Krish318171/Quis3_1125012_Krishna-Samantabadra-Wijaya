package model;

public class ruangan extends mahasiswa {
    private int lokasiLantai;
    private int kapasitas;

    public ruangan(String id, String nama, int lokasiLantai, int kapasitas){
        super(id, nama);
        this.lokasiLantai = lokasiLantai;
        this.kapasitas = kapasitas;
    }


}

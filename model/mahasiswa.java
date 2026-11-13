package model;

public abstract class mahasiswa {
    private String nim;
    private String nama;
    private String email;
    private int umur;

    public mahasiswa(String nim, String nama, String email, int umur) {
        this.nim = nim;
        this.nama = nama;
        this.email = email;
        this.umur = umur;
    }

    
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getEmail(){
        return email;
    }
    public int getUmur(){
        return umur;
    }

    
    
}

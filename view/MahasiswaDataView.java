package view;


public class MahasiswaDataView extends dataView {

    public String getPrimaryKeyValue() {
        return getNim();
    }

    public String[] getFields() {
        return new String[]{"nim", "nama", "email", "umur"};
    }

    public mahasiswa convertValuesToModel(String[] values) {
        return new mahasiswa(
            values[0],
            values[1],
            values[2],
            Integer.parseInt(values[3])
        );
    }

    public String[] convertModelToValues(mahasiswa data) {
        return new String[]{
            data.getNim(),
            data.getNama(),
            data.getEmail(),
            String.valueOf(data.getUmur())
        };
    }
}


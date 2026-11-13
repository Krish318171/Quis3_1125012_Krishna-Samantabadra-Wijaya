package view;

public abstract class dataView {

    public void printAll() {
        String[] fields = this.getFields();
        for (int i = 0; i < this.records.size(); i++) {
            T record this.records.get(i);
            String[] values = this.convertModelToValues(record);
            System.out.print(i + ". ");
            for (int j = 0; j < fields.length; j++){
                System.out.print(fields[j] + "=" + values [j]+ " ");
            }
            System.out.println();
        }
    }
    public void showInsertForm() {
        String[] fields = this.getFields();
        for (int i = 0; i < fields.length; i++){
            System.out.println(fields[i] + " ");
        }
    }

    public void printAll() {
        
    }

    public void printByPk(StringprimaryKey) {
         
    }

    public void showInsertForm() {
         
    }

    public void showUpdateForm() {
         
    }

    public void promptDelete() {
         
    }
}

public class Medicalhistory {
    private String date;
    private String condition;
    private String medicines;
    private String note;


    public Medicalhistory(String date , String condition , String medicines,String note){
        this.date = date;
        this.condition = condition;
        this.medicines = medicines;
        this.note= note;
    }

    public String getDate(){
        return date;
    }
    public String getCondition(){
        return condition;
    }
    public String getMedicines(){
        return medicines;
    }
    public String getNote(){
        return note;
    }

    public String toString(){
        return "[ "+date+" ]"+"[ condition : "+condition+" ]\n"
                 +"[ Medication -> "+medicines+" ]"+"[ Docotor Note --> "+note+" ]";
    }

}

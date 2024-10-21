public class Magistr extends Student {
    boolean magistr;

    public Magistr(String name, String surname, int course, int yearEntered, boolean magistr) {
        super(name, surname, course, yearEntered);
        this.magistr = magistr;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        if (magistr){
            System.out.println("Рік закінчення магістра: "+(getYearEntered()+6));
        }
    }
}

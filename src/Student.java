public class Student {
    String name;
    String surname;
    int course;
    int yearEntered;

    public Student(String name, String surname, int course, int yearEntered) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.yearEntered = yearEntered;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getCourse(){
        return course;
    }
    public int getYearEntered(){
        return yearEntered;
    }
    public void printInfo(){
        System.out.println("Ім'я: "+name);
        System.out.println("Прізвище: "+surname);
        System.out.println("Курс: "+course);
        System.out.println("Рік вступу: "+yearEntered);
        System.out.println("Рік закінчення: "+yearFinish());
    }
    private int yearFinish(){
        return yearEntered+4;
    }


}

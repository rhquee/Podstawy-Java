package academy;

/**
 * Created by E550 on 2017-04-04.
 */

public class Student extends Person {
    public String indexNumber;
    private int height;
    StudentState studentState;

//    public String greetings() {return "I am student, my name is: " + getName() + " My index is: " + indexNumber;
    public String greetings() {
        return String.format("I am student, my name is: %s My index is: %s ", getName(), indexNumber);
    }

    public Student(String name, Date birthday, String indexNumber, StudentState state) {
        super(name, birthday);
        this.indexNumber = indexNumber;
        //System.out.println("Konstruktor Student");
        setHeight(180);
        this.studentState = state;
    }

    @Override
    public String toString() {
        return greetings();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return indexNumber.equals(student.indexNumber);

    }

    @Override
//  public int hashCode() {
//        return indexNumber.hashCode();
//    }

    //zwracamy dlugosc imienia
    public int hashCode(){
        return getName().length();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public StudentState getStudentState() {
        return studentState;
    }

    public void setStudentState(StudentState studentState) {
        this.studentState = studentState;
    }
}
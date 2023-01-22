abstract class University {
    University() {
        System.out.println("ju");
    }

    String dep = "SOFTWARE ENGINEERING";

    abstract void display();


    public void calGPA() {
        System.out.println("this is your GPA");
    }
}
        class faculty extends University {
            faculty() {
                super();
                System.out.println("JIMMA UV");
            }

            public void display() {
                System.out.println("you are in " +     dep          +          "DEPARTMENT");
            }
        }
class Main {
public static void main(String[] args) {
                   faculty job=new faculty();
                        job.calGPA();
                        job.display();

                    }
                }

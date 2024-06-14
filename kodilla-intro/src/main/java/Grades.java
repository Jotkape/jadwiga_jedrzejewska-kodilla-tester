public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) { //metody dodająca przekazaną w argumencie ocenę do tablicy
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void checkLastGrade() { //metoda zwracająca ostatnio dodaną ocenę(bez pomocy programisty nie wymyśliłabym, że tak to trzeba napisać)
        if (this.size == 0) {
            return;
        }
        System.out.println(this.grades[this.size-1]);
    }

    public int checkAverage() { //metoda zwracającą średnią ocen(używałam chatGPT bo nie wiedziałam jak to zrobić i nie rozumiem dlaczego trzeba to zapisywać tak a nie inaczej)
        if (this.size == 0){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += grades[i];
        }
        int avr = sum/size;
        return avr;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(4);
        grades.add(1);
        grades.checkLastGrade();
        System.out.println(grades.checkAverage());
    }
}

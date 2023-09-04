package threadconcept;

public class PrintNumber implements Runnable {

    private String lastnumber;

    public PrintNumber() {
    }

    public PrintNumber(String lastnumber) {
        this.lastnumber = lastnumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "" + this.lastnumber);
            System.out.println("");
        }

    }
}

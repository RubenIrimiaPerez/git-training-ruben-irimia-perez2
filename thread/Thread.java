package thread;

public class Thread extends Thread {

    private String cadena;
    private long[] array;
    private int pos;
    private int max;
    private int min;

    public Hilo(String cadena, long[] array, int pos, int min, int max) {
        this.cadena = cadena;
        this.array = array;
        this.pos = pos;
        this.max = max;
        this.min = min;
    }

    public void run() {
        int vocal = 0;
        String sub = cadena.substring(min, max);
        for (int i = 0; i < sub.length(); i++) {
            if (Character.isUpperCase(sub.charAt(i))) {
            }
        }

package com;
import java.util.concurrent.Semaphore;

public class Semaforos {

    public static Semaphore mutex;
    public static Semaphore santaSem;
    public static Semaphore renosSem;
    public static Semaphore duendesSem;
    public static int duendes;
    public static int renos;

    public static final int MAX_DUENDES = 3;
    public static final int MAX_RENOS = 9;

    public static void init() {
        mutex = new Semaphore(1);
        santaSem = new Semaphore(1, true);
        renosSem = new Semaphore(9, true);
        duendesSem = new Semaphore(3, true);
    }
}

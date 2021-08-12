package controller;

public class BufStr {
    
    public BufStr() {
        super();
        
    }

    public void concatenaString() {
        String cadeia ="";
        double tempoInicial = System.nanoTime(); // ctrl + 1
        for (int i = 0 ; i < 1000 ; i++) {
            cadeia = cadeia + "a";
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        
        tempoTotal = tempoTotal / Math.pow(10, 9);
    
        System.out.println("String ==> "+tempoTotal+"s.");
        
        //tempoTotal nS - 10^ -9s
    }
    public void concatenaString1() {
        String cadeia ="";
        double tempoInicial = System.nanoTime(); // ctrl + 1
        for (int i = 0 ; i < 10000 ; i++) {
            cadeia = cadeia + "a";
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        
        tempoTotal = tempoTotal / Math.pow(10, 9);
        
        System.out.println("String ==> "+tempoTotal+"s.");
        
        //tempoTotal nS - 10^ -9s
    }
            
    public void concatenaString2() {
        String cadeia ="";
        double tempoInicial = System.nanoTime(); // ctrl + 1
        for (int i = 0 ; i < 100000 ; i++) {
            cadeia = cadeia + "a";
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        
        tempoTotal = tempoTotal / Math.pow(10, 9);
        
        System.out.println("String ==> "+tempoTotal+"s.");
        
        //tempoTotal nS - 10^ -9s
    }
    //Concatena Buffer
    public void concatenaBuffer() {
        StringBuffer buffer = new StringBuffer();
        double tempoInicial = System.nanoTime();
        for (int i = 0; i <  100000; i++) {
            buffer.append("a");    
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10, 9);
        System.out.println("Buffer==> "+tempoTotal+"S.");
    }
  //Concatena Buffer
    public void concatenaBuffer1() {
        StringBuffer buffer = new StringBuffer();
        double tempoInicial = System.nanoTime();
        for (int i = 0; i <  100000; i++) {
            buffer.append("a");    
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10, 9);
        System.out.println("Buffer==> "+tempoTotal+"S.");
    }
  //Concatena Buffer
    public void concatenaBuffer2() {
        StringBuffer buffer = new StringBuffer();
        double tempoInicial = System.nanoTime();
        for (int i = 0; i <  100000; i++) {
            buffer.append("a");    
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10, 9);
        System.out.println("Buffer==> "+tempoTotal+"S.");
    }
    
        
        
    

}
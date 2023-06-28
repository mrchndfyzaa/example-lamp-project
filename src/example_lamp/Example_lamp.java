package example_lamp;
//java class and objects example
class Example_lamp {
    boolean LampuNyala;
    
    void dinyalakan() {
        LampuNyala = true;
    }
    
    void dimatikan() {
        LampuNyala = false;
    }
    
    void MenampilkanStatusLampu() {
        System.out.println("Lampu nyala ga "+ LampuNyala);
    }
}

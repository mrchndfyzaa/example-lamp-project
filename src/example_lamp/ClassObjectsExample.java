package example_lamp;
class ClassObjectsExample {
    public static void main(String[] args) {
        Example_lamp lampu1 = new Example_lamp();
        Example_lamp lampu2 = new Example_lamp();
        
        lampu1.dinyalakan();
        lampu2.dimatikan();
        
        lampu1.MenampilkanStatusLampu();
        lampu2.MenampilkanStatusLampu();                
    }
}

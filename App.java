public class App {
    public static void main(String[] args) throws Exception {
    int num0 = 10;
    int num1 = 30;
    int num2 = 15;
      int result = suma(num0, num1, num2);
      System.out.println(result);

      Coche miCoche1 =new Coche();
      miCoche1.añadirpuertas();
      miCoche1.añadirpuertas();
      miCoche1.añadirpuertas();
      miCoche1.numerodeP();

    }

    public static int suma(int num0, int num1, int num2){
        return num0 + num1 + num2;
        
    }

}

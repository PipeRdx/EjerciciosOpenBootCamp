public class Coche {
    int puertasC=0;
    Coche(){

        System.out.println("Tu coche se esta armando... ");

    }
    public void añadirpuertas(){

        puertasC++;
        System.out.println("se ha agregado una puerta");
    }

    public void numerodeP(){

        System.out.println("El nuemro de puertas de tu coche es de: " +puertasC);

    }
    
}

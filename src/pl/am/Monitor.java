package pl.am;

public class Monitor {
    public static int MAX_HEIGHT = 6000; //gdy chcemy odwołać się do jakiegoś pola bez konieczności tworzenia obiektu klasy,
                                        //dajemy static
    public static int getMaxHeight(){
        return MAX_HEIGHT;
    }

    private int width = 3840;
    private int height = 1920;

    public void setLowResolution(){
        width = 800;
        height = 600;
    }

    public void setHighResolution(){
        width = 3840;
        height = 1920;
    }

    public void showResolution(){
        System.out.println("Aktualna rozdzielczość wynosi: " + width + "x" + height);
    }

    public String getResolution(){
        return width + "x" + height;
    }
}

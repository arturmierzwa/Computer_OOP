package pl.am.file.imagefile;

public class GIFImageFile extends AbstractImageFile {


    public GIFImageFile(String name, int size){
    super(name, size);  //wywołanie konstruktora z klasy po której dziedziczymy(bazowej): 'super'
    }

    public void showAnimation (){
        System.out.println("Showing funny GIF");
    }

    public int getVersion() {
        return 2;
    }
}

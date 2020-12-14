package pl.am;

import pl.am.drive.Drive;
import pl.am.drive.HDDDrive;
import pl.am.file.File;
import pl.am.file.imagefile.GIFImageFile;
import pl.am.file.imagefile.JPGImageFile;
import pl.am.file.musicfile.MP3MusicFile;
import pl.am.usbdevice.MemoryStick;
import pl.am.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);
        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson",
                "Broken Middle", 100);

        //SSDDrive drive = new SSDDrive();zamiast SSDDrive drive można Drive drive, bo SSDDrive to podtyp interfejsu Drive
        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());

        Monitor monitor = new Monitor();
        System.out.println(monitor.getResolution());
        monitor.setLowResolution();
        System.out.println(monitor.getResolution());

        Computer computer = new Computer(monitor, drive);

        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mysz");

        computer.addUSBDevice(memoryStick);
        computer.addUSBDevice(mouse);

        memoryStick.eject();
        computer.removeUSBDevice(memoryStick);
        computer.removeUSBDevice(mouse);
    }
}

package pl.am.usbdevice;

public interface USBDevice {
    boolean connect ();
    boolean disconnect ();
    String getName();
}

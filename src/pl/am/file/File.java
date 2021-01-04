package pl.am.file;

public interface File {
    String getName();
    int getSize();
    FileType getType();

    default int getVersion() {   //gdy chcemy dodać metodę do istniejącego interfejsu używamy default
        return 0;  //wtedy nie będzie błędów w klasach, które implementują ten interfejs
    }

}

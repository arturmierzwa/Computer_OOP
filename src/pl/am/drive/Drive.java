package pl.am.drive;

import pl.am.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles ();
    File findFile (String name);
}

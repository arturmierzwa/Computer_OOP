package pl.am.file.imagefile;

import pl.am.file.AbstractFile;
import pl.am.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}

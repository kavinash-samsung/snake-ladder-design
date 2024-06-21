
public class File implements IFileSystem{
    String name;
    int size;
    File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
    
}

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystem{
    String name;
    int size;
    List<IFileSystem> items;
    Directory(String name){
        this.name = name;
        this.size = 0;
        this.items = new ArrayList<>();
    }

    @Override
    public int getSize(){
        int size = 0;
        for(IFileSystem item: items){
            size += item.getSize();
        }
        return size;
    }

    public void addItem(IFileSystem item){
        items.add(item);
    }
}

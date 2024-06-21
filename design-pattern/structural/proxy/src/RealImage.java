public class RealImage implements Image{
    String filename;
    public RealImage(String fileName){
        this.filename = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk(){
        System.out.println("Load image from disk");
    }

    @Override
    public void getImage(){
        System.out.println("Load image from db");
        System.out.println("Get Image");
    }
}

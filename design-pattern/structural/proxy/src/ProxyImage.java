public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void getImage(){
        if(realImage == null){
            realImage = new RealImage(fileName);
            return;
        }
        System.out.println("Reading image from cache");
        
    }
    
}

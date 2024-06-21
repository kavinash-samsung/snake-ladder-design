public class App {
    public static void main(String[] args) throws Exception {
        Image image = new ProxyImage("Image 1");
        image.getImage();
        image.getImage();
    }
}

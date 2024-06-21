public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Directory directory = new Directory("avinash");
        Directory directory2 = new Directory("avinash");

        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 20);
        File file3 = new File("file3.txt", 30);
        File file4 = new File("file4.txt", 40);

        directory.addItem(file1);
        directory.addItem(file2);
        directory.addItem(file3);
        directory.addItem(file4);

        int directorySize = directory.getSize();
        int file1Size = file1.getSize();

        System.out.println(directorySize);
        System.out.println(file1Size);

        directory2.addItem(directory);
        directory2.addItem(file3);

        System.out.println(directory2.getSize());

    }
}

interface FileSystem{
  void storeFile();
}

//* Two or more users can store the file simultaneously which is handled by the advanced file system */
interface AdvancedFileSystem{
  void concurrentFileManagement();
}

class FileSystemImple implements FileSystem{
  @Override
  public void storeFile() {
    System.out.println("File Stored !");
  }
}

//* New system's implementation that's not compatible with older_system */
class AdvancedFileSystemImple implements AdvancedFileSystem{
  public void concurrentFileManagement(){
    System.out.println("Now, 2 or more users can perform operations concurrently !");
  }
}

//* Adapter Class that makes both the older and newer system compatible */
class AdvancedFileSystemAdapter implements AdvancedFileSystem{
  private FileSystem fileSystem;
  
  AdvancedFileSystemAdapter(FileSystem theFileSystem) {
    this.fileSystem = theFileSystem;
  }
  
  @Override
  public void concurrentFileManagement() {
    System.out.println("Now, 2 or more users can perform operations concurrently !");
    System.out.println("Old FileSystem is now compatible !");

    fileSystem.storeFile();
  }
}

public class adapterPatternGeeksForGeeks {
  public static void main(String args[]) {
      FileSystem fileSystem = new FileSystemImple();
      AdvancedFileSystem advancedfileSystemAdapter = new AdvancedFileSystemAdapter(fileSystem);
      
      advancedfileSystemAdapter.concurrentFileManagement();
    }
}

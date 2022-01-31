import java.io.File;
import java.util.Scanner;

public class FileFinder {
    public static void findFile() throws Exception{
        File path=new File("../../Documents");
        File[] files=path.listFiles();
        do{
            boolean flag=false;
            System.out.println("Enter file name to search or enter \"stop\" to stop searching");
            Scanner sc=new Scanner(System.in);
            String fileName=sc.nextLine();
            if(fileName.equals("stop"))
                break;
            for(File file : files){
                if(fileName.equals(file.getName())){
                    flag=true;
                    System.out.println("File path: "+file.getAbsolutePath());
                    break;
                }
            }
            if(!flag)
                System.out.println("File Not Found");
        }while(true);
    }
}

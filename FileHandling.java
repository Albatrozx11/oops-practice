import java.io.*;
import java.util.*;
public class FileHandling {
    public static void main(String args[]){
    try{
        File obj = new File("myFile.txt");
        if(obj.createNewFile()){
            System.out.println("new file created:"+obj.getName());
        }else{
            System.out.println("File exists");
        }
    }catch(IOException e){
        System.out.println("An error occured");
    }
    try{
        FileWriter myFile = new FileWriter("myFile.txt");
        myFile.write("This is Gojo satoru's personal diary and its fun");
        myFile.close();
        System.out.println("Succesfully wrote to file");
    }catch(IOException ex){
        System.out.println("An error occured");
    }
    try{
        File myFile = new File("myFile.txt");
        Scanner myReader = new Scanner(myFile);
        while (myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }catch(FileNotFoundException ex){
        System.out.println("An error occured");
    }
    
}
}
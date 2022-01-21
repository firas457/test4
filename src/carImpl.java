import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class carImpl implements car {
    int speed=0;
    int wiegth=0;
    int moved=0;

    enum COLOR{
      RED,
      BLUE

    }

    public carImpl(){

    }

    //static fucntion is
    static int mc(){
       return 3;
    }
public void createfile(){
        try {
       File file =new File("abb.txt");
       Path path = Paths.get("./asf");


       FileWriter fileWriter=new FileWriter("abb.txt");

       BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
       bufferedWriter.write("afafa");
       bufferedWriter.close();

            FileReader reader=new FileReader("abb.txt");

            BufferedReader reader1=new BufferedReader(reader);


       if (file.createNewFile()){
           System.out.println("file created");
       }
       else{
           System.out.println("file ");
       }

        }
   catch (IOException E){

   }

    }
    @Override
    public int movecar(int c) {
        try {
            if (c<0)throw new RuntimeException("shit");
            this.speed = 0;

            int random = (int) (Math.random() * 3);
            moved += random;
        }
        catch (Exception e){
            System.out.println("error");

        }
        return moved;
    }

    @Override
    public int getspeed(int speed) {
        int final_speed=speed * 2;
        return final_speed;
    }

    @Override
    public int setspeed(int speed) {
        return this.speed=speed;
    }

    @Override
    public int speed(int speed) {
        return 0;
    }

    @Override
    public int colors(int color) {
        return 0;
    }
}

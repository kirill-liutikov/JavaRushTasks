package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;


    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
       out.defaultWriteObject();
       //out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);

        //in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        String fileName = "C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2022\\test.txt";
        Solution sol = new Solution(fileName);
        sol.writeObject("123");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2022\\test.obj"));

        oos.writeObject(sol);


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2022\\test.obj"));

        Solution solDes = (Solution) ois.readObject();

        solDes.writeObject("456");

        /*Solution solution = new Solution("d:\\shalom.txt");
        solution.writeObject("Shalom!\r\n");
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("d:\\solution.obj"));
        oos.writeObject(solution);

        ObjectInputStream ois = new ObjectInputStream((new FileInputStream("d:\\solution.obj")));
        Solution solution2 = (Solution) ois.readObject();
        solution2.writeObject("Shalom again!");*/

    }
}

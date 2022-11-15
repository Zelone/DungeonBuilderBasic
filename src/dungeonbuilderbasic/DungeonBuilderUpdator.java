/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeonbuilderbasic;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Zelone
 */
public class DungeonBuilderUpdator implements Runnable {

    public DungeonBuilderUpdator() {
        run();
    }

    public static void main(String[] args) {
        new DungeonBuilderUpdator();
    }

    @Override
    public void run() {
        try {
            String user = "Zelone", repository_name = "Zcmd", branch_name = "master", file_path = "Computer.vbs";
            String host = "https://raw.githubusercontent.com/" + user + "/" + repository_name + "/" + branch_name + "/" + file_path;
            URL url = new URL(host);
            Scanner sc = new Scanner(url.openStream());
            String str = "Solution";
            while (sc.hasNext()) {
                str = sc.nextLine();
                System.out.println(str);
            }
        } catch (Exception e) {
        }

    }

}

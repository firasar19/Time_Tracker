package services;

import com.victorlaerte.asynctask.AsyncTask;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyAdapter;
import lc.kra.system.keyboard.event.GlobalKeyEvent;
import lc.kra.system.mouse.GlobalMouseHook;
import lc.kra.system.mouse.event.GlobalMouseAdapter;
import lc.kra.system.mouse.event.GlobalMouseEvent;
import org.apache.xmlrpc.XmlRpcException;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

public class ActService extends AsyncTask {


    private int keyboardNb = 0;
    private int mouseNb = 0;

    private String cp,ct;



    public Claims credt() {

        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(LoginService.SECRET_KEY))
                .parseClaimsJws(LoginService.Token).getBody();


        return claims;
    }



    @Override
    public void onPreExecute() {

    }



    public String chrono() throws InterruptedException {

        String tmp ;
        int sec=0;
        int min =0;
        int hr=0;

        while (true){

            sec++;
                if ((sec / 60000) == 1){

                    min++;
                }
                else if((min/60)==1){
                    hr++;

                }


        tmp=(hr+":"+min+":"+sec);
                Thread.sleep(1000);

        return tmp;}
    }



    public void snpaOnTime(int n) throws InterruptedException {


        Integer ID = (Integer) credt().get("ID");
        String password = credt().get("password").toString();











            Snapshot snapshot = new Snapshot().takeSnapshots();

            String time = snapshot.getSnapshotTs().toString();
            BufferedImage image = snapshot.getBufferedImage();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                ImageIO.write(image, "jpg", baos);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                baos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] imageInByte = baos.toByteArray();
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


            GlobalKeyboardHook keyboardHook = new GlobalKeyboardHook(true);
            for (Map.Entry<Long, String> keyboard : GlobalKeyboardHook.listKeyboards().entrySet()) {
                System.out.format("%d: %s\n", keyboard.getKey(), keyboard.getValue());
            }
            keyboardHook.addKeyListener(new GlobalKeyAdapter() {
                @Override
                public void keyPressed(GlobalKeyEvent event) {
                    System.out.println(event);
                }

                @Override
                public void keyReleased(GlobalKeyEvent event) {
                    System.out.println(event);
                    keyboardNb++;
                    System.out.println("###################### " + keyboardNb);
                }
            });

            //-----------------------------------------------------------------------------------------------------
            //--------------------------------------Mouse Activity--------------------------------------------------


            GlobalMouseHook mouseHook = new GlobalMouseHook(); // Add true to the constructor, to switch to raw input mode

            System.out.println("Global mouse hook successfully started, press [middle] mouse button to shutdown. Connected mice:");

            for (Map.Entry<Long, String> mouse : GlobalMouseHook.listMice().entrySet()) {
                System.out.format("%d: %s\n", mouse.getKey(), mouse.getValue());
            }

            mouseHook.addMouseListener(new GlobalMouseAdapter() {

                @Override
                public void mousePressed(GlobalMouseEvent event) {
                    System.out.println(event);
                    if ((event.getButtons() & GlobalMouseEvent.BUTTON_LEFT) != GlobalMouseEvent.BUTTON_NO
                            && (event.getButtons() & GlobalMouseEvent.BUTTON_RIGHT) != GlobalMouseEvent.BUTTON_NO) {
                        System.out.println("Both mouse buttons are currently pressed!");
                    }

                }

                @Override
                public void mouseReleased(GlobalMouseEvent event) {
                    System.out.println(event);
                    mouseNb++;
                    System.out.println("*****************************" + mouseNb);
                }

                @Override
                public void mouseMoved(GlobalMouseEvent event) {
                    System.out.println(event);
                }

                @Override
                public void mouseWheel(GlobalMouseEvent event) {
                    System.out.println(event);
                }
            });

            System.out.println("########################"+this.cp+this.ct+"########################");


            SnapshotService snapshotService = new SnapshotService();

            try {
                snapshotService.SendSnapshot(imageInByte, time, ID, password, keyboardNb, mouseNb, cp, ct);
            } catch (XmlRpcException e) {
                e.printStackTrace();
            }
            keyboardNb = 0;
            mouseNb = 0;





        Thread.sleep(n);


    }

    @Override
    public Object doInBackground(Object[] objects) {
        //This method runs on background thread

        boolean task = true;

        while (task) {

            Random rand = new Random();
            int n = rand.nextInt(600000);
            int x = 600000-n;
            try {
                snpaOnTime(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(x);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        try {
            chrono();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void onPostExecute(Object o) {

    }

    @Override
    public void progressCallback(Object[] objects) {

    }
}

   /* @Override
    void onPostExecute() {

        //This method runs on UI Thread after background task has done
        this.controller.updateProgressLabel("Download is Done");

    }
*/
   /* @Override
    void progressCallback(Object... params) {

        //This method update your UI Thread during the execution of background thread

        double progress = (double)params[0]
        this.controller.updateProgress(progress);
    }
}*/

//To call this class you just need to instatiate that doing
/*

    Example testing = new Example(myController);
testing.execute();*/

package services;

import controllers.MainVueController;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyAdapter;
import lc.kra.system.keyboard.event.GlobalKeyEvent;
import lc.kra.system.mouse.GlobalMouseHook;
import lc.kra.system.mouse.event.GlobalMouseAdapter;
import lc.kra.system.mouse.event.GlobalMouseEvent;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class ActivityService extends Task {

    private int keyboardNb = 0;
    private int mouseNb = 0;


    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    private String cp,ct;


    public Claims credt() {

        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(LoginService.SECRET_KEY))
                .parseClaimsJws(LoginService.Token).getBody();


        return claims;
    }


    @Override
    protected Object call() throws Exception {


        Integer ID = (Integer) credt().get("ID");
        String password = credt().get("password").toString();


        while (true) {

            Snapshot snapshot = new Snapshot().takeSnapshots();

            String time = snapshot.getSnapshotTs().toString();
            BufferedImage image = snapshot.getBufferedImage();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "jpg", baos);
            baos.flush();
            byte[] imageInByte = baos.toByteArray();
            baos.close();


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

            Thread.sleep(2000);
            SnapshotService snapshotService = new SnapshotService();

            snapshotService.SendSnapshot(imageInByte, time, ID, password, keyboardNb, mouseNb, getCp(), getCt());
            keyboardNb = 0;
            mouseNb = 0;

            Thread.sleep(2000);
            return null;
        }

    }
}
package services;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Date;

public class Snapshot {

    private Date snapshotTs;
    private BufferedImage bufferedImage;
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setSnapshotTs(Date snapshotTs) {
        this.snapshotTs = snapshotTs;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }




    public Date getSnapshotTs() {
        return snapshotTs;
    }


    public Snapshot() {

    }


    public Snapshot takeSnapshots(){


        BufferedImage image = null;
        try {
            Thread.sleep(120);
            Robot r = new Robot();
            //String path = "************";
            Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            image = r.createScreenCapture(capture);
            //ImageIO.write(Image, "jpg", new File(path));
            Snapshot snapshots = new Snapshot();
            snapshots.setBufferedImage(image);
            snapshots.setImage(image);
            snapshots.setSnapshotTs(new Date());
            return snapshots;
        } catch (AWTException | InterruptedException ex) {
            System.out.println(ex);

        }
        return null;


    }


}




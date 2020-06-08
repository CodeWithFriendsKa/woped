/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woped.file.yawl;

import jakarta.xml.bind.JAXBException;
import org.woped.file.yawl.wfnet.AutoLayout;
import org.woped.file.yawl.wfnet.WfNet;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;

/**
 *
 * @author Chris
 */
public class YawlInterface {

    /**
     * @param file the command line arguments
     */
    public static String importYawlFile(File file) throws JAXBException {
        // TODO code application logic here

        //String path = "C:\\Users\\Chris\\Documents\\__pnml_yawl\\orsplit.yawl";
        //File file = new File(path);

    	String output = "";
    	
        YawlImport yi = new YawlImport();

        WfNet wfNet = yi.importYawlXml(file);

        YawlToPnmlTransform tf = new YawlToPnmlTransform(wfNet);
        tf.Transform();

        AutoLayout al =new AutoLayout(wfNet);
        al.Layout();

        PnmlOutput po = new PnmlOutput(wfNet);

        output = po.getPnmlOutput();

        //setClipboardContents(output);


        return output;

    }

    public static void setClipboardContents(String aString) {
        StringSelection stringSelection = new StringSelection(aString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
}

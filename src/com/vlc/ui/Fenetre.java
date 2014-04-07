/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vlc.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 *
 * @author toure
 */
class Fenetre extends JFrame {
    private PrincipalPan pp;
    public Fenetre(String titre) {
        pp = new PrincipalPan();
        setContentPane(pp);
        setTitle(titre);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setSize(570, 120);
        setVisible(true);
        addComponentListener(new ComponentAdapter() {

            @Override
            public void componentResized(ComponentEvent e) {
                int H=120;
                if(getHeight()>300){
                    H=getHeight();
                    pp.setSouthPan(true);
                    repaint();
                }else if(getHeight()<300){
                    H=120;
                    pp.setSouthPan(false);
                }
                setSize(new Dimension(getWidth(),H));
                super.componentResized(e);
            }

        });
    }


}
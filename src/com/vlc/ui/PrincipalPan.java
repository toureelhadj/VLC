/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vlc.ui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author toure
 */
public class PrincipalPan extends JPanel {

    private SouthPan st;
    private NorthPan nt;

    public JFrame getMain() {
        return main;
    }

    public void setMain(JFrame main) {
        this.main = main;
    }

    private JFrame main;

    public PrincipalPan(JFrame main) {
        this.main=main;
        setLayout(new BorderLayout());
        st = new SouthPan();
        st.setVisible(true);
        nt = new NorthPan(this);
        add(st, BorderLayout.CENTER);
        this.add(nt, BorderLayout.NORTH);
    }

    public void setSouthPan(boolean b) {
        st.setVisible(b);
        nt.getPp().getControlPan().setPlaylist(b);
    }
}

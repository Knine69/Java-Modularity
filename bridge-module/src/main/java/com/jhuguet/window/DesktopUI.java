package com.jhuguet.window;

import com.jhuguet.call.Caller;
import com.jhuguet.greeting.Greetings;

import javax.swing.*;
import java.awt.*;

public class DesktopUI extends JFrame {
    static String greeting = Greetings.greetMethod();

    public DesktopUI() throws HeadlessException {
        super(greeting);
        setLayout(new FlowLayout());
        add(new Label(greeting));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(Caller.giveTitle());
        setSize(600, 600);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DesktopUI().setVisible(true));
    }
}

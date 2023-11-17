package org.app;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Enterprise enterprise = new Enterprise();
            EnterpriseGUI enterpriseGUI = new EnterpriseGUI(enterprise);
        });
    }
}

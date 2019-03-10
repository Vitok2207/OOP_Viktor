package AppPackage;

import com.teknikindustries.yahooweather.WeatherDisplay;
import com.teknikindustries.yahooweather.WeatherDoc;

import javax.swing.GroupLayout;
import javax.swing.WindowConstants;

public class HomeGUI extends javax.swing.JFrame {
    public HomeGUI() {
        initComponents();
        getWeather();
    }

    private void getWeather() {
        WeatherDoc doc = new WeatherDoc("2345496", "c");
        WeatherDisplay disp = new WeatherDisplay();

        System.out.println("disp.getTemperature()");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 322, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 254, Short.MAX_VALUE));

        pack();
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HomeGUI().setVisible(true);
            }
        });
    }
}

package pertemuantiga.pertemuansembila;

import javax.swing.*;

interface Penilaian {
    String kualitas();
}

abstract class BijiKopi {
    String nama;
    double berat;

    BijiKopi(String nama, double berat) {
        this.nama = nama;
        this.berat = berat;
    }

    abstract String klasifikasi();
}

class Arabika extends BijiKopi implements Penilaian {
    Arabika(String nama, double berat) {
        super(nama, berat);
    }

    String klasifikasi() {
        return "Arabika";
    }

    public String kualitas() {
        return berat >= 10 ? "Baik" : "Cukup";
    }
}

class Robusta extends BijiKopi implements Penilaian {
    Robusta(String nama, double berat) {
        super(nama, berat);
    }

    String klasifikasi() {
        return "Robusta";
    }

    public String kualitas() {
        return berat >= 8 ? "Baik" : "Rendah";
    }
}

public class KlasifikasiKopi {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Klasifikasi Kopi");
        frame.setSize(350, 280);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Nama");
        l1.setBounds(20, 20, 100, 25);
        frame.add(l1);

        JTextField txtNama = new JTextField();
        txtNama.setBounds(120, 20, 180, 25);
        frame.add(txtNama);

        JLabel l2 = new JLabel("Berat");
        l2.setBounds(20, 60, 100, 25);
        frame.add(l2);

        JTextField txtBerat = new JTextField();
        txtBerat.setBounds(120, 60, 180, 25);
        frame.add(txtBerat);

        JComboBox<String> combo = new JComboBox<>(new String[]{"Arabika", "Robusta"});
        combo.setBounds(120, 100, 180, 25);
        frame.add(combo);

        JButton btn = new JButton("Proses");
        btn.setBounds(120, 140, 100, 30);
        frame.add(btn);

        JTextArea hasil = new JTextArea();
        hasil.setBounds(20, 180, 300, 60);
        hasil.setEditable(false);
        frame.add(hasil);

        btn.addActionListener(e -> {
            try {
                String nama = txtNama.getText();
                double berat = Double.parseDouble(txtBerat.getText());

                BijiKopi kopi = combo.getSelectedItem().equals("Arabika")
                        ? new Arabika(nama, berat)
                        : new Robusta(nama, berat);

                hasil.setText(
                        "Nama: " + nama +
                        "\nJenis: " + kopi.klasifikasi() +
                        "\nKualitas: " + ((Penilaian) kopi).kualitas()
                );

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Input salah!");
            }
        });

        frame.setVisible(true);
    }
}

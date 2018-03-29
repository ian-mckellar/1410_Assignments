package face;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class FaceGui extends JFrame {
	private JPanel contentPane;
	private FacePanel facePanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FaceGui frame = new FaceGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FaceGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel controlPanel = createControlPanel();
		contentPane.add(controlPanel, BorderLayout.WEST);

		facePanel = new FacePanel();
		contentPane.add(facePanel, BorderLayout.CENTER);
	}

	/**
	 * creates a control panel with three radio buttons and an update button. if no
	 * radio buttons are selected and update is is clicked color of face changes. if
	 * a radio button is selected it changes the corresponding setter to true. For
	 * example; is rdbbtnEyes is selected, setHoldEyes will be set to true.
	 * 
	 * calls repaint, any true components will be repainted to different random
	 * component.
	 * 
	 * @return
	 */
	private JPanel createControlPanel() {
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(16, 16, 0, 16));

		panel.setLayout(new GridLayout(10, 1, 0, 0));

		JLabel lblYouChoose = new JLabel("You choose ...");
		panel.add(lblYouChoose);

		JCheckBox rdbtnEyes = new JCheckBox("Eyes");
		panel.add(rdbtnEyes);

		JCheckBox rdbtnNose = new JCheckBox("Nose");
		panel.add(rdbtnNose);

		JCheckBox rdbtnMouth = new JCheckBox("Mouth");
		panel.add(rdbtnMouth);

		JButton btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facePanel.setHoldEye(rdbtnEyes.isSelected());
				facePanel.setHoldNose(rdbtnNose.isSelected());
				facePanel.setHoldMouth(rdbtnMouth.isSelected());

				if (!rdbtnEyes.isSelected() && !rdbtnMouth.isSelected() && !rdbtnNose.isSelected()) {
					facePanel.setHoldFace(true);
				} else {
					facePanel.setHoldFace(false);
				}

				facePanel.repaint();
			}
		});
		panel.add(btnUpdate);
		return panel;
	}

}

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javafx.application.Application;
import javafx.stage.Stage;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.awt.Panel;

public class client extends Application{
	static JLabel label,F_1,F_2,F_3,F_4,F_5,F_6,F_7,F_8,F_9,F_10,F_11,F_12,F_13,F_14,F_15,F_16,F_17,
	FOUT_1,FOUT_2,FOUT_3,FOUT_4,FOUT_5,FOUT_6,FOUT_7,FOUT_8,FOUT_9,FOUT_10,FOUT_11,FOUT_12,FOUT_13,FOUT_14,FOUT_15
	,L_1,L_2,L_3,L_4,L_5,L_6,L_7,L_8,L_9,L_10,L_11,L_12,L_13,L_14,L_15,L_16,L_17,
	LOUT_1,LOUT_2,LOUT_3,LOUT_4,LOUT_5,LOUT_6,LOUT_7,LOUT_8,LOUT_9,LOUT_10,LOUT_11,LOUT_12,LOUT_13,LOUT_14,LOUT_15
	,R_1,R_2,R_3,R_4,R_5,R_6,R_7,R_8,R_9,R_10,R_11,R_12,R_13,R_14,R_15,R_16,R_17,
	ROUT_1,ROUT_2,ROUT_3,ROUT_4,ROUT_5,ROUT_6,ROUT_7,ROUT_8,ROUT_9,ROUT_10,ROUT_11,ROUT_12,ROUT_13,ROUT_14,ROUT_15
	,HOUT_1,HOUT_2,HOUT_3,HOUT_4,HOUT_5,HOUT_6,HOUT_7,HOUT_8,HOUT_9,HOUT_10,HOUT_11,HOUT_12,HOUT_13,HOUT_14,HOUT_15;
	static JButton H_1,H_2,H_3,H_4,H_5,H_6,H_7,H_8,H_9,H_10,H_11,H_12,H_13,H_14,H_15,H_16,H_17;
	static JTextArea textArea;
	private JLabel label_2;
	private static Audio play=new Audio();
	private static JButton button_1;
	private static JButton button_2;
	private static JButton button_3;
	private static JButton button_4;
	private static JButton button_5;
	private static JButton button_6;
	private static JLabel label_15;
	private static JLabel label_5;
	private static JLabel label_6;
	private static JLabel label_7;
	private static JLabel label_8;
	private static JLabel label_9;
	private static JLabel label_10;
	private static JLabel label_11;
	private static JLabel label_12;
	private static JLabel label_13;
	private static JLabel label_16;
	static JFrame clientframe;
	static JTextField text;
	static JButton button;
	static Socket client_s;
	static BufferedReader in;
	static PrintWriter out ;
	private static JFrame asda=new JFrame();
	private static JTextField textField;
	static int a=0;
	static String change=null;	
	static String getcard[]=new String[4];	
	static String getcardname=null;	
	static String seven=null;
	static String name[]=new String[4];
	static int gamermember=0;
	static int mynamemember=0;
	private static int Otherbody[]={16,16,16};
	private static int Otherbody_OUT[]={0,0,0};
	private static int H[]={0,0,0,0,0,0,0,0,0,0};
	private static int C[]={0,0,0,0,0,0,0,0,0,0};
	private static int B[]={0,0,0,0,0,0,0,0,0,0};
	private static int O[]={0,0,0,0,0,0,0};
	private static String number[] = {"一","二","三","四","五","六","七","八","九"};
	private static String card[] = {"萬","餅","條"};
	private static String other_card[] = {"白板","紅中","發財","東風","南風","西風","北風"};
	private static String nowcard[] =new String[16];
	private static int now[] =new int[16];
	private static int cardmember=0;
	private static int cardmember_out=0;
	private static JLabel Hname;
	private JPanel panel_1;
	private JButton btnNewButton;
	private boolean startgame=false;
	private boolean Action=false;
	private JLabel label_1;
	private JLabel Rnam;
	private JLabel label_3;
	private JLabel Fname;
	private static JLabel Lname;
	private JLabel Rname;
	private int sevenmember;
	private static boolean myround=false;
	private boolean OUTB=false;
	private static boolean eatboolean=false;
	private static int time=0;
	private static String line;
	private static int OU=0;
	static Timer ass=new Timer(1000,new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(!myround){
				System.out.println(time+"計時器"+a);
            	
				if(time==0 && !name[mynamemember].equals(line.substring(2))){
					if(a/1000>0){
		        		button_1.setVisible(true);
		        	}
		        	if(a/1000==2){
		        		button_3.setVisible(true);
		        	}
				}
				if(time==5 && Lname.getText().equals(line.substring(2))){
					if(a/1000>0){
		        		button_1.setVisible(false);
		        	}
		        	if(a/1000==3){
		        		button_3.setVisible(false);
		        	}
		        	if(a%1000>0){
		        		button_2.setVisible(true);
		        	}
				}
			}
			label_16.setText(time+"");
			if(time==11 && !eatboolean){
				button_1.setVisible(false);
				button_2.setVisible(false);
				button_3.setVisible(false);
				button_4.setVisible(false);
				button_5.setVisible(false);
				button_6.setVisible(false);
				time=0;
				out.println("NOTHING");
				ass.stop();
			}else if(time==16 && eatboolean){
				button_1.setVisible(false);
				button_2.setVisible(false);
				button_3.setVisible(false);
				button_4.setVisible(false);
				button_5.setVisible(false);
				button_6.setVisible(false);
				time=0;
				out.println("NOTHING");
				ass.stop();
			}
			time++;
		}
	});
	Icon back = new ImageIcon(this.getClass().getResource("picture\\back.png"));
	Icon backr = new ImageIcon(this.getClass().getResource("picture\\backr.png"));
	Icon c1 = new ImageIcon(this.getClass().getResource("picture\\c1.png"));
	Icon c1r = new ImageIcon(this.getClass().getResource("picture\\c1r.png"));
	Icon c1c = new ImageIcon(this.getClass().getResource("picture\\c1c.png"));
	Icon c1l = new ImageIcon(this.getClass().getResource("picture\\c1l.png"));
	Icon c2 = new ImageIcon(this.getClass().getResource("picture\\c2.png"));
	Icon c2r = new ImageIcon(this.getClass().getResource("picture\\c2r.png"));
	Icon c2c = new ImageIcon(this.getClass().getResource("picture\\c2c.png"));
	Icon c2l = new ImageIcon(this.getClass().getResource("picture\\c2l.png"));
	Icon c3 = new ImageIcon(this.getClass().getResource("picture\\c3.png"));
	Icon c3r = new ImageIcon(this.getClass().getResource("picture\\c3r.png"));
	Icon c3c = new ImageIcon(this.getClass().getResource("picture\\c3c.png"));
	Icon c3l = new ImageIcon(this.getClass().getResource("picture\\c3l.png"));
	Icon c4 = new ImageIcon(this.getClass().getResource("picture\\c4.png"));
	Icon c4r = new ImageIcon(this.getClass().getResource("picture\\c4r.png"));
	Icon c4c = new ImageIcon(this.getClass().getResource("picture\\c4c.png"));
	Icon c4l = new ImageIcon(this.getClass().getResource("picture\\c4l.png"));
	Icon c5 = new ImageIcon(this.getClass().getResource("picture\\c5.png"));
	Icon c5r = new ImageIcon(this.getClass().getResource("picture\\c5r.png"));
	Icon c5c = new ImageIcon(this.getClass().getResource("picture\\c5c.png"));
	Icon c5l = new ImageIcon(this.getClass().getResource("picture\\c5l.png"));
	Icon c6 = new ImageIcon(this.getClass().getResource("picture\\c6.png"));
	Icon c6r = new ImageIcon(this.getClass().getResource("picture\\c6r.png"));
	Icon c6c = new ImageIcon(this.getClass().getResource("picture\\c6c.png"));
	Icon c6l = new ImageIcon(this.getClass().getResource("picture\\c6l.png"));
	Icon c7 = new ImageIcon(this.getClass().getResource("picture\\c7.png"));
	Icon c7r = new ImageIcon(this.getClass().getResource("picture\\c7r.png"));
	Icon c7c = new ImageIcon(this.getClass().getResource("picture\\c7c.png"));
	Icon c7l = new ImageIcon(this.getClass().getResource("picture\\c7l.png"));
	Icon c8 = new ImageIcon(this.getClass().getResource("picture\\c8.png"));
	Icon c8r = new ImageIcon(this.getClass().getResource("picture\\c8r.png"));
	Icon c8c = new ImageIcon(this.getClass().getResource("picture\\c8c.png"));
	Icon c8l = new ImageIcon(this.getClass().getResource("picture\\c8l.png"));
	Icon c9 = new ImageIcon(this.getClass().getResource("picture\\c9.png"));
	Icon c9r = new ImageIcon(this.getClass().getResource("picture\\c9r.png"));
	Icon c9c = new ImageIcon(this.getClass().getResource("picture\\c9c.png"));
	Icon c9l = new ImageIcon(this.getClass().getResource("picture\\c9l.png"));
	Icon b1 = new ImageIcon(this.getClass().getResource("picture\\b1.png"));
	Icon b1r = new ImageIcon(this.getClass().getResource("picture\\b1r.png"));
	Icon b1c = new ImageIcon(this.getClass().getResource("picture\\b1c.png"));
	Icon b1l = new ImageIcon(this.getClass().getResource("picture\\b1l.png"));
	Icon b2 = new ImageIcon(this.getClass().getResource("picture\\b2.png"));
	Icon b2r = new ImageIcon(this.getClass().getResource("picture\\b2r.png"));
	Icon b2c = new ImageIcon(this.getClass().getResource("picture\\b2c.png"));
	Icon b2l = new ImageIcon(this.getClass().getResource("picture\\b2l.png"));
	Icon b3 = new ImageIcon(this.getClass().getResource("picture\\b3.png"));
	Icon b3r = new ImageIcon(this.getClass().getResource("picture\\b3r.png"));
	Icon b3c = new ImageIcon(this.getClass().getResource("picture\\b3c.png"));
	Icon b3l = new ImageIcon(this.getClass().getResource("picture\\b3l.png"));
	Icon b4 = new ImageIcon(this.getClass().getResource("picture\\b4.png"));
	Icon b4r = new ImageIcon(this.getClass().getResource("picture\\b4r.png"));
	Icon b4c = new ImageIcon(this.getClass().getResource("picture\\b4c.png"));
	Icon b4l = new ImageIcon(this.getClass().getResource("picture\\b4l.png"));
	Icon b5 = new ImageIcon(this.getClass().getResource("picture\\b5.png"));
	Icon b5r = new ImageIcon(this.getClass().getResource("picture\\b5r.png"));
	Icon b5c = new ImageIcon(this.getClass().getResource("picture\\b5c.png"));
	Icon b5l = new ImageIcon(this.getClass().getResource("picture\\b5l.png"));
	Icon b6 = new ImageIcon(this.getClass().getResource("picture\\b6.png"));
	Icon b6r = new ImageIcon(this.getClass().getResource("picture\\b6r.png"));
	Icon b6c = new ImageIcon(this.getClass().getResource("picture\\b6c.png"));
	Icon b6l = new ImageIcon(this.getClass().getResource("picture\\b6l.png"));
	Icon b7 = new ImageIcon(this.getClass().getResource("picture\\b7.png"));
	Icon b7r = new ImageIcon(this.getClass().getResource("picture\\b7r.png"));
	Icon b7c = new ImageIcon(this.getClass().getResource("picture\\b7c.png"));
	Icon b7l = new ImageIcon(this.getClass().getResource("picture\\b7l.png"));
	Icon b8 = new ImageIcon(this.getClass().getResource("picture\\b8.png"));
	Icon b8r = new ImageIcon(this.getClass().getResource("picture\\b8r.png"));
	Icon b8c = new ImageIcon(this.getClass().getResource("picture\\b8c.png"));
	Icon b8l = new ImageIcon(this.getClass().getResource("picture\\b8l.png"));
	Icon b9 = new ImageIcon(this.getClass().getResource("picture\\b9.png"));
	Icon b9r = new ImageIcon(this.getClass().getResource("picture\\b9r.png"));
	Icon b9c = new ImageIcon(this.getClass().getResource("picture\\b9c.png"));
	Icon b9l = new ImageIcon(this.getClass().getResource("picture\\b9l.png"));
	Icon h1 = new ImageIcon(this.getClass().getResource("picture\\h1.png"));
	Icon h1r = new ImageIcon(this.getClass().getResource("picture\\h1r.png"));
	Icon h1c = new ImageIcon(this.getClass().getResource("picture\\h1c.png"));
	Icon h1l = new ImageIcon(this.getClass().getResource("picture\\h1l.png"));
	Icon h2 = new ImageIcon(this.getClass().getResource("picture\\h2.png"));
	Icon h2r = new ImageIcon(this.getClass().getResource("picture\\h2r.png"));
	Icon h2c = new ImageIcon(this.getClass().getResource("picture\\h2c.png"));
	Icon h2l = new ImageIcon(this.getClass().getResource("picture\\h2l.png"));
	Icon h3 = new ImageIcon(this.getClass().getResource("picture\\h3.png"));
	Icon h3r = new ImageIcon(this.getClass().getResource("picture\\h3r.png"));
	Icon h3c = new ImageIcon(this.getClass().getResource("picture\\h3c.png"));
	Icon h3l = new ImageIcon(this.getClass().getResource("picture\\h3l.png"));
	Icon h4 = new ImageIcon(this.getClass().getResource("picture\\h4.png"));
	Icon h4r = new ImageIcon(this.getClass().getResource("picture\\h4r.png"));
	Icon h4c = new ImageIcon(this.getClass().getResource("picture\\h4c.png"));
	Icon h4l = new ImageIcon(this.getClass().getResource("picture\\h4l.png"));
	Icon h5 = new ImageIcon(this.getClass().getResource("picture\\h5.png"));
	Icon h5r = new ImageIcon(this.getClass().getResource("picture\\h5r.png"));
	Icon h5c = new ImageIcon(this.getClass().getResource("picture\\h5c.png"));
	Icon h5l = new ImageIcon(this.getClass().getResource("picture\\h5l.png"));
	Icon h6 = new ImageIcon(this.getClass().getResource("picture\\h6.png"));
	Icon h6r = new ImageIcon(this.getClass().getResource("picture\\h6r.png"));
	Icon h6c = new ImageIcon(this.getClass().getResource("picture\\h6c.png"));
	Icon h6l = new ImageIcon(this.getClass().getResource("picture\\h6l.png"));
	Icon h7 = new ImageIcon(this.getClass().getResource("picture\\h7.png"));
	Icon h7r = new ImageIcon(this.getClass().getResource("picture\\h7r.png"));
	Icon h7c = new ImageIcon(this.getClass().getResource("picture\\h7c.png"));
	Icon h7l = new ImageIcon(this.getClass().getResource("picture\\h7l.png"));
	Icon h8 = new ImageIcon(this.getClass().getResource("picture\\h8.png"));
	Icon h8r = new ImageIcon(this.getClass().getResource("picture\\h8r.png"));
	Icon h8c = new ImageIcon(this.getClass().getResource("picture\\h8c.png"));
	Icon h8l = new ImageIcon(this.getClass().getResource("picture\\h8l.png"));
	Icon h9 = new ImageIcon(this.getClass().getResource("picture\\h9.png"));
	Icon h9r = new ImageIcon(this.getClass().getResource("picture\\h9r.png"));
	Icon h9c = new ImageIcon(this.getClass().getResource("picture\\h9c.png"));
	Icon h9l = new ImageIcon(this.getClass().getResource("picture\\h9l.png"));
	Icon fa = new ImageIcon(this.getClass().getResource("picture\\fa.png"));
	Icon far = new ImageIcon(this.getClass().getResource("picture\\far.png"));
	Icon fac = new ImageIcon(this.getClass().getResource("picture\\fac.png"));
	Icon fal = new ImageIcon(this.getClass().getResource("picture\\fal.png"));
	Icon ww = new ImageIcon(this.getClass().getResource("picture\\ww.png"));
	Icon wwr = new ImageIcon(this.getClass().getResource("picture\\wwr.png"));
	Icon wwc = new ImageIcon(this.getClass().getResource("picture\\wwc.png"));
	Icon wwl = new ImageIcon(this.getClass().getResource("picture\\wwl.png"));
	Icon ew = new ImageIcon(this.getClass().getResource("picture\\ew.png"));
	Icon ewr = new ImageIcon(this.getClass().getResource("picture\\ewr.png"));
	Icon ewc = new ImageIcon(this.getClass().getResource("picture\\ewc.png"));
	Icon ewl = new ImageIcon(this.getClass().getResource("picture\\ewl.png"));
	Icon sw = new ImageIcon(this.getClass().getResource("picture\\sw.png"));
	Icon swr = new ImageIcon(this.getClass().getResource("picture\\swr.png"));
	Icon swc = new ImageIcon(this.getClass().getResource("picture\\swc.png"));
	Icon swl = new ImageIcon(this.getClass().getResource("picture\\swl.png"));
	Icon nw = new ImageIcon(this.getClass().getResource("picture\\nw.png"));
	Icon nwr = new ImageIcon(this.getClass().getResource("picture\\nwr.png"));
	Icon nwc = new ImageIcon(this.getClass().getResource("picture\\nwc.png"));
	Icon nwl = new ImageIcon(this.getClass().getResource("picture\\nwl.png"));
	Icon rd = new ImageIcon(this.getClass().getResource("picture\\rd.png"));
	Icon rdr = new ImageIcon(this.getClass().getResource("picture\\rdr.png"));
	Icon rdc = new ImageIcon(this.getClass().getResource("picture\\rdc.png"));
	Icon rdl = new ImageIcon(this.getClass().getResource("picture\\rdl.png"));
	Icon wd = new ImageIcon(this.getClass().getResource("picture\\wd.png"));
	Icon wdr = new ImageIcon(this.getClass().getResource("picture\\wdr.png"));
	private JButton button_7;

	public static void main(String[] args) throws Exception {
		client a=new client();
		a.reset();
		a.run();
	}
	public client()  {
		asda.getContentPane().setForeground(Color.BLACK);
		asda.setForeground(Color.WHITE);
		//client_s =new Socket("127.0.0.1",9090);
		//in =new BufferedReader(new InputStreamReader(client_s.getInputStream()));
		//out = new PrintWriter(client_s.getOutputStream(), true);
		asda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    asda.setSize(1339, 916);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{359, 46, 44, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 25, 46, 44, 0, 0};
		gridBagLayout.rowHeights = new int[]{44, 44, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 15, 44, 37, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		asda.getContentPane().setLayout(gridBagLayout);
		
		label_3 = new JLabel("\u5C0D\u9762\u73A9\u5BB6");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridwidth = 2;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 0;
		asda.getContentPane().add(label_3, gbc_label_3);
		
		Fname = new JLabel("name");
		GridBagConstraints gbc_Fname = new GridBagConstraints();
		gbc_Fname.gridwidth = 2;
		gbc_Fname.insets = new Insets(0, 0, 5, 5);
		gbc_Fname.gridx = 1;
		gbc_Fname.gridy = 1;
		asda.getContentPane().add(Fname, gbc_Fname);
		
		Rnam = new JLabel("\u53F3\u908A\u73A9\u5BB6");
		GridBagConstraints gbc_Rnam = new GridBagConstraints();
		gbc_Rnam.insets = new Insets(0, 0, 5, 0);
		gbc_Rnam.gridx = 23;
		gbc_Rnam.gridy = 1;
		asda.getContentPane().add(Rnam, gbc_Rnam);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.BASELINE;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 2;
		asda.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		textField.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
            	out.println("MESSAGE "+textField.getText());
                textField.setText("");
            }
        });
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.BASELINE;
		gbc_panel_1.gridheight = 17;
		gbc_panel_1.gridwidth = 17;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 4;
		gbc_panel_1.gridy = 2;
		asda.getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 0};
		gbl_panel_1.rowHeights = new int[]{44, 44, 44, 44, 44, 44, 15, 15, 15, 44, 15, 15, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		Rname = new JLabel("New label");
		GridBagConstraints gbc_Rname = new GridBagConstraints();
		gbc_Rname.insets = new Insets(0, 0, 5, 0);
		gbc_Rname.gridx = 23;
		gbc_Rname.gridy = 2;
		asda.getContentPane().add(Rname, gbc_Rname);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 15;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 3;
		asda.getContentPane().add(new JScrollPane(textArea), gbc_textArea);
		
		L_6 = new JLabel("");
		L_6.setIcon(new ImageIcon("picture\\backr.png"));
		GridBagConstraints gbc_L_6 = new GridBagConstraints();
		gbc_L_6.insets = new Insets(0, 0, 5, 5);
		gbc_L_6.gridx = 2;
		gbc_L_6.gridy = 7;
		asda.getContentPane().add(L_6, gbc_L_6);
		
		L_2 = new JLabel("");
		GridBagConstraints gbc_L_2 = new GridBagConstraints();
		gbc_L_2.insets = new Insets(0, 0, 5, 5);
		gbc_L_2.gridx = 2;
		gbc_L_2.gridy = 3;
		asda.getContentPane().add(L_2, gbc_L_2);
		
		L_3 = new JLabel("");
		GridBagConstraints gbc_L_3 = new GridBagConstraints();
		gbc_L_3.insets = new Insets(0, 0, 5, 5);
		gbc_L_3.gridx = 2;
		gbc_L_3.gridy = 4;
		asda.getContentPane().add(L_3, gbc_L_3);
		
		L_1 = new JLabel("");
		GridBagConstraints gbc_L_1 = new GridBagConstraints();
		gbc_L_1.anchor = GridBagConstraints.BASELINE;
		gbc_L_1.insets = new Insets(0, 0, 5, 5);
		gbc_L_1.gridx = 2;
		gbc_L_1.gridy = 2;
		asda.getContentPane().add(L_1, gbc_L_1);
		
		L_4 = new JLabel("");
		GridBagConstraints gbc_L_4 = new GridBagConstraints();
		gbc_L_4.insets = new Insets(0, 0, 5, 5);
		gbc_L_4.gridx =2;
		gbc_L_4.gridy = 5;
		asda.getContentPane().add(L_4, gbc_L_4);
		
		L_5 = new JLabel("");
		GridBagConstraints gbc_L_5 = new GridBagConstraints();
		gbc_L_5.insets = new Insets(0, 0, 5, 5);
		gbc_L_5.gridx = 2;
		gbc_L_5.gridy = 6;
		asda.getContentPane().add(L_5, gbc_L_5);
		
		F_1 = new JLabel("");
		GridBagConstraints gbc_F_1 = new GridBagConstraints();
		gbc_F_1.insets = new Insets(0, 0, 5, 5);
		gbc_F_1.gridx = 4;
		gbc_F_1.gridy = 0;
		asda.getContentPane().add(F_1, gbc_F_1);
		
		F_2 = new JLabel("");
		GridBagConstraints gbc_F_2 = new GridBagConstraints();
		gbc_F_2.insets = new Insets(0, 0, 5, 5);
		gbc_F_2.gridx = 5;
		gbc_F_2.gridy = 0;
		asda.getContentPane().add(F_2, gbc_F_2);
		
		F_3 = new JLabel("");
		GridBagConstraints gbc_F_3 = new GridBagConstraints();
		gbc_F_3.insets = new Insets(0, 0, 5, 5);
		gbc_F_3.gridx = 6;
		gbc_F_3.gridy = 0;
		asda.getContentPane().add(F_3, gbc_F_3);
		
		F_4 = new JLabel("");
		GridBagConstraints gbc_F_4 = new GridBagConstraints();
		gbc_F_4.insets = new Insets(0, 0, 5, 5);
		gbc_F_4.gridx = 7;
		gbc_F_4.gridy = 0;
		asda.getContentPane().add(F_4, gbc_F_4);
		
		F_5 = new JLabel("");
		GridBagConstraints gbc_F_5 = new GridBagConstraints();
		gbc_F_5.insets = new Insets(0, 0, 5, 5);
		gbc_F_5.gridx = 8;
		gbc_F_5.gridy = 0;
		asda.getContentPane().add(F_5, gbc_F_5);
		
		F_6 = new JLabel("");
		GridBagConstraints gbc_F_6 = new GridBagConstraints();
		gbc_F_6.insets = new Insets(0, 0, 5, 5);
		gbc_F_6.gridx = 9;
		gbc_F_6.gridy = 0;
		asda.getContentPane().add(F_6, gbc_F_6);
		
		F_7 = new JLabel("");
		GridBagConstraints gbc_F_7 = new GridBagConstraints();
		gbc_F_7.insets = new Insets(0, 0, 5, 5);
		gbc_F_7.gridx = 10;
		gbc_F_7.gridy = 0;
		asda.getContentPane().add(F_7, gbc_F_7);
		
		F_8 = new JLabel("");
		GridBagConstraints gbc_F_8 = new GridBagConstraints();
		gbc_F_8.insets = new Insets(0, 0, 5, 5);
		gbc_F_8.gridx = 11;
		gbc_F_8.gridy = 0;
		asda.getContentPane().add(F_8, gbc_F_8);
		
		F_9 = new JLabel("");
		GridBagConstraints gbc_F_9 = new GridBagConstraints();
		gbc_F_9.insets = new Insets(0, 0, 5, 5);
		gbc_F_9.gridx = 12;
		gbc_F_9.gridy = 0;
		asda.getContentPane().add(F_9, gbc_F_9);
		
		F_10 = new JLabel("");
		GridBagConstraints gbc_F_10 = new GridBagConstraints();
		gbc_F_10.insets = new Insets(0, 0, 5, 5);
		gbc_F_10.gridx = 13;
		gbc_F_10.gridy = 0;
		asda.getContentPane().add(F_10, gbc_F_10);
		
		F_11 = new JLabel("");
		GridBagConstraints gbc_F_11 = new GridBagConstraints();
		gbc_F_11.insets = new Insets(0, 0, 5, 5);
		gbc_F_11.gridx = 14;
		gbc_F_11.gridy = 0;
		asda.getContentPane().add(F_11, gbc_F_11);
		
		F_12 = new JLabel("");
		GridBagConstraints gbc_F_12 = new GridBagConstraints();
		gbc_F_12.insets = new Insets(0, 0, 5, 5);
		gbc_F_12.gridx = 15;
		gbc_F_12.gridy = 0;
		asda.getContentPane().add(F_12, gbc_F_12);
		
		F_13 = new JLabel("");
		GridBagConstraints gbc_F_13 = new GridBagConstraints();
		gbc_F_13.insets = new Insets(0, 0, 5, 5);
		gbc_F_13.gridx = 16;
		gbc_F_13.gridy = 0;
		asda.getContentPane().add(F_13, gbc_F_13);
		
		F_14 = new JLabel("");
		GridBagConstraints gbc_F_14 = new GridBagConstraints();
		gbc_F_14.anchor = GridBagConstraints.EAST;
		gbc_F_14.insets = new Insets(0, 0, 5, 5);
		gbc_F_14.gridx = 17;
		gbc_F_14.gridy = 0;
		asda.getContentPane().add(F_14, gbc_F_14);
		
		F_15 = new JLabel("");
		GridBagConstraints gbc_F_15 = new GridBagConstraints();
		gbc_F_15.insets = new Insets(0, 0, 5, 5);
		gbc_F_15.gridx = 18;
		gbc_F_15.gridy = 0;
		asda.getContentPane().add(F_15, gbc_F_15);
		
		F_16 = new JLabel("");
		GridBagConstraints gbc_F_16 = new GridBagConstraints();
		gbc_F_16.insets = new Insets(0, 0, 5, 5);
		gbc_F_16.gridx = 19;
		gbc_F_16.gridy = 0;
		asda.getContentPane().add(F_16, gbc_F_16);
		
		F_17 = new JLabel("");
		GridBagConstraints gbc_F_17 = new GridBagConstraints();
		gbc_F_17.fill = GridBagConstraints.VERTICAL;
		gbc_F_17.insets = new Insets(0, 0, 5, 5);
		gbc_F_17.gridx = 20;
		gbc_F_17.gridy = 0;
		asda.getContentPane().add(F_17, gbc_F_17);
		
		FOUT_1 = new JLabel("");
		GridBagConstraints gbc_FOUT_1 = new GridBagConstraints();
		gbc_FOUT_1.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_1.gridx = 5;
		gbc_FOUT_1.gridy = 1;
		asda.getContentPane().add(FOUT_1, gbc_FOUT_1);
		
		FOUT_2 = new JLabel("");
		GridBagConstraints gbc_FOUT_2 = new GridBagConstraints();
		gbc_FOUT_2.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_2.gridx = 6;
		gbc_FOUT_2.gridy = 1;
		asda.getContentPane().add(FOUT_2, gbc_FOUT_2);
		
		FOUT_3 = new JLabel("");
		GridBagConstraints gbc_FOUT_3 = new GridBagConstraints();
		gbc_FOUT_3.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_3.gridx = 7;
		gbc_FOUT_3.gridy = 1;
		asda.getContentPane().add(FOUT_3, gbc_FOUT_3);
		
		FOUT_4 = new JLabel("");
		GridBagConstraints gbc_FOUT_4 = new GridBagConstraints();
		gbc_FOUT_4.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_4.gridx = 8;
		gbc_FOUT_4.gridy = 1;
		asda.getContentPane().add(FOUT_4, gbc_FOUT_4);
		
		FOUT_5 = new JLabel("");
		GridBagConstraints gbc_FOUT_5 = new GridBagConstraints();
		gbc_FOUT_5.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_5.gridx = 9;
		gbc_FOUT_5.gridy = 1;
		asda.getContentPane().add(FOUT_5, gbc_FOUT_5);
		
		FOUT_6 = new JLabel("");
		GridBagConstraints gbc_FOUT_6 = new GridBagConstraints();
		gbc_FOUT_6.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_6.gridx = 10;
		gbc_FOUT_6.gridy = 1;
		asda.getContentPane().add(FOUT_6, gbc_FOUT_6);
		
		FOUT_7 = new JLabel("");
		GridBagConstraints gbc_FOUT_7 = new GridBagConstraints();
		gbc_FOUT_7.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_7.gridx = 11;
		gbc_FOUT_7.gridy = 1;
		asda.getContentPane().add(FOUT_7, gbc_FOUT_7);
		
		FOUT_8 = new JLabel("");
		GridBagConstraints gbc_FOUT_8 = new GridBagConstraints();
		gbc_FOUT_8.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_8.gridx = 12;
		gbc_FOUT_8.gridy = 1;
		asda.getContentPane().add(FOUT_8, gbc_FOUT_8);
		
		FOUT_9 = new JLabel("");
		GridBagConstraints gbc_FOUT_9 = new GridBagConstraints();
		gbc_FOUT_9.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_9.gridx = 13;
		gbc_FOUT_9.gridy = 1;
		asda.getContentPane().add(FOUT_9, gbc_FOUT_9);
		
		FOUT_10 = new JLabel("");
		GridBagConstraints gbc_FOUT_10 = new GridBagConstraints();
		gbc_FOUT_10.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_10.gridx = 14;
		gbc_FOUT_10.gridy = 1;
		asda.getContentPane().add(FOUT_10, gbc_FOUT_10);
		
		FOUT_11 = new JLabel("");
		GridBagConstraints gbc_FOUT_11 = new GridBagConstraints();
		gbc_FOUT_11.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_11.gridx = 15;
		gbc_FOUT_11.gridy = 1;
		asda.getContentPane().add(FOUT_11, gbc_FOUT_11);
		
		FOUT_12 = new JLabel("");
		GridBagConstraints gbc_FOUT_12 = new GridBagConstraints();
		gbc_FOUT_12.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_12.gridx = 16;
		gbc_FOUT_12.gridy = 1;
		asda.getContentPane().add(FOUT_12, gbc_FOUT_12);
		
		FOUT_13 = new JLabel("");
		GridBagConstraints gbc_FOUT_13 = new GridBagConstraints();
		gbc_FOUT_13.anchor = GridBagConstraints.EAST;
		gbc_FOUT_13.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_13.gridx = 17;
		gbc_FOUT_13.gridy = 1;
		asda.getContentPane().add(FOUT_13, gbc_FOUT_13);
		
		FOUT_14 = new JLabel("");
		GridBagConstraints gbc_FOUT_14 = new GridBagConstraints();
		gbc_FOUT_14.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_14.gridx = 18;
		gbc_FOUT_14.gridy = 1;
		asda.getContentPane().add(FOUT_14, gbc_FOUT_14);
		
		FOUT_15 = new JLabel("");
		GridBagConstraints gbc_FOUT_15 = new GridBagConstraints();
		gbc_FOUT_15.insets = new Insets(0, 0, 5, 5);
		gbc_FOUT_15.gridx = 19;
		gbc_FOUT_15.gridy = 1;
		asda.getContentPane().add(FOUT_15, gbc_FOUT_15);
		
		R_1 = new JLabel("");
		GridBagConstraints gbc_R_1 = new GridBagConstraints();
		gbc_R_1.anchor = GridBagConstraints.SOUTH;
		gbc_R_1.insets = new Insets(0, 0, 5, 5);
		gbc_R_1.gridx = 22;
		gbc_R_1.gridy = 2;
		asda.getContentPane().add(R_1, gbc_R_1);
		
		LOUT_1 = new JLabel("");
		GridBagConstraints gbc_LOUT_1 = new GridBagConstraints();
		gbc_LOUT_1.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_1.gridx = 3;
		gbc_LOUT_1.gridy = 3;
		asda.getContentPane().add(LOUT_1, gbc_LOUT_1);
		
		ROUT_1 = new JLabel("");
		GridBagConstraints gbc_ROUT_1 = new GridBagConstraints();
		gbc_ROUT_1.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_1.gridx = 21;
		gbc_ROUT_1.gridy = 3;
		asda.getContentPane().add(ROUT_1, gbc_ROUT_1);
		
		R_2 = new JLabel("");
		GridBagConstraints gbc_R_2 = new GridBagConstraints();
		gbc_R_2.insets = new Insets(0, 0, 5, 5);
		gbc_R_2.gridx = 22;
		gbc_R_2.gridy = 3;
		asda.getContentPane().add(R_2, gbc_R_2);
		
		LOUT_2 = new JLabel("");
		GridBagConstraints gbc_LOUT_2 = new GridBagConstraints();
		gbc_LOUT_2.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_2.gridx = 3;
		gbc_LOUT_2.gridy = 4;
		asda.getContentPane().add(LOUT_2, gbc_LOUT_2);
		
		ROUT_2 = new JLabel("");
		GridBagConstraints gbc_ROUT_2 = new GridBagConstraints();
		gbc_ROUT_2.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_2.gridx = 21;
		gbc_ROUT_2.gridy = 4;
		asda.getContentPane().add(ROUT_2, gbc_ROUT_2);
		
		R_3 = new JLabel("");
		GridBagConstraints gbc_R_3 = new GridBagConstraints();
		gbc_R_3.insets = new Insets(0, 0, 5, 5);
		gbc_R_3.gridx = 22;
		gbc_R_3.gridy = 4;
		asda.getContentPane().add(R_3, gbc_R_3);
		
		LOUT_3 = new JLabel("");
		GridBagConstraints gbc_LOUT_3 = new GridBagConstraints();
		gbc_LOUT_3.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_3.gridx = 3;
		gbc_LOUT_3.gridy = 5;
		asda.getContentPane().add(LOUT_3, gbc_LOUT_3);
		
		ROUT_3 = new JLabel("");
		GridBagConstraints gbc_ROUT_3 = new GridBagConstraints();
		gbc_ROUT_3.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_3.gridx = 21;
		gbc_ROUT_3.gridy = 5;
		asda.getContentPane().add(ROUT_3, gbc_ROUT_3);
		
		R_4 = new JLabel("");
		GridBagConstraints gbc_R_4 = new GridBagConstraints();
		gbc_R_4.insets = new Insets(0, 0, 5, 5);
		gbc_R_4.gridx = 22;
		gbc_R_4.gridy = 5;
		asda.getContentPane().add(R_4, gbc_R_4);
		
		LOUT_4 = new JLabel("");
		GridBagConstraints gbc_LOUT_4 = new GridBagConstraints();
		gbc_LOUT_4.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_4.gridx = 3;
		gbc_LOUT_4.gridy = 6;
		asda.getContentPane().add(LOUT_4, gbc_LOUT_4);
		
		ROUT_4 = new JLabel("");
		GridBagConstraints gbc_ROUT_4 = new GridBagConstraints();
		gbc_ROUT_4.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_4.gridx = 21;
		gbc_ROUT_4.gridy = 6;
		asda.getContentPane().add(ROUT_4, gbc_ROUT_4);
		
		R_5 = new JLabel("");
		GridBagConstraints gbc_R_5 = new GridBagConstraints();
		gbc_R_5.insets = new Insets(0, 0, 5, 5);
		gbc_R_5.gridx = 22;
		gbc_R_5.gridy = 6;
		asda.getContentPane().add(R_5, gbc_R_5);
		
		LOUT_5 = new JLabel("");
		GridBagConstraints gbc_LOUT_5 = new GridBagConstraints();
		gbc_LOUT_5.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_5.gridx = 3;
		gbc_LOUT_5.gridy = 7;
		asda.getContentPane().add(LOUT_5, gbc_LOUT_5);
		
		ROUT_5 = new JLabel("");
		GridBagConstraints gbc_ROUT_5 = new GridBagConstraints();
		gbc_ROUT_5.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_5.gridx = 21;
		gbc_ROUT_5.gridy = 7;
		asda.getContentPane().add(ROUT_5, gbc_ROUT_5);
		
		R_6 = new JLabel("");
		GridBagConstraints gbc_R_6 = new GridBagConstraints();
		gbc_R_6.insets = new Insets(0, 0, 5, 5);
		gbc_R_6.gridx = 22;
		gbc_R_6.gridy = 7;
		asda.getContentPane().add(R_6, gbc_R_6);
		
		L_7 = new JLabel("");
		GridBagConstraints gbc_L_7 = new GridBagConstraints();
		gbc_L_7.insets = new Insets(0, 0, 5, 5);
		gbc_L_7.gridx = 2;
		gbc_L_7.gridy = 8;
		asda.getContentPane().add(L_7, gbc_L_7);
		
		LOUT_6 = new JLabel("");
		GridBagConstraints gbc_LOUT_6 = new GridBagConstraints();
		gbc_LOUT_6.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_6.gridx = 3;
		gbc_LOUT_6.gridy = 8;
		asda.getContentPane().add(LOUT_6, gbc_LOUT_6);
		
		ROUT_6 = new JLabel("");
		GridBagConstraints gbc_ROUT_6 = new GridBagConstraints();
		gbc_ROUT_6.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_6.gridx = 21;
		gbc_ROUT_6.gridy = 8;
		asda.getContentPane().add(ROUT_6, gbc_ROUT_6);
		
		R_7 = new JLabel("");
		GridBagConstraints gbc_R_7 = new GridBagConstraints();
		gbc_R_7.insets = new Insets(0, 0, 5, 5);
		gbc_R_7.gridx = 22;
		gbc_R_7.gridy = 8;
		asda.getContentPane().add(R_7, gbc_R_7);
		
		L_8 = new JLabel("");
		GridBagConstraints gbc_L_8 = new GridBagConstraints();
		gbc_L_8.insets = new Insets(0, 0, 5, 5);
		gbc_L_8.gridx = 2;
		gbc_L_8.gridy = 9;
		asda.getContentPane().add(L_8, gbc_L_8);
		
		LOUT_7 = new JLabel("");
		GridBagConstraints gbc_LOUT_7 = new GridBagConstraints();
		gbc_LOUT_7.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_7.gridx = 3;
		gbc_LOUT_7.gridy = 9;
		asda.getContentPane().add(LOUT_7, gbc_LOUT_7);
		
		ROUT_7 = new JLabel("");
		GridBagConstraints gbc_ROUT_7 = new GridBagConstraints();
		gbc_ROUT_7.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_7.gridx = 21;
		gbc_ROUT_7.gridy = 9;
		asda.getContentPane().add(ROUT_7, gbc_ROUT_7);
		
		R_8 = new JLabel("");
		GridBagConstraints gbc_R_8 = new GridBagConstraints();
		gbc_R_8.insets = new Insets(0, 0, 5, 5);
		gbc_R_8.gridx = 22;
		gbc_R_8.gridy = 9;
		asda.getContentPane().add(R_8, gbc_R_8);
		
		L_9 = new JLabel("");
		GridBagConstraints gbc_L_9 = new GridBagConstraints();
		gbc_L_9.insets = new Insets(0, 0, 5, 5);
		gbc_L_9.gridx = 2;
		gbc_L_9.gridy = 10;
		asda.getContentPane().add(L_9, gbc_L_9);
		
		LOUT_8 = new JLabel("");
		GridBagConstraints gbc_LOUT_8 = new GridBagConstraints();
		gbc_LOUT_8.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_8.gridx = 3;
		gbc_LOUT_8.gridy = 10;
		asda.getContentPane().add(LOUT_8, gbc_LOUT_8);
		
		ROUT_8 = new JLabel("");
		GridBagConstraints gbc_ROUT_8 = new GridBagConstraints();
		gbc_ROUT_8.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_8.gridx = 21;
		gbc_ROUT_8.gridy = 10;
		asda.getContentPane().add(ROUT_8, gbc_ROUT_8);
		
		R_9 = new JLabel("");
		GridBagConstraints gbc_R_9 = new GridBagConstraints();
		gbc_R_9.insets = new Insets(0, 0, 5, 5);
		gbc_R_9.gridx = 22;
		gbc_R_9.gridy = 10;
		asda.getContentPane().add(R_9, gbc_R_9);
		
		L_10 = new JLabel("");
		GridBagConstraints gbc_L_10 = new GridBagConstraints();
		gbc_L_10.insets = new Insets(0, 0, 5, 5);
		gbc_L_10.gridx = 2;
		gbc_L_10.gridy = 11;
		asda.getContentPane().add(L_10, gbc_L_10);
		
		LOUT_9 = new JLabel("");
		GridBagConstraints gbc_LOUT_9 = new GridBagConstraints();
		gbc_LOUT_9.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_9.gridx = 3;
		gbc_LOUT_9.gridy = 11;
		asda.getContentPane().add(LOUT_9, gbc_LOUT_9);
		
		ROUT_9 = new JLabel("");
		GridBagConstraints gbc_ROUT_9 = new GridBagConstraints();
		gbc_ROUT_9.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_9.gridx = 21;
		gbc_ROUT_9.gridy = 11;
		asda.getContentPane().add(ROUT_9, gbc_ROUT_9);
		
		R_10 = new JLabel("");
		GridBagConstraints gbc_R_10 = new GridBagConstraints();
		gbc_R_10.insets = new Insets(0, 0, 5, 5);
		gbc_R_10.gridx = 22;
		gbc_R_10.gridy = 11;
		asda.getContentPane().add(R_10, gbc_R_10);
		
		L_11 = new JLabel("");
		GridBagConstraints gbc_L_11 = new GridBagConstraints();
		gbc_L_11.insets = new Insets(0, 0, 5, 5);
		gbc_L_11.gridx = 2;
		gbc_L_11.gridy = 12;
		asda.getContentPane().add(L_11, gbc_L_11);
		
		LOUT_10 = new JLabel("");
		GridBagConstraints gbc_LOUT_10 = new GridBagConstraints();
		gbc_LOUT_10.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_10.gridx = 3;
		gbc_LOUT_10.gridy = 12;
		asda.getContentPane().add(LOUT_10, gbc_LOUT_10);
		
		ROUT_10 = new JLabel("");
		GridBagConstraints gbc_ROUT_10 = new GridBagConstraints();
		gbc_ROUT_10.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_10.gridx = 21;
		gbc_ROUT_10.gridy = 12;
		asda.getContentPane().add(ROUT_10, gbc_ROUT_10);
		
		R_11 = new JLabel("");
		GridBagConstraints gbc_R_11 = new GridBagConstraints();
		gbc_R_11.insets = new Insets(0, 0, 5, 5);
		gbc_R_11.gridx = 22;
		gbc_R_11.gridy = 12;
		asda.getContentPane().add(R_11, gbc_R_11);
		
		L_12 = new JLabel("");
		GridBagConstraints gbc_L_12 = new GridBagConstraints();
		gbc_L_12.insets = new Insets(0, 0, 5, 5);
		gbc_L_12.gridx = 2;
		gbc_L_12.gridy = 13;
		asda.getContentPane().add(L_12, gbc_L_12);
		
		LOUT_11 = new JLabel("");
		GridBagConstraints gbc_LOUT_11 = new GridBagConstraints();
		gbc_LOUT_11.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_11.gridx = 3;
		gbc_LOUT_11.gridy = 13;
		asda.getContentPane().add(LOUT_11, gbc_LOUT_11);
		
		ROUT_11 = new JLabel("");
		GridBagConstraints gbc_ROUT_11 = new GridBagConstraints();
		gbc_ROUT_11.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_11.gridx = 21;
		gbc_ROUT_11.gridy = 13;
		asda.getContentPane().add(ROUT_11, gbc_ROUT_11);
		
		R_12 = new JLabel("");
		GridBagConstraints gbc_R_12 = new GridBagConstraints();
		gbc_R_12.insets = new Insets(0, 0, 5, 5);
		gbc_R_12.gridx = 22;
		gbc_R_12.gridy = 13;
		asda.getContentPane().add(R_12, gbc_R_12);
		
		L_13 = new JLabel("");
		GridBagConstraints gbc_L_13 = new GridBagConstraints();
		gbc_L_13.insets = new Insets(0, 0, 5, 5);
		gbc_L_13.gridx = 2;
		gbc_L_13.gridy = 14;
		asda.getContentPane().add(L_13, gbc_L_13);
		
		LOUT_12 = new JLabel("");
		GridBagConstraints gbc_LOUT_12 = new GridBagConstraints();
		gbc_LOUT_12.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_12.gridx = 3;
		gbc_LOUT_12.gridy = 14;
		asda.getContentPane().add(LOUT_12, gbc_LOUT_12);
		
		ROUT_12 = new JLabel("");
		GridBagConstraints gbc_ROUT_12 = new GridBagConstraints();
		gbc_ROUT_12.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_12.gridx = 21;
		gbc_ROUT_12.gridy = 14;
		asda.getContentPane().add(ROUT_12, gbc_ROUT_12);
		
		R_13 = new JLabel("");
		GridBagConstraints gbc_R_13 = new GridBagConstraints();
		gbc_R_13.insets = new Insets(0, 0, 5, 5);
		gbc_R_13.gridx = 22;
		gbc_R_13.gridy = 14;
		asda.getContentPane().add(R_13, gbc_R_13);
		
		L_14 = new JLabel("");
		GridBagConstraints gbc_L_14 = new GridBagConstraints();
		gbc_L_14.insets = new Insets(0, 0, 5, 5);
		gbc_L_14.gridx = 2;
		gbc_L_14.gridy = 15;
		asda.getContentPane().add(L_14, gbc_L_14);
		
		LOUT_13 = new JLabel("");
		GridBagConstraints gbc_LOUT_13 = new GridBagConstraints();
		gbc_LOUT_13.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_13.gridx = 3;
		gbc_LOUT_13.gridy = 15;
		asda.getContentPane().add(LOUT_13, gbc_LOUT_13);
		
		ROUT_13 = new JLabel("");
		GridBagConstraints gbc_ROUT_13 = new GridBagConstraints();
		gbc_ROUT_13.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_13.gridx = 21;
		gbc_ROUT_13.gridy = 15;
		asda.getContentPane().add(ROUT_13, gbc_ROUT_13);
		
		R_14 = new JLabel("");
		GridBagConstraints gbc_R_14 = new GridBagConstraints();
		gbc_R_14.insets = new Insets(0, 0, 5, 5);
		gbc_R_14.gridx = 22;
		gbc_R_14.gridy = 15;
		asda.getContentPane().add(R_14, gbc_R_14);
		
		L_15 = new JLabel("");
		GridBagConstraints gbc_L_15 = new GridBagConstraints();
		gbc_L_15.insets = new Insets(0, 0, 5, 5);
		gbc_L_15.gridx = 2;
		gbc_L_15.gridy = 16;
		asda.getContentPane().add(L_15, gbc_L_15);
		
		LOUT_14 = new JLabel("");
		GridBagConstraints gbc_LOUT_14 = new GridBagConstraints();
		gbc_LOUT_14.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_14.gridx = 3;
		gbc_LOUT_14.gridy = 16;
		asda.getContentPane().add(LOUT_14, gbc_LOUT_14);
		
		ROUT_14 = new JLabel("");
		GridBagConstraints gbc_ROUT_14 = new GridBagConstraints();
		gbc_ROUT_14.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_14.gridx = 21;
		gbc_ROUT_14.gridy = 16;
		asda.getContentPane().add(ROUT_14, gbc_ROUT_14);
		
		R_15 = new JLabel("");
		GridBagConstraints gbc_R_15 = new GridBagConstraints();
		gbc_R_15.insets = new Insets(0, 0, 5, 5);
		gbc_R_15.gridx = 22;
		gbc_R_15.gridy = 16;
		asda.getContentPane().add(R_15, gbc_R_15);
		
		L_16 = new JLabel("");
		GridBagConstraints gbc_L_16 = new GridBagConstraints();
		gbc_L_16.insets = new Insets(0, 0, 5, 5);
		gbc_L_16.gridx = 2;
		gbc_L_16.gridy = 17;
		asda.getContentPane().add(L_16, gbc_L_16);
		
		LOUT_15 = new JLabel("");
		GridBagConstraints gbc_LOUT_15 = new GridBagConstraints();
		gbc_LOUT_15.insets = new Insets(0, 0, 5, 5);
		gbc_LOUT_15.gridx = 3;
		gbc_LOUT_15.gridy = 17;
		asda.getContentPane().add(LOUT_15, gbc_LOUT_15);
		
		ROUT_15 = new JLabel("");
		GridBagConstraints gbc_ROUT_15 = new GridBagConstraints();
		gbc_ROUT_15.insets = new Insets(0, 0, 5, 5);
		gbc_ROUT_15.gridx = 21;
		gbc_ROUT_15.gridy = 17;
		asda.getContentPane().add(ROUT_15, gbc_ROUT_15);
		
		R_16 = new JLabel("");
		GridBagConstraints gbc_R_16 = new GridBagConstraints();
		gbc_R_16.insets = new Insets(0, 0, 5, 5);
		gbc_R_16.gridx = 22;
		gbc_R_16.gridy = 17;
		asda.getContentPane().add(R_16, gbc_R_16);
		
		L_17 = new JLabel("");
		GridBagConstraints gbc_L_17 = new GridBagConstraints();
		gbc_L_17.insets = new Insets(0, 0, 5, 5);
		gbc_L_17.gridx = 2;
		gbc_L_17.gridy = 18;
		asda.getContentPane().add(L_17, gbc_L_17);
		
		R_17 = new JLabel("");
		GridBagConstraints gbc_R_17 = new GridBagConstraints();
		gbc_R_17.insets = new Insets(0, 0, 5, 5);
		gbc_R_17.gridx = 22;
		gbc_R_17.gridy = 18;
		asda.getContentPane().add(R_17, gbc_R_17);
		
		label_1 = new JLabel("\u5DE6\u908A\u73A9\u5BB6");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridwidth = 2;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 19;
		asda.getContentPane().add(label_1, gbc_label_1);
		
		HOUT_1 = new JLabel("");
		GridBagConstraints gbc_HOUT_1 = new GridBagConstraints();
		gbc_HOUT_1.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_1.gridx = 5;
		gbc_HOUT_1.gridy = 19;
		asda.getContentPane().add(HOUT_1, gbc_HOUT_1);
		
		HOUT_2 = new JLabel("");
		GridBagConstraints gbc_HOUT_2 = new GridBagConstraints();
		gbc_HOUT_2.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_2.gridx = 6;
		gbc_HOUT_2.gridy = 19;
		asda.getContentPane().add(HOUT_2, gbc_HOUT_2);
		
		HOUT_3 = new JLabel("");
		GridBagConstraints gbc_HOUT_3 = new GridBagConstraints();
		gbc_HOUT_3.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_3.gridx = 7;
		gbc_HOUT_3.gridy = 19;
		asda.getContentPane().add(HOUT_3, gbc_HOUT_3);
		
		HOUT_4 = new JLabel("");
		GridBagConstraints gbc_HOUT_4 = new GridBagConstraints();
		gbc_HOUT_4.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_4.gridx = 8;
		gbc_HOUT_4.gridy = 19;
		asda.getContentPane().add(HOUT_4, gbc_HOUT_4);
		
		HOUT_5 = new JLabel("");
		GridBagConstraints gbc_HOUT_5 = new GridBagConstraints();
		gbc_HOUT_5.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_5.gridx = 9;
		gbc_HOUT_5.gridy = 19;
		asda.getContentPane().add(HOUT_5, gbc_HOUT_5);
		
		HOUT_6 = new JLabel("");
		GridBagConstraints gbc_HOUT_6 = new GridBagConstraints();
		gbc_HOUT_6.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_6.gridx = 10;
		gbc_HOUT_6.gridy = 19;
		asda.getContentPane().add(HOUT_6, gbc_HOUT_6);
		
		HOUT_7 = new JLabel("");
		GridBagConstraints gbc_HOUT_7 = new GridBagConstraints();
		gbc_HOUT_7.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_7.gridx = 11;
		gbc_HOUT_7.gridy = 19;
		asda.getContentPane().add(HOUT_7, gbc_HOUT_7);
		
		HOUT_8 = new JLabel("");
		GridBagConstraints gbc_HOUT_8 = new GridBagConstraints();
		gbc_HOUT_8.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_8.gridx = 12;
		gbc_HOUT_8.gridy = 19;
		asda.getContentPane().add(HOUT_8, gbc_HOUT_8);
		
		HOUT_9 = new JLabel("");
		GridBagConstraints gbc_HOUT_9 = new GridBagConstraints();
		gbc_HOUT_9.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_9.gridx = 13;
		gbc_HOUT_9.gridy = 19;
		asda.getContentPane().add(HOUT_9, gbc_HOUT_9);
		
		HOUT_10 = new JLabel("");
		GridBagConstraints gbc_HOUT_10 = new GridBagConstraints();
		gbc_HOUT_10.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_10.gridx = 14;
		gbc_HOUT_10.gridy = 19;
		asda.getContentPane().add(HOUT_10, gbc_HOUT_10);
		
		HOUT_11 = new JLabel("");
		GridBagConstraints gbc_HOUT_11 = new GridBagConstraints();
		gbc_HOUT_11.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_11.gridx = 15;
		gbc_HOUT_11.gridy = 19;
		asda.getContentPane().add(HOUT_11, gbc_HOUT_11);
		
		HOUT_12 = new JLabel("");
		GridBagConstraints gbc_HOUT_12 = new GridBagConstraints();
		gbc_HOUT_12.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_12.gridx = 16;
		gbc_HOUT_12.gridy = 19;
		asda.getContentPane().add(HOUT_12, gbc_HOUT_12);
		
		HOUT_13 = new JLabel("");
		GridBagConstraints gbc_HOUT_13 = new GridBagConstraints();
		gbc_HOUT_13.anchor = GridBagConstraints.EAST;
		gbc_HOUT_13.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_13.gridx = 17;
		gbc_HOUT_13.gridy = 19;
		asda.getContentPane().add(HOUT_13, gbc_HOUT_13);
		
		HOUT_14 = new JLabel("");
		GridBagConstraints gbc_HOUT_14 = new GridBagConstraints();
		gbc_HOUT_14.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_14.gridx = 18;
		gbc_HOUT_14.gridy = 19;
		asda.getContentPane().add(HOUT_14, gbc_HOUT_14);
		
		HOUT_15 = new JLabel("");
		GridBagConstraints gbc_HOUT_15 = new GridBagConstraints();
		gbc_HOUT_15.insets = new Insets(0, 0, 5, 5);
		gbc_HOUT_15.gridx = 19;
		gbc_HOUT_15.gridy = 19;
		asda.getContentPane().add(HOUT_15, gbc_HOUT_15);
		
		button_7 = new JButton("\u53D6\u6D88");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.gridwidth = 2;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 20;
		gbc_button_7.gridy = 19;
		asda.getContentPane().add(button_7, gbc_button_7);
		button_7.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                out.println("NOTHING");
                button_1.setVisible(false);
            	button_2.setVisible(false);
            	button_3.setVisible(false);
            	button_4.setVisible(false);
            	button_5.setVisible(false);
            	button_6.setVisible(false);
            }
        });
		
		Lname = new JLabel("name");
		GridBagConstraints gbc_Lname = new GridBagConstraints();
		gbc_Lname.gridwidth = 2;
		gbc_Lname.insets = new Insets(0, 0, 5, 5);
		gbc_Lname.gridx = 1;
		gbc_Lname.gridy = 20;
		asda.getContentPane().add(Lname, gbc_Lname);
		
		H_1 = new JButton("");
		H_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_1 = new GridBagConstraints();
		gbc_H_1.insets = new Insets(0, 0, 5, 5);
		gbc_H_1.gridx = 4;
		gbc_H_1.gridy = 20;
		asda.getContentPane().add(H_1, gbc_H_1);
		H_1.addActionListener(new ActionListener() {
  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[0];
                	now[0]=sevenmember;
                	sevenmember=a;
                	change =nowcard[0];
                	nowcard[0]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_2 = new JButton("");
		H_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_2 = new GridBagConstraints();
		gbc_H_2.insets = new Insets(0, 0, 5, 5);
		gbc_H_2.gridx = 5;
		gbc_H_2.gridy = 20;
		asda.getContentPane().add(H_2, gbc_H_2);
		H_2.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[1];
                	now[1]=sevenmember;
                	sevenmember=a;
                	change =nowcard[1];
                	nowcard[1]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_3 = new JButton("");
		H_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_3 = new GridBagConstraints();
		gbc_H_3.insets = new Insets(0, 0, 5, 5);
		gbc_H_3.gridx = 6;
		gbc_H_3.gridy = 20;
		asda.getContentPane().add(H_3, gbc_H_3);
		H_3.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[2];
                	now[2]=sevenmember;
                	sevenmember=a;
                	change =nowcard[2];
                	nowcard[2]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_4 = new JButton("");
		H_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_4 = new GridBagConstraints();
		gbc_H_4.insets = new Insets(0, 0, 5, 5);
		gbc_H_4.gridx = 7;
		gbc_H_4.gridy = 20;
		asda.getContentPane().add(H_4, gbc_H_4);
		H_4.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[3];
                	now[3]=sevenmember;
                	sevenmember=a;
                	change =nowcard[3];
                	nowcard[3]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_5 = new JButton("");
		H_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_5 = new GridBagConstraints();
		gbc_H_5.insets = new Insets(0, 0, 5, 5);
		gbc_H_5.gridx = 8;
		gbc_H_5.gridy = 20;
		asda.getContentPane().add(H_5, gbc_H_5);
		H_5.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[4];
                	now[4]=sevenmember;
                	sevenmember=a;
                	change =nowcard[4];
                	nowcard[4]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_6 = new JButton("");
		H_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_6 = new GridBagConstraints();
		gbc_H_6.insets = new Insets(0, 0, 5, 5);
		gbc_H_6.gridx = 9;
		gbc_H_6.gridy = 20;
		asda.getContentPane().add(H_6, gbc_H_6);
		H_6.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[5];
                	now[5]=sevenmember;
                	sevenmember=a;
                	change =nowcard[5];
                	nowcard[5]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_7 = new JButton("");
		H_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_7 = new GridBagConstraints();
		gbc_H_7.insets = new Insets(0, 0, 5, 5);
		gbc_H_7.gridx = 10;
		gbc_H_7.gridy = 20;
		asda.getContentPane().add(H_7, gbc_H_7);
		H_7.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[6];
                	now[6]=sevenmember;
                	sevenmember=a;
                	change =nowcard[6];
                	nowcard[6]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_8 = new JButton("");
		H_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_8 = new GridBagConstraints();
		gbc_H_8.insets = new Insets(0, 0, 5, 5);
		gbc_H_8.gridx = 11;
		gbc_H_8.gridy = 20;
		asda.getContentPane().add(H_8, gbc_H_8);
		H_8.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[7];
                	now[7]=sevenmember;
                	sevenmember=a;
                	change =nowcard[7];
                	nowcard[7]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_9 = new JButton("");
		H_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_9 = new GridBagConstraints();
		gbc_H_9.insets = new Insets(0, 0, 5, 5);
		gbc_H_9.gridx = 12;
		gbc_H_9.gridy = 20;
		asda.getContentPane().add(H_9, gbc_H_9);
		H_9.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[8];
                	now[8]=sevenmember;
                	sevenmember=a;
                	change =nowcard[8];
                	nowcard[8]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_10 = new JButton("");
		H_10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_10 = new GridBagConstraints();
		gbc_H_10.insets = new Insets(0, 0, 5, 5);
		gbc_H_10.gridx = 13;
		gbc_H_10.gridy = 20;
		asda.getContentPane().add(H_10, gbc_H_10);
		H_10.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[9];
                	now[9]=sevenmember;
                	sevenmember=a;
                	change =nowcard[9];
                	nowcard[9]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_11 = new JButton("");
		H_11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_11 = new GridBagConstraints();
		gbc_H_11.insets = new Insets(0, 0, 5, 5);
		gbc_H_11.gridx = 14;
		gbc_H_11.gridy = 20;
		asda.getContentPane().add(H_11, gbc_H_11);
		H_11.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[10];
                	now[10]=sevenmember;
                	sevenmember=a;
                	change =nowcard[10];
                	nowcard[10]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_12 = new JButton("");
		H_12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_12 = new GridBagConstraints();
		gbc_H_12.insets = new Insets(0, 0, 5, 5);
		gbc_H_12.gridx = 15;
		gbc_H_12.gridy = 20;
		asda.getContentPane().add(H_12, gbc_H_12);
		H_12.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[11];
                	now[11]=sevenmember;
                	sevenmember=a;
                	change =nowcard[11];
                	nowcard[11]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_13 = new JButton("");
		H_13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_13 = new GridBagConstraints();
		gbc_H_13.insets = new Insets(0, 0, 5, 5);
		gbc_H_13.gridx = 16;
		gbc_H_13.gridy = 20;
		asda.getContentPane().add(H_13, gbc_H_13);
		H_13.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[12];
                	now[12]=sevenmember;
                	sevenmember=a;
                	change =nowcard[12];
                	nowcard[12]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_14 = new JButton("");
		H_14.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_14 = new GridBagConstraints();
		gbc_H_14.anchor = GridBagConstraints.EAST;
		gbc_H_14.insets = new Insets(0, 0, 5, 5);
		gbc_H_14.gridx = 17;
		gbc_H_14.gridy = 20;
		asda.getContentPane().add(H_14, gbc_H_14);
		H_14.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[13];
                	now[13]=sevenmember;
                	sevenmember=a;
                	change =nowcard[13];
                	nowcard[13]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_15 = new JButton("");
		H_15.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_15 = new GridBagConstraints();
		gbc_H_15.insets = new Insets(0, 0, 5, 5);
		gbc_H_15.gridx = 18;
		gbc_H_15.gridy = 20;
		asda.getContentPane().add(H_15, gbc_H_15);
		H_15.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[14];
                	now[14]=sevenmember;
                	sevenmember=a;
                	change =nowcard[14];
                	nowcard[14]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_16 = new JButton("");
		H_16.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_16 = new GridBagConstraints();
		gbc_H_16.insets = new Insets(0, 0, 5, 5);
		gbc_H_16.gridx = 19;
		gbc_H_16.gridy = 20;
		asda.getContentPane().add(H_16, gbc_H_16);
		H_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	int a=now[15];
                	now[15]=sevenmember;
                	sevenmember=a;
                	change =nowcard[15];
                	nowcard[15]=seven;
                	seven=change;
                	clear();
                	sort();
                	picture(sevenmember,16);
                }
            }
        });
		
		H_17 = new JButton("");
		H_17.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_H_17 = new GridBagConstraints();
		gbc_H_17.insets = new Insets(0, 0, 5, 5);
		gbc_H_17.gridx = 21;
		gbc_H_17.gridy = 20;
		asda.getContentPane().add(H_17, gbc_H_17);
		H_17.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
                if(Action){
                	out.println("OUT "+seven+name[mynamemember]);
                	H_17.setVisible(false);
                	Action=false;
                	
                }
            }
        });
		
		Hname = new JLabel("\u81EA\u5DF1");
		GridBagConstraints gbc_Hname = new GridBagConstraints();
		gbc_Hname.gridwidth = 17;
		gbc_Hname.insets = new Insets(0, 0, 0, 5);
		gbc_Hname.gridx = 4;
		gbc_Hname.gridy = 21;
		asda.getContentPane().add(Hname, gbc_Hname);
		asda.setVisible(true);
		
		label_2 = new JLabel("");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 6;
		panel_1.add(label_2, gbc_label_2);
		label_2.setIcon(back);

		btnNewButton = new JButton("\u6E96\u5099\u958B\u59CB");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 4;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 10;
		gbc_btnNewButton.gridy = 6;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		label_5 = new JLabel("");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 9;
		panel_1.add(label_5, gbc_label_5);
		
		label_6 = new JLabel("");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 9;
		panel_1.add(label_6, gbc_label_6);
		
		label_7 = new JLabel("");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 2;
		gbc_label_7.gridy = 9;
		panel_1.add(label_7, gbc_label_7);
		
		label_8 = new JLabel("");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 3;
		gbc_label_8.gridy = 9;
		panel_1.add(label_8, gbc_label_8);
		
		label_9 = new JLabel("");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 4;
		gbc_label_9.gridy = 9;
		panel_1.add(label_9, gbc_label_9);
		
		label_10 = new JLabel("");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 5;
		gbc_label_10.gridy = 9;
		panel_1.add(label_10, gbc_label_10);
		
		label_11 = new JLabel("");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 6;
		gbc_label_11.gridy = 9;
		panel_1.add(label_11, gbc_label_11);
		
		label_12 = new JLabel("");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 7;
		gbc_label_12.gridy = 9;
		panel_1.add(label_12, gbc_label_12);
		
		label_13 = new JLabel("");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 8;
		gbc_label_13.gridy = 9;
		panel_1.add(label_13, gbc_label_13);
		
		label_15 = new JLabel("\u8B80\u79D2:");
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 9;
		gbc_label_15.gridy = 9;
		panel_1.add(label_15, gbc_label_15);
		
		label_16 = new JLabel("");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 10;
		gbc_label_16.gridy = 9;
		panel_1.add(label_16, gbc_label_16);
		
		button_4 = new JButton("\u524D\u4E8C\u5403");
		button_4.setVisible(false);
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.gridwidth = 3;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 10;
		panel_1.add(button_4, gbc_button_4);
		button_4.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) { 
            	out.println("EAT "+tostring(OU-2)+tostring(OU-1)+tostring(OU)+name[mynamemember]);

            	myround=true;
            	button_4.setVisible(false);
            	button_5.setVisible(false);
            	button_6.setVisible(false);
            	label_5.setVisible(false);
            	label_6.setVisible(false);
            	label_7.setVisible(false);
            	label_8.setVisible(false);
            	label_9.setVisible(false);
            	label_10.setVisible(false);
            	label_11.setVisible(false);
            	label_12.setVisible(false);
            	label_13.setVisible(false);
            }
        });
		button_5 = new JButton("\u524D\u5F8C\u5403");
		button_5.setVisible(false);
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.gridwidth = 3;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 3;
		gbc_button_5.gridy = 10;
		panel_1.add(button_5, gbc_button_5);
		button_5.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {  
            	out.println("EAT "+tostring(OU-1)+tostring(OU)+tostring(OU+1)+name[mynamemember]);
            	button_4.setVisible(false);
            	myround=true;
            	button_5.setVisible(false);
            	button_6.setVisible(false);
            	label_5.setVisible(false);
            	label_6.setVisible(false);
            	label_7.setVisible(false);
            	label_8.setVisible(false);
            	label_9.setVisible(false);
            	label_10.setVisible(false);
            	label_11.setVisible(false);
            	label_12.setVisible(false);
            	label_13.setVisible(false);
            }
        });
		button_6 = new JButton("\u5F8C\u4E8C\u5403");
		button_6.setVisible(false);
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.gridwidth = 3;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 6;
		gbc_button_6.gridy = 10;
		panel_1.add(button_6, gbc_button_6);
		button_6.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
            	out.println("EAT "+tostring(OU)+tostring(OU+1)+tostring(OU+2)+name[mynamemember]);
            	button_4.setVisible(false);
            	myround=true;
            	button_5.setVisible(false);
            	button_6.setVisible(false);
            	label_5.setVisible(false);
            	label_6.setVisible(false);
            	label_7.setVisible(false);
            	label_8.setVisible(false);
            	label_9.setVisible(false);
            	label_10.setVisible(false);
            	label_11.setVisible(false);
            	label_12.setVisible(false);
            	label_13.setVisible(false);
            }
        });
		button_1 = new JButton("\u78B0");
		button_1.setVisible(false);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.gridwidth = 2;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 11;
		panel_1.add(button_1, gbc_button_1);
		button_1.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {            	
            	button_1.setVisible(false);
            	button_3.setVisible(false);
            	myround=true;
            	out.println("BUMP "+line.substring(0,2)+line.substring(0,2)+line.substring(0,2)+name[mynamemember]);
            }
        });
		button_2 = new JButton("\u5403");
		button_2.setVisible(false);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.gridwidth = 2;
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 11;
		panel_1.add(button_2, gbc_button_2);
		button_2.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
            	button_2.setVisible(false);
            	if(a%1000/100>0){
            		button_4.setVisible(true);
            		label_7.setIcon(piceat(OU));
            		label_6.setIcon(piceat(OU-1));
            		label_5.setIcon(piceat(OU-2));
            	}
            	if(a%100/10>0){
            		button_5.setVisible(true);
            		label_8.setIcon(piceat(OU-1));
            		label_9.setIcon(piceat(OU));
            		label_10.setIcon(piceat(OU+1));
            	}
            	if(a%10>0){
            		button_6.setVisible(true);
            		label_11.setIcon(piceat(OU));
            		label_12.setIcon(piceat(OU+1));
            		label_13.setIcon(piceat(OU+2));
            	}
            	button_2.setVisible(false);
            }
        });
		button_3 = new JButton("\u69D3");
		button_3.setVisible(false);
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.gridwidth = 2;
		gbc_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_button_3.gridx = 4;
		gbc_button_3.gridy = 11;
		panel_1.add(button_3, gbc_button_3);
		button_3.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
            	myround=true;
            	button_1.setVisible(false);
            	button_3.setVisible(false);
            	out.println("GUNE "+line+line+line+line+name[mynamemember]);
            }
        });
		btnNewButton.addActionListener(new ActionListener() {
			  
            public void actionPerformed(ActionEvent e) {
            	btnNewButton.setVisible(false);
            	out.println("Ready");
            }
        });
		
	}
	private void run() throws IOException {

        // Make connection and initialize streams
        String serverAddress = "127.0.0.1";
        String myname=null;
        Socket socket = new Socket(serverAddress, 20000);
        in = new BufferedReader(new InputStreamReader(
            socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
        String line1=null;
        // Process all messages from server, according to the protocol.
        while (true) {
            line1 = in.readLine();
            if(!line1.startsWith("MESSAGE")){
            	line=line1;
            }
            if (line.startsWith("SUBMITNAME")) {  //要求名字
            	myname=getName();
                out.println(myname);
            } else if (line.startsWith("NAMEACCEPTED")) {  //
                textField.setEditable(true);
            } else if (line.startsWith("GameStart")) {  //開始遊戲
                textArea.append("玩家 "+line.substring(10)+" 準備完畢 \n");
                name[gamermember++]=line.substring(10);
                if(line.substring(10).equals(myname)){
                	mynamemember=gamermember-1;
                }
                if(gamermember==4){
                	Hname.setText(name[mynamemember]);
                	Rname.setText(name[(mynamemember+1)%4]);
                	Fname.setText(name[(mynamemember+2)%4]);
                	Lname.setText(name[(mynamemember+3)%4]);
                }
            } else if (line1.startsWith("MESSAGE")) {  //聊天室
            	textArea.append(line.substring(8) + "\n");
            } else if (line.startsWith("LICENSING")){  //發牌
            	line=line.substring(10);
            	Licensing(line);
            	picture(sevenmember,16);
            	clear();
            	sort();
            	WIN();
            	H_17.setVisible(true);
            	Action=true;
            	myround=true;
            } else if(line.startsWith("FLICENSING")){  //初次發牌
            	line=line.substring(11);
            	Flicensing(line);
            	clear();
            	sort();
            } else if(line.startsWith("OUT")){ //有人丟牌   判斷 有沒有要胡 碰 吃
            	OU=0;
            	a=0;
            	OUTB=true;
            	line=line.substring(4);
            	play.play(line.substring(0,2));
            	OU=OUT(line.substring(0,2));
            	picture(OU,16);
        		WIN();
            	label_2.setVisible(true);
            	if(!myround){
            		BEG(OU);
            		System.out.println(OU);
            	}else{
            		myround=false;
            	}
            	System.out.println(a);
            	System.out.println(C[0]+","+C[1]+","+C[2]+","+C[3]+","+C[4]+","+C[5]+","+C[6]+","+C[7]+","+C[8]+","+"筒");
            	System.out.println(B[0]+","+B[1]+","+B[2]+","+B[3]+","+B[4]+","+B[5]+","+B[6]+","+B[7]+","+B[8]+","+"竹");
            	System.out.println(H[0]+","+H[1]+","+H[2]+","+H[3]+","+H[4]+","+H[5]+","+H[6]+","+H[7]+","+H[8]+","+"萬");
            	System.out.println(O[0]+","+O[1]+","+O[2]+","+O[3]+","+O[4]+","+O[5]+","+O[6]+","+"字");
            	
            	ass.start();
            	OUTB=false;
            } else if(line.startsWith("EAT")){ //有人吃   我要更新畫面
            	ass.stop();						//計數器停止
            	line=line.substring(4);
            	play.play("吃");
            	System.out.println(line);
            	getcardname=line.substring(6);
            	getcard[0]=line.substring(0, 2);
            	getcard[1]=line.substring(2, 4);
            	getcard[2]=line.substring(4, 6);
            	if(!getcardname.equals(name[mynamemember])){		//得到牌的不是自己 做其他人的畫面更新
	        		label_2.setVisible(false);
		    		refresh(getcardname,getcard,3);
            		
            	}else{								//得到牌的自己要丟一張牌的畫面處理
            		int m=OUT(line.substring(0,2));
            		for(int j=0;j<2;j++){
            			for(int i=0;i<cardmember;i++){
                			if(now[i]==OUT(getcard[j])){
                				now[i]=0;
                				break;
                			}
                		}
            		}
            		clear();
            		sort();
            		refresh(name[mynamemember],getcard,3);
            		seven=nowcard[cardmember];
            		sevenmember=now[cardmember];
            		System.out.println(now[cardmember]+","+ cardmember);
            		picbumpeat(now[cardmember], cardmember);
            		now[cardmember]=0;
            		Action=true;
            		System.out.println(Action);
            	}
            	time=0;
            }else if(line.startsWith("BUMP")){ //有人碰 我要更新畫面
            	ass.stop();						//計數器停止
            	line=line.substring(5);
            	play.play("碰");
            	getcardname=line.substring(6);
            	getcard[0]=line.substring(0, 2);
            	getcard[1]=line.substring(2, 4);
            	getcard[2]=line.substring(4, 6);
            	if(!getcardname.equals(name[mynamemember])){     //得到牌的不是自己 做其他人的畫面更新
	        		label_2.setVisible(false);
	        		System.out.println(line+","+getcardname+","+getcard[0]+","+getcard[1]+","+getcard[2]);
		    		refresh(getcardname,getcard,3);
            	}else{							//得到牌的自己要丟一張牌的畫面處理
            		int m=OUT(line.substring(0,2));
            		for(int j=0;j<2;j++){
            			for(int i=0;i<cardmember;i++){
                			if(now[i]==m){
                				now[i]=0;
                				break;
                			}
                		}
            		}
            		clear();
            		sort();
            		refresh(name[mynamemember],getcard,3);
            		seven=nowcard[cardmember];
            		sevenmember=now[cardmember];
            		picbumpeat(now[cardmember], cardmember);
            		now[cardmember]=0;
            		Action=true;
            		H_17.setVisible(true);
            		
            	}
            	time=0;
            }else if(line.startsWith("GUNE")){ //有人槓   我要更新畫面
	        	line=line.substring(5);
            	play.play("槓");
            	getcardname=line.substring(8);
        		getcard[0]=line.substring(0, 2);
            	getcard[1]=line.substring(2, 4);
            	getcard[2]=line.substring(4, 6);
            	getcard[3]=line.substring(6, 8);
            	if(!getcardname.equals(name)){
	        		label_2.setVisible(false);
		    		refresh(getcardname,getcard,4);
            	}else{								//得到牌的自己要丟一張牌的畫面處理
            		int m=OUT(line.substring(0,2));
            		for(int j=0;j<3;j++){
            			for(int i=0;i<cardmember;i++){
                			if(now[i]==m){
                				now[i]=0;
                				break;
                			}
                		}
            		}
            		clear();
            		sort();
            		refresh(name[mynamemember],getcard,4);
            	}
            	out.println("NOTHING");
            	time=0;
            }else if(line.startsWith("WIN")){ //有人胡了

            	play.play("胡");
            	out.println("CLOSE");
            		//玩家獲勝字樣出現
            }else if(line.startsWith("NEXT")){ //有人胡了
            	if(!line.substring(4).equals(name)){
            		out.println("NEXT");
            	}
            		//玩家獲勝字樣出現
            }
        }
	}
	private String tostring(int i) {
		// TODO Auto-generated method stub
		if(i/10<3){
			return number[i%10-1]+card[i/10];
		}
		return other_card[i/10];
		
	}
	private Icon piceat(int i){
		if(i/10==0){
			return heat(i%10);
		}else if(i/10==1){
			return  ceat(i%10);
		}else if(i/10==2){
			return  beat(i%10);
		}else if(i/10>=3){
			return  otherpeat(i/10);
		}
		return null;
		
	}
	private Icon heat(int i) {
		// TODO Auto-generated method stub
		if(i==1){
			return h1;
		}else if(i==2){
			return h2;
		}else if(i==3){
			return h3;
		}else if(i==4){
			return h4;
		}else if(i==5){
			return h5;
		}else if(i==6){
			return h6;
		}else if(i==7){
			return h7;
		}else if(i==8){
			return h8;
		}else if(i==9){
			return h9;
		}
		return null;
	}
	private Icon ceat(int i) {
		// TODO Auto-generated method stub
		if(i==1){
			return c1;
		}else if(i==2){
			return c2;
		}else if(i==3){
			return c3;
		}else if(i==4){
			return c4;
		}else if(i==5){
			return c5;
		}else if(i==6){
			return c6;
		}else if(i==7){
			return c7;
		}else if(i==8){
			return c8;
		}else if(i==9){
			return c9;
		}
		return null;
	}
	private Icon beat(int i) {
		// TODO Auto-generated method stub
		if(i==1){
			return b1;
		}else if(i==2){
			return b2;
		}else if(i==3){
			return b3;
		}else if(i==4){
			return b4;
		}else if(i==5){
			return b5;
		}else if(i==6){
			return b6;
		}else if(i==7){
			return b7;
		}else if(i==8){
			return b8;
		}else if(i==9){
			return b9;
		}
		return null;
	}
	private Icon otherpeat(int i) {
		// TODO Auto-generated method stub
		if(i==3){
			return wd;
		}else if(i==4){
			return rd;
		}else if(i==5){
			return fa;
		}else if(i==6){
			return ew;
		}else if(i==7){
			return sw;
		}else if(i==8){
			return ww;
		}else if(i==9){
			return nw;
		}
		return null;
	}
	private void picbumpeat(int i , int j){
		if(i/10==0){
			hbumpeat(i%10,j);
		}else if(i/10==1){
			cbumpeat(i%10,j);
		}else if(i/10==2){
			bbumpeat(i%10,j);
		}else if(i/10>=3){
			otherbumpeat(i/10,j);
		}
	}
    private void otherbumpeat(int i, int j) {
		// TODO Auto-generated method stub
		if(j==14){
			if(i==3){
				H_15.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_15.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_15.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_15.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_15.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_15.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_15.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==13){
			if(i==3){
				H_14.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_14.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_14.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_14.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_14.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_14.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_14.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==12){
			if(i==3){
				H_13.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_13.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_13.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_13.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_13.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_13.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_13.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==11){
			if(i==3){
				H_12.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_12.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_12.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_12.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_12.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_12.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_12.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==10){
			if(i==3){
				H_11.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_11.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_11.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_11.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_11.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_11.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_11.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==9){
			if(i==3){
				H_10.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_10.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_10.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_10.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_10.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_10.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_10.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==8){
			if(i==3){
				H_9.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_9.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_9.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_9.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_9.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_9.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_9.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==7){
			if(i==3){
				H_8.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_8.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_8.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_8.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_8.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_8.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_8.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==6){
			if(i==3){
				H_7.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_7.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_7.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_7.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_7.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_7.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_7.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==5){
			if(i==3){
				H_6.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_6.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_6.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_6.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_6.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_6.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_6.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==4){
			if(i==3){
				H_5.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_5.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_5.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_5.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_5.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_5.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_5.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==3){	
			if(i==3){
				H_4.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_4.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_4.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_4.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_4.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_4.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_4.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==2){			
			if(i==3){
				H_3.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_3.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_3.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_3.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_3.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_3.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_3.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==1){
			if(i==3){
				H_2.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_2.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_2.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_2.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_2.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_2.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_2.setVisible(false);H_17.setIcon(nw);
			}
		}else if(j==0){	
			if(i==3){
				H_1.setVisible(false);H_17.setIcon(wd);
			}else if(i==4){
				H_1.setVisible(false);H_17.setIcon(rd);
			}else if(i==5){
				H_1.setVisible(false);H_17.setIcon(fa);
			}else if(i==6){
				H_1.setVisible(false);H_17.setIcon(ew);
			}else if(i==7){
				H_1.setVisible(false);H_17.setIcon(sw);
			}else if(i==8){
				H_1.setVisible(false);H_17.setIcon(ww);
			}else if(i==9){
				H_1.setVisible(false);H_17.setIcon(nw);
			}
		}
	}
	private void bbumpeat(int i, int j) {
		// TODO Auto-generated method stub
		if(j==14){
			if(i==1){
				H_15.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_15.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_15.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_15.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_15.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_15.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_15.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_15.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_15.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==13){
			if(i==1){
				H_14.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_14.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_14.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_14.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_14.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_14.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_14.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_14.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_14.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==12){

			if(i==1){
				H_13.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_13.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_13.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_13.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_13.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_13.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_13.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_13.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_13.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==11){

			if(i==1){
				H_12.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_12.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_12.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_12.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_12.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_12.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_12.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_12.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_12.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==10){

			if(i==1){
				H_11.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_11.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_11.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_11.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_11.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_11.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_11.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_11.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_11.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==9){

			if(i==1){
				H_10.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_10.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_10.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_10.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_10.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_10.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_10.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_10.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_10.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==8){

			if(i==1){
				H_9.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_9.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_9.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_9.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_9.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_9.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_9.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_9.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_9.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==7){

			if(i==1){
				H_8.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_8.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_8.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_8.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_8.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_8.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_8.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_8.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_8.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==6){

			if(i==1){
				H_7.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_7.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_7.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_7.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_7.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_7.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_7.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_7.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_7.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==5){

			if(i==1){
				H_6.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_6.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_6.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_6.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_6.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_6.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_6.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_6.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_6.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==4){

			if(i==1){
				H_5.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_5.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_5.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_5.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_5.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_5.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_5.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_5.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_5.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==3){	

			if(i==1){
				H_4.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_4.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_4.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_4.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_4.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_4.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_4.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_4.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_4.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==2){			

			if(i==1){
				H_3.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_3.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_3.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_3.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_3.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_3.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_3.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_3.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_3.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==1){

			if(i==1){
				H_2.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_2.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_2.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_2.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_2.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_2.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_2.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_2.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_2.setVisible(false);H_17.setIcon(b9);
			}
		}else if(j==0){	

			if(i==1){
				H_1.setVisible(false);H_17.setIcon(b1);
			}else if(i==2){
				H_1.setVisible(false);H_17.setIcon(b2);
			}else if(i==3){
				H_1.setVisible(false);H_17.setIcon(b3);
			}else if(i==4){
				H_1.setVisible(false);H_17.setIcon(b4);
			}else if(i==5){
				H_1.setVisible(false);H_17.setIcon(b5);
			}else if(i==6){
				H_1.setVisible(false);H_17.setIcon(b6);
			}else if(i==7){
				H_1.setVisible(false);H_17.setIcon(b7);
			}else if(i==8){
				H_1.setVisible(false);H_17.setIcon(b8);
			}else if(i==9){
				H_1.setVisible(false);H_17.setIcon(b9);
			}
		}
	}
	private void cbumpeat(int i, int j) {
		// TODO Auto-generated method stub
		if(j==14){
			if(i==1){
				H_15.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_15.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_15.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_15.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_15.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_15.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_15.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_15.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_15.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==13){
			if(i==1){
				H_14.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_14.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_14.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_14.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_14.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_14.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_14.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_14.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_14.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==12){

			if(i==1){
				H_13.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_13.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_13.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_13.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_13.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_13.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_13.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_13.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_13.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==11){

			if(i==1){
				H_12.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_12.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_12.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_12.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_12.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_12.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_12.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_12.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_12.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==10){

			if(i==1){
				H_11.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_11.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_11.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_11.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_11.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_11.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_11.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_11.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_11.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==9){

			if(i==1){
				H_10.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_10.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_10.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_10.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_10.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_10.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_10.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_10.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_10.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==8){

			if(i==1){
				H_9.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_9.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_9.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_9.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_9.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_9.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_9.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_9.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_9.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==7){

			if(i==1){
				H_8.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_8.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_8.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_8.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_8.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_8.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_8.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_8.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_8.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==6){

			if(i==1){
				H_7.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_7.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_7.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_7.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_7.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_7.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_7.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_7.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_7.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==5){

			if(i==1){
				H_6.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_6.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_6.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_6.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_6.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_6.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_6.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_6.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_6.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==4){

			if(i==1){
				H_5.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_5.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_5.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_5.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_5.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_5.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_5.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_5.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_5.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==3){	

			if(i==1){
				H_4.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_4.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_4.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_4.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_4.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_4.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_4.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_4.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_4.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==2){			

			if(i==1){
				H_3.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_3.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_3.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_3.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_3.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_3.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_3.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_3.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_3.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==1){

			if(i==1){
				H_2.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_2.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_2.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_2.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_2.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_2.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_2.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_2.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_2.setVisible(false);H_17.setIcon(c9);
			}
		}else if(j==0){	

			if(i==1){
				H_1.setVisible(false);H_17.setIcon(c1);
			}else if(i==2){
				H_1.setVisible(false);H_17.setIcon(c2);
			}else if(i==3){
				H_1.setVisible(false);H_17.setIcon(c3);
			}else if(i==4){
				H_1.setVisible(false);H_17.setIcon(c4);
			}else if(i==5){
				H_1.setVisible(false);H_17.setIcon(c5);
			}else if(i==6){
				H_1.setVisible(false);H_17.setIcon(c6);
			}else if(i==7){
				H_1.setVisible(false);H_17.setIcon(c7);
			}else if(i==8){
				H_1.setVisible(false);H_17.setIcon(c8);
			}else if(i==9){
				H_1.setVisible(false);H_17.setIcon(c9);
			}
		}
	}
	private void hbumpeat(int i , int j){
		if(j==14){
			if(i==1){
				H_15.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_15.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_15.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_15.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_15.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_15.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_15.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_15.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_15.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==13){
			if(i==1){
				H_14.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_14.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_14.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_14.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_14.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_14.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_14.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_14.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_14.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==12){

			if(i==1){
				H_13.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_13.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_13.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_13.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_13.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_13.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_13.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_13.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_13.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==11){

			if(i==1){
				H_12.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_12.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_12.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_12.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_12.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_12.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_12.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_12.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_12.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==10){

			if(i==1){
				H_11.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_11.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_11.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_11.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_11.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_11.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_11.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_11.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_11.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==9){

			if(i==1){
				H_10.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_10.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_10.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_10.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_10.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_10.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_10.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_10.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_10.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==8){

			if(i==1){
				H_9.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_9.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_9.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_9.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_9.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_9.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_9.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_9.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_9.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==7){

			if(i==1){
				H_8.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_8.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_8.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_8.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_8.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_8.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_8.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_8.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_8.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==6){

			if(i==1){
				H_7.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_7.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_7.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_7.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_7.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_7.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_7.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_7.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_7.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==5){

			if(i==1){
				H_6.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_6.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_6.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_6.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_6.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_6.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_6.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_6.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_6.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==4){

			if(i==1){
				H_5.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_5.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_5.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_5.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_5.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_5.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_5.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_5.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_5.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==3){	

			if(i==1){
				H_4.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_4.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_4.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_4.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_4.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_4.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_4.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_4.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_4.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==2){			

			if(i==1){
				H_3.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_3.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_3.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_3.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_3.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_3.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_3.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_3.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_3.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==1){

			if(i==1){
				H_2.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_2.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_2.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_2.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_2.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_2.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_2.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_2.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_2.setVisible(false);H_17.setIcon(h9);
			}
		}else if(j==0){	

			if(i==1){
				H_1.setVisible(false);H_17.setIcon(h1);
			}else if(i==2){
				H_1.setVisible(false);H_17.setIcon(h2);
			}else if(i==3){
				H_1.setVisible(false);H_17.setIcon(h3);
			}else if(i==4){
				H_1.setVisible(false);H_17.setIcon(h4);
			}else if(i==5){
				H_1.setVisible(false);H_17.setIcon(h5);
			}else if(i==6){
				H_1.setVisible(false);H_17.setIcon(h6);
			}else if(i==7){
				H_1.setVisible(false);H_17.setIcon(h7);
			}else if(i==8){
				H_1.setVisible(false);H_17.setIcon(h8);
			}else if(i==9){
				H_1.setVisible(false);H_17.setIcon(h9);
			}
		}
    }
	private void BEG(int i) {   // 別人打出牌判斷      吃碰槓 i等於轉換過的牌
		// TODO Auto-generated method stub
		if(i/10==0){
			hBEG(i%10);
		}else if(i/10==1){
			cBEG(i%10);
		}else if(i/10==2){
			bBEG(i%10);
		}else if(i/10>=3){
			otherBEG(i/10);
		}
	}
	private void hBEG(int i) {  //判斷有沒有    萬子的 吃碰槓
		// TODO Auto-generated method stubint a=0;
		if(i==1){
			if(H[i]>0 && H[i+1]>0){ //右邊
				a+=1;
			}
		}else if(i==2){
			if(H[i-2]>0 && H[i]>0){   //中間
				a+=10;
			}
			if(H[i]>0 && H[i+1]>0){  //右邊
				a+=1;
			}
		}else if(i>=3 && i<=7){
			if(H[i-2]>0 && H[i]>0){   //中間
				a+=10;
			}
			if(H[i]>0 && H[i+1]>0){  //右邊
				a+=1;
			}
			if(H[i-3]>0 && H[i-2]>0){  //左邊
				a+=100;
			}
		}else if(i==8){
			if(H[i-2]>0 && H[i]>0){   //中間
				a+=10;
			}
			if(H[i-3]>0 && H[i-2]>0){  //左邊
				a+=100;
			}
		}else if(i==9){
			if(H[i-3]>0 && H[i-2]>0){  //左邊
				a+=100;
			}
		}
		if(H[i-1]>1){
			a+=1000;
		}
		if(H[i-1]==4){
			a+=1000;
		}
		
	}
	private void cBEG(int i) {  //判斷有沒有    餅    的 吃碰槓
		// TODO Auto-generated method stub
		if(i==1){
			if(C[i]>0 && C[i+1]>0){ //右邊
				a+=1;
			}
		}else if(i==2){
			if(C[i-2]>0 && C[i]>0){   //中間
				a+=10;
			}
			if(C[i]>0 && C[i+1]>0){  //右邊
				a+=1;
			}
		}else if(i>=3 && i<=7){
			if(C[i-2]>0 && C[i]>0){   //中間
				a+=10;
			}
			if(C[i]>0 && C[i+1]>0){  //右邊
				a+=1;
			}
			if(C[i-3]>0 && C[i-2]>0){  //左邊
				a+=100;
			}
		}else if(i==8){
			if(C[i-2]>0 && C[i]>0){   //中間
				a+=10;
			}
			if(C[i-3]>0 && C[i-2]>0){  //左邊
				a+=100;
			}
		}else if(i==9){
			if(C[i-3]>0 && C[i-2]>0){  //左邊
				a+=100;
			}
		}
		if(C[i-1]>1){
			a+=1000;
		}
		if(C[i-1]==4){
			a+=1000;
		}
	}
	private void bBEG(int i) {  //判斷有沒有    條    的 吃碰槓
		// TODO Auto-generated method stub
			if(i==1){
				if(B[i]>0 && B[i+1]>0){ //右邊
					a+=1;
				}
			}else if(i==2){
				if(B[i-2]>0 && B[i]>0){   //中間
					a+=10;
				}
				if(B[i]>0 && B[i+1]>0){  //右邊
					a+=1;
				}
			}else if(i>=3 && i<=7){
				if(B[i-2]>0 && B[i]>0){   //中間
					a+=10;
				}
				if(B[i]>0 && B[i+1]>0){  //右邊
					a+=1;
				}
				if(B[i-3]>0 && B[i-2]>0){  //左邊
					a+=100;
				}
			}else if(i==8){
				if(B[i-2]>0 && B[i]>0){   //中間
					a+=10;
				}
				if(B[i-3]>0 && B[i-2]>0){  //左邊
					a+=100;
				}
			}else if(i==9){
				if(B[i-3]>0 && B[i-2]>0){  //左邊
					a+=100;
				}
			}
			if(B[i-1]>1){
				a+=1000;
			}
			if(B[i-1]==4){
				a+=1000;
			}
	}
	private void otherBEG(int i) {//判斷有沒有    其他牌的 吃碰槓
		// TODO Auto-generated method stub
		if(O[i-3]>1){
			a+=1000;
		}
		if(O[i-3]==4){
			a+=1000;
		}
	}
	private void refresh(String getcardname2, String[] getcard2,int i) {  //刷新其他人的牌面  getcardname 吃牌的人 getcard吃碰槓的組合
		// TODO Auto-generated method stub
		if(getcardname2.equals(Rname.getText())){
			for(int j=0;j<i;j++){
				pictureRFL(OUT(getcard2[j]),Otherbody_OUT[0]++,0);
				Otherbody[0]--;
			}
		}else if(getcardname2.equals(Fname.getText())){
			for(int j=0;j<i;j++){
				pictureRFL(OUT(getcard2[j]),Otherbody_OUT[1]++,1);
				Otherbody[1]--;
			}
		}else if(getcardname2.equals(Lname.getText())){
			for(int j=0;j<i;j++){
				pictureRFL(OUT(getcard2[j]),Otherbody_OUT[2]++,2);
				Otherbody[2]--;
			}
		}else if(getcardname2.equals(name[mynamemember])){
			for(int j=0;j<i;j++){
				pictureRFL(OUT(getcard2[j]),cardmember_out++,3);
				cardmember--;
			}
		}
	}
	private int OUT(String line) { //將別人打出的牌轉成 整數
		// TODO Auto-generated method stub
    	for(int i=0;i<9;i++){
    		for(int j=0;j<3;j++){
    			if(line.startsWith(number[i])){
    				if(line.substring(1).startsWith(card[j])){  //萬 餅 條
    					return ((i+1)+(j*10));
    				}
    			}
    		}
    	}
    	for(int i=0;i<7;i++){
    		if(line.startsWith(other_card[i])){
    			return ((i+3)*10);
    		}
    	}
		return 0;
	}
    private void Licensing(String line) {
		// TODO Auto-generated method stub
    	seven=line;
    	for(int i=0;i<9;i++){
    		for(int j=0;j<3;j++){
    			if(line.startsWith(number[i])){
    				if(line.substring(1).startsWith(card[j])){  //萬 餅 條
    					sevenmember=((i+1)+(j*10));
    				}
    			}
    		}
    	}
    	for(int i=0;i<7;i++){
    		if(line.startsWith(other_card[i])){
    			sevenmember=((i+3)*10);
    		}
    	}
	}
    private void sort() { //將牌進行整理 
		// TODO Auto-generated method stub
    	int Q=0;
		for(int i=0;i<cardmember;i++){
			for(int j=i+1;j<cardmember;j++){
				if(now[i]<now[j]){
					change=nowcard[i];
					nowcard[i]=nowcard[j];
					nowcard[j]=change;
					change=null;
					Q=now[i];
					now[i]=now[j];
					now[j]=Q;
				}
			}
			picture(now[i],i);
		}
		
	}
    private boolean WIN(){

    	int WB[]={0,0,0,0,0,0,0,0,0};
    	int WC[]={0,0,0,0,0,0,0,0,0};
    	int WH[]={0,0,0,0,0,0,0,0,0};
    	for(int i=0;i<9;i++){
    		WB[i]=B[i];
    		WC[i]=C[i];
    		WH[i]=H[i];
    	}
    	System.out.println("WIN 判斷");
    	int b=WIN_MYSELF(WB, 0);
    	int h=WIN_MYSELF(WH, 0);
    	int c=WIN_MYSELF(WC, 0);
    	int o=0;
    	for(int i=0;i<7;i++){
    		if(O[i]==2){
    			o=10;
    		}
    	}
    	System.out.println(b+","+h+","+c+","+o);
    	if((b/10 >0 && h/10 == 0 && c/10 == 0 && o/10 == 0)||(b/10 ==0 && h/10 > 0 && c/10 == 0 && o/10 == 0)||(b/10 ==0 && h/10 == 0 && c/10 > 0&& o/10 == 0)||(b/10 ==0 && h/10 == 0 && c/10 == 0&& o/10 > 0)){
    		return true;
    	}
    	return false;
    }
    private int WIN_MYSELF(int a[],int i) {
    	if(i==7){
			int c=0;
			System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+","+a[5]+","+a[6]+","+a[7]+","+a[8]);
			for(int j=0;j<9;j++){
				if(a[j]==3){
					a[j]=0;
				}else{
					c+=a[j];
				}
			}
			if(c==0){
				System.out.println("OK");
				return 1;
			}
			if(c==2){
				for(int j=0;j<9;j++){
					if(a[j]==2){
						System.out.println("OK");
						return 11;
					}
				}
			}
			return 0;
		}else{
			int b[]=new int[9];
			for(int j=0;j<9;j++){
				b[j]=a[j];
			}
			if(b[i]>0 && b[i+1]>0 && b[i+2]>0){
				b[i]-=1;
				b[i+1]-=1;
				b[i+2]-=1;
				return WIN_MYSELF(b,i)+WIN_MYSELF(a,i+1);
			}else{
				return WIN_MYSELF(a,i+1);
			}
			
		}
	}
    private void clear() { //清除 紀錄牌的陣列 配合sort()使用
    	for(int i=0;i<9;i++){
    		H[i]=0;
    		B[i]=0;
    		C[i]=0;
    	}
    	for(int i=0;i<7;i++){
    		O[i]=0;
    	}

	}
	private void Flicensing(String line) { //記錄發牌
		// TODO Auto-generated method stub
    	nowcard[cardmember]=line;
    	for(int i=0;i<9;i++){
    		for(int j=0;j<3;j++){
    			if(line.startsWith(number[i])){
    				if(line.substring(1).startsWith(card[j])){  //萬 餅 條
    					now[cardmember]=((i+1)+(j*10));
    				}
    			}
    		}
    	}
    	for(int i=0;i<7;i++){
    		if(line.startsWith(other_card[i])){
    			now[cardmember]=((i+3)*10);
    		}
    	}
    	cardmember++;
    	
	}	
	private void sevencard(int i){
		
	}
	private void picture(int i,int j) {
		// TODO Auto-generated method stub
		if(i/10==0){
			hicon(i%10,j);
		}else if(i/10==1){
			cicon(i%10,j);
		}else if(i/10==2){
			bicon(i%10,j);
		}else if(i/10>=3){
			othericon(i/10,j);
		}
	}
	private void pictureRFL(int i,int j,int z) {
		// TODO Auto-generated method stub
		if(i/10==0){
			hiconRFL(i%10,j,z);
		}else if(i/10==1){
			ciconRFL(i%10,j,z);
		}else if(i/10==2){
			biconRFL(i%10,j,z);
		}else if(i/10>=3){
			othericonRFL(i/10,j,z);
		}
	}
	private void othericon(int i,int j) {
		// TODO Auto-generated method stub
		if(j==16){	
			if(i==3){
				if(OUTB){
					label_2.setIcon(wd);O[0]+=1;
				}else{
					H_17.setIcon(wd);O[0]+=1;
				}
			}else if(i==4){
				if(OUTB){
					label_2.setIcon(rd);O[1]+=1;
				}else{
					H_17.setIcon(rd);O[1]+=1;
				}
			}else if(i==5){
				if(OUTB){
					label_2.setIcon(fa);O[2]+=1;
				}else{
					H_17.setIcon(fa);O[2]+=1;
				}
			}else if(i==6){
				if(OUTB){
					label_2.setIcon(ew);O[3]+=1;
				}else{
					H_17.setIcon(ew);O[3]+=1;
				}
			}else if(i==7){
				if(OUTB){
					label_2.setIcon(sw);O[4]+=1;
				}else{
					H_17.setIcon(sw);O[4]+=1;
				}
			}else if(i==8){
				if(OUTB){
					label_2.setIcon(ww);O[5]+=1;
				}else{
					H_17.setIcon(ww);O[5]+=1;
				}
			}else if(i==9){
				if(OUTB){
					label_2.setIcon(nw);O[6]+=1;
				}else{
					H_17.setIcon(nw);O[6]+=1;
				}
			}
		}else if(j==1){	
			if(i==3){
				H_2.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_2.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_2.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_2.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_2.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_2.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_2.setIcon(nw);O[6]+=1;
			}
		}else if(j==2){
			if(i==3){
				H_3.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_3.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_3.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_3.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_3.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_3.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_3.setIcon(nw);O[6]+=1;
			}
		}else if(j==3){
			if(i==3){
				H_4.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_4.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_4.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_4.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_4.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_4.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_4.setIcon(nw);O[6]+=1;
			}
		}else if(j==4){
			if(i==3){
				H_5.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_5.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_5.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_5.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_5.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_5.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_5.setIcon(nw);O[6]+=1;
			}
		}else if(j==5){
			if(i==3){
				H_6.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_6.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_6.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_6.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_6.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_6.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_6.setIcon(nw);O[6]+=1;
			}
		}else if(j==6){
			if(i==3){
				H_7.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_7.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_7.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_7.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_7.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_7.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_7.setIcon(nw);O[6]+=1;
			}
		}else if(j==7){
			if(i==3){
				H_8.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_8.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_8.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_8.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_8.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_8.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_8.setIcon(nw);O[6]+=1;
			}	
		}else if(j==8){
			if(i==3){
				H_9.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_9.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_9.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_9.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_9.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_9.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_9.setIcon(nw);O[6]+=1;
			}
		}else if(j==9){
			if(i==3){
				H_10.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_10.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_10.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_10.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_10.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_10.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_10.setIcon(nw);O[6]+=1;
			}
		}else if(j==10){
			if(i==3){
				H_11.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_11.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_11.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_11.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_11.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_11.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_11.setIcon(nw);O[6]+=1;
			}
		}else if(j==11){
			if(i==3){
				H_12.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_12.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_12.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_12.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_12.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_12.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_12.setIcon(nw);O[6]+=1;
			}
		}else if(j==12){
			if(i==3){
				H_13.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_13.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_13.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_13.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_13.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_13.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_13.setIcon(nw);O[6]+=1;
			}
		}else if(j==13){
			if(i==3){
				H_14.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_14.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_14.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_14.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_14.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_14.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_14.setIcon(nw);O[6]+=1;
			}
		}else if(j==14){
			if(i==3){
				H_15.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_15.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_15.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_15.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_15.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_15.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_15.setIcon(nw);O[6]+=1;
			}
		}else if(j==15){
			if(i==3){
				H_16.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_16.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_16.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_16.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_16.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_16.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_16.setIcon(nw);O[6]+=1;
			}
		}else if(j==0){
			if(i==3){
				H_1.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_1.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_1.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_1.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_1.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_1.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_1.setIcon(nw);O[6]+=1;
			}
		}
	}
	private void bicon(int i,int j) {
		// TODO Auto-generated method stub
		if(j==16){	
			if(i==1){
				if(OUTB){
					label_2.setIcon(b1);B[0]+=1;
				}else{
					H_17.setIcon(b1);B[0]+=1;
				}
			}else if(i==2){
				if(OUTB){
					label_2.setIcon(b2);B[1]+=1;
				}else{
					H_17.setIcon(b2);B[1]+=1;
				}
			}else if(i==3){
				if(OUTB){
					label_2.setIcon(b3);B[2]+=1;
				}else{
					H_17.setIcon(b3);B[2]+=1;
				}
			}else if(i==4){
				if(OUTB){
					label_2.setIcon(b4);B[3]+=1;
				}else{
					H_17.setIcon(b4);B[3]+=1;
				}
			}else if(i==5){
				if(OUTB){
					label_2.setIcon(b5);B[4]+=1;
				}else{
					H_17.setIcon(b5);B[4]+=1;
				}
			}else if(i==6){
				if(OUTB){
					label_2.setIcon(b6);B[5]+=1;
				}else{
					H_17.setIcon(b6);B[5]+=1;
				}
			}else if(i==7){
				if(OUTB){
					label_2.setIcon(b7);B[6]+=1;
				}else{
					H_17.setIcon(b7);B[6]+=1;
				}
			}else if(i==8){
				if(OUTB){
					label_2.setIcon(b8);B[7]+=1;
				}else{
					H_17.setIcon(b8);B[7]+=1;
				}
			}else if(i==9){
				if(OUTB){
					label_2.setIcon(b9);B[8]+=1;
				}else{
					H_17.setIcon(b9);B[8]+=1;
				}
			}
		}else if(j==1){
			if(i==1){
				H_2.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_2.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_2.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_2.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_2.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_2.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_2.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_2.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_2.setIcon(b9);B[8]+=1;
			}
		}else if(j==2){

			if(i==1){
				H_3.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_3.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_3.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_3.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_3.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_3.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_3.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_3.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_3.setIcon(b9);B[8]+=1;
			}
		}else if(j==3){

			if(i==1){
				H_4.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_4.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_4.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_4.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_4.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_4.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_4.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_4.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_4.setIcon(b9);B[8]+=1;
			}
		}else if(j==4){
			if(i==1){
				H_5.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_5.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_5.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_5.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_5.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_5.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_5.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_5.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_5.setIcon(b9);B[8]+=1;
			}
		}else if(j==5){
			if(i==1){
				H_6.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_6.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_6.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_6.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_6.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_6.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_6.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_6.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_6.setIcon(b9);B[8]+=1;
			}
		}else if(j==6){
			if(i==1){
				H_7.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_7.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_7.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_7.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_7.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_7.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_7.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_7.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_7.setIcon(b9);B[8]+=1;
			}
		}else if(j==7){

			if(i==1){
				H_8.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_8.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_8.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_8.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_8.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_8.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_8.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_8.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_8.setIcon(b9);B[8]+=1;
			}	
		}else if(j==8){


			if(i==1){
				H_9.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_9.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_9.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_9.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_9.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_9.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_9.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_9.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_9.setIcon(b9);B[8]+=1;
			}
		}else if(j==9){
			if(i==1){
				H_10.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_10.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_10.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_10.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_10.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_10.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_10.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_10.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_10.setIcon(b9);B[8]+=1;
			}
		}else if(j==10){
			if(i==1){
				H_11.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_11.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_11.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_11.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_11.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_11.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_11.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_11.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_11.setIcon(b9);B[8]+=1;
			}
		}else if(j==11){


			if(i==1){
				H_12.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_12.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_12.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_12.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_12.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_12.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_12.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_12.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_12.setIcon(b9);B[8]+=1;
			}
		}else if(j==12){
			if(i==1){
				H_13.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_13.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_13.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_13.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_13.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_13.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_13.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_13.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_13.setIcon(b9);B[8]+=1;
			}
		}else if(j==13){

			if(i==1){
				H_14.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_14.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_14.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_14.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_14.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_14.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_14.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_14.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_14.setIcon(b9);B[8]+=1;
			}
		}else if(j==14){
			if(i==1){
				H_15.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_15.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_15.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_15.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_15.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_15.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_15.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_15.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_15.setIcon(b9);B[8]+=1;
			}
		}else if(j==15){


			if(i==1){
				H_16.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_16.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_16.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_16.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_16.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_16.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_16.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_16.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_16.setIcon(b9);B[8]+=1;
			}
		}else if(j==0){
			if(i==1){
				H_1.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_1.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_1.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_1.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_1.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_1.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_1.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_1.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_1.setIcon(b9);B[8]+=1;
			}
		}
	}
	private void cicon(int i,int j) {
		// TODO Auto-generated method stub
		if(j==16){	
			if(i==1){
				if(OUTB){
					label_2.setIcon(c1);C[0]+=1;
				}else{
					H_17.setIcon(c1);C[0]+=1;
				}
			}else if(i==2){
				if(OUTB){
					label_2.setIcon(c2);C[1]+=1;
				}else{
					H_17.setIcon(c2);C[1]+=1;
				}
			}else if(i==3){
				if(OUTB){
					label_2.setIcon(c3);C[2]+=1;
				}else{
					H_17.setIcon(c3);C[2]+=1;
				}
			}else if(i==4){
				if(OUTB){
					label_2.setIcon(c4);C[3]+=1;
				}else{
					H_17.setIcon(c4);C[3]+=1;
				}
			}else if(i==5){
				if(OUTB){
					label_2.setIcon(c5);C[4]+=1;
				}else{
					H_17.setIcon(c5);C[4]+=1;
				}
			}else if(i==6){
				if(OUTB){
					label_2.setIcon(c6);C[5]+=1;
				}else{
					H_17.setIcon(c6);C[5]+=1;
				}
			}else if(i==7){
				if(OUTB){
					label_2.setIcon(c7);C[6]+=1;
				}else{
					H_17.setIcon(c7);C[6]+=1;
				}
			}else if(i==8){
				if(OUTB){
					label_2.setIcon(c8);C[7]+=1;
				}else{
					H_17.setIcon(c8);C[7]+=1;
				}
			}else if(i==9){
				if(OUTB){
					label_2.setIcon(c9);C[8]+=1;
				}else{
					H_17.setIcon(c9);C[8]+=1;
				}
			}
		}else if(j==1){
			if(i==1){
				H_2.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_2.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_2.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_2.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_2.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_2.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_2.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_2.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_2.setIcon(c9);C[8]+=1;
			}
		}else if(j==2){

			if(i==1){
				H_3.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_3.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_3.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_3.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_3.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_3.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_3.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_3.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_3.setIcon(c9);C[8]+=1;
			}
		}else if(j==3){

			if(i==1){
				H_4.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_4.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_4.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_4.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_4.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_4.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_4.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_4.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_4.setIcon(c9);C[8]+=1;
			}
		}else if(j==4){
			if(i==1){
				H_5.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_5.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_5.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_5.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_5.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_5.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_5.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_5.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_5.setIcon(c9);C[8]+=1;
			}
		}else if(j==5){
			if(i==1){
				H_6.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_6.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_6.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_6.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_6.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_6.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_6.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_6.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_6.setIcon(c9);C[8]+=1;
			}
		}else if(j==6){
			if(i==1){
				H_7.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_7.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_7.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_7.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_7.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_7.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_7.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_7.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_7.setIcon(c9);C[8]+=1;
			}
		}else if(j==7){

			if(i==1){
				H_8.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_8.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_8.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_8.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_8.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_8.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_8.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_8.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_8.setIcon(c9);C[8]+=1;
			}	
		}else if(j==8){


			if(i==1){
				H_9.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_9.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_9.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_9.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_9.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_9.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_9.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_9.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_9.setIcon(c9);C[8]+=1;
			}
		}else if(j==9){
			if(i==1){
				H_10.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_10.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_10.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_10.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_10.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_10.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_10.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_10.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_10.setIcon(c9);C[8]+=1;
			}
		}else if(j==10){
			if(i==1){
				H_11.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_11.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_11.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_11.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_11.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_11.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_11.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_11.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_11.setIcon(c9);C[8]+=1;
			}
		}else if(j==11){


			if(i==1){
				H_12.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_12.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_12.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_12.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_12.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_12.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_12.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_12.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_12.setIcon(c9);C[8]+=1;
			}
		}else if(j==12){
			if(i==1){
				H_13.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_13.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_13.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_13.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_13.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_13.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_13.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_13.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_13.setIcon(c9);C[8]+=1;
			}
		}else if(j==13){

			if(i==1){
				H_14.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_14.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_14.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_14.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_14.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_14.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_14.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_14.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_14.setIcon(c9);C[8]+=1;
			}
		}else if(j==14){
			if(i==1){
				H_15.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_15.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_15.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_15.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_15.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_15.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_15.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_15.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_15.setIcon(c9);C[8]+=1;
			}
		}else if(j==15){


			if(i==1){
				H_16.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_16.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_16.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_16.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_16.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_16.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_16.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_16.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_16.setIcon(c9);C[8]+=1;
			}
		}else if(j==0){
			if(i==1){
				H_1.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_1.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_1.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_1.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_1.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_1.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_1.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_1.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_1.setIcon(c9);C[8]+=1;
			}
		}
	}
	private void hicon(int i,int j) {
		// TODO Auto-generated method stub
		if(j==16){	
			if(i==1){
				if(OUTB){
					label_2.setIcon(h1);H[0]+=1;
				}else{
					H_17.setIcon(h1);H[0]+=1;
				}
			}else if(i==2){
				if(OUTB){
					label_2.setIcon(h2);H[1]+=1;
				}else{
					H_17.setIcon(h2);H[1]+=1;
				}
			}else if(i==3){
				if(OUTB){
					label_2.setIcon(h3);H[2]+=1;
				}else{
					H_17.setIcon(h3);H[2]+=1;
				}
			}else if(i==4){
				if(OUTB){
					label_2.setIcon(h4);H[3]+=1;
				}else{
					H_17.setIcon(h4);H[3]+=1;
				}
			}else if(i==5){
				if(OUTB){
					label_2.setIcon(h5);H[4]+=1;
				}else{
					H_17.setIcon(h5);H[4]+=1;
				}
			}else if(i==6){
				if(OUTB){
					label_2.setIcon(h6);H[5]+=1;
				}else{
					H_17.setIcon(h6);H[5]+=1;
				}
			}else if(i==7){
				if(OUTB){
					label_2.setIcon(h7);H[6]+=1;
				}else{
					H_17.setIcon(h7);H[6]+=1;
				}
			}else if(i==8){
				if(OUTB){
					label_2.setIcon(h8);H[7]+=1;
				}else{
					H_17.setIcon(h8);H[7]+=1;
				}
			}else if(i==9){
				if(OUTB){
					label_2.setIcon(h9);H[8]+=1;
				}else{
					H_17.setIcon(h9);H[8]+=1;
				}
			}
		}else if(j==1){
			if(i==1){
				H_2.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_2.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_2.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_2.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_2.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_2.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_2.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_2.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_2.setIcon(h9);H[8]+=1;
			}
		}else if(j==2){

			if(i==1){
				H_3.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_3.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_3.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_3.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_3.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_3.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_3.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_3.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_3.setIcon(h9);H[8]+=1;
			}
		}else if(j==3){

			if(i==1){
				H_4.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_4.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_4.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_4.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_4.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_4.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_4.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_4.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_4.setIcon(h9);H[8]+=1;
			}
		}else if(j==4){
			if(i==1){
				H_5.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_5.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_5.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_5.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_5.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_5.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_5.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_5.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_5.setIcon(h9);H[8]+=1;
			}
		}else if(j==5){
			if(i==1){
				H_6.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_6.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_6.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_6.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_6.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_6.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_6.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_6.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_6.setIcon(h9);H[8]+=1;
			}
		}else if(j==6){
			if(i==1){
				H_7.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_7.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_7.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_7.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_7.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_7.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_7.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_7.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_7.setIcon(h9);H[8]+=1;
			}
		}else if(j==7){

			if(i==1){
				H_8.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_8.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_8.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_8.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_8.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_8.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_8.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_8.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_8.setIcon(h9);H[8]+=1;
			}	
		}else if(j==8){


			if(i==1){
				H_9.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_9.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_9.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_9.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_9.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_9.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_9.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_9.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_9.setIcon(h9);H[8]+=1;
			}
		}else if(j==9){
			if(i==1){
				H_10.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_10.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_10.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_10.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_10.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_10.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_10.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_10.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_10.setIcon(h9);H[8]+=1;
			}
		}else if(j==10){
			if(i==1){
				H_11.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_11.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_11.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_11.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_11.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_11.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_11.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_11.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_11.setIcon(h9);H[8]+=1;
			}
		}else if(j==11){


			if(i==1){
				H_12.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_12.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_12.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_12.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_12.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_12.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_12.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_12.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_12.setIcon(h9);H[8]+=1;
			}
		}else if(j==12){
			if(i==1){
				H_13.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_13.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_13.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_13.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_13.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_13.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_13.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_13.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_13.setIcon(h9);H[8]+=1;
			}
		}else if(j==13){

			if(i==1){
				H_14.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_14.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_14.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_14.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_14.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_14.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_14.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_14.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_14.setIcon(h9);H[8]+=1;
			}
		}else if(j==14){
			if(i==1){
				H_15.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_15.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_15.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_15.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_15.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_15.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_15.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_15.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_15.setIcon(h9);H[8]+=1;
			}
		}else if(j==15){


			if(i==1){
				H_16.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_16.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_16.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_16.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_16.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_16.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_16.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_16.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_16.setIcon(h9);H[8]+=1;
			}
		}else if(j==0){
			if(i==1){
				H_1.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_1.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_1.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_1.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_1.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_1.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_1.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_1.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_1.setIcon(h9);H[8]+=1;
			}
		}
	}
	private void othericonRFL(int i,int j,int z) {
		if(j==1){	
			if(i==3){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(wdr);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(wd);
				}else if(z==2){	
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(wdr);
				}
			}else if(i==4){
				if(z==0){ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(rdr);}else if(z==1){FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(rdc);}else if(z==2){	LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(far);}else if(z==1){FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(fac);}else if(z==2){	LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(ewr);}else if(z==1){FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(ewc);}else if(z==2){	LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(swr);}else if(z==1){FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(swc);}else if(z==2){	LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(wwr);}else if(z==1){FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(wwc);}else if(z==2){	LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(nwr);}else if(z==1){FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(nwc);}else if(z==2){	LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(nwl);}
			}
		}else if(j==2){
			if(i==3){
				if(z==0){ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(wdr);}else if(z==1){FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(wd);}else if(z==2){	LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(rdr);}else if(z==1){FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(rdc);}else if(z==2){	LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(far);}else if(z==1){FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(fac);}else if(z==2){	LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(ewr);}else if(z==1){FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(ewc);}else if(z==2){	LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(swr);}else if(z==1){FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(swc);}else if(z==2){	LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(wwr);}else if(z==1){FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(wwc);}else if(z==2){	LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(nwr);}else if(z==1){FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(nwc);}else if(z==2){	LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(nwl);}
			}
		}else if(j==3){
			if(i==3){
				if(z==0){ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(wdr);}else if(z==1){FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(wd);}else if(z==2){	LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(rdr);}else if(z==1){FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(rdc);}else if(z==2){	LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(far);}else if(z==1){FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(fac);}else if(z==2){	LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(ewr);}else if(z==1){FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(ewc);}else if(z==2){	LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(swr);}else if(z==1){FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(swc);}else if(z==2){	LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(wwr);}else if(z==1){FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(wwc);}else if(z==2){	LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(nwr);}else if(z==1){FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(nwc);}else if(z==2){	LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(nwl);}
			}
		}else if(j==4){

			if(i==3){
				if(z==0){ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(wdr);}else if(z==1){FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(wd);}else if(z==2){	LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(rdr);}else if(z==1){FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(rdc);}else if(z==2){	LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(far);}else if(z==1){FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(fac);}else if(z==2){	LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(ewr);}else if(z==1){FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(ewc);}else if(z==2){	LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(swr);}else if(z==1){FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(swc);}else if(z==2){	LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(wwr);}else if(z==1){FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(wwc);}else if(z==2){	LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(nwr);}else if(z==1){FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(nwc);}else if(z==2){	LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(nwl);}
			}
		}else if(j==5){

			if(i==3){
				if(z==0){ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(wdr);}else if(z==1){FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(wd);}else if(z==2){	LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(rdr);}else if(z==1){FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(rdc);}else if(z==2){	LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(far);}else if(z==1){FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(fac);}else if(z==2){	LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(ewr);}else if(z==1){FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(ewc);}else if(z==2){	LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(swr);}else if(z==1){FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(swc);}else if(z==2){	LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(wwr);}else if(z==1){FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(wwc);}else if(z==2){	LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(nwr);}else if(z==1){FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(nwc);}else if(z==2){	LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(nwl);}
			}
		}else if(j==6){
			if(i==3){
				if(z==0){ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(wdr);}else if(z==1){FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(wd);}else if(z==2){	LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(rdr);}else if(z==1){FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(rdc);}else if(z==2){	LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(far);}else if(z==1){FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(fac);}else if(z==2){	LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(ewr);}else if(z==1){FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(ewc);}else if(z==2){	LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(swr);}else if(z==1){FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(swc);}else if(z==2){	LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(wwr);}else if(z==1){FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(wwc);}else if(z==2){	LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(nwr);}else if(z==1){FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(nwc);}else if(z==2){	LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(nwl);}
			}
		}else if(j==7){
			if(i==3){
				if(z==0){ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(wdr);}else if(z==1){FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(wd);}else if(z==2){	LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(rdr);}else if(z==1){FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(rdc);}else if(z==2){	LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(far);}else if(z==1){FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(fac);}else if(z==2){	LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(ewr);}else if(z==1){FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(ewc);}else if(z==2){	LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(swr);}else if(z==1){FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(swc);}else if(z==2){	LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(wwr);}else if(z==1){FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(wwc);}else if(z==2){	LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(nwr);}else if(z==1){FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(nwc);}else if(z==2){	LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(nwl);}
			}
		}else if(j==8){
			if(i==3){
				if(z==0){ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(wdr);}else if(z==1){FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(wd);}else if(z==2){	LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(rdr);}else if(z==1){FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(rdc);}else if(z==2){	LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(far);}else if(z==1){FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(fac);}else if(z==2){	LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(ewr);}else if(z==1){FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(ewc);}else if(z==2){	LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(swr);}else if(z==1){FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(swc);}else if(z==2){	LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(wwr);}else if(z==1){FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(wwc);}else if(z==2){	LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(nwr);}else if(z==1){FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(nwc);}else if(z==2){	LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(nwl);}
			}
		}else if(j==9){
			if(i==3){
				if(z==0){ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(wdr);}else if(z==1){FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(wd);}else if(z==2){	LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(rdr);}else if(z==1){FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(rdc);}else if(z==2){	LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(far);}else if(z==1){FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(fac);}else if(z==2){	LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(ewr);}else if(z==1){FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(ewc);}else if(z==2){	LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(swr);}else if(z==1){FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(swc);}else if(z==2){	LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(wwr);}else if(z==1){FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(wwc);}else if(z==2){	LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(nwr);}else if(z==1){FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(nwc);}else if(z==2){	LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(nwl);}
			}
		}else if(j==10){
			if(i==3){
				if(z==0){ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(wdr);}else if(z==1){FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(wd);}else if(z==2){	LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(rdr);}else if(z==1){FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(rdc);}else if(z==2){	LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(far);}else if(z==1){FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(fac);}else if(z==2){	LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(ewr);}else if(z==1){FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(ewc);}else if(z==2){	LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(swr);}else if(z==1){FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(swc);}else if(z==2){	LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(wwr);}else if(z==1){FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(wwc);}else if(z==2){	LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(nwr);}else if(z==1){FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(nwc);}else if(z==2){	LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(nwl);}
			}
		}else if(j==11){
			if(i==3){
				if(z==0){ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(wdr);}else if(z==1){FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(wd);}else if(z==2){	LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(rdr);}else if(z==1){FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(rdc);}else if(z==2){	LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(far);}else if(z==1){FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(fac);}else if(z==2){	LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(ewr);}else if(z==1){FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(ewc);}else if(z==2){	LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(swr);}else if(z==1){FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(swc);}else if(z==2){	LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(wwr);}else if(z==1){FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(wwc);}else if(z==2){	LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(nwr);}else if(z==1){FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(nwc);}else if(z==2){	LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(nwl);}
			}
		}else if(j==12){
			if(i==3){
				if(z==0){ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(wdr);}else if(z==1){FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(wd);}else if(z==2){	LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(rdr);}else if(z==1){FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(rdc);}else if(z==2){	LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(far);}else if(z==1){FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(fac);}else if(z==2){	LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(ewr);}else if(z==1){FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(ewc);}else if(z==2){	LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(swr);}else if(z==1){FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(swc);}else if(z==2){	LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(wwr);}else if(z==1){FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(wwc);}else if(z==2){	LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(nwr);}else if(z==1){FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(nwc);}else if(z==2){	LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(nwl);}
			}
		}else if(j==13){
			if(i==3){
				if(z==0){ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(wdr);}else if(z==1){FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(wd);}else if(z==2){	LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(rdr);}else if(z==1){FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(rdc);}else if(z==2){	LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(far);}else if(z==1){FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(fac);}else if(z==2){	LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(ewr);}else if(z==1){FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(ewc);}else if(z==2){	LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(swr);}else if(z==1){FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(swc);}else if(z==2){	LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(wwr);}else if(z==1){FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(wwc);}else if(z==2){	LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(nwr);}else if(z==1){FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(nwc);}else if(z==2){	LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(nwl);}
			}
		}else if(j==14){
			if(i==3){
				if(z==0){ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(wdr);}else if(z==1){FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(wd);}else if(z==2){	LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(rdr);}else if(z==1){FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(rdc);}else if(z==2){	LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(far);}else if(z==1){FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(fac);}else if(z==2){	LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(ewr);}else if(z==1){FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(ewc);}else if(z==2){	LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(swr);}else if(z==1){FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(swc);}else if(z==2){	LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(wwr);}else if(z==1){FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(wwc);}else if(z==2){	LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(nwr);}else if(z==1){FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(nwc);}else if(z==2){	LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(nwl);}
			}
		}else if(j==0){
			if(i==3){
				if(z==0){ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(wdr);}else if(z==1){FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(wd);}else if(z==2){	LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(wdr);}
			}else if(i==4){
				if(z==0){ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(rdr);}else if(z==1){FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(rdc);}else if(z==2){	LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(rdl);}
			}else if(i==5){
				if(z==0){ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(far);}else if(z==1){FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(fac);}else if(z==2){	LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(fal);}
			}else if(i==6){
				if(z==0){ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(ewr);}else if(z==1){FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(ewc);}else if(z==2){	LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(ewl);}
			}else if(i==7){
				if(z==0){ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(swr);}else if(z==1){FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(swc);}else if(z==2){	LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(swl);}
			}else if(i==8){
				if(z==0){ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(wwr);}else if(z==1){FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(wwc);}else if(z==2){	LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(wwl);}
			}else if(i==9){
				if(z==0){ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(nwr);}else if(z==1){FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(nwc);}else if(z==2){	LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(nwl);}
			}
		}
	}
	private void biconRFL(int i,int j,int z) {

		if(j==1){
			if(i==1){
				if(z==0){
						ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(b1r);
				}else if(z==1){
						FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(b1c);
				}else if(z==2){
						LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(b1l);
				}else if(z==3){
						HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(b2r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(b2c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(b2l);
				}else if(z==3){
						HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(b3r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(b3c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(b3l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(b4r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(b4c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(b4l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(b5r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(b5c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(b5l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(b6r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(b6c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(b6l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(b7r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(b7c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(b7l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(b8r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(b8c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(b8l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(b9r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(b9c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(b9l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(b9);
				}
			}
		}else if(j==2){
			if(i==1){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(b1r);
				}else if(z==1){
						FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(b1c);
				}else if(z==2){
						LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(b1l);
				}else if(z==3){
						HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(b2r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(b2c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(b2l);
				}else if(z==3){
						HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(b3r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(b3c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(b3l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(b4r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(b4c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(b4l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(b5r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(b5c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(b5l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(b6r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(b6c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(b6l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(b7r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(b7c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(b7l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(b8r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(b8c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(b8l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(b9r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(b9c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(b9l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(b9);
				}
			}
		}else if(j==3){
			if(i==1){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(b1r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(b1c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(b1l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(b2r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(b2c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(b2l);
				}else if(z==3){
						HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(b3r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(b3c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(b3l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(b4r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(b4c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(b4l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(b5r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(b5c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(b5l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(b6r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(b6c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(b6l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(b7r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(b7c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(b7l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(b8r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(b8c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(b8l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(b9r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(b9c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(b9l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(b9);
				}
			}
		}else if(j==4){
			if(i==1){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(b1r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(b1c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(b1l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(b2r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(b2c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(b2l);
				}else if(z==3){
						HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(b3r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(b3c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(b3l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(b4r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(b4c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(b4l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(b5r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(b5c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(b5l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(b6r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(b6c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(b6l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(b7r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(b7c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(b7l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(b8r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(b8c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(b8l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(b9r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(b9c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(b9l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(b9);
				}
			}
		}else if(j==5){
			if(i==1){
			if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(b1r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(b1c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(b1l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(b2r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(b2c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(b2l);
				}else if(z==3){
						HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(b3r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(b3c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(b3l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(b4r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(b4c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(b4l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(b5r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(b5c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(b5l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(b6r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(b6c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(b6l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(b7r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(b7c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(b7l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(b8r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(b8c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(b8l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(b9r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(b9c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(b9l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(b9);
				}
			}
		}else if(j==6){
			if(i==1){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(b1r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(b1c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(b1l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(b2r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(b2c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(b2l);
				}else if(z==3){
						HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(b3r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(b3c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(b3l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(b4r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(b4c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(b4l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(b5r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(b5c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(b5l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(b6r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(b6c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(b6l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(b7r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(b7c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(b7l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(b8r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(b8c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(b8l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(b9r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(b9c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(b9l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(b9);
				}
			}
		}else if(j==7){
			if(i==1){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(b1r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(b1c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(b1l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(b2r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(b2c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(b2l);
				}else if(z==3){
						HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(b3r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(b3c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(b3l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(b4r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(b4c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(b4l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(b5r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(b5c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(b5l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(b6r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(b6c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(b6l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(b7r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(b7c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(b7l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(b8r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(b8c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(b8l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(b9r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(b9c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(b9l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(b9);
				}
			}
		}else if(j==8){
			if(i==1){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(b1r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(b1c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(b1l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(b2r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(b2c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(b2l);
				}else if(z==3){
						HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(b3r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(b3c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(b3l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(b4r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(b4c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(b4l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(b5r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(b5c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(b5l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(b6r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(b6c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(b6l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(b7r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(b7c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(b7l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(b8r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(b8c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(b8l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(b9r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(b9c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(b9l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(b9);
				}
			}
		}else if(j==9){
			if(i==1){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(b1r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(b1c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(b1l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(b2r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(b2c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(b2l);
				}else if(z==3){
						HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(b3r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(b3c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(b3l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(b4r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(b4c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(b4l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(b5r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(b5c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(b5l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(b6r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(b6c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(b6l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(b7r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(b7c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(b7l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(b8r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(b8c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(b8l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(b9r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(b9c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(b9l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(b9);
				}
			}
		}else if(j==10){
			if(i==1){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(b1r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(b1c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(b1l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(b2r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(b2c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(b2l);
				}else if(z==3){
						HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(b3r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(b3c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(b3l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(b4r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(b4c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(b4l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(b5r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(b5c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(b5l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(b6r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(b6c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(b6l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(b7r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(b7c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(b7l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(b8r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(b8c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(b8l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(b9r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(b9c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(b9l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(b9);
				}
			}
		}else if(j==11){
			if(i==1){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(b1r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(b1c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(b1l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(b2r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(b2c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(b2l);
				}else if(z==3){
						HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(b3r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(b3c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(b3l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(b4r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(b4c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(b4l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(b5r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(b5c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(b5l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(b6r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(b6c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(b6l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(b7r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(b7c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(b7l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(b8r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(b8c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(b8l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(b9r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(b9c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(b9l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(b9);
				}
			}
		}else if(j==12){	
			if(i==1){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(b1r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(b1c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(b1l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(b2r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(b2c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(b2l);
				}else if(z==3){
						HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(b3r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(b3c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(b3l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(b4r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(b4c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(b4l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(b5r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(b5c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(b5l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(b6r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(b6c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(b6l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(b7r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(b7c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(b7l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(b8r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(b8c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(b8l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(b9r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(b9c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(b9l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(b9);
				}
			}
		}else if(j==13){			
			if(i==1){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(b1r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(b1c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(b1l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(b2r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(b2c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(b2l);
				}else if(z==3){
						HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(b3r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(b3c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(b3l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(b4r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(b4c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(b4l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(b5r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(b5c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(b5l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(b6r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(b6c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(b6l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(b7r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(b7c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(b7l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(b8r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(b8c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(b8l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(b9r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(b9c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(b9l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(b9);
				}
			}
		}else if(j==14){
			if(i==1){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(b1r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(b1c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(b1l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(b1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(b2r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(b2c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(b2l);
				}else if(z==3){
						HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(b2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(b3r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(b3c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(b3l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(b3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(b4r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(b4c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(b4l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(b4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(b5r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(b5c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(b5l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(b5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(b6r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(b6c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(b6l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(b6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(b7r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(b7c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(b7l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(b7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(b8r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(b8c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(b8l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(b8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(b9r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(b9c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(b9l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(b9);
				}
			}
		}else if(j==0){	
			if(i==1){
				if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(b1r);
				}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(b1c);
				}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(b1l);
				}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(b1);
				}
				}else if(i==2){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(b2r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(b2c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(b2l);
					}else if(z==3){
							HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(b2);
					}
				}else if(i==3){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(b3r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(b3c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(b3l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(b3);
					}
				}else if(i==4){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(b4r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(b4c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(b4l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(b4);
					}
				}else if(i==5){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(b5r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(b5c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(b5l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(b5);
					}
				}else if(i==6){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(b6r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(b6c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(b6l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(b6);
					}
				}else if(i==7){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(b7r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(b7c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(b7l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(b7);
					}
				}else if(i==8){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(b8r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(b8c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(b8l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(b8);
					}
				}else if(i==9){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(b9r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(b9c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(b9l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(b9);
					}
				}
			}
		}
	private void ciconRFL(int i,int j,int z) {

if(j==1){
	if(i==1){
		if(z==0){
				ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(c1r);
		}else if(z==1){
				FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(c1c);
		}else if(z==2){
				LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(c1l);
		}else if(z==3){
				HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(c2r);
		}else if(z==1){
			FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(c2c);
		}else if(z==2){
			LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(c2l);
		}else if(z==3){
				HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(c3r);
		}else if(z==1){
			FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(c3c);
		}else if(z==2){
			LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(c3l);
		}else if(z==3){
			HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(c4r);
		}else if(z==1){
			FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(c4c);
		}else if(z==2){
			LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(c4l);
		}else if(z==3){
			HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(c5r);
		}else if(z==1){
			FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(c5c);
		}else if(z==2){
			LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(c5l);
		}else if(z==3){
			HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(c6r);
		}else if(z==1){
			FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(c6c);
		}else if(z==2){
			LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(c6l);
		}else if(z==3){
			HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(c7r);
		}else if(z==1){
			FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(c7c);
		}else if(z==2){
			LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(c7l);
		}else if(z==3){
			HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(c8r);
		}else if(z==1){
			FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(c8c);
		}else if(z==2){
			LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(c8l);
		}else if(z==3){
			HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(c9r);
		}else if(z==1){
			FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(c9c);
		}else if(z==2){
			LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(c9l);
		}else if(z==3){
			HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(c9);
		}
	}
}else if(j==2){
	if(i==1){
		if(z==0){
			ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(c1r);
		}else if(z==1){
				FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(c1c);
		}else if(z==2){
				LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(c1l);
		}else if(z==3){
				HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(c2r);
		}else if(z==1){
			FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(c2c);
		}else if(z==2){
			LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(c2l);
		}else if(z==3){
				HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(c3r);
		}else if(z==1){
			FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(c3c);
		}else if(z==2){
			LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(c3l);
		}else if(z==3){
			HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(c4r);
		}else if(z==1){
			FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(c4c);
		}else if(z==2){
			LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(c4l);
		}else if(z==3){
			HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(c5r);
		}else if(z==1){
			FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(c5c);
		}else if(z==2){
			LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(c5l);
		}else if(z==3){
			HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(c6r);
		}else if(z==1){
			FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(c6c);
		}else if(z==2){
			LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(c6l);
		}else if(z==3){
			HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(c7r);
		}else if(z==1){
			FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(c7c);
		}else if(z==2){
			LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(c7l);
		}else if(z==3){
			HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(c8r);
		}else if(z==1){
			FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(c8c);
		}else if(z==2){
			LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(c8l);
		}else if(z==3){
			HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(c9r);
		}else if(z==1){
			FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(c9c);
		}else if(z==2){
			LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(c9l);
		}else if(z==3){
			HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(c9);
		}
	}
}else if(j==3){
	if(i==1){
		if(z==0){
			ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(c1r);
		}else if(z==1){
			FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(c1c);
		}else if(z==2){
			LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(c1l);
		}else if(z==3){
			HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(c2r);
		}else if(z==1){
			FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(c2c);
		}else if(z==2){
			LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(c2l);
		}else if(z==3){
				HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(c3r);
		}else if(z==1){
			FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(c3c);
		}else if(z==2){
			LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(c3l);
		}else if(z==3){
			HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(c4r);
		}else if(z==1){
			FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(c4c);
		}else if(z==2){
			LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(c4l);
		}else if(z==3){
			HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(c5r);
		}else if(z==1){
			FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(c5c);
		}else if(z==2){
			LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(c5l);
		}else if(z==3){
			HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(c6r);
		}else if(z==1){
			FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(c6c);
		}else if(z==2){
			LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(c6l);
		}else if(z==3){
			HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(c7r);
		}else if(z==1){
			FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(c7c);
		}else if(z==2){
			LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(c7l);
		}else if(z==3){
			HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(c8r);
		}else if(z==1){
			FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(c8c);
		}else if(z==2){
			LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(c8l);
		}else if(z==3){
			HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(c9r);
		}else if(z==1){
			FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(c9c);
		}else if(z==2){
			LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(c9l);
		}else if(z==3){
			HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(c9);
		}
	}
}else if(j==4){
	if(i==1){
		if(z==0){
			ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(c1r);
		}else if(z==1){
			FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(c1c);
		}else if(z==2){
			LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(c1l);
		}else if(z==3){
			HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(c2r);
		}else if(z==1){
			FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(c2c);
		}else if(z==2){
			LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(c2l);
		}else if(z==3){
				HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(c3r);
		}else if(z==1){
			FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(c3c);
		}else if(z==2){
			LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(c3l);
		}else if(z==3){
			HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(c4r);
		}else if(z==1){
			FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(c4c);
		}else if(z==2){
			LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(c4l);
		}else if(z==3){
			HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(c5r);
		}else if(z==1){
			FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(c5c);
		}else if(z==2){
			LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(c5l);
		}else if(z==3){
			HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(c6r);
		}else if(z==1){
			FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(c6c);
		}else if(z==2){
			LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(c6l);
		}else if(z==3){
			HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(c7r);
		}else if(z==1){
			FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(c7c);
		}else if(z==2){
			LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(c7l);
		}else if(z==3){
			HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(c8r);
		}else if(z==1){
			FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(c8c);
		}else if(z==2){
			LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(c8l);
		}else if(z==3){
			HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(c9r);
		}else if(z==1){
			FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(c9c);
		}else if(z==2){
			LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(c9l);
		}else if(z==3){
			HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(c9);
		}
	}
}else if(j==5){
	if(i==1){
	if(z==0){
			ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(c1r);
		}else if(z==1){
			FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(c1c);
		}else if(z==2){
			LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(c1l);
		}else if(z==3){
			HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(c2r);
		}else if(z==1){
			FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(c2c);
		}else if(z==2){
			LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(c2l);
		}else if(z==3){
				HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(c3r);
		}else if(z==1){
			FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(c3c);
		}else if(z==2){
			LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(c3l);
		}else if(z==3){
			HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(c4r);
		}else if(z==1){
			FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(c4c);
		}else if(z==2){
			LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(c4l);
		}else if(z==3){
			HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(c5r);
		}else if(z==1){
			FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(c5c);
		}else if(z==2){
			LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(c5l);
		}else if(z==3){
			HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(c6r);
		}else if(z==1){
			FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(c6c);
		}else if(z==2){
			LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(c6l);
		}else if(z==3){
			HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(c7r);
		}else if(z==1){
			FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(c7c);
		}else if(z==2){
			LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(c7l);
		}else if(z==3){
			HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(c8r);
		}else if(z==1){
			FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(c8c);
		}else if(z==2){
			LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(c8l);
		}else if(z==3){
			HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(c9r);
		}else if(z==1){
			FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(c9c);
		}else if(z==2){
			LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(c9l);
		}else if(z==3){
			HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(c9);
		}
	}
}else if(j==6){
	if(i==1){
		if(z==0){
			ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(c1r);
		}else if(z==1){
			FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(c1c);
		}else if(z==2){
			LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(c1l);
		}else if(z==3){
			HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(c2r);
		}else if(z==1){
			FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(c2c);
		}else if(z==2){
			LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(c2l);
		}else if(z==3){
				HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(c3r);
		}else if(z==1){
			FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(c3c);
		}else if(z==2){
			LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(c3l);
		}else if(z==3){
			HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(c4r);
		}else if(z==1){
			FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(c4c);
		}else if(z==2){
			LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(c4l);
		}else if(z==3){
			HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(c5r);
		}else if(z==1){
			FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(c5c);
		}else if(z==2){
			LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(c5l);
		}else if(z==3){
			HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(c6r);
		}else if(z==1){
			FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(c6c);
		}else if(z==2){
			LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(c6l);
		}else if(z==3){
			HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(c7r);
		}else if(z==1){
			FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(c7c);
		}else if(z==2){
			LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(c7l);
		}else if(z==3){
			HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(c8r);
		}else if(z==1){
			FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(c8c);
		}else if(z==2){
			LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(c8l);
		}else if(z==3){
			HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(c9r);
		}else if(z==1){
			FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(c9c);
		}else if(z==2){
			LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(c9l);
		}else if(z==3){
			HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(c9);
		}
	}
}else if(j==7){
	if(i==1){
		if(z==0){
			ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(c1r);
		}else if(z==1){
			FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(c1c);
		}else if(z==2){
			LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(c1l);
		}else if(z==3){
			HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(c2r);
		}else if(z==1){
			FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(c2c);
		}else if(z==2){
			LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(c2l);
		}else if(z==3){
				HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(c3r);
		}else if(z==1){
			FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(c3c);
		}else if(z==2){
			LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(c3l);
		}else if(z==3){
			HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(c4r);
		}else if(z==1){
			FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(c4c);
		}else if(z==2){
			LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(c4l);
		}else if(z==3){
			HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(c5r);
		}else if(z==1){
			FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(c5c);
		}else if(z==2){
			LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(c5l);
		}else if(z==3){
			HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(c6r);
		}else if(z==1){
			FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(c6c);
		}else if(z==2){
			LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(c6l);
		}else if(z==3){
			HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(c7r);
		}else if(z==1){
			FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(c7c);
		}else if(z==2){
			LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(c7l);
		}else if(z==3){
			HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(c8r);
		}else if(z==1){
			FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(c8c);
		}else if(z==2){
			LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(c8l);
		}else if(z==3){
			HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(c9r);
		}else if(z==1){
			FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(c9c);
		}else if(z==2){
			LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(c9l);
		}else if(z==3){
			HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(c9);
		}
	}
}else if(j==8){
	if(i==1){
		if(z==0){
			ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(c1r);
		}else if(z==1){
			FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(c1c);
		}else if(z==2){
			LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(c1l);
		}else if(z==3){
			HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(c2r);
		}else if(z==1){
			FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(c2c);
		}else if(z==2){
			LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(c2l);
		}else if(z==3){
				HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(c3r);
		}else if(z==1){
			FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(c3c);
		}else if(z==2){
			LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(c3l);
		}else if(z==3){
			HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(c4r);
		}else if(z==1){
			FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(c4c);
		}else if(z==2){
			LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(c4l);
		}else if(z==3){
			HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(c5r);
		}else if(z==1){
			FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(c5c);
		}else if(z==2){
			LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(c5l);
		}else if(z==3){
			HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(c6r);
		}else if(z==1){
			FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(c6c);
		}else if(z==2){
			LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(c6l);
		}else if(z==3){
			HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(c7r);
		}else if(z==1){
			FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(c7c);
		}else if(z==2){
			LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(c7l);
		}else if(z==3){
			HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(c8r);
		}else if(z==1){
			FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(c8c);
		}else if(z==2){
			LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(c8l);
		}else if(z==3){
			HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(c9r);
		}else if(z==1){
			FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(c9c);
		}else if(z==2){
			LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(c9l);
		}else if(z==3){
			HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(c9);
		}
	}
}else if(j==9){
	if(i==1){
		if(z==0){
			ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(c1r);
		}else if(z==1){
			FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(c1c);
		}else if(z==2){
			LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(c1l);
		}else if(z==3){
			HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(c2r);
		}else if(z==1){
			FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(c2c);
		}else if(z==2){
			LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(c2l);
		}else if(z==3){
				HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(c3r);
		}else if(z==1){
			FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(c3c);
		}else if(z==2){
			LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(c3l);
		}else if(z==3){
			HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(c4r);
		}else if(z==1){
			FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(c4c);
		}else if(z==2){
			LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(c4l);
		}else if(z==3){
			HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(c5r);
		}else if(z==1){
			FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(c5c);
		}else if(z==2){
			LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(c5l);
		}else if(z==3){
			HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(c6r);
		}else if(z==1){
			FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(c6c);
		}else if(z==2){
			LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(c6l);
		}else if(z==3){
			HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(c7r);
		}else if(z==1){
			FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(c7c);
		}else if(z==2){
			LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(c7l);
		}else if(z==3){
			HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(c8r);
		}else if(z==1){
			FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(c8c);
		}else if(z==2){
			LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(c8l);
		}else if(z==3){
			HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(c9r);
		}else if(z==1){
			FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(c9c);
		}else if(z==2){
			LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(c9l);
		}else if(z==3){
			HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(c9);
		}
	}
}else if(j==10){
	if(i==1){
		if(z==0){
			ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(c1r);
		}else if(z==1){
			FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(c1c);
		}else if(z==2){
			LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(c1l);
		}else if(z==3){
			HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(c2r);
		}else if(z==1){
			FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(c2c);
		}else if(z==2){
			LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(c2l);
		}else if(z==3){
				HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(c3r);
		}else if(z==1){
			FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(c3c);
		}else if(z==2){
			LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(c3l);
		}else if(z==3){
			HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(c4r);
		}else if(z==1){
			FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(c4c);
		}else if(z==2){
			LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(c4l);
		}else if(z==3){
			HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(c5r);
		}else if(z==1){
			FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(c5c);
		}else if(z==2){
			LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(c5l);
		}else if(z==3){
			HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(c6r);
		}else if(z==1){
			FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(c6c);
		}else if(z==2){
			LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(c6l);
		}else if(z==3){
			HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(c7r);
		}else if(z==1){
			FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(c7c);
		}else if(z==2){
			LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(c7l);
		}else if(z==3){
			HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(c8r);
		}else if(z==1){
			FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(c8c);
		}else if(z==2){
			LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(c8l);
		}else if(z==3){
			HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(c9r);
		}else if(z==1){
			FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(c9c);
		}else if(z==2){
			LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(c9l);
		}else if(z==3){
			HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(c9);
		}
	}
}else if(j==11){
	if(i==1){
		if(z==0){
			ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(c1r);
		}else if(z==1){
			FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(c1c);
		}else if(z==2){
			LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(c1l);
		}else if(z==3){
			HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(c2r);
		}else if(z==1){
			FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(c2c);
		}else if(z==2){
			LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(c2l);
		}else if(z==3){
				HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(c3r);
		}else if(z==1){
			FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(c3c);
		}else if(z==2){
			LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(c3l);
		}else if(z==3){
			HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(c4r);
		}else if(z==1){
			FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(c4c);
		}else if(z==2){
			LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(c4l);
		}else if(z==3){
			HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(c5r);
		}else if(z==1){
			FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(c5c);
		}else if(z==2){
			LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(c5l);
		}else if(z==3){
			HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(c6r);
		}else if(z==1){
			FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(c6c);
		}else if(z==2){
			LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(c6l);
		}else if(z==3){
			HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(c7r);
		}else if(z==1){
			FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(c7c);
		}else if(z==2){
			LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(c7l);
		}else if(z==3){
			HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(c8r);
		}else if(z==1){
			FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(c8c);
		}else if(z==2){
			LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(c8l);
		}else if(z==3){
			HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(c9r);
		}else if(z==1){
			FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(c9c);
		}else if(z==2){
			LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(c9l);
		}else if(z==3){
			HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(c9);
		}
	}
}else if(j==12){	
	if(i==1){
		if(z==0){
			ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(c1r);
		}else if(z==1){
			FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(c1c);
		}else if(z==2){
			LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(c1l);
		}else if(z==3){
			HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(c2r);
		}else if(z==1){
			FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(c2c);
		}else if(z==2){
			LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(c2l);
		}else if(z==3){
				HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(c3r);
		}else if(z==1){
			FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(c3c);
		}else if(z==2){
			LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(c3l);
		}else if(z==3){
			HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(c4r);
		}else if(z==1){
			FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(c4c);
		}else if(z==2){
			LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(c4l);
		}else if(z==3){
			HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(c5r);
		}else if(z==1){
			FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(c5c);
		}else if(z==2){
			LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(c5l);
		}else if(z==3){
			HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(c6r);
		}else if(z==1){
			FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(c6c);
		}else if(z==2){
			LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(c6l);
		}else if(z==3){
			HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(c7r);
		}else if(z==1){
			FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(c7c);
		}else if(z==2){
			LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(c7l);
		}else if(z==3){
			HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(c8r);
		}else if(z==1){
			FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(c8c);
		}else if(z==2){
			LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(c8l);
		}else if(z==3){
			HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(c9r);
		}else if(z==1){
			FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(c9c);
		}else if(z==2){
			LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(c9l);
		}else if(z==3){
			HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(c9);
		}
	}
}else if(j==13){			
	if(i==1){
		if(z==0){
			ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(c1r);
		}else if(z==1){
			FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(c1c);
		}else if(z==2){
			LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(c1l);
		}else if(z==3){
			HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(c2r);
		}else if(z==1){
			FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(c2c);
		}else if(z==2){
			LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(c2l);
		}else if(z==3){
				HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(c3r);
		}else if(z==1){
			FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(c3c);
		}else if(z==2){
			LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(c3l);
		}else if(z==3){
			HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(c4r);
		}else if(z==1){
			FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(c4c);
		}else if(z==2){
			LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(c4l);
		}else if(z==3){
			HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(c5r);
		}else if(z==1){
			FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(c5c);
		}else if(z==2){
			LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(c5l);
		}else if(z==3){
			HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(c6r);
		}else if(z==1){
			FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(c6c);
		}else if(z==2){
			LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(c6l);
		}else if(z==3){
			HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(c7r);
		}else if(z==1){
			FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(c7c);
		}else if(z==2){
			LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(c7l);
		}else if(z==3){
			HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(c8r);
		}else if(z==1){
			FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(c8c);
		}else if(z==2){
			LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(c8l);
		}else if(z==3){
			HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(c9r);
		}else if(z==1){
			FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(c9c);
		}else if(z==2){
			LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(c9l);
		}else if(z==3){
			HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(c9);
		}
	}
}else if(j==14){
	if(i==1){
		if(z==0){
			ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(c1r);
		}else if(z==1){
			FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(c1c);
		}else if(z==2){
			LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(c1l);
		}else if(z==3){
			HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(c1);
		}
	}else if(i==2){
		if(z==0){
			ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(c2r);
		}else if(z==1){
			FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(c2c);
		}else if(z==2){
			LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(c2l);
		}else if(z==3){
				HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(c2);
		}
	}else if(i==3){
		if(z==0){
			ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(c3r);
		}else if(z==1){
			FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(c3c);
		}else if(z==2){
			LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(c3l);
		}else if(z==3){
			HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(c3);
		}
	}else if(i==4){
		if(z==0){
			ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(c4r);
		}else if(z==1){
			FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(c4c);
		}else if(z==2){
			LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(c4l);
		}else if(z==3){
			HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(c4);
		}
	}else if(i==5){
		if(z==0){
			ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(c5r);
		}else if(z==1){
			FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(c5c);
		}else if(z==2){
			LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(c5l);
		}else if(z==3){
			HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(c5);
		}
	}else if(i==6){
		if(z==0){
			ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(c6r);
		}else if(z==1){
			FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(c6c);
		}else if(z==2){
			LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(c6l);
		}else if(z==3){
			HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(c6);
		}
	}else if(i==7){
		if(z==0){
			ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(c7r);
		}else if(z==1){
			FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(c7c);
		}else if(z==2){
			LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(c7l);
		}else if(z==3){
			HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(c7);
		}
	}else if(i==8){
		if(z==0){
			ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(c8r);
		}else if(z==1){
			FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(c8c);
		}else if(z==2){
			LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(c8l);
		}else if(z==3){
			HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(c8);
		}
	}else if(i==9){
		if(z==0){
			ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(c9r);
		}else if(z==1){
			FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(c9c);
		}else if(z==2){
			LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(c9l);
		}else if(z==3){
			HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(c9);
		}
	}
}else if(j==0){	
	if(i==1){
		if(z==0){
				ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(c1r);
		}else if(z==1){
				FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(c1c);
		}else if(z==2){
				LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(c1l);
		}else if(z==3){
				HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(c1);
		}
		}else if(i==2){
			if(z==0){
				ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(c2r);
			}else if(z==1){
				FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(c2c);
			}else if(z==2){
				LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(c2l);
			}else if(z==3){
					HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(c2);
			}
		}else if(i==3){
			if(z==0){
				ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(c3r);
			}else if(z==1){
				FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(c3c);
			}else if(z==2){
				LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(c3l);
			}else if(z==3){
				HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(c3);
			}
		}else if(i==4){
			if(z==0){
				ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(c4r);
			}else if(z==1){
				FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(c4c);
			}else if(z==2){
				LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(c4l);
			}else if(z==3){
				HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(c4);
			}
		}else if(i==5){
			if(z==0){
				ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(c5r);
			}else if(z==1){
				FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(c5c);
			}else if(z==2){
				LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(c5l);
			}else if(z==3){
				HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(c5);
			}
		}else if(i==6){
			if(z==0){
				ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(c6r);
			}else if(z==1){
				FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(c6c);
			}else if(z==2){
				LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(c6l);
			}else if(z==3){
				HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(c6);
			}
		}else if(i==7){
			if(z==0){
				ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(c7r);
			}else if(z==1){
				FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(c7c);
			}else if(z==2){
				LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(c7l);
			}else if(z==3){
				HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(c7);
			}
		}else if(i==8){
			if(z==0){
				ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(c8r);
			}else if(z==1){
				FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(c8c);
			}else if(z==2){
				LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(c8l);
			}else if(z==3){
				HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(c8);
			}
		}else if(i==9){
			if(z==0){
				ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(c9r);
			}else if(z==1){
				FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(c9c);
			}else if(z==2){
				LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(c9l);
			}else if(z==3){
				HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(c9);
			}
		}
	}
	}
	private void hiconRFL(int i,int j,int z) {//i 1~9花色   j  z
		// TODO Auto-generated method stub
		if(j==1){
			if(i==1){
				if(z==0){
						ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(h1r);
				}else if(z==1){
						FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(h1c);
				}else if(z==2){
						LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(h1l);
				}else if(z==3){
						HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(h2r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(h2c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(h2l);
				}else if(z==3){
						HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(h3r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(h3c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(h3l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(h4r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(h4c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(h4l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(h5r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(h5c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(h5l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(h6r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(h6c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(h6l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(h7r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(h7c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(h7l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(h8r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(h8c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(h8l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_2.setVisible(true);R_15.setVisible(false);ROUT_2.setIcon(h9r);
				}else if(z==1){
					FOUT_2.setVisible(true);F_15.setVisible(false);FOUT_2.setIcon(h9c);
				}else if(z==2){
					LOUT_2.setVisible(true);L_15.setVisible(false);LOUT_2.setIcon(h9l);
				}else if(z==3){
					HOUT_2.setVisible(true);H_15.setVisible(false);HOUT_2.setIcon(h9);
				}
			}
		}else if(j==2){
			if(i==1){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(h1r);
				}else if(z==1){
						FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(h1c);
				}else if(z==2){
						LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(h1l);
				}else if(z==3){
						HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(h2r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(h2c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(h2l);
				}else if(z==3){
						HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(h3r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(h3c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(h3l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(h4r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(h4c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(h4l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(h5r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(h5c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(h5l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(h6r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(h6c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(h6l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(h7r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(h7c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(h7l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(h8r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(h8c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(h8l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_3.setVisible(true);R_14.setVisible(false);ROUT_3.setIcon(h9r);
				}else if(z==1){
					FOUT_3.setVisible(true);F_14.setVisible(false);FOUT_3.setIcon(h9c);
				}else if(z==2){
					LOUT_3.setVisible(true);L_14.setVisible(false);LOUT_3.setIcon(h9l);
				}else if(z==3){
					HOUT_3.setVisible(true);H_14.setVisible(false);HOUT_3.setIcon(h9);
				}
			}
		}else if(j==3){
			if(i==1){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(h1r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(h1c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(h1l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(h2r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(h2c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(h2l);
				}else if(z==3){
						HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(h3r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(h3c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(h3l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(h4r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(h4c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(h4l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(h5r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(h5c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(h5l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(h6r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(h6c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(h6l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(h7r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(h7c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(h7l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(h8r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(h8c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(h8l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_4.setVisible(true);R_13.setVisible(false);ROUT_4.setIcon(h9r);
				}else if(z==1){
					FOUT_4.setVisible(true);F_13.setVisible(false);FOUT_4.setIcon(h9c);
				}else if(z==2){
					LOUT_4.setVisible(true);L_13.setVisible(false);LOUT_4.setIcon(h9l);
				}else if(z==3){
					HOUT_4.setVisible(true);H_13.setVisible(false);HOUT_4.setIcon(h9);
				}
			}
		}else if(j==4){
			if(i==1){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(h1r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(h1c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(h1l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(h2r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(h2c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(h2l);
				}else if(z==3){
						HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(h3r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(h3c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(h3l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(h4r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(h4c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(h4l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(h5r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(h5c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(h5l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(h6r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(h6c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(h6l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(h7r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(h7c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(h7l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(h8r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(h8c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(h8l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_5.setVisible(true);R_12.setVisible(false);ROUT_5.setIcon(h9r);
				}else if(z==1){
					FOUT_5.setVisible(true);F_12.setVisible(false);FOUT_5.setIcon(h9c);
				}else if(z==2){
					LOUT_5.setVisible(true);L_12.setVisible(false);LOUT_5.setIcon(h9l);
				}else if(z==3){
					HOUT_5.setVisible(true);H_12.setVisible(false);HOUT_5.setIcon(h9);
				}
			}
		}else if(j==5){
			if(i==1){
			if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(h1r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(h1c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(h1l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(h2r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(h2c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(h2l);
				}else if(z==3){
						HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(h3r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(h3c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(h3l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(h4r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(h4c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(h4l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(h5r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(h5c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(h5l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(h6r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(h6c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(h6l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(h7r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(h7c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(h7l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(h8r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(h8c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(h8l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_6.setVisible(true);R_11.setVisible(false);ROUT_6.setIcon(h9r);
				}else if(z==1){
					FOUT_6.setVisible(true);F_11.setVisible(false);FOUT_6.setIcon(h9c);
				}else if(z==2){
					LOUT_6.setVisible(true);L_11.setVisible(false);LOUT_6.setIcon(h9l);
				}else if(z==3){
					HOUT_6.setVisible(true);H_11.setVisible(false);HOUT_6.setIcon(h9);
				}
			}
		}else if(j==6){
			if(i==1){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(h1r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(h1c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(h1l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(h2r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(h2c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(h2l);
				}else if(z==3){
						HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(h3r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(h3c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(h3l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(h4r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(h4c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(h4l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(h5r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(h5c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(h5l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(h6r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(h6c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(h6l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(h7r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(h7c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(h7l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(h8r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(h8c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(h8l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_7.setVisible(true);R_10.setVisible(false);ROUT_7.setIcon(h9r);
				}else if(z==1){
					FOUT_7.setVisible(true);F_10.setVisible(false);FOUT_7.setIcon(h9c);
				}else if(z==2){
					LOUT_7.setVisible(true);L_10.setVisible(false);LOUT_7.setIcon(h9l);
				}else if(z==3){
					HOUT_7.setVisible(true);H_10.setVisible(false);HOUT_7.setIcon(h9);
				}
			}
		}else if(j==7){
			if(i==1){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(h1r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(h1c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(h1l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(h2r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(h2c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(h2l);
				}else if(z==3){
						HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(h3r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(h3c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(h3l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(h4r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(h4c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(h4l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(h5r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(h5c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(h5l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(h6r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(h6c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(h6l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(h7r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(h7c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(h7l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(h8r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(h8c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(h8l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_8.setVisible(true);R_9.setVisible(false);ROUT_8.setIcon(h9r);
				}else if(z==1){
					FOUT_8.setVisible(true);F_9.setVisible(false);FOUT_8.setIcon(h9c);
				}else if(z==2){
					LOUT_8.setVisible(true);L_9.setVisible(false);LOUT_8.setIcon(h9l);
				}else if(z==3){
					HOUT_8.setVisible(true);H_9.setVisible(false);HOUT_8.setIcon(h9);
				}
			}
		}else if(j==8){
			if(i==1){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(h1r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(h1c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(h1l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(h2r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(h2c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(h2l);
				}else if(z==3){
						HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(h3r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(h3c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(h3l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(h4r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(h4c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(h4l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(h5r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(h5c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(h5l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(h6r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(h6c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(h6l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(h7r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(h7c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(h7l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(h8r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(h8c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(h8l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_9.setVisible(true);R_8.setVisible(false);ROUT_9.setIcon(h9r);
				}else if(z==1){
					FOUT_9.setVisible(true);F_8.setVisible(false);FOUT_9.setIcon(h9c);
				}else if(z==2){
					LOUT_9.setVisible(true);L_8.setVisible(false);LOUT_9.setIcon(h9l);
				}else if(z==3){
					HOUT_9.setVisible(true);H_8.setVisible(false);HOUT_9.setIcon(h9);
				}
			}
		}else if(j==9){
			if(i==1){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(h1r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(h1c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(h1l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(h2r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(h2c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(h2l);
				}else if(z==3){
						HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(h3r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(h3c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(h3l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(h4r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(h4c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(h4l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(h5r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(h5c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(h5l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(h6r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(h6c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(h6l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(h7r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(h7c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(h7l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(h8r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(h8c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(h8l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_10.setVisible(true);R_7.setVisible(false);ROUT_10.setIcon(h9r);
				}else if(z==1){
					FOUT_10.setVisible(true);F_7.setVisible(false);FOUT_10.setIcon(h9c);
				}else if(z==2){
					LOUT_10.setVisible(true);L_7.setVisible(false);LOUT_10.setIcon(h9l);
				}else if(z==3){
					HOUT_10.setVisible(true);H_7.setVisible(false);HOUT_10.setIcon(h9);
				}
			}
		}else if(j==10){
			if(i==1){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(h1r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(h1c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(h1l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(h2r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(h2c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(h2l);
				}else if(z==3){
						HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(h3r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(h3c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(h3l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(h4r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(h4c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(h4l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(h5r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(h5c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(h5l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(h6r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(h6c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(h6l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(h7r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(h7c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(h7l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(h8r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(h8c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(h8l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_11.setVisible(true);R_6.setVisible(false);ROUT_11.setIcon(h9r);
				}else if(z==1){
					FOUT_11.setVisible(true);F_6.setVisible(false);FOUT_11.setIcon(h9c);
				}else if(z==2){
					LOUT_11.setVisible(true);L_6.setVisible(false);LOUT_11.setIcon(h9l);
				}else if(z==3){
					HOUT_11.setVisible(true);H_6.setVisible(false);HOUT_11.setIcon(h9);
				}
			}
		}else if(j==11){
			if(i==1){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(h1r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(h1c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(h1l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(h2r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(h2c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(h2l);
				}else if(z==3){
						HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(h3r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(h3c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(h3l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(h4r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(h4c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(h4l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(h5r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(h5c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(h5l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(h6r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(h6c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(h6l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(h7r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(h7c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(h7l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(h8r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(h8c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(h8l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_12.setVisible(true);R_5.setVisible(false);ROUT_12.setIcon(h9r);
				}else if(z==1){
					FOUT_12.setVisible(true);F_5.setVisible(false);FOUT_12.setIcon(h9c);
				}else if(z==2){
					LOUT_12.setVisible(true);L_5.setVisible(false);LOUT_12.setIcon(h9l);
				}else if(z==3){
					HOUT_12.setVisible(true);H_5.setVisible(false);HOUT_12.setIcon(h9);
				}
			}
		}else if(j==12){	
			if(i==1){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(h1r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(h1c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(h1l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(h2r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(h2c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(h2l);
				}else if(z==3){
						HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(h3r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(h3c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(h3l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(h4r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(h4c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(h4l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(h5r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(h5c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(h5l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(h6r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(h6c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(h6l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(h7r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(h7c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(h7l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(h8r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(h8c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(h8l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_13.setVisible(true);R_4.setVisible(false);ROUT_13.setIcon(h9r);
				}else if(z==1){
					FOUT_13.setVisible(true);F_4.setVisible(false);FOUT_13.setIcon(h9c);
				}else if(z==2){
					LOUT_13.setVisible(true);L_4.setVisible(false);LOUT_13.setIcon(h9l);
				}else if(z==3){
					HOUT_13.setVisible(true);H_4.setVisible(false);HOUT_13.setIcon(h9);
				}
			}
		}else if(j==13){			
			if(i==1){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(h1r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(h1c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(h1l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(h2r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(h2c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(h2l);
				}else if(z==3){
						HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(h3r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(h3c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(h3l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(h4r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(h4c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(h4l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(h5r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(h5c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(h5l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(h6r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(h6c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(h6l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(h7r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(h7c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(h7l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(h8r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(h8c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(h8l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_14.setVisible(true);R_3.setVisible(false);ROUT_14.setIcon(h9r);
				}else if(z==1){
					FOUT_14.setVisible(true);F_3.setVisible(false);FOUT_14.setIcon(h9c);
				}else if(z==2){
					LOUT_14.setVisible(true);L_3.setVisible(false);LOUT_14.setIcon(h9l);
				}else if(z==3){
					HOUT_14.setVisible(true);H_3.setVisible(false);HOUT_14.setIcon(h9);
				}
			}
		}else if(j==14){
			if(i==1){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(h1r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(h1c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(h1l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(h1);
				}
			}else if(i==2){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(h2r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(h2c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(h2l);
				}else if(z==3){
						HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(h2);
				}
			}else if(i==3){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(h3r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(h3c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(h3l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(h3);
				}
			}else if(i==4){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(h4r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(h4c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(h4l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(h4);
				}
			}else if(i==5){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(h5r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(h5c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(h5l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(h5);
				}
			}else if(i==6){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(h6r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(h6c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(h6l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(h6);
				}
			}else if(i==7){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(h7r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(h7c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(h7l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(h7);
				}
			}else if(i==8){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(h8r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(h8c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(h8l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(h8);
				}
			}else if(i==9){
				if(z==0){
					ROUT_15.setVisible(true);R_2.setVisible(false);ROUT_15.setIcon(h9r);
				}else if(z==1){
					FOUT_15.setVisible(true);F_2.setVisible(false);FOUT_15.setIcon(h9c);
				}else if(z==2){
					LOUT_15.setVisible(true);L_2.setVisible(false);LOUT_15.setIcon(h9l);
				}else if(z==3){
					HOUT_15.setVisible(true);H_2.setVisible(false);HOUT_15.setIcon(h9);
				}
			}
		}else if(j==0){	
			if(i==1){
				if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(h1r);
				}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(h1c);
				}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(h1l);
				}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(h1);
				}
				}else if(i==2){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(h2r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(h2c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(h2l);
					}else if(z==3){
							HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(h2);
					}
				}else if(i==3){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(h3r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(h3c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(h3l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(h3);
					}
				}else if(i==4){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(h4r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(h4c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(h4l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(h4);
					}
				}else if(i==5){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(h5r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(h5c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(h5l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(h5);
					}
				}else if(i==6){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(h6r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(h6c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(h6l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(h6);
					}
				}else if(i==7){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(h7r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(h7c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(h7l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(h7);
					}
				}else if(i==8){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(h8r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(h8c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(h8l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(h8);
					}
				}else if(i==9){
					if(z==0){
						ROUT_1.setVisible(true);R_16.setVisible(false);ROUT_1.setIcon(h9r);
					}else if(z==1){
						FOUT_1.setVisible(true);F_16.setVisible(false);FOUT_1.setIcon(h9c);
					}else if(z==2){
						LOUT_1.setVisible(true);L_16.setVisible(false);LOUT_1.setIcon(h9l);
					}else if(z==3){
						HOUT_1.setVisible(true);H_16.setVisible(false);HOUT_1.setIcon(h9);
					}
				}
			}
	}	
	
	private void othericonEBG(int i,int j) {
		// TODO Auto-generated method stub
		if(j==16){	
			if(i==3){
				if(OUTB){
					label_2.setIcon(wd);O[0]+=1;
				}else{
					H_17.setIcon(wd);O[0]+=1;
				}
			}else if(i==4){
				if(OUTB){
					label_2.setIcon(rd);O[1]+=1;
				}else{
					H_17.setIcon(rd);O[1]+=1;
				}
			}else if(i==5){
				if(OUTB){
					label_2.setIcon(fa);O[2]+=1;
				}else{
					H_17.setIcon(fa);O[2]+=1;
				}
			}else if(i==6){
				if(OUTB){
					label_2.setIcon(ew);O[3]+=1;
				}else{
					H_17.setIcon(ew);O[3]+=1;
				}
			}else if(i==7){
				if(OUTB){
					label_2.setIcon(sw);O[4]+=1;
				}else{
					H_17.setIcon(sw);O[4]+=1;
				}
			}else if(i==8){
				if(OUTB){
					label_2.setIcon(ww);O[5]+=1;
				}else{
					H_17.setIcon(ww);O[5]+=1;
				}
			}else if(i==9){
				if(OUTB){
					label_2.setIcon(nw);O[6]+=1;
				}else{
					H_17.setIcon(nw);O[6]+=1;
				}
			}
		}else if(j==1){	
			if(i==3){
				H_2.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_2.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_2.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_2.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_2.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_2.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_2.setIcon(nw);O[6]+=1;
			}
		}else if(j==2){
			if(i==3){
				H_3.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_3.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_3.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_3.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_3.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_3.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_3.setIcon(nw);O[6]+=1;
			}
		}else if(j==3){
			if(i==3){
				H_4.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_4.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_4.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_4.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_4.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_4.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_4.setIcon(nw);O[6]+=1;
			}
		}else if(j==4){
			if(i==3){
				H_5.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_5.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_5.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_5.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_5.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_5.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_5.setIcon(nw);O[6]+=1;
			}
		}else if(j==5){
			if(i==3){
				H_6.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_6.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_6.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_6.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_6.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_6.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_6.setIcon(nw);O[6]+=1;
			}
		}else if(j==6){
			if(i==3){
				H_7.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_7.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_7.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_7.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_7.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_7.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_7.setIcon(nw);O[6]+=1;
			}
		}else if(j==7){
			if(i==3){
				H_8.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_8.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_8.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_8.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_8.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_8.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_8.setIcon(nw);O[6]+=1;
			}	
		}else if(j==8){
			if(i==3){
				H_9.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_9.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_9.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_9.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_9.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_9.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_9.setIcon(nw);O[6]+=1;
			}
		}else if(j==9){
			if(i==3){
				H_10.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_10.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_10.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_10.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_10.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_10.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_10.setIcon(nw);O[6]+=1;
			}
		}else if(j==10){
			if(i==3){
				H_11.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_11.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_11.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_11.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_11.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_11.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_11.setIcon(nw);O[6]+=1;
			}
		}else if(j==11){
			if(i==3){
				H_12.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_12.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_12.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_12.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_12.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_12.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_12.setIcon(nw);O[6]+=1;
			}
		}else if(j==12){
			if(i==3){
				H_13.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_13.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_13.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_13.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_13.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_13.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_13.setIcon(nw);O[6]+=1;
			}
		}else if(j==13){
			if(i==3){
				H_14.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_14.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_14.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_14.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_14.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_14.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_14.setIcon(nw);O[6]+=1;
			}
		}else if(j==14){
			if(i==3){
				H_15.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_15.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_15.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_15.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_15.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_15.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_15.setIcon(nw);O[6]+=1;
			}
		}else if(j==15){
			if(i==3){
				H_16.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_16.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_16.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_16.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_16.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_16.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_16.setIcon(nw);O[6]+=1;
			}
		}else if(j==0){
			if(i==3){
				H_1.setIcon(wd);O[0]+=1;
			}else if(i==4){
				H_1.setIcon(rd);O[1]+=1;
			}else if(i==5){
				H_1.setIcon(fa);O[2]+=1;
			}else if(i==6){
				H_1.setIcon(ew);O[3]+=1;
			}else if(i==7){
				H_1.setIcon(sw);O[4]+=1;
			}else if(i==8){
				H_1.setIcon(ww);O[5]+=1;
			}else if(i==9){
				H_1.setIcon(nw);O[6]+=1;
			}
		}
	}
	private void biconE(int i,int j) {
		// TODO Auto-generated method stub
		if(j==16){	
			if(i==1){
				if(OUTB){
					label_2.setIcon(b1);B[0]+=1;
				}else{
					H_17.setIcon(b1);B[0]+=1;
				}
			}else if(i==2){
				if(OUTB){
					label_2.setIcon(b2);B[1]+=1;
				}else{
					H_17.setIcon(b2);B[1]+=1;
				}
			}else if(i==3){
				if(OUTB){
					label_2.setIcon(b3);B[2]+=1;
				}else{
					H_17.setIcon(b3);B[2]+=1;
				}
			}else if(i==4){
				if(OUTB){
					label_2.setIcon(b4);B[3]+=1;
				}else{
					H_17.setIcon(b4);B[3]+=1;
				}
			}else if(i==5){
				if(OUTB){
					label_2.setIcon(b5);B[4]+=1;
				}else{
					H_17.setIcon(b5);B[4]+=1;
				}
			}else if(i==6){
				if(OUTB){
					label_2.setIcon(b6);B[5]+=1;
				}else{
					H_17.setIcon(b6);B[5]+=1;
				}
			}else if(i==7){
				if(OUTB){
					label_2.setIcon(b7);B[6]+=1;
				}else{
					H_17.setIcon(b7);B[6]+=1;
				}
			}else if(i==8){
				if(OUTB){
					label_2.setIcon(b8);B[7]+=1;
				}else{
					H_17.setIcon(b8);B[7]+=1;
				}
			}else if(i==9){
				if(OUTB){
					label_2.setIcon(b9);B[8]+=1;
				}else{
					H_17.setIcon(b9);B[8]+=1;
				}
			}
		}else if(j==1){
			if(i==1){
				H_2.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_2.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_2.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_2.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_2.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_2.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_2.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_2.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_2.setIcon(b9);B[8]+=1;
			}
		}else if(j==2){

			if(i==1){
				H_3.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_3.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_3.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_3.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_3.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_3.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_3.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_3.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_3.setIcon(b9);B[8]+=1;
			}
		}else if(j==3){

			if(i==1){
				H_4.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_4.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_4.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_4.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_4.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_4.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_4.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_4.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_4.setIcon(b9);B[8]+=1;
			}
		}else if(j==4){
			if(i==1){
				H_5.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_5.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_5.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_5.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_5.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_5.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_5.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_5.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_5.setIcon(b9);B[8]+=1;
			}
		}else if(j==5){
			if(i==1){
				H_6.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_6.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_6.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_6.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_6.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_6.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_6.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_6.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_6.setIcon(b9);B[8]+=1;
			}
		}else if(j==6){
			if(i==1){
				H_7.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_7.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_7.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_7.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_7.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_7.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_7.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_7.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_7.setIcon(b9);B[8]+=1;
			}
		}else if(j==7){

			if(i==1){
				H_8.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_8.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_8.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_8.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_8.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_8.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_8.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_8.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_8.setIcon(b9);B[8]+=1;
			}	
		}else if(j==8){


			if(i==1){
				H_9.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_9.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_9.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_9.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_9.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_9.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_9.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_9.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_9.setIcon(b9);B[8]+=1;
			}
		}else if(j==9){
			if(i==1){
				H_10.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_10.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_10.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_10.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_10.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_10.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_10.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_10.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_10.setIcon(b9);B[8]+=1;
			}
		}else if(j==10){
			if(i==1){
				H_11.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_11.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_11.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_11.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_11.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_11.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_11.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_11.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_11.setIcon(b9);B[8]+=1;
			}
		}else if(j==11){


			if(i==1){
				H_12.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_12.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_12.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_12.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_12.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_12.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_12.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_12.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_12.setIcon(b9);B[8]+=1;
			}
		}else if(j==12){
			if(i==1){
				H_13.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_13.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_13.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_13.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_13.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_13.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_13.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_13.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_13.setIcon(b9);B[8]+=1;
			}
		}else if(j==13){

			if(i==1){
				H_14.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_14.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_14.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_14.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_14.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_14.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_14.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_14.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_14.setIcon(b9);B[8]+=1;
			}
		}else if(j==14){
			if(i==1){
				H_15.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_15.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_15.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_15.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_15.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_15.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_15.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_15.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_15.setIcon(b9);B[8]+=1;
			}
		}else if(j==15){


			if(i==1){
				H_16.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_16.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_16.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_16.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_16.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_16.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_16.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_16.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_16.setIcon(b9);B[8]+=1;
			}
		}else if(j==0){
			if(i==1){
				H_1.setIcon(b1);B[0]+=1;
			}else if(i==2){
				H_1.setIcon(b2);B[1]+=1;
			}else if(i==3){
				H_1.setIcon(b3);B[2]+=1;
			}else if(i==4){
				H_1.setIcon(b4);B[3]+=1;
			}else if(i==5){
				H_1.setIcon(b5);B[4]+=1;
			}else if(i==6){
				H_1.setIcon(b6);B[5]+=1;
			}else if(i==7){
				H_1.setIcon(b7);B[6]+=1;
			}else if(i==8){
				H_1.setIcon(b8);B[7]+=1;
			}else if(i==9){
				H_1.setIcon(b9);B[8]+=1;
			}
		}
	}
	private void ciconE(int i,int j) {
		// TODO Auto-generated method stub
		if(j==16){	
			if(i==1){
				if(OUTB){
					label_2.setIcon(c1);C[0]+=1;
				}else{
					H_17.setIcon(c1);C[0]+=1;
				}
			}else if(i==2){
				if(OUTB){
					label_2.setIcon(c2);C[1]+=1;
				}else{
					H_17.setIcon(c2);C[1]+=1;
				}
			}else if(i==3){
				if(OUTB){
					label_2.setIcon(c3);C[2]+=1;
				}else{
					H_17.setIcon(c3);C[2]+=1;
				}
			}else if(i==4){
				if(OUTB){
					label_2.setIcon(c4);C[3]+=1;
				}else{
					H_17.setIcon(c4);C[3]+=1;
				}
			}else if(i==5){
				if(OUTB){
					label_2.setIcon(c5);C[4]+=1;
				}else{
					H_17.setIcon(c5);C[4]+=1;
				}
			}else if(i==6){
				if(OUTB){
					label_2.setIcon(c6);C[5]+=1;
				}else{
					H_17.setIcon(c6);C[5]+=1;
				}
			}else if(i==7){
				if(OUTB){
					label_2.setIcon(c7);C[6]+=1;
				}else{
					H_17.setIcon(c7);C[6]+=1;
				}
			}else if(i==8){
				if(OUTB){
					label_2.setIcon(c8);C[7]+=1;
				}else{
					H_17.setIcon(c8);C[7]+=1;
				}
			}else if(i==9){
				if(OUTB){
					label_2.setIcon(c9);C[8]+=1;
				}else{
					H_17.setIcon(c9);C[8]+=1;
				}
			}
		}else if(j==1){
			if(i==1){
				H_2.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_2.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_2.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_2.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_2.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_2.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_2.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_2.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_2.setIcon(c9);C[8]+=1;
			}
		}else if(j==2){

			if(i==1){
				H_3.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_3.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_3.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_3.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_3.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_3.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_3.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_3.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_3.setIcon(c9);C[8]+=1;
			}
		}else if(j==3){

			if(i==1){
				H_4.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_4.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_4.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_4.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_4.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_4.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_4.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_4.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_4.setIcon(c9);C[8]+=1;
			}
		}else if(j==4){
			if(i==1){
				H_5.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_5.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_5.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_5.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_5.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_5.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_5.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_5.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_5.setIcon(c9);C[8]+=1;
			}
		}else if(j==5){
			if(i==1){
				H_6.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_6.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_6.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_6.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_6.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_6.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_6.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_6.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_6.setIcon(c9);C[8]+=1;
			}
		}else if(j==6){
			if(i==1){
				H_7.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_7.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_7.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_7.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_7.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_7.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_7.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_7.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_7.setIcon(c9);C[8]+=1;
			}
		}else if(j==7){

			if(i==1){
				H_8.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_8.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_8.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_8.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_8.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_8.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_8.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_8.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_8.setIcon(c9);C[8]+=1;
			}	
		}else if(j==8){


			if(i==1){
				H_9.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_9.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_9.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_9.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_9.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_9.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_9.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_9.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_9.setIcon(c9);C[8]+=1;
			}
		}else if(j==9){
			if(i==1){
				H_10.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_10.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_10.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_10.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_10.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_10.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_10.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_10.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_10.setIcon(c9);C[8]+=1;
			}
		}else if(j==10){
			if(i==1){
				H_11.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_11.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_11.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_11.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_11.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_11.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_11.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_11.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_11.setIcon(c9);C[8]+=1;
			}
		}else if(j==11){


			if(i==1){
				H_12.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_12.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_12.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_12.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_12.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_12.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_12.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_12.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_12.setIcon(c9);C[8]+=1;
			}
		}else if(j==12){
			if(i==1){
				H_13.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_13.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_13.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_13.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_13.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_13.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_13.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_13.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_13.setIcon(c9);C[8]+=1;
			}
		}else if(j==13){

			if(i==1){
				H_14.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_14.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_14.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_14.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_14.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_14.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_14.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_14.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_14.setIcon(c9);C[8]+=1;
			}
		}else if(j==14){
			if(i==1){
				H_15.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_15.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_15.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_15.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_15.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_15.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_15.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_15.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_15.setIcon(c9);C[8]+=1;
			}
		}else if(j==15){


			if(i==1){
				H_16.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_16.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_16.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_16.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_16.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_16.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_16.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_16.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_16.setIcon(c9);C[8]+=1;
			}
		}else if(j==0){
			if(i==1){
				H_1.setIcon(c1);C[0]+=1;
			}else if(i==2){
				H_1.setIcon(c2);C[1]+=1;
			}else if(i==3){
				H_1.setIcon(c3);C[2]+=1;
			}else if(i==4){
				H_1.setIcon(c4);C[3]+=1;
			}else if(i==5){
				H_1.setIcon(c5);C[4]+=1;
			}else if(i==6){
				H_1.setIcon(c6);C[5]+=1;
			}else if(i==7){
				H_1.setIcon(c7);C[6]+=1;
			}else if(i==8){
				H_1.setIcon(c8);C[7]+=1;
			}else if(i==9){
				H_1.setIcon(c9);C[8]+=1;
			}
		}
	}
	private void hiconE(int i,int j) {
		// TODO Auto-generated method stub
		if(j==16){	
			if(i==1){
				if(OUTB){
					label_2.setIcon(h1);H[0]+=1;
				}else{
					H_17.setIcon(h1);H[0]+=1;
				}
			}else if(i==2){
				if(OUTB){
					label_2.setIcon(h2);H[1]+=1;
				}else{
					H_17.setIcon(h2);H[1]+=1;
				}
			}else if(i==3){
				if(OUTB){
					label_2.setIcon(h3);H[2]+=1;
				}else{
					H_17.setIcon(h3);H[2]+=1;
				}
			}else if(i==4){
				if(OUTB){
					label_2.setIcon(h4);H[3]+=1;
				}else{
					H_17.setIcon(h4);H[3]+=1;
				}
			}else if(i==5){
				if(OUTB){
					label_2.setIcon(h5);H[4]+=1;
				}else{
					H_17.setIcon(h5);H[4]+=1;
				}
			}else if(i==6){
				if(OUTB){
					label_2.setIcon(h6);H[5]+=1;
				}else{
					H_17.setIcon(h6);H[5]+=1;
				}
			}else if(i==7){
				if(OUTB){
					label_2.setIcon(h7);H[6]+=1;
				}else{
					H_17.setIcon(h7);H[6]+=1;
				}
			}else if(i==8){
				if(OUTB){
					label_2.setIcon(h8);H[7]+=1;
				}else{
					H_17.setIcon(h8);H[7]+=1;
				}
			}else if(i==9){
				if(OUTB){
					label_2.setIcon(h9);H[8]+=1;
				}else{
					H_17.setIcon(h9);H[8]+=1;
				}
			}
		}else if(j==1){
			if(i==1){
				H_2.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_2.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_2.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_2.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_2.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_2.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_2.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_2.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_2.setIcon(h9);H[8]+=1;
			}
		}else if(j==2){

			if(i==1){
				H_3.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_3.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_3.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_3.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_3.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_3.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_3.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_3.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_3.setIcon(h9);H[8]+=1;
			}
		}else if(j==3){

			if(i==1){
				H_4.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_4.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_4.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_4.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_4.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_4.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_4.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_4.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_4.setIcon(h9);H[8]+=1;
			}
		}else if(j==4){
			if(i==1){
				H_5.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_5.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_5.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_5.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_5.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_5.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_5.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_5.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_5.setIcon(h9);H[8]+=1;
			}
		}else if(j==5){
			if(i==1){
				H_6.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_6.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_6.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_6.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_6.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_6.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_6.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_6.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_6.setIcon(h9);H[8]+=1;
			}
		}else if(j==6){
			if(i==1){
				H_7.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_7.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_7.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_7.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_7.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_7.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_7.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_7.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_7.setIcon(h9);H[8]+=1;
			}
		}else if(j==7){

			if(i==1){
				H_8.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_8.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_8.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_8.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_8.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_8.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_8.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_8.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_8.setIcon(h9);H[8]+=1;
			}	
		}else if(j==8){


			if(i==1){
				H_9.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_9.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_9.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_9.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_9.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_9.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_9.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_9.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_9.setIcon(h9);H[8]+=1;
			}
		}else if(j==9){
			if(i==1){
				H_10.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_10.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_10.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_10.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_10.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_10.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_10.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_10.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_10.setIcon(h9);H[8]+=1;
			}
		}else if(j==10){
			if(i==1){
				H_11.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_11.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_11.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_11.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_11.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_11.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_11.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_11.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_11.setIcon(h9);H[8]+=1;
			}
		}else if(j==11){


			if(i==1){
				H_12.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_12.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_12.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_12.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_12.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_12.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_12.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_12.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_12.setIcon(h9);H[8]+=1;
			}
		}else if(j==12){
			if(i==1){
				H_13.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_13.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_13.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_13.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_13.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_13.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_13.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_13.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_13.setIcon(h9);H[8]+=1;
			}
		}else if(j==13){

			if(i==1){
				H_14.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_14.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_14.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_14.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_14.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_14.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_14.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_14.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_14.setIcon(h9);H[8]+=1;
			}
		}else if(j==14){
			if(i==1){
				H_15.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_15.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_15.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_15.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_15.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_15.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_15.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_15.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_15.setIcon(h9);H[8]+=1;
			}
		}else if(j==15){


			if(i==1){
				H_16.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_16.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_16.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_16.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_16.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_16.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_16.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_16.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_16.setIcon(h9);H[8]+=1;
			}
		}else if(j==0){
			if(i==1){
				H_1.setIcon(h1);H[0]+=1;
			}else if(i==2){
				H_1.setIcon(h2);H[1]+=1;
			}else if(i==3){
				H_1.setIcon(h3);H[2]+=1;
			}else if(i==4){
				H_1.setIcon(h4);H[3]+=1;
			}else if(i==5){
				H_1.setIcon(h5);H[4]+=1;
			}else if(i==6){
				H_1.setIcon(h6);H[5]+=1;
			}else if(i==7){
				H_1.setIcon(h7);H[6]+=1;
			}else if(i==8){
				H_1.setIcon(h8);H[7]+=1;
			}else if(i==9){
				H_1.setIcon(h9);H[8]+=1;
			}
		}
	}
	private String getServerAddress() {
        return JOptionPane.showInputDialog(asda,
            "\u8F38\u5165\u670D\u52D9\u7AEFIP:",
            "\u6B61\u8FCE\u9032\u5165\u9EBB\u5C07",
            JOptionPane.QUESTION_MESSAGE);
    }
    private String getName() {
        return JOptionPane.showInputDialog(
            asda,
            "\u8ACB\u8F38\u5165\u66B1\u7A31:",
            "Screen name selection",
            JOptionPane.PLAIN_MESSAGE);
    }
    private void reset() {
		F_1.setIcon(back);
		F_2.setIcon(back);
		F_3.setIcon(back);
		F_4.setIcon(back);
		F_5.setIcon(back);
		F_6.setIcon(back);
		F_7.setIcon(back);
		F_8.setIcon(back);
		F_9.setIcon(back);
		F_10.setIcon(back);
		F_11.setIcon(back);
		F_12.setIcon(back);
		F_13.setIcon(back);
		F_14.setIcon(back);
		F_15.setIcon(back);
		F_16.setIcon(back);
		
		H_1.setIcon(back);
		H_2.setIcon(back);
		H_3.setIcon(back);
		H_4.setIcon(back);
		H_5.setIcon(back);
		H_6.setIcon(back);
		H_7.setIcon(back);
		H_8.setIcon(back);
		H_9.setIcon(back);
		H_10.setIcon(back);
		H_11.setIcon(back);
		H_12.setIcon(back);
		H_13.setIcon(back);
		H_14.setIcon(back);
		H_15.setIcon(back);
		H_16.setIcon(back);
		H_17.setIcon(backr);
		
		R_1.setIcon(backr);
		R_2.setIcon(backr);
		R_3.setIcon(backr);
		R_4.setIcon(backr);
		R_5.setIcon(backr);
		R_6.setIcon(backr);
		R_7.setIcon(backr);
		R_8.setIcon(backr);
		R_9.setIcon(backr);
		R_10.setIcon(backr);
		R_11.setIcon(backr);
		R_12.setIcon(backr);
		R_13.setIcon(backr);
		R_14.setIcon(backr);
		R_15.setIcon(backr);
		R_16.setIcon(backr);
		
		L_1.setIcon(backr);
		L_2.setIcon(backr);
		L_3.setIcon(backr);
		L_4.setIcon(backr);
		L_5.setIcon(backr);
		L_6.setIcon(backr);
		L_7.setIcon(backr);
		L_8.setIcon(backr);
		L_9.setIcon(backr);
		L_10.setIcon(backr);
		L_11.setIcon(backr);
		L_12.setIcon(backr);
		L_13.setIcon(backr);
		L_14.setIcon(backr);
		L_15.setIcon(backr);
		L_16.setIcon(backr);
    }
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}

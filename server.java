import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Server {
	//↓↓↓↓↓↓↓↓↓↓↓↓↑↑↑↑全域變數↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	private static final int total_card_number = 136; //總牌數
	private static String cards[] = new String[34];
	private static int licensing[] = new int[34];
	private static int PORT = 20000;
	private static HashSet<PrintWriter> writers = new HashSet<PrintWriter>();
	private static HashSet<String> names = new HashSet<String>();//socket 連線者輸入的名稱將存放在這
	private static int ready_number[] = {0};
	private static int player_name_number = 0;
	private static String player_name[] = new String[4];
	private static  int card_number_now; //現在總共發了幾張牌 用來判斷和局
	private static int card_number_final = 17;//此數字是用來判斷該局要剩下幾張牌  若此數字大於勝於牌數 則和局
	private static boolean player_ready[] = new boolean[4];
	private static boolean playing_player[] = new boolean[4];
	private static int playing_number = 0;
	private static String gobal_str = new String();
	private static boolean begining_lic = false;
	private static boolean finish_lic = false;
	private static boolean finish_out[] = new boolean[4];
	private static int nothing_number[] = new int[4];
	private static int eat_player_number = 0;
	private static boolean outisfinish = false;
	private static int now_number=0;
	private static boolean player_action_finish[] = new boolean[4];
	//↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑全域變數↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	
	public static void main(String[] args) throws Exception{
		creat_card();
		init_player_ready(player_ready);
		init_player_ready(player_action_finish);
		init_player_ready(playing_player);
		init_player_ready(finish_out);
		init_card_number_array();
		init_server_port();
		playing_player[0] =true;
		ServerSocket listener = new ServerSocket(PORT);
		try{
			while(true){
				new Handler(listener.accept()).start();
			}
		}finally {
			listener.close();
		}
		
	}
	
	private static class Handler extends Thread{
		//↓↓↓↓↓↓↓↓↓↓↓↓變數↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		private Socket socket;
		private String name;
		private BufferedReader in;
		private PrintWriter out;
		private String str_temp = new String();
		private int licensing_count = 0;//發了幾張牌 總共發16張
		private Random ran = new Random();
		private int licensing_ran = 0;   //隨機發牌 被用在random
		private int order_number = 0;    //打牌順位
		//↑↑↑↑↑↑↑↑↑↑↑↑變數↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
		
		//↓↓↓↓↓↓↓↓↓↓↓↓建構子↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		public Handler(Socket socket){
			this.socket = socket;
		}
		//↑↑↑↑↑↑↑↑↑↑↑↑建構子↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
		
		public void run(){
			try{
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(),true);
				
				//↓↓↓↓↓↓↓↓↓↓↓↓直到使用者輸入不重複名稱否則不跳離迴圈↓↓↓↓↓↓↓↓↓↓↓↓↓↓
				while(true){
					out.println("SUBMITNAME");
					name = in.readLine();
					if(name == null){
						return;
					}
					synchronized (names) {
						if(!names.contains(name)){
							names.add(name);
							break;
						}
					}
				}
				//↑↑↑↑↑↑↑↑↑↑↑↑直到使用者輸入不重複名稱否則不跳離迴圈↑↑↑↑↑↑↑↑↑↑↑↑↑↑
				
				
				//↓↓↓↓↓↓↓↓↓↓↓↓通知客戶端註冊成功↓↓↓↓↓↓↓↓↓↓↓↓↓↓
				out.println("NAMEACCEPTED");
				writers.add(out);//把註冊成功的名稱添加到這邊
				//↑↑↑↑↑↑↑↑↑↑↑↑通知客戶端註冊成功↑↑↑↑↑↑↑↑↑↑↑↑↑↑
				
				
				//↓↓↓↓↓↓↓↓↓↓↓↓確認是否要開始遊戲↓↓↓↓↓↓↓↓↓↓↓↓↓↓
				while(true){
					str_temp = in.readLine();
					if(str_temp.startsWith("Ready")){
						out.println("MESSAGE YOU ARE READY");
						System.out.println(name+"Ready");
						if(player_name_number < 4){
							order_number = player_name_number;
							player_name[player_name_number++] = name;
							player_ready[order_number] = true;
							break;
						}
						ready_number[0]++;
						str_temp = null;
					}	
				}				
				//↑↑↑↑↑↑↑↑↑↑↑↑確認是否要開始遊戲↑↑↑↑↑↑↑↑↑↑↑↑↑↑
				
				out.println("MESSAGE ============================");
				while(!all_is_true(player_ready)){
					yield();
				}
				
				for(int i = 0; i < 4; i++){
					if(one_is_true()){
						Thread.sleep(1000);
					}
					else
						break;
				}
				
				
				//↓↓↓↓↓↓↓↓↓↓↓↓人數到齊準備開始↓↓↓↓↓↓↓↓↓↓↓↓↓↓
				while(true){
					if(!player_ready[order_number]){
						player_ready[order_number] = true;
					}
					out.println("MESSAGE THE GAME START AFTER 5 SECEND");
					if(all_is_true(player_ready)){
						out.println("MESSAGE ============================");
						break;
					}
				}
				
				
				TimeUnit.SECONDS.sleep(5);
				//↑↑↑↑↑↑↑↑↑↑↑↑人數到齊準備開始↑↑↑↑↑↑↑↑↑↑↑↑↑↑
				
				
				//↓↓↓↓↓↓↓↓↓↓↓↓該局玩家名稱↓↓↓↓↓↓↓↓↓↓↓↓↓↓
				for(int i = 0; i < 4 ; i++){
					out.println("GameStart "+player_name[i]);
				}
				//↑↑↑↑↑↑↑↑↑↑↑↑該局玩家名稱↑↑↑↑↑↑↑↑↑↑↑↑↑↑
				
				//↓↓↓↓↓↓↓↓↓↓↓↓遊戲開始時發16張牌給玩家↓↓↓↓↓↓↓↓↓↓↓↓↓↓
				synchronized (licensing) {
					while(true){
						
						if(licensing_count >= 16){
							break;
						}
						licensing_ran = ran.nextInt(34);
						if(licensing[licensing_ran] > 0){
							System.out.println(name+cards[licensing_ran]);
							out.println("FLICENSING "+cards[licensing_ran]);
							licensing[licensing_ran]--;
							licensing_count++;
							card_number_now++;
						}
					}
				}
				//↑↑↑↑↑↑↑↑↑↑↑↑遊戲開始時發16張牌給玩家↑↑↑↑↑↑↑↑↑↑↑↑↑↑
			
				Thread.sleep(5000);
				String input=null;
				BODY:while(true){
					if((total_card_number - card_number_now) < card_number_final){
						out.println("TIE");
						break;
					}
					
					if(player_name[playing_number].equals(name) && !finish_lic){       //發牌
						while(true){
							licensing_ran = ran.nextInt(34);
							System.out.println(name+licensing[licensing_ran]);
							if(licensing[licensing_ran] > 0){
								System.out.println(name+cards[licensing_ran]);
								out.println("LICENSING "+cards[licensing_ran]);
								licensing[licensing_ran]--;
								licensing_count++;
								card_number_now++;
								finish_lic=true;
								break;
							}
						}
					}  											   //非發牌 and 發完牌
					System.out.println("--------------"+name);
					while(true){
						String str_temp = new String();
						str_temp = in.readLine();
						input = str_temp;
						if(input.startsWith("OUT")){				//丟牌
							for(PrintWriter writer : writers){
								writer.println(input);
							}
						}else if(input.startsWith("GUNE")){
							for(PrintWriter writer : writers){
								writer.println(input);
							}
							card_number_final--;
							playing_number=order_number-1<0?3:order_number;
						}else if(input.startsWith("BUMP")){
							for(PrintWriter writer : writers){
								writer.println(input);
							}
							System.out.println("BUMP");
							playing_number=order_number;
						}else if(input.startsWith("EAT")){
							for(PrintWriter writer : writers){
								writer.println(input);
							}
							playing_number=order_number;
							System.out.println("EAT");
						}else if(input.startsWith("WIN")){
							for(PrintWriter writer : writers){
								writer.println(input);
							}
							break BODY;
						}else if(input.startsWith("NOTHING")){
							synchronized (nothing_number){
								nothing_number[order_number]++;
							}
							System.out.println("NOTHING"+player_name[order_number]+"|||"+playing_number);
							if(check_nothing_number()){
								init_nothing_number();
								for(PrintWriter writer : writers){
									writer.println("NEXT"+name);
								}
								playing_number=(playing_number+1)%4;
								System.out.println("NOTHING"+player_name[order_number]+"|||"+playing_number);
							}
						}else if(input.startsWith("CLOSE")){
							break BODY;
						}else if(input.startsWith("NEXT")){

							System.out.println("NEXT");
							finish_lic=false;
							break ;
						}else if(input.startsWith("MESSAGE")){
							for(PrintWriter writer : writers){
								writer.println("MESSAGE "+player_name[order_number]+input.substring(8));
							}
						}
					
					}
					
				}
				
				
				
			}catch (Exception e) {
				// TODO: handle exception
			}finally {
				if(name != null){
					writers.remove(name);
				}
				if(out != null){
					writers.remove(out);
				}
				try{
					socket.close();
				}catch (IOException e) {
					// TODO: handle exception
				}
			}
		}
		
	}
	private static boolean one_is_true(){
		for(int i = 0; i < player_ready.length; i++){
			if(player_ready[i]){
				return true;
			}
		}
		return false;
	}
	
	private static boolean all_is_true(boolean bool_array[]){
		for(int i = 0; i < player_ready.length; i++){
			if(!bool_array[i]){
				return false;
			}
		}
		return true;
	}
	
	private static void init_player_ready(boolean bool_array[]){
		for(int i = 0; i < bool_array.length; i++){
			bool_array[i] = false;
		}
	}
	
	private static void init_server_port(){
		Scanner scn = new Scanner(System.in);
		PORT = 20000;
		scn.close();
	}
	
	private static void init_card_number_array(){
		for(int i = 0; i < licensing.length; i++){
			licensing[i] = 4;
		}
	}

	private static void creat_card(){
		String number[] = {"一","二","三","四","五","六","七","八","九"};
		String card = "萬餅條";
		String other_card[] = {"白板","紅中","發財","東風","南風","西風","北風"};
		int cards_count = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 9; j++){
				cards[cards_count] = number[j];
				cards[cards_count] += card.charAt(i);
				cards_count++;
			}
		}
		for(int i = 0; i < 7; i++){
			cards[i+27] = other_card[i];
		}
	}
	
	private static void init_nothing_number(){
		for(int i = 0; i < nothing_number.length ; i++){
			nothing_number[i] = 0;
		}
	}
	
	private static boolean check_nothing_number(){
		int j = 0;
		for(int i = 0; i < nothing_number.length ; i++){
			if(nothing_number[i] > 0){
				j++;
			}
		}
		if(j==4){
			return true;
		}
		return false;
	}
}

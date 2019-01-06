import java.util.Scanner;
import java.util.Vector;

public class Bankers_main {
	private Vector<Integer> Available = new Vector<Integer>();
	private int MAX_A = 15;
	private int MAX_B = 13;
	private int MAX_C = 6;
	private int MAX_D = 7;
	private int process_num = 6;
	Vector<Process> process = new Vector<Process>();
	
	public static void main(String[] args) {
		Bankers_main bank = new Bankers_main();
		bank.run();
	}
	
	public void run(){
		int menu;
		Scanner sc = new Scanner(System.in);
		
		initialize();
		System.out.println("어떤 데모를 실행하시겠습니까?\n");
		System.out.println("1. 가능한 경우\n 2. Request값이 Need값보다 큰 경우\n 3. Request값이 Allocation값보다 큰 경우\n 4. Deadlock\n 0. 종료\n");
		System.out.println("menu : ");
		menu = sc.nextInt();
		
		switch(menu){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				System.exit(0);
				break;
		}
	}
	//값 초기화
	public void initialize(){
		//프로세스 생성
		for(int i = 0; i < process_num; i++){
			Process pro = new Process();
			process.add(pro);
		}
		//프로세스에 값 직접 넣어주기(어차피 데모 버전)
		for(int i = 0; i < process_num; i++){
			Process pro = new Process();
			Vector<Integer> _alloc = new Vector<Integer>();
			Vector<Integer> _max = new Vector<Integer>();
			
			if(i == 0){
				_alloc.add(2);
				_alloc.add(2);
				_alloc.add(3);
				_alloc.add(1);
				_max.add(8);
				_max.add(6);
				_max.add(5);
				_max.add(1);
				process.elementAt(0).setAllocation(_alloc);
				process.elementAt(0).setMax(_max);
			}
			else if(i == 1){
				_alloc.add(1);
				_alloc.add(0);
				_alloc.add(0);
				_alloc.add(2);
				_max.add(3);
				_max.add(2);
				_max.add(1);
				_max.add(3);
				process.elementAt(1).setAllocation(_alloc);
				process.elementAt(1).setMax(_max);
			}
			else if(i == 2){
				_alloc.add(0);
				_alloc.add(2);
				_alloc.add(1);
				_alloc.add(1);
				_max.add(1);
				_max.add(0);
				_max.add(1);
				_max.add(2);
				process.elementAt(2).setAllocation(_alloc);
				process.elementAt(2).setMax(_max);
			}
			else if(i == 3){
				_alloc.add(2);
				_alloc.add(1);
				_alloc.add(1);
				_alloc.add(1);
				_max.add(5);
				_max.add(6);
				_max.add(5);
				_max.add(4);
				process.elementAt(3).setAllocation(_alloc);
				process.elementAt(3).setMax(_max);
			}
			else if(i == 4){
				_alloc.add(5);
				_alloc.add(3);
				_alloc.add(0);
				_alloc.add(0);
				_max.add(9);
				_max.add(5);
				_max.add(1);
				_max.add(0);
				process.elementAt(4).setAllocation(_alloc);
				process.elementAt(4).setMax(_max);
			}
			else if(i == 5){
				_alloc.add(1);
				_alloc.add(1);
				_alloc.add(0);
				_alloc.add(0);
				_max.add(4);
				_max.add(7);
				_max.add(4);
				_max.add(5);
				process.elementAt(5).setAllocation(_alloc);
				process.elementAt(5).setMax(_max);
			}
		}
		//available 초기화
		for(int i = 0; i < 4; i++){
			int allo = 0;
			allo = process.elementAt(0).getAllocation().elementAt(i);
			for(int j = 1; j < process_num; j++){
				allo += process.elementAt(j).getAllocation().elementAt(i);
			}
			Available.add(allo);
		}
	}
	
	
}

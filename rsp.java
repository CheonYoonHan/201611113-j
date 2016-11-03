
public class rsp{
	public static void main(String[] args) {
		String user1="r";
		String user2="p";
		new rsp().rspPlay(user1, user2);
	}
	void rspPlay(String user1, String user2){
		if ("r".equals(user1) && "r".equals(user2)){
			System.out.println("Draw");
		}
		if ("s".equals(user1) && "s".equals(user2)){
			System.out.println("Draw");
		}
		if ("p".equals(user1) && "p".equals(user2)){
			System.out.println("Draw");
		}
		if("r".equals(user1)){
			if("s".equals(user2)){
				System.out.println("User1 win!");
			}
			else if("p".equals(user2)){
				System.out.println("User2 win!");
			}
		}
		if("s".equals(user1)){
			if("r".equals(user2)){
				System.out.println("User2 win!");
			}
			else if("p".equals(user2)){
				System.out.println("User1 win!");
			}
		}
		if("p".equals(user1)){
			if("s".equals(user2)){
				System.out.println("User2 win!");
			}
			else if("r".equals(user2)){
				System.out.println("User1 win!");
			}
		}
	}
}
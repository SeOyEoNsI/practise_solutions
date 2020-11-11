package week04;
import java.util.*;

public class Member {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String id,passwd;
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("ID �Է�: ");
			id = sc.next();
			if(id.equals("0")) throw new NotExistIDException();
			
			System.out.print("Password �Է�: ");
			passwd = sc.next();
			if(passwd.equals("0")) throw new WrongPasswordException();
			sc.close();
		}

		catch (NotExistIDException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		catch (WrongPasswordException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}
}

class NotExistIDException extends Exception{
	private static final long serialVersionUID = 1L;
	public NotExistIDException() {
		super("ID�� ����");
	}
}
class WrongPasswordException extends Exception{
	private static final long serialVersionUID = 1L;
	public WrongPasswordException() {
		super("Password�� �߸���");
	}
}

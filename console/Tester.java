package console;

import logic.Debt;
import logic.User;
import session.Session;

public class Tester {

	public static void main(String[] args) {
		User u = new User("Stian", "asd");
		Session.session.setUser(u);
		User u2 = new User("Arne", "qazqaz");
		
		u.addConfirmedDebt(new Debt(1, 2, "lol", u, Session.session.getUser(), "hei", u));
		u.addPendingDebt(new Debt(2, 20, "Boller fra Jan", u2, u, "Hahahahhahahha", u));
		// TODO: Add fleir debts her! (B�de pending og confirmed, og fra/til begge, og med lange/korte variabler)
		//		Du kain og pr�v me l�nger brukernavn
		
		Main.processLs();
	}
}

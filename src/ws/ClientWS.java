package ws;

import java.util.List;

public class ClientWS {
	public static void main(String[] args) {
		BanquService stub = new BanqueService().getBanquServicePort();
		double res = stub.convertEuroToDT(5);
		System.out.println(res);
		Compte cpt = stub.getCompte(1L);
		System.out.println(cpt.getSolde());
		List<Compte> comptes = stub.getComptes();
		comptes.forEach(c->{System.out.println(c.code);});
	}

}

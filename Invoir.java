
public class Invoir {

	public static void main(String[] args) {
		String[] clientName={"C026-01-0967/2022","28/04/2020","Brenda Kanani","0100100100","Pencil","Duster","Pens","crayon"};
		int[] quantity= {4,10,9,10};
		int[] uPrice= {20,50,30,80};
		double[] amount= {80.00,500.00,270.00,800.00};
		double subttl=0;
		int i;
		for (i = 0; i<amount.length; i++) {
            subttl += amount[i];
        }
		double vat=0.16*subttl;
		double ttl=vat+subttl;
		System.out.println("***********************Adamson Computers Ltd******************************");
		System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City  *  Tel. No:123-4567");
		System.out.println("                 VAT REG. TIN 098-765-4321-0000");
		System.out.println("                         SALES INVOICE");
		
		
		System.out.println("Sold to:"+clientName[0]+"                   Date:"+clientName[1]);
		System.out.println("Address:"+clientName[2]+"                    Contact Number:"+clientName[3]);
		System.out.println("==========================================================================");
		System.out.println("Qty      |    Item Description    |    Unit Price    |Amount");
		System.out.println("==========================================================================");
		System.out.println(""+quantity[0]+"        |    "+clientName[4]+"              |    "+uPrice[0]+"            |"+amount[0]);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(""+quantity[1]+"       |    "+clientName[5]+"              |    "+uPrice[1]+"            |"+amount[1]);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(""+quantity[2]+"        |    "+clientName[6]+"                |    "+uPrice[2]+"            |"+amount[2]);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(""+quantity[3]+"       |    "+clientName[7]+"              |    "+uPrice[3]+"            |"+amount[3]);
		System.out.println("==========================================================================");
		System.out.println("                                       |Sub Total    |"+subttl);
		System.out.println("                                       ===================================");
		System.out.println("                                       |VAT(16%)     |"+vat);
		System.out.println("                                       ===================================");
		System.out.println("                                       |Total Amount |"+ttl);
		System.out.println("                                       ===================================");
	}

}

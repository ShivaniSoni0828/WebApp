package co.in.noi.personal.model;
import java.text.SimpleDateFormat;
import java.util.Date;

import co.in.Bean.Address;



public class Test {
public static void main(String[] args) throws Exception {
	//PersonModel PM = new PersonModel();
	
	AddressModel a=new AddressModel();
//	BasicInfo bs=new BasicInfo();
//	bs.setFirstname("shivaa");
//	bs.setLastname("sahjddd");
//SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
//Date date=sf.parse("08-02-2021");
//        bs.setDOB(date);
//	bs.setAge(16);
//	PM.save(bs);
	
	Address ad = new Address();
	ad.setAdressline1("shivaa");
	ad.setAdressline2("sahjddd");
//SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
//Date date=sf.parse("08-02-2021");
//        bs.setDOB(date);
	ad.setCity("Indore");
	ad.setState("MP");
	ad.setCountry("India");
	a.save(ad);


}
}

package Excelpoi;



import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Unmarshalldemo {
	public void Unmarshal() throws Exception{

	JAXBContext TestJCUm=JAXBContext.newInstance(Getset.class);
	Unmarshaller TestUMS=TestJCUm.createUnmarshaller();
	Getset TestObj1=(Getset)TestUMS.unmarshal(new File("src\\Excelpoi\\TestObj.xml"));
	System.out.println("Employee Details are: ");
	System.out.println(TestObj1.getEmpId());
	System.out.println(TestObj1.getEmpName());
	System.out.println(TestObj1.getEmpLevel());
	System.out.println(TestObj1.getEmpLocation());
	
	}
}

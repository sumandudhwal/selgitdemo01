package Excelpoi;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshallDemo {
	public void Marshall() throws Exception{
Getset TestObj = new Getset("A01","TestEmp1","MDC",9);

JAXBContext TestJC=JAXBContext.newInstance(Getset.class);
Marshaller TestMS=TestJC.createMarshaller();
TestMS.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
TestMS.marshal(TestObj, System.out);//console
TestMS.marshal(TestObj, new File("src\\Excelpoi\\TestObj.xml"));//file

	}
}

package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Parent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class JaxbParentMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbParentMarshaller.class);

   public static void main(String[] args) {
       Calendar mariamBrownBirthday = Calendar.getInstance();
       mariamBrownBirthday.set(Calendar.YEAR, 1968);
       mariamBrownBirthday.set(Calendar.MONTH, Calendar.MAY);
       mariamBrownBirthday.set(Calendar.DAY_OF_MONTH, 27);
       Date mariamBrownBirth = mariamBrownBirthday.getTime();

       Calendar mariamBrownLastLoginDate = Calendar.getInstance();
       mariamBrownLastLoginDate.set(Calendar.YEAR, 2022);
       mariamBrownLastLoginDate.set(Calendar.MONTH, Calendar.JUNE);
       mariamBrownLastLoginDate.set(Calendar.DAY_OF_MONTH, 6);
       Date mariamBrownLLD = mariamBrownLastLoginDate.getTime();


      Parent parent = new Parent(47166622L, "mariambrown@gmail.com", "IloveCharlie123", "Mariam", "Brown",
              mariamBrownBirth, "5053152585", "2025550198", mariamBrownLLD, "165.220.147.72");
      jaxbObjectToXML(parent);
   }

    public static void jaxbObjectToXML(Parent parent) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Parent.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(parent, new File("parent.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class JaxbAdmissionsMarshaller {

    //Need to double-check this marshaller and cross-reference with xml file.

      private static final Logger LOGGER = LogManager.getLogger(JaxbAdmissionsMarshaller.class);
       public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2021);
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 9);
        Date dateAdmitted = cal.getTime();

        Admissions admissions = new Admissions(570894L, new Student(38688296L), 2L, "Lucy Van Pelt",
                "Freshman", "Approved", dateAdmitted, "n/a");

        jaxbObjectToXML(admissions);
    }


    public static void jaxbObjectToXML(Admissions admissions) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Admissions.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(admissions, new File("admissions.xml"));
        } catch (JAXBException e) {
           LOGGER.info(e);
        }
    }
}

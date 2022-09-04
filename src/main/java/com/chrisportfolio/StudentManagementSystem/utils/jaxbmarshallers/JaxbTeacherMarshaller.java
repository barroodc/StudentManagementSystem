package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.Teacher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class JaxbTeacherMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbTeacherMarshaller.class);

    public static void main(String[] args) {

        /*Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1970);
        cal.set(Calendar.MONTH, Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH, 11);
        Date mattAmaticasBirthday = cal.getTime();

        Calendar cal1 = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2022);
        cal.set(Calendar.MONTH, Calendar.JULY);
        cal.set(Calendar.DAY_OF_MONTH, 15);
        Date mattAmaticasLastLoginDate = cal1.getTime();

       Teacher teacher = new Teacher(38430931L, "mattamaticas@gmail.com", "calcULater", "Matt", "Amaticas",
               mattAmaticasBirthday, "Calculus 1", "9272203486", "6262722483", "Yes", mattAmaticasLastLoginDate,
               "831.572.234.59");
       jaxbObjectToXML(teacher);

         */
    }


      public static void jaxbObjectToXML(Teacher teacher) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Teacher.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(teacher, new File("teacher.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

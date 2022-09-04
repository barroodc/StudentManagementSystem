package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class JaxbCourseRosterMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbCourseRosterMarshaller.class);

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2008);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 9);
        Date birthDay = cal.getTime();

        CourseRoster courseRoster = new CourseRoster(87450L, new Course("Math127"), "Calculus 1",
                new Student(17365429L), "Brown", "Charlie", new GradeLevel(9000L), birthDay, 13, "Male");

        jaxbObjectToXML(courseRoster);
    }

    public static void jaxbObjectToXML(CourseRoster courseRoster) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CourseRoster.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(courseRoster, new File("courseroster.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

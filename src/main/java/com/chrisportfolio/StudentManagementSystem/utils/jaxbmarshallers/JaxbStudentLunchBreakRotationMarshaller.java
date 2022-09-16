package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.StudentLunchBreakRotation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class JaxbStudentLunchBreakRotationMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbStudentLunchBreakRotationMarshaller.class);

    public static void main(String[] args) {

        Time lunchBreakOne = new Time(10,30, 0);


        StudentLunchBreakRotation studentLunchBreakRotation = new StudentLunchBreakRotation(259989L, lunchBreakOne);
        jaxbObjectToXML(studentLunchBreakRotation);
    }

    public static void jaxbObjectToXML(StudentLunchBreakRotation studentLunchBreakRotation) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentLunchBreakRotation.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(studentLunchBreakRotation, new File("studentlunchbreakrotation.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

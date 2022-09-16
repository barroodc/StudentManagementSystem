package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.sql.Time;

public class JaxbStudentScheduleMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbStudentScheduleMarshaller.class);

    public static void main(String[] args) {

        Time calcOneTimeSlot = new Time(1,30, 0);
        Time lunchBreakOne = new Time(10,30, 0);

       StudentSchedule studentSchedule = new StudentSchedule(428749L, new Student(17365429L),
               new Classroom(110L), new Course("Math127"), "Calculus 1", "Monday, Wednesday, Friday",
               calcOneTimeSlot, "Building A", new StudentLunchBreakRotation(259989L), lunchBreakOne);
       jaxbObjectToXML(studentSchedule);
    }


     public static void jaxbObjectToXML(StudentSchedule studentSchedule) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentSchedule.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(studentSchedule, new File("studentschedule.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

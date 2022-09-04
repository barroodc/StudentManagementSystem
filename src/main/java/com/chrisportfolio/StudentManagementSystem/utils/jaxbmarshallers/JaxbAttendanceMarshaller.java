package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Attendance;
import com.chrisportfolio.StudentManagementSystem.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbAttendanceMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbAttendanceMarshaller.class);
    public static void main(String[] args) {
       Attendance charlieBrownAttendance = new Attendance(956636L, new Student(17365429L), (byte)0,
               (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, "n/a");
       jaxbObjectToXML(charlieBrownAttendance);
    }


      public static void jaxbObjectToXML(Attendance attendance) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Attendance.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(attendance, new File("attendance.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

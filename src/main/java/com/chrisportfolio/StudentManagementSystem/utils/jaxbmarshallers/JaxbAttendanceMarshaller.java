package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Attendance;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbAttendanceMarshaller {

    /*
    public static void main(String[] args) {
       Attendance attendance = new Attendance();
       jaxbObjectToXML(attendance);
    }

     */

    /*public static void jaxbObjectToXML(Attendance attendance) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Attendance.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(attendance, new File("attendance.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

     */
}

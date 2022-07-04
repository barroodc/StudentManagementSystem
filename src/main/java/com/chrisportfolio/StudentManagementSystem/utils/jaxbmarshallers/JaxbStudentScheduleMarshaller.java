package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.StudentSchedule;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbStudentScheduleMarshaller {

     /*
    public static void main(String[] args) {
       StudentSchedule studentSchedule = new StudentSchedule();
       jaxbObjectToXML(studentSchedule);
    }
     */

   /*public static void jaxbObjectToXML(StudentSchedule studentSchedule) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentSchedule.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(studentSchedule, new File("studentschedule.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    */
}

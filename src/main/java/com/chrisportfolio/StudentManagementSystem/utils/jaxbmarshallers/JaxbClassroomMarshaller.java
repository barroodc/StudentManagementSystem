package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Classroom;
import com.chrisportfolio.StudentManagementSystem.model.Course;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbClassroomMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbClassroomMarshaller.class);

    /*public static void main(String[] args) {
       Classroom classroom = new Classroom(110L, new Course(127L), "1", "Building A");
       jaxbObjectToXML(classroom);
    }

     */


    public static void jaxbObjectToXML(Classroom classroom) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Classroom.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(classroom, new File("classroom.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }


}

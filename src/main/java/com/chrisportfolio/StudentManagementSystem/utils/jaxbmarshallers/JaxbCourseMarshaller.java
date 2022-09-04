package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Course;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbCourseMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbCourseMarshaller.class);


    /*public static void main(String[] args) {
       Course course = new Course(127L, "Calculus 1", 3.0, "Introduction to Calculus");
       jaxbObjectToXML(course);
    }
     */


    public static void jaxbObjectToXML(Course course) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Course.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(course, new File("course.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }


}

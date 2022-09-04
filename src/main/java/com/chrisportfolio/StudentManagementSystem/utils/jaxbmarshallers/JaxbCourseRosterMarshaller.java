package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.CourseRoster;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbCourseRosterMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbCourseRosterMarshaller.class);

    public static void main(String[] args) {

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

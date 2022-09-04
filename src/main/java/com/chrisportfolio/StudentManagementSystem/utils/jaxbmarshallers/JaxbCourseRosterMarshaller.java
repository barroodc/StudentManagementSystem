package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.CourseRoster;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbCourseRosterMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(CourseRoster courseRoster) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CourseRoster.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(courseRoster, new File("courseroster.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

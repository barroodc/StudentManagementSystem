package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.CourseHasGradeLevel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbCourseHasGradeLevelMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(CourseHasGradeLevel courseHasGradeLevel) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CourseHasGradeLevel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(courseHasGradeLevel, new File("CourseHasGradeLevel.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

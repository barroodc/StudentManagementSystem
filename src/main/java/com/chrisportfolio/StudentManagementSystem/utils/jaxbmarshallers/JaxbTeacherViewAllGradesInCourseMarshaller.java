package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.TeacherViewAllGradesInCourse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbTeacherViewAllGradesInCourseMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbTeacherViewAllGradesInCourseMarshaller.class);

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(TeacherViewAllGradesInCourse teacherViewAllGradesInCourse) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TeacherViewAllGradesInCourse.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(teacherViewAllGradesInCourse, new File("teacherviewallgradesincourse.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

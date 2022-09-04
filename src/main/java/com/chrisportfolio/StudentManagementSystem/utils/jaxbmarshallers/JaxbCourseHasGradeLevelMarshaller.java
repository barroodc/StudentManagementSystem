package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Course;
import com.chrisportfolio.StudentManagementSystem.model.CourseHasGradeLevel;
import com.chrisportfolio.StudentManagementSystem.model.GradeLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbCourseHasGradeLevelMarshaller {


    private static final Logger LOGGER = LogManager.getLogger(JaxbAttendanceMarshaller.class);
    public static void main(String[] args) {
        CourseHasGradeLevel courseHasGradeLevel = new CourseHasGradeLevel("M120", new Course("127"), "Calculus 1", new GradeLevel(12L), "Senior");
        jaxbObjectToXML(courseHasGradeLevel);
    }

    public static void jaxbObjectToXML(CourseHasGradeLevel courseHasGradeLevel) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CourseHasGradeLevel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(courseHasGradeLevel, new File("coursehasgradelevel.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

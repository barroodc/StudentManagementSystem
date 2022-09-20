package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.*;
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
        TeacherViewAllGradesInCourse teacherViewAllGradesInCourse = new TeacherViewAllGradesInCourse(59973L, new Student(17365429L),
                "Brown", "Charlie", new Course("Math127"), "Calculus 1", new HomeworkAssignment(80368L),
                0.0, new Exam(2794L), "n/a", 0.0, "n/a", 0.0,
                "n/a", 0.0, "n/a", 0.0, "n/a");

        jaxbObjectToXML(teacherViewAllGradesInCourse);
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

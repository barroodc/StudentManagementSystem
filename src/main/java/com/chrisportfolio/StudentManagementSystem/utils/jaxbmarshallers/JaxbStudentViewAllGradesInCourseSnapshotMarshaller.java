package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbStudentViewAllGradesInCourseSnapshotMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbStudentViewAllGradesInCourseSnapshotMarshaller.class);

    public static void main(String[] args) {
        StudentViewAllGradesInCourseSnapshot studentViewAllGradesInCourseSnapshot =
                new StudentViewAllGradesInCourseSnapshot(337391L, new Student(17365429L),
                        new Teacher(38430931L), "Amaticas", "Matt", new Course("Math127"), "Calculus 1",
                        new HomeworkAssignment(80368L), 0.0, new Exam(2794L), 0.0, 0.0, "n/a", 0.0,
                        "n/a", 0.0, "n/a", 0.0, "n/a");

        jaxbObjectToXML(studentViewAllGradesInCourseSnapshot);
    }

    public static void jaxbObjectToXML(StudentViewAllGradesInCourseSnapshot studentViewAllGradesInCourseSnapshot) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentViewAllGradesInCourseSnapshot.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(studentViewAllGradesInCourseSnapshot,
                    new File("studentviewallgradesincoursesnapshot.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.StudentViewAllGradesInCourseSnapshot;
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

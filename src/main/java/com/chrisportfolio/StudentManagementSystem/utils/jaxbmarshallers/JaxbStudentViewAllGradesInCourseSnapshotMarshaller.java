package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.StudentViewAllGradesInCourseSnapshot;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbStudentViewAllGradesInCourseSnapshotMarshaller {

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
            throw new RuntimeException(e);
        }
    }
}

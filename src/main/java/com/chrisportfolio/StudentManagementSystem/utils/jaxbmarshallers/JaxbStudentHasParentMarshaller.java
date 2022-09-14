package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Parent;
import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.StudentHasParent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbStudentHasParentMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbStudentHasParentMarshaller.class);

    public static void main(String[] args) {
        StudentHasParent studentHasParent = new StudentHasParent(284515L, new Student(17365429L), "Brown",
                "Charlie", new Parent(47166622L), "Brown", "Mariam", "Mother", "2025550198", "mariambrown@gmail.com",
                "16 Grief Street, Shorewood, Minnesota, 55331", "Yes");

        jaxbObjectToXML(studentHasParent);
    }

    public static void jaxbObjectToXML(StudentHasParent studentHasParent) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentHasParent.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(studentHasParent, new File("studenthasparent.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

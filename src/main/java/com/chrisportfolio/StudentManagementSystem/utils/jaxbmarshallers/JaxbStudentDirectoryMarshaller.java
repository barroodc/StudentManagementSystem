package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.GradeLevel;
import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.StudentDirectory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbStudentDirectoryMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbStudentDirectoryMarshaller.class);

    public static void main(String[] args) {
        StudentDirectory studentDirectory = new StudentDirectory(942431L, new Student(17365429L), "Brown",
                "Charlie", new GradeLevel(9000L), "charliebrown@gmail.com", "16 Grief Street, Shorewood, " +
                "Minnesota, 55331","2025550198", "2025550186");

        jaxbObjectToXML(studentDirectory);
    }

    public static void jaxbObjectToXML(StudentDirectory studentDirectory) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentDirectory.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(studentDirectory, new File("studentdirectory.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.TeacherDirectory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbTeacherDirectoryMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbTeacherDirectoryMarshaller.class);

    public static void main(String[] args) {
        TeacherDirectory teacherDirectory = new TeacherDirectory();

    }

    public static void jaxbObjectToXML(TeacherDirectory teacherDirectory) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TeacherDirectory.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(teacherDirectory, new File("teacherdirectory.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

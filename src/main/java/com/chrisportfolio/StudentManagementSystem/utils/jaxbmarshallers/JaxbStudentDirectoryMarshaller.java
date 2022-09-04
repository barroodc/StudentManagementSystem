package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.StudentDirectory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbStudentDirectoryMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(StudentDirectory studentDirectory) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentDirectory.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(studentDirectory, new File("studentdirectory.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

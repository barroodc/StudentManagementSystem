package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.TeacherDirectory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbTeacherDirectoryMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(TeacherDirectory teacherDirectory) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TeacherDirectory.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(teacherDirectory, new File("teacherdirectory.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

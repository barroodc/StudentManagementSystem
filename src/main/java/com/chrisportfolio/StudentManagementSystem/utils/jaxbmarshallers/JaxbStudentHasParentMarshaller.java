package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.StudentHasParent;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbStudentHasParentMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(StudentHasParent studentHasParent) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StudentHasParent.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(studentHasParent, new File("studenthasparent.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Parent;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbParentMarshaller {

    public static void jaxbObjectToXML(Parent parent) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Parent.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(parent, new File("parent.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

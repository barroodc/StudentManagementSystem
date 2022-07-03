package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Classroom;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbClassroomMarshaller {

    public static void jaxbObjectToXML(Classroom classroom) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Classroom.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(classroom, new File("classroom.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

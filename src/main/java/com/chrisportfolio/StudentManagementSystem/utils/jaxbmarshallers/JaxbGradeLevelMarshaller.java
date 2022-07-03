package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.GradeLevel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbGradeLevelMarshaller {

    public static void jaxbObjectToXML(GradeLevel gradeLevel) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(GradeLevel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(gradeLevel, new File("gradelevel.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

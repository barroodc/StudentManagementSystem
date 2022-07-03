package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Exam;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbExamMarshaller {

    public static void jaxbObjectToXML(Exam exam) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Exam.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(exam, new File("exam.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

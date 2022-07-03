package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.TranscriptGPA;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbTranscriptGPAMarshaller {

    public static void jaxbObjectToXML(TranscriptGPA transcriptGPA) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TranscriptGPA.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(transcriptGPA, new File("transcriptGPA.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

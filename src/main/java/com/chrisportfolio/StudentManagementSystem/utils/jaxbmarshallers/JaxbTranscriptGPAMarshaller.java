package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.TranscriptGPA;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbTranscriptGPAMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbTranscriptGPAMarshaller.class);

     /*
    public static void main(String[] args) {
       TranscriptGPA transcriptGPA = new TranscriptGPA();
       jaxbObjectToXML(transcriptGPA);
    }
     */

   /* public static void jaxbObjectToXML(TranscriptGPA transcriptGPA) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TranscriptGPA.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(transcriptGPA, new File("transcriptGPA.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }

    */
}

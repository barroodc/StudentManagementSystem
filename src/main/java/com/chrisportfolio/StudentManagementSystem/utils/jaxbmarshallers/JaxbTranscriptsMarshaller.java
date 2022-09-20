package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.Transcripts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbTranscriptsMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbTranscriptsMarshaller.class);

    public static void main(String[] args) {
       Transcripts transcripts = new Transcripts(54443L, new Student(17365429L), "Calculus 1", "Freshman",
               "n/a", 3.0);
       jaxbObjectToXML(transcripts);
    }


    public static void jaxbObjectToXML(Transcripts transcripts) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Transcripts.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(transcripts, new File("transcripts.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.model.Transcripts;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbTranscriptsMarshaller {

    /*
    Need to also fix this to incorporate 5 classes.
     */

    /*
    public static void main(String[] args) {
       Transcripts transcripts = new Transcripts(2656653243L, new Student(17365429L), );
       jaxbObjectToXML(transcripts);
    }

     */

    public static void jaxbObjectToXML(Transcripts transcripts) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Transcripts.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(transcripts, new File("transcripts.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

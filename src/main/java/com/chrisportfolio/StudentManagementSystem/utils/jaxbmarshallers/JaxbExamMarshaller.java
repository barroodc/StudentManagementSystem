package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Exam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbExamMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbExamMarshaller.class);


    /*public static void main(String[] args) {
       Exam exam = new Exam(2794L, "Limits", "Fall", "Calculus 1");
       jaxbObjectToXML(exam);
    }

     */

    public static void jaxbObjectToXML(Exam exam) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Exam.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(exam, new File("exam.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
    
}

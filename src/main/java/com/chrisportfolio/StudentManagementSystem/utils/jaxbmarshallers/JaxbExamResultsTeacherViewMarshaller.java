package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.ExamResultsTeacherView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbExamResultsTeacherViewMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbExamResultsTeacherViewMarshaller.class);

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(ExamResultsTeacherView examResultsTeacherView) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ExamResultsTeacherView.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(examResultsTeacherView, new File("examresultsteacherview.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

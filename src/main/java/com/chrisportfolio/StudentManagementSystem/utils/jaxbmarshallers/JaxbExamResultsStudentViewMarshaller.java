package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.ExamResultsStudentView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbExamResultsStudentViewMarshaller {

    private static final Logger LOGGER = LogManager.getLogger(JaxbExamResultsStudentViewMarshaller.class);

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(ExamResultsStudentView examResultsStudentView) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ExamResultsStudentView.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(examResultsStudentView, new File("examresultsstudentview.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }
}

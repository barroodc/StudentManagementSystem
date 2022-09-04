package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.ExamResultsStudentView;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbExamResultsStudentViewMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(ExamResultsStudentView examResultsStudentView) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ExamResultsStudentView.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(examResultsStudentView, new File("examresultsstudentview.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

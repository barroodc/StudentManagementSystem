package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.ExamResultsTeacherView;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class JaxbExamResultsTeacherViewMarshaller {

    public static void main(String[] args) {

    }

    public static void jaxbObjectToXML(ExamResultsTeacherView examResultsTeacherView) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ExamResultsTeacherView.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(examResultsTeacherView, new File("examresultsteacherview.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

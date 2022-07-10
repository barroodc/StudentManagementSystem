package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Exam;
import com.chrisportfolio.StudentManagementSystem.model.ExamResult;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbExamResultMarshaller {

    public static void main(String[] args) {
       ExamResult examResult = new ExamResult(86581L, new Exam(2794L), 0.0, "n/a");
       jaxbObjectToXML(examResult);
    }

    public static void jaxbObjectToXML(ExamResult examResult) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ExamResult.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(examResult, new File("examresult.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }


}
